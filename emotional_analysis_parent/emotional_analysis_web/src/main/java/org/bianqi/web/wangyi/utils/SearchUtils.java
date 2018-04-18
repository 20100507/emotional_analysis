package org.bianqi.web.wangyi.utils;

import java.math.BigInteger;
import java.security.SecureRandom;

import org.jsoup.Jsoup;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;


/**
 * 根据用户ID用户的名称
 * 歌曲的ID 找到歌曲的名称
 * 歌曲的ID 歌曲的真实URL
 * <p>Title: SearchUtils</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年3月16日下午8:26:23
 * @version 1.0.0
 */
public class SearchUtils {
	
	/**
	 *获取该歌曲的歌手
	 * <p>Title: getSingerById</p>
	 * <p>Description: </p>
	 * @param songId
	 * @return
	 */
	public static String getSingerById(long songId) throws Exception{
		String singer = "";
		Response execute = Jsoup.connect("http://music.163.com/m/song?id=" + songId)
				.header("User-Agent",
						"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.79 Safari/537.36")
				.header("Cache-Control", "no-cache").timeout(2000000000)
				.execute();
		Document parse = execute.parse();
		Elements elements = parse.getElementsByClass("s-fc7");
		if(elements.size() > 0){
			Element singerElement = elements.get(1);
			if(elements.size() > 0){
				Node singerChildNode = singerElement.childNode(0);
				singer = singerChildNode.toString();
			}
		}
		return singer;
	}
	
	/**
	 * 获取歌曲名称
	 * <p>Title: getSongNameById</p>
	 * <p>Description: </p>
	 * @param songId
	 * @return
	 * @throws Exception
	 */
	public static String getSongNameById(long songId) throws Exception{
		String songName = null;
		Response execute = Jsoup.connect("http://music.163.com/m/song?id=" + songId)
				.header("User-Agent",
						"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.79 Safari/537.36")
				.header("Cache-Control", "no-cache").timeout(2000000000)
				.execute();
		Document parse = execute.parse();
		Elements elementsByClass = parse.getElementsByClass("f-ff2");
		if(elementsByClass.size() > 0){
			Element element = elementsByClass.get(0);
			Node childNode = element.childNode(0);
			songName = childNode.toString();
		}else{
			songName = "ES中歌曲在网易云音乐中找不到";
		}
		return songName;
	}
	
	public static String getSongUrlById(long songId) throws Exception{
		String req_str = "{\"ids\":\"[" + songId + "]\",\"br\":128000,\"csrf_token\":\"\"};";
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
		if(index2 == -1){
			return "";
		}
		substring = string.substring(index1 + 7, index2);
		return substring;
	}
	
}
