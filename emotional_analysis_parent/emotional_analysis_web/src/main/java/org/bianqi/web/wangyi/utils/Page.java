package org.bianqi.web.wangyi.utils;

public class Page {
	private long pn;
	private long pageSize;
	private long startPos;
	public long getPn() {
		return pn;
	}
	public void setPn(long pn) {
		this.pn = pn;
	}
	public long getPageSize() {
		return pageSize;
	}
	public Page(long pn, long pageSize) {
		super();
		this.pn = pn;
		this.pageSize = pageSize;
	}
	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}
	public long getStartPos() {
		return startPos;
	}
	public void setStartPos(long startPos) {
		this.startPos = startPos;
	}
	
	
}
