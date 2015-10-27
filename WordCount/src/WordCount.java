import java.io.IOException;
import java.util.regex.Pattern;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapred.TextOutputFormat;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.log4j.Logger;

public class WordCount extends Configured implements Tool{
	
	public static void main(String[] args) throws Exception {
	    int res = ToolRunner.run(new WordCount(), args);
	    System.exit(res);
	  }

	  public int run(String[] args) throws Exception {
		    JobConf jconf = new JobConf(WordCount.class);
		    jconf.setJobName("wordCount");

		    jconf.setOutputKeyClass(Text.class);
		    jconf.setOutputValueClass(IntWritable.class);

		    jconf.setMapperClass(WordCountMapper.class);
		    jconf.setCombinerClass(WordCountReducer.class);
		    jconf.setReducerClass(WordCountReducer.class);

		    jconf.setInputFormat(TextInputFormat.class);
		    jconf.setOutputFormat(TextOutputFormat.class);

	      
		   
		  	    
		    jconf.setNumReduceTasks(2);
		    jconf.setPartitionerClass(WordCountPartitioner.class);
		    
		    Job job = new Job(jconf);
		    
		      FileInputFormat.setInputPaths(job,new Path("file:///home/cloudera/sample-data/helloworld"));
	          FileOutputFormat.setOutputPath(job,new Path("file:///home/cloudera/sample-data/result"));
	       
	          		   
		    job.submit();
		    return job.waitForCompletion(true) ? 0 : 1;
		  }
}


