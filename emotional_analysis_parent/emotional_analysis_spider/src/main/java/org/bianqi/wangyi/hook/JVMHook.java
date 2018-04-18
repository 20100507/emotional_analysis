package org.bianqi.wangyi.hook;

import org.bianqi.wangyi.utils.PropertyUtil;


/**
 * 虚拟机正常退出以及意外退出的补救
 * 用于断点爬取写入文件 
 * JVM钩子
 * <p>Title: JVMHook</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月7日下午1:05:56
 * @version 1.0.0
 */
public class JVMHook {
	
	public  boolean writePropAndHook(final String pointName,final String pointValue){
		Runtime.getRuntime().addShutdownHook(new Thread(){
			@Override
			public void start() {
				try {
					System.err.println("执行钩子~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					PropertyUtil.writeProp("point.properties", pointName, pointValue);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		return true;
	}
}
