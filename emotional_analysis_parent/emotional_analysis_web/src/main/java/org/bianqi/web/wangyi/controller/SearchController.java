package org.bianqi.web.wangyi.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.bianqi.web.wangyi.service.SearchService;
import org.bianqi.web.wangyi.utils.ESClientUtils;
import org.bianqi.web.wangyi.utils.Page;
import org.bianqi.web.wangyi.utils.PageBean;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.common.text.Text;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.highlight.HighlightBuilder;
import org.elasticsearch.search.highlight.HighlightField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 评论的查询
 * <p>Title: SearchController</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年3月3日下午1:40:47
 * @version 1.0.0
 */
@Controller
@RequestMapping("/comment")
public class SearchController {
	
	@Autowired
	private SearchService searchService;
	
	    @RequestMapping("/search")
		public String getAdminListByPage(@RequestParam(value="page",defaultValue="1") int page, 
											@RequestParam(value="rows",defaultValue="3") int rows,
											Model model,HttpServletRequest request) throws Exception{
	    	String content = request.getParameter("content");
	    	if(content != null){
	    		content = URLEncoder.encode(content,"iso8859-1");
	    		content = URLDecoder.decode(content,"UTF-8");
	    	}
	    	if(content == null){
	    		content = "寂寞";
	    	}
	    	PageBean<Map<String,Object>> searchList = searchService.getSearchResult(page, rows, content);
	    	model.addAttribute("page",page);
			model.addAttribute("pageBean", searchList);
			model.addAttribute("content",content);
			return "search";
		}
	
}
