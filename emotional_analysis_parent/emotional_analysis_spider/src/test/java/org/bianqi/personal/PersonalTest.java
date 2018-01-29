package org.bianqi.personal;

import java.math.BigInteger;
import java.security.SecureRandom;

import org.bianqi.utils.EncryptUtils;
import org.jsoup.Jsoup;
import org.jsoup.Connection.Method;
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
		String secKey = new BigInteger(100, new SecureRandom()).toString(32).substring(0, 16);
        String encText = EncryptUtils.aesEncrypt(EncryptUtils.aesEncrypt("{\"uid\":2763211,\"offset\":0,\"limit\":50};","0CoJUm6Qyw8W8jud"), secKey);
        String encSecKey = EncryptUtils.rsaEncrypt(secKey);
	    Response execute = Jsoup.connect("http://music.163.com/weapi/user/playlist")
				.data("params",encText)
				.data("encSecKey",encSecKey)
				.method(Method.POST).ignoreContentType(true).execute();
		String string = execute.body().toString();
		System.out.println(string);
	}
	
	/**
	 * 个人动态
	 * @throws Exception
	 */
	@Test
	public void test3() throws Exception{
		String secKey = new BigInteger(100, new SecureRandom()).toString(32).substring(0, 16);
        String encText = EncryptUtils.aesEncrypt(EncryptUtils.aesEncrypt("{\"uid\":2763211,\"offset\":0,\"limit\":50};","0CoJUm6Qyw8W8jud"), secKey);
        String encSecKey = EncryptUtils.rsaEncrypt(secKey);
	    Response execute = Jsoup.connect("http://music.163.com/weapi/event/get/2763211")
				.data("params",encText)
				.data("encSecKey",encSecKey)
				.method(Method.POST).ignoreContentType(true).execute();
		String string = execute.body().toString();
		System.out.println(string);
	}

}






