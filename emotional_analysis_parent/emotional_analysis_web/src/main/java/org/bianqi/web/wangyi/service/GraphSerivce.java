package org.bianqi.web.wangyi.service;

import java.util.List;

import org.bianqi.web.wangyi.pojo.GraphTop;
import org.bianqi.web.wangyi.pojo.GraphTriangle;

public interface GraphSerivce {
	
	public List<GraphTop> getGraphTopList();
	
	public List<GraphTriangle> getGraphTriangle();
	
}
