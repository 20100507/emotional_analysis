package org.bianqi.wangyi.web.es.test;

import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

import org.bianqi.web.wangyi.utils.EncryptUtils;
import org.jsoup.Jsoup;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;

/**
 * <p>Title: GetSongName</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年3月16日下午8:48:23
 * @version 1.0.0
 */
public class GetSongName {
	
	@Test
	public void test1() throws Exception{
		Response execute = Jsoup.connect("http://music.163.com/m/song?id=" + 91445)
				.header("User-Agent",
						"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.79 Safari/537.36")
				.header("Cache-Control", "no-cache").timeout(2000000000)
				.execute();
		Document parse = execute.parse();
		Elements elementsByClass = parse.getElementsByClass("f-ff2");
		Element element = elementsByClass.get(0);
		Node childNode = element.childNode(0);
		// 获取歌曲名称
		String songName = childNode.toString();
		System.out.println(songName);
	}
	
	@Test
	public void test2() throws Exception{
		String req_str = "{\"ids\":\"[" + 91445 + "]\",\"br\":128000,\"csrf_token\":\"\"};";
		String secKey = new BigInteger(100, new SecureRandom()).toString(32).substring(0, 16);
		String encText = EncryptUtils.aesEncrypt(EncryptUtils.aesEncrypt(req_str, "0CoJUm6Qyw8W8jud"), secKey);
		String encSecKey = EncryptUtils.rsaEncrypt(secKey);
		Response execute = Jsoup.connect("http://music.163.com/weapi/song/enhance/player/url").data("params", encText)
				.data("encSecKey", encSecKey).method(Method.POST).ignoreContentType(true).execute();
		String string = execute.body().toString();
		String substring = "";
		int index1 = string.indexOf("\"url\":\"");
		String str1 = "\",\"br\":";
		int index2 = string.indexOf(str1);
		substring = string.substring(index1 + 7, index2);
		System.out.println(substring);
	}
	
	@Test
	public void test3(){
		
	}
	
}
