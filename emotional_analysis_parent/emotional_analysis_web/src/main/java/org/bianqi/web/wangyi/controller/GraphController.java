package org.bianqi.web.wangyi.controller;

import java.util.List;
import java.util.Map;

import org.bianqi.web.wangyi.pojo.GraphTop;
import org.bianqi.web.wangyi.pojo.GraphTriangle;
import org.bianqi.web.wangyi.service.GraphSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 图计算
 * <p>Title: GraphController</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年3月3日下午2:32:56
 * @version 1.0.0
 */
@Controller
@RequestMapping("/graph")
public class GraphController {
	
	@Autowired
	private GraphSerivce graphService;
	
	@RequestMapping("/graphTriangle")
	public String graphTriangle(ModelMap map){
		List<GraphTriangle> graphTriangle = graphService.getGraphTriangle();
		map.put("graphTriangle", graphTriangle);
		return "graph_triangle";
	}
	
	@RequestMapping("/graphTop")
	public String graphTop(ModelMap map){
		List<GraphTop> graphTopList = graphService.getGraphTopList();
		map.put("graphTopList", graphTopList);
		return "graph_top";
	}
	
}
