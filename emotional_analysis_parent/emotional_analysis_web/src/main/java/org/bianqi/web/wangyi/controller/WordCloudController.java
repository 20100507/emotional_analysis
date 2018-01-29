package org.bianqi.web.wangyi.controller;

import java.util.List;

import org.bianqi.web.wangyi.pojo.CommentCount;
import org.bianqi.web.wangyi.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 评论展现
 * <p>Title: CommentController</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年3月2日下午7:52:26
 * @version 1.0.0
 */
@Controller
@RequestMapping("/comment")
public class WordCloudController {
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping("/wordcloud")
	public String wordcloud() {
		return "wordcloud";
	}
	
	@RequestMapping("/comment_word")
	@ResponseBody
	public List<CommentCount> comment_word() {
		List<CommentCount> commentCountList = commentService.getCommentCountList();
		return commentCountList;
	}

}
