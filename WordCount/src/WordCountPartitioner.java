import java.io.IOException;
import java.util.regex.Pattern;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;

public class WordCountPartitioner extends MapReduceBase implements org.apache.hadoop.mapred.Partitioner<Text, IntWritable>{

	@Override
	public int getPartition(Text key, IntWritable value, int numPartitions) {
		if(numPartitions == 2){
			String partitionKey = key.toString();
			if(partitionKey.charAt(0) > 'a' )
				return 0;
			else 
				return 1;
		}else if(numPartitions == 1)
			return 0;
		else{
			System.err.println("WordCountParitioner can only handle either 1 or 2 paritions");
			return 0;
		}
	}

	
}
