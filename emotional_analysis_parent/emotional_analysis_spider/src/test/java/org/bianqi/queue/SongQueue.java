package org.bianqi.queue;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

import org.bianqi.entity.SongEntity;

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
	
	private static AtomicInteger atomicInteger = new AtomicInteger(0);
	
	private static LinkedBlockingQueue<SongEntity> ltq ;
	
	public static LinkedBlockingQueue<SongEntity> getInstance() {  
        if (ltq == null) {    
            synchronized (SongQueue.class) {    
               if (ltq == null) {    
            	   ltq = new LinkedBlockingQueue<>();   
               }    
            }    
        }    
        return ltq;   
    }  
	
	public static void pushSong(SongEntity songEntity){
		System.out.println("推送到队列"+atomicInteger.incrementAndGet()+"首歌曲");
		try {
			ltq.put(songEntity);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static SongEntity pollSong(){
		System.out.println("拉取队列"+atomicInteger.decrementAndGet()+"首歌曲");
		return ltq.poll();
	}
}
