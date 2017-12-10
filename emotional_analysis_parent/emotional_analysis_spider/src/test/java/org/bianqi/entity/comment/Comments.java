/**
  * Copyright 2017 bejson.com 
  */
package org.bianqi.entity.comment;
import java.util.List;

/**
 * Auto-generated: 2017-10-25 14:24:57
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Comments {

    private User user;
    private boolean liked;
    private long commentId;
    private long likedCount;
    private long time;
    private String content;
    private boolean isRemoveHotComment;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public boolean isLiked() {
		return liked;
	}
	public void setLiked(boolean liked) {
		this.liked = liked;
	}
	public long getCommentId() {
		return commentId;
	}
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}
	public long getLikedCount() {
		return likedCount;
	}
	public void setLikedCount(long likedCount) {
		this.likedCount = likedCount;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isRemoveHotComment() {
		return isRemoveHotComment;
	}
	public void setRemoveHotComment(boolean isRemoveHotComment) {
		this.isRemoveHotComment = isRemoveHotComment;
	}
    
}