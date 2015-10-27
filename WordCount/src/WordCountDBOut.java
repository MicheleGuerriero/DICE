import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.apache.hadoop.filecache.DistributedCache;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapred.lib.db.DBConfiguration;
import org.apache.hadoop.mapred.lib.db.DBOutputFormat;
import org.apache.hadoop.mapred.lib.db.DBWritable;

public class WordCountDBOut {
    public static class WordCountMapperDBOut extends MapReduceBase implements Mapper<LongWritable, Text, DBOutput, IntWritable> {
        private static IntWritable one = new IntWritable(1);
        private static DBOutput text = new DBOutput();
        @Override
        public void map(LongWritable key, Text value,
                OutputCollector<DBOutput, IntWritable> collect, Reporter arg3)
                throws IOException {
            StringTokenizer token = new StringTokenizer(value.toString());
            while(token.hasMoreTokens()) {
                text.setText(token.nextToken());
                collect.collect(text, one);
            }            
                        
        }
        
    }
    
    public static class WordCountReducerDBOut extends MapReduceBase implements Reducer<DBOutput, IntWritable, DBOutput, IntWritable> {

        
        @Override
        public void reduce(DBOutput key, Iterator<IntWritable> values,
                OutputCollector<DBOutput, IntWritable> collect, Reporter arg3)
                throws IOException {
            int sum = 0;
            IntWritable no = null;
            DBOutput dbKey = new DBOutput();
            
            while(values.hasNext()) {
                no = values.next();
                sum += no.get();
            }
            dbKey.setText(key.getText());
            dbKey.setNo(sum);
            collect.collect(dbKey, new IntWritable(sum));
            
        }
        
    }
    
    public void run(String inputPath, String outputPath) throws Exception {
        JobConf conf = new JobConf(WordCountDBOut.class);
        conf.setJobName("wordcountDbOut");
      //  DistributedCache.addFileToClassPath(new Path("<Absolute Path>/mysql-connector-java-5.1.7-bin.jar"), conf);

        // the keys are DBOutput
        conf.setOutputKeyClass(DBOutput.class);
        // the values are counts (ints)
        conf.setOutputValueClass(IntWritable.class);

        conf.setMapperClass(WordCountMapperDBOut.class);
        conf.setReducerClass(WordCountReducerDBOut.class);        
        
        conf.setOutputFormat(DBOutputFormat.class);

        FileInputFormat.addInputPath(conf, new Path(inputPath));
        DBOutputFormat.setOutput(conf, "WordCountTBL", "word", "count");
        
        DBConfiguration.configureDB(conf, "com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/WordCountDB", "root", "cloudera");
        
        //FileOutputFormat.setOutputPath(conf, new Path(outputPath));

        JobClient.runJob(conf);
      }
    
    public static void main(String[] args) throws Exception {
        WordCountDBOut wordCountDbOut = new WordCountDBOut();
        wordCountDbOut.run("file:///home/cloudera/sample-data/helloworld", "file:///home/cloudera/sample-data/result");
    }
    
    private static class DBOutput implements DBWritable, WritableComparable<DBOutput> {
        
        private String text;
        
        private int no;

        @Override
        public void readFields(ResultSet rs) throws SQLException {
            text = rs.getString("word");
            no = rs.getInt("count");
        }

        @Override
        public void write(PreparedStatement ps) throws SQLException {
            ps.setString(1, text);
            ps.setInt(2, no);
        }
        
        public void setText(String text) {
            this.text = text;
        }
        
        public String getText() {
            return text;
        }
        
        public void setNo(int no) {
            this.no = no;
        }
        
        public int getNo() {
            return no;
        }

        @Override
        public void readFields(DataInput input) throws IOException {
            text = input.readUTF();    
            no = input.readInt();
        }

        @Override
        public void write(DataOutput output) throws IOException {
            output.writeUTF(text);
            output.writeInt(no);
        }

        @Override
        public int compareTo(DBOutput o) {
            return text.compareTo(o.getText());
        }
        
    }
}