package org.bianqi.wangyi.utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/**
 * HDFS的上传组件
 * <p>Title: HdfsUploadUtils</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月13日下午3:22:51
 * @version 1.0.0
 */
public class HdfsUploadUtils {
	
	public boolean upLoadHDFS(String host,String sourceUrl,String disUrl){
		try {
			FileSystem fs = null;
			Configuration conf = null;
			conf = new Configuration();
			conf.set("fs.defaultFS", "hdfs://"+host+":9000");
			fs = FileSystem.get(new URI("hdfs://"+host+":9000"),conf,"hadoop");
			fs.copyFromLocalFile(new Path(sourceUrl), new Path(disUrl));
			fs.close();
			return true;
		} catch (IOException | InterruptedException | URISyntaxException e) {
			return false;
		} 
	}
	
	
	
	
}
