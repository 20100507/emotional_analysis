package org.bianqi.time;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.net.PrintCommandListener;
import org.junit.Test;

public class TimeTest {

	@Test
	public void test1(){
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //时间格式
	    try {
	    	long time = dateformat.parse("2018-01-01 00:00:00").getTime();//格式转换
	        System.out.println(time);
	    } catch (java.text.ParseException e) {
	        e.printStackTrace();
	    }
	}
}
