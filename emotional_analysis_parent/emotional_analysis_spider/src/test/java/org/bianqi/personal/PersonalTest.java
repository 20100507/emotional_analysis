package org.bianqi.personal;

import org.jsoup.Jsoup;
import org.jsoup.Connection.Response;
import org.junit.Test;

/**
 * 
 * <p>Title: PersonalTest</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年10月25日下午1:11:10
 * @version 1.0.0
 */
public class PersonalTest {
	
	/**
	 * 抓取个人页面
	 * <p>Title: test2</p>
	 * <p>Description: </p>
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception{
	    Response execute = Jsoup.connect("http://music.163.com/user/home?id=2768563")
				.ignoreContentType(true).execute();
		String string = execute.body().toString();
		System.out.println(string);
	}
}
