package org.bianqi.followers;

import java.math.BigInteger;
import java.security.SecureRandom;

import org.bianqi.utils.EncryptUtils;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.junit.Test;

/**
 * <p>Title: FollowerTest</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年10月25日下午1:10:43
 * @version 1.0.0
 */
public class FollowerTest {
	
	/**
	 * <p>Title: test3</p>
	 * <p>Description: </p>
	 * @throws Exception 
	 */
	@Test
	public void test3() throws Exception{
			String secKey = new BigInteger(100, new SecureRandom()).toString(32).substring(0, 16);
	        String encText = EncryptUtils.aesEncrypt(EncryptUtils.aesEncrypt("{\"offset\":0,\"offset\":0,\"limit\":50};","0CoJUm6Qyw8W8jud"), secKey);
	        String encSecKey = EncryptUtils.rsaEncrypt(secKey);
		    Response execute = Jsoup.connect("http://music.163.com/weapi/user/getfollows/380377129")
					.data("params",encText)
					.data("encSecKey",encSecKey)
					.method(Method.POST).ignoreContentType(true).execute();
			String string = execute.body().toString();
			System.out.println(string);
	}
	
}
