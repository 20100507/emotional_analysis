package org.bianqi.web.wangyi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.bianqi.web.wangyi.mapper.CommentCountMapper;
import org.bianqi.web.wangyi.mapper.CommentIntervalMapper;
import org.bianqi.web.wangyi.pojo.CommentCount;
import org.bianqi.web.wangyi.pojo.CommentCountExample;
import org.bianqi.web.wangyi.pojo.CommentInterval;
import org.bianqi.web.wangyi.pojo.CommentIntervalExample;
import org.bianqi.web.wangyi.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 评论词云
 * <p>Title: CommentServiceImpl</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年3月2日下午8:07:43
 * @version 1.0.0
 */
@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentCountMapper commentCountMapper;
	
	@Autowired
	private CommentIntervalMapper commentIntervalMapper;
	
	@Override
	public List<CommentCount> getCommentCountList() {
		CommentCountExample commentCountExample = new CommentCountExample();
		List<CommentCount> selectByExample = commentCountMapper.selectByExample(commentCountExample);
		return selectByExample;
	}

	@Override
	public List<Integer> getCommentInterval() {
		CommentIntervalExample commentIntervalExample = new CommentIntervalExample();
		commentIntervalExample.setOrderByClause("intervalTime asc");
		List<CommentInterval> selectByExample = commentIntervalMapper.selectByExample(commentIntervalExample);
		List<Integer> timeList = new ArrayList<>();
		for (CommentInterval commentInterval : selectByExample) {
			timeList.add(commentInterval.getIntervalcount());
		}
		return timeList;
	}
}
