package org.bianqi.web.wangyi.controller;

import java.util.List;

import org.bianqi.web.wangyi.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping("/time")
	@ResponseBody
	public List<Integer> getCommentInterval(){
		List<Integer> commentInterval = commentService.getCommentInterval();
		return commentInterval;
	}
	
}
