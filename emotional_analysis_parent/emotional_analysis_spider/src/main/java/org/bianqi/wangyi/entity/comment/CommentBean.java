/**
  * Copyright 2017 bejson.com 
  */
package org.bianqi.wangyi.entity.comment;
import java.util.List;

/**
 *   总入口
 * <p>Title: CommentBean</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年10月25日下午2:30:22
 * @version 1.0.0
 */
public class CommentBean {

    private long userId;
    private List<String> topComments;
    private boolean moreHot;
    private List<HotComments> hotComments;
    private long code;
    private List<Comments> comments;
    private long total;
    private boolean more;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public List<String> getTopComments() {
		return topComments;
	}
	public void setTopComments(List<String> topComments) {
		this.topComments = topComments;
	}
	public boolean isMoreHot() {
		return moreHot;
	}
	public void setMoreHot(boolean moreHot) {
		this.moreHot = moreHot;
	}
	public List<HotComments> getHotComments() {
		return hotComments;
	}
	public void setHotComments(List<HotComments> hotComments) {
		this.hotComments = hotComments;
	}
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public List<Comments> getComments() {
		return comments;
	}
	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public boolean isMore() {
		return more;
	}
	public void setMore(boolean more) {
		this.more = more;
	}
   
}