package org.bianqi.web.wangyi.service;

import java.util.Map;

import org.bianqi.web.wangyi.utils.PageBean;

public interface SearchService {
	
	public PageBean<Map<String,Object>> getSearchResult(int page, int rows,String content) throws Exception;
}
