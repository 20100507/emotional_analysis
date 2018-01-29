package org.bianqi.web.wangyi.utils;

import java.io.Serializable;
import java.util.List;

public class PageBean<T> implements Serializable{
	private long page;
	private long totalPage;
	private List<T> list;
	public long getPage() {
		return page;
	}
	public void setPage(long page) {
		this.page = page;
	}
	public long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
	
	
}