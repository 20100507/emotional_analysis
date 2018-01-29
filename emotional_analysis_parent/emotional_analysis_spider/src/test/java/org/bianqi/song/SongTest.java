package org.bianqi.song;

import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.io.IOUtils;
import org.bianqi.comment.SpiderComment;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;

/**
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
				Thread.sleep(200);
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
	
	//测试
	public static void main(String[] args) throws Exception {
		ExecutorService executorSong = Executors.newCachedThreadPool();
		SpiderComment spiderComment = new SpiderComment(28815250L);
		Thread t1 = new Thread(spiderComment);
		executorSong.execute(t1);
		executorSong.shutdown();
	}
}