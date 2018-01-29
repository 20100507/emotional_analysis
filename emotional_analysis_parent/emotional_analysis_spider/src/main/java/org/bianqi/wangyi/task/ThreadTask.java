package org.bianqi.wangyi.task;

public class ThreadTask extends Thread{
	
	protected long uid;
	
	public ThreadTask(long uid) {
		this.uid = uid;
	}

	@Override
	public void run() {
	
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}
	
}
