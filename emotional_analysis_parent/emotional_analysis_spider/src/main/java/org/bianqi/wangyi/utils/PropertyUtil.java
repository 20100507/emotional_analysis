package org.bianqi.wangyi.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.junit.Test;

/**
 * 断点爬取写入读取properties文件
 * <p>Title: PropUtils</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月6日下午12:20:18
 * @version 1.0.0
 */
public class PropertyUtil {

	private static Properties props;

	public static long readProp(String filename, String pointName) throws Exception{
		props = new Properties();
		InputStream in = new FileInputStream(filename);
		props.load(in);
		String pointNum = props.getProperty(pointName);
		long num = Long.parseLong(pointNum);
		return num;
	}

	public static void writeProp(String filename,String pointName,String pointValue) throws Exception{
		  InputStream in = new FileInputStream(filename);
		  Properties props = new Properties();
		  props.load(in);
		  in.close();
		  props.setProperty(pointName, pointValue);    
		  OutputStream fos = new FileOutputStream(filename);   
          props.setProperty(pointName, pointValue);   
          props.store(fos, "Update '" + pointName + "' value");   
          fos.close();
	}
	
	@Test
	public void test1() throws Exception{
//		writeProp("point.properties","personal_point","222");
//		long readProp = readProp("point.properties", "personal_point");
//		System.out.println(readProp);
	}

}




