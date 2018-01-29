package org.bianqi.web.wangyi.vo;

/**
 * 歌曲排行榜vo
 * <p>Title: SongTopVo</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年3月21日下午10:42:26
 * @version 1.0.0
 */
public class SongTopVo {
	
	private int songTop;
	private String songName;
	private String singerName;
	private int songCount;
	public int getSongTop() {
		return songTop;
	}
	public void setSongTop(int songTop) {
		this.songTop = songTop;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public int getSongCount() {
		return songCount;
	}
	public void setSongCount(int songCount) {
		this.songCount = songCount;
	}
	@Override
	public String toString() {
		return "SongTopVo [songTop=" + songTop + ", songName=" + songName + ", singerName=" + singerName
				+ ", songCount=" + songCount + "]";
	}
	
}
