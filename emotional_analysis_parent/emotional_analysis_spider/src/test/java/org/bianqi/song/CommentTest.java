package org.bianqi.song;

import java.util.Queue;

import org.bianqi.comment.SpiderComment;
import org.bianqi.queue.SongQueue;
import org.bianqi.thread.SongThread;

public class CommentTest {
	
	static Queue<String> instance = SongQueue.getUncrawledMusicList();
	public static void main(String[] args) throws Exception {
		int j = 0;
		for (int i = 1000; i < 10200; i++) {
			SongThread st = new SongThread(2000000L + j, 2000100L + j, instance);
			Thread t2 = new Thread(st);
			t2.start();
			j++;
		}
	}
}

class CommentDataThread extends Thread{
	
	@Override
	public void run() {
		while(!SongQueue.isUncrawledMusicListEmpty()){
			getCommentData(); 
		}
	}
	
	public void getCommentData(){
		if(!SongQueue.isUncrawledMusicListEmpty()){
			SpiderComment spiderComment = new SpiderComment(Long.valueOf(SongQueue.getTopMusicList()));
			if(SongQueue.isUncrawledMusicListEmpty()){
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			Thread t1 = new Thread(spiderComment);
			t1.start();
		}
	}
}
