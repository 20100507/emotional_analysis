package org.bianqi.wangyi.entity.song;

import java.io.Serializable;

/**
 * <p>Title: SongEntity</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年10月26日下午3:34:29
 * @version 1.0.0
 */
public class SongEntity implements Serializable{
	
	private static final long serialVersionUID = 1657050899695081172L;

	private Long songId;
	private String songName;
	
	public SongEntity(Long songId, String songName) {
		this.songId = songId;
		this.songName = songName;
	}
	public Long getSongId() {
		return songId;
	}
	public void setSongId(Long songId) {
		this.songId = songId;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
}
