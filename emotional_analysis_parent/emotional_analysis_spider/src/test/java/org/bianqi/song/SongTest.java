package org.bianqi.song;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.commons.io.IOUtils;
import org.bianqi.entity.comment.CommentBean;
import org.bianqi.thread.SongThread;
import org.bianqi.utils.EncryptUtils;
import org.jsoup.Jsoup;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * <p>Title: SongTest</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年10月25日下午1:17:14
 * @version 1.0.0
 */
public class SongTest {
	
	/**
	 *测试歌曲保存
	 * <p>Title: test1</p>
	 * <p>Description: </p>
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception{
		
		FileOutputStream fileOutputStream = new FileOutputStream(new File("data.dat"));
		for(long i = 88000;i < 100000000000L;i++){
			if(i % 2 == 0){
			Response execute = Jsoup.connect("http://music.163.com/m/song?id="+i)
					.header("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.79 Safari/537.36")
					.header("Cache-Control", "no-cache").timeout(20000)
					.execute();
			String body = execute.body();
			if(body.contains("很抱歉，你要查找的网页找不到")){
				byte[] bytes = (i+"----------------").getBytes();
				System.out.println("爬取到歌曲ID："+i+"=============但是 很抱歉，你要查找的网页找不到");
				IOUtils.write(bytes, fileOutputStream);
				byte[] bytes2 = "\r\n".getBytes();
				IOUtils.write(bytes2, fileOutputStream);
				continue;
			}
			Document parse = execute.parse();
			Elements elementsByClass = parse.getElementsByClass("f-ff2");
			Element element = elementsByClass.get(0);
			Node childNode = element.childNode(0);
			String str = childNode.toString();
			System.out.println("采集歌曲ID为："+i+"  =============歌曲名称为："+str);
			byte[] bytes = (i+str).getBytes();
			IOUtils.write(bytes, fileOutputStream);
			byte[] bytes2 = "\r\n".getBytes();
			IOUtils.write(bytes2, fileOutputStream);
			}else{
				Response execute = Jsoup.connect("http://music.163.com/m/song?id="+i)
						.header("User-Agent", "Mozilla/5.0 (Windows NT 6.3; W…) Gecko/20100101 Firefox/56.0")
						.header("Cache-Control", "no-cache").timeout(200000)
						.execute();
				String body = execute.body();
				if(body.contains("很抱歉，你要查找的网页找不到")){
					byte[] bytes = (i+"----------------").getBytes();
					System.out.println("爬取到歌曲ID："+i+"=============但是 很抱歉，你要查找的网页找不到");
					IOUtils.write(bytes, fileOutputStream);
					byte[] bytes2 = "\r\n".getBytes();
					IOUtils.write(bytes2, fileOutputStream);
					continue;
				}
				Document parse = execute.parse();
				Elements elementsByClass = parse.getElementsByClass("f-ff2");
				Element element = elementsByClass.get(0);
				Node childNode = element.childNode(0);
				String str = childNode.toString();
				System.out.println("采集歌曲ID为："+i+"  =============歌曲名称为："+str);
				byte[] bytes = (i+str).getBytes();
				IOUtils.write(bytes, fileOutputStream);
				byte[] bytes2 = "\r\n".getBytes();
				IOUtils.write(bytes2, fileOutputStream);
			}
			if(i % 2000 == 0){
				Thread.sleep(200000);
			}
		}
	}
	
	/**
	 * 解析出歌手 专辑
	 * <p>Title: test4</p>
	 * <p>Description: </p>
	 * @throws Exception
	 */
	@Test
	public void test4() throws Exception{
		 Response execute = Jsoup.connect("http://music.163.com/song?id=63650")
					.ignoreContentType(true).execute();
		 Document parse = execute.parse();
		 Elements elements = parse.getElementsByClass("s-fc7");
		 Element singerElement = elements.get(1);
		 Node singerChildNode = singerElement.childNode(0);
		 String singer = singerChildNode.toString();
		 //Album
		 Element albumElement = elements.get(2);
		 Node albumChildNode = albumElement.childNode(0);
		 String album = albumChildNode.toString();
		 System.out.println(singer+"--------"+album);
	}
	
	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(503);
		for(int i = 1400;i <= 1500;i++){
			executor.execute(new SongThread(100*i, 100*(i+1), i+".dat"));
		}
		executor.shutdown();
	}
	
	@Test
	public void test5() throws Exception{
		String secKey = new BigInteger(100, new SecureRandom()).toString(32).substring(0, 16);//limit
		String encText = EncryptUtils.aesEncrypt(EncryptUtils.aesEncrypt("{\"offset\":"+ 0 * 10 +",\"limit\":"+10+"};","0CoJUm6Qyw8W8jud"), secKey);
        String encSecKey = EncryptUtils.rsaEncrypt(secKey);
	    Response execute = Jsoup.connect("http://music.163.com/weapi/v1/resource/comments/R_SO_4_"+5236008+"?csrf_token=2032a8f34f1f92412a49ba3d6f68b2db")
				.data("params",encText)
				.data("encSecKey",encSecKey)
				.header("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.79 Safari/537.36")
				.header("Cache-Control", "no-cache")
				.header("Accept", "*/*")
				.header("Accept-Language", "zh-CN,zh;q=0.8,en;q=0.6")
				.header("Connection", "keep-alive")
				.header("Referer", "http://music.163.com/song?id=186016")
				.header("Origin", "http://music.163.com")
				.header("Host", "music.163.com")
				.header("Content-Type", "application/x-www-form-urlencoded")
				.header("Cookie", "UM_distinctid=15e9863cf14335-0a09f939cd2af9-6d1b137c-100200-15e9863cf157f1; vjuids=414b87eb3.15e9863cfc1.0.ec99d6f660d09; _ntes_nnid=4543481cc76ab2fd3110ecaafd5f1288,1505795231854; _ntes_nuid=4543481cc76ab2fd3110ecaafd5f1288; __s_=1; __gads=ID=6cbc4ab41878c6b9:T=1505795247:S=ALNI_MbCe-bAY4kZyMbVKlS4T2BSuY75kw; usertrack=c+xxC1nMphjBCzKpBPJjAg==; NTES_CMT_USER_INFO=100899097%7Cm187****4250%7C%7Cfalse%7CbTE4NzAzNDE0MjUwQDE2My5jb20%3D; P_INFO=m18703414250@163.com|1507178162|2|mail163|00&99|CA&1506163335&mail163#hun&430800#10#0#0|187250&1|163|18703414250@163.com; vinfo_n_f_l_n3=8ba0369be425c0d2.1.7.1505795231863.1507950353704.1508150387844; vjlast=1505795232.1508150167.11; Province=0450; City=0454; _ga=GA1.2.1044198758.1506584097; _gid=GA1.2.763458995.1508907342; JSESSIONID-WYYY=Zm%2FnBG6%2B1vb%2BfJp%5CJP8nIyBZQfABmnAiIqMM8fgXABoqI0PdVq%2FpCsSPDROY1APPaZnFgh14pR2pV9E0Vdv2DaO%2BKkifMncYvxRVlOKMEGzq9dTcC%2F0PI07KWacWqGpwO88GviAmX%2BVuDkIVNBEquDrJ4QKhTZ2dzyGD%2Bd2T%2BbiztinJ%3A1508946396692; _iuqxldmzr_=32; playerid=20572717; MUSIC_U=39d0b2b5e15675f10fd5d9c05e8a5d593c61fcb81368d4431bab029c28eff977d4a57de2f409f533b482feaf99a1b61e80836282123441c67df96e4bf32a71bc38be3a5b629323e7bf122d59fa1ed6a2; __remember_me=true; __csrf=2032a8f34f1f92412a49ba3d6f68b2db; __utma=94650624.1044198758.1506584097.1508939111.1508942690.40; __utmb=94650624.20.10.1508942690; __utmc=94650624; __utmz=94650624.1508394258.18.4.utmcsr=xujin.org|utmccn=(referral)|utmcmd=referral|utmcct=/")
				.method(Method.POST).ignoreContentType(true).timeout(2000000000).execute();
		String string = execute.body().toString();
		ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		CommentBean readValue = objectMapper.readValue(string.getBytes(), CommentBean.class);
		long total = readValue.getTotal();
		long pageSize = total / 10;
		System.out.println(pageSize+"==="+total);
	}
}