package org.bianqi.queue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 歌曲队列【推送到评论】
 * <p>Title: SongQueue</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年10月26日下午3:37:21
 * @version 1.0.0
 */
public class SongQueue {
	
private static Queue<String> uncrawledMusicList = new ConcurrentLinkedQueue<String>();
	
	public static Queue<String> getUncrawledMusicList() {
		return uncrawledMusicList;
	}
	
	public static void addMusicList(String e) {
		System.out.println("=========================添加到队列中了===============================");
		uncrawledMusicList.offer(e);
	}
	
	public static String getTopMusicList() {
		if (!uncrawledMusicList.isEmpty()) {
			System.out.println("==================拉取队列中的数据====================");
			return uncrawledMusicList.poll();
		}
		return null;
	}
	
	public static boolean isUncrawledMusicListEmpty() {
		return uncrawledMusicList.isEmpty();
	}
	
	public static void printAll() {
		while (!uncrawledMusicList.isEmpty()) {
			System.out.println(uncrawledMusicList.poll());
		}
	}
}
