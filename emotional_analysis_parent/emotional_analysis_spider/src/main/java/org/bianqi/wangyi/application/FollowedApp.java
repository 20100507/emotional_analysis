package org.bianqi.wangyi.application;

import org.bianqi.wangyi.executor.ThreadExecutor;
import org.bianqi.wangyi.executor.ThreadPool;
import org.bianqi.wangyi.hook.JVMHook;
import org.bianqi.wangyi.proxy.IpProxy;
import org.bianqi.wangyi.spider.followed.FollowedThread;
import org.bianqi.wangyi.utils.PropertyUtil;

/**
 * 
 * <p>Title: FollowedApp</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月17日下午4:43:03
 * @version 1.0.0
 */
public class FollowedApp {
	
	public static void main(String[] args) throws Exception{
		long readProp = PropertyUtil.readProp("point.properties", "follower");
		System.out.println(readProp);
		ThreadExecutor executor = new ThreadExecutor(readProp, 97137553L, 5000, "6");
		new JVMHook().writePropAndHook("follower",137413L+"");
		executor.scheduerThread();
		IpProxy.newScheduledThreadPool.shutdown();
		executor.shutdownThreadPool();
	}
}
