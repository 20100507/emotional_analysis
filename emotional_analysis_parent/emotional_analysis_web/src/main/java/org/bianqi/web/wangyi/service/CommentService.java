package org.bianqi.web.wangyi.service;

import java.util.List;

import org.bianqi.web.wangyi.pojo.CommentCount;

public interface CommentService {
	
	public List<CommentCount> getCommentCountList();
	
	public List<Integer> getCommentInterval();
}
