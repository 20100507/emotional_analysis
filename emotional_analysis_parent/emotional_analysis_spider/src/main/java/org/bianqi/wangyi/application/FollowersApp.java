package org.bianqi.wangyi.application;

import org.bianqi.wangyi.executor.ThreadExecutor;
import org.bianqi.wangyi.executor.ThreadPool;
import org.bianqi.wangyi.hook.JVMHook;
import org.bianqi.wangyi.proxy.IpProxy;
import org.bianqi.wangyi.spider.followers.FollowersThread;

/**
 * 
 * <p>Title: FollowersApp</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月21日下午7:40:31
 * @version 1.0.0
 */
public class FollowersApp {
	
	public static void main(String[] args)  {
		ThreadExecutor executor = new ThreadExecutor(0, 1000000, 5000, "6");
		executor.scheduerThread();
		IpProxy.newScheduledThreadPool.shutdown();
		executor.shutdownThreadPool();
	}
}
