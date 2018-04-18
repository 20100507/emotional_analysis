package org.bianqi.web.wangyi.controller;

import java.util.List;
import java.util.Map;

import org.bianqi.web.wangyi.service.SongService;
import org.bianqi.web.wangyi.vo.SongTopVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 歌曲相关的Controller
 * <p>Title: SongController</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年3月21日下午10:40:32
 * @version 1.0.0
 */
@Controller
@RequestMapping("/song")
public class SongController {
	
	@Autowired
	private SongService songService;
	
	@RequestMapping("songtop")
	public String songtop(ModelMap model) throws Exception{
		List<SongTopVo> songTopList = songService.getSongTopList();
		model.put("songTopList", songTopList);
		return "song_top";
	}
	
}
