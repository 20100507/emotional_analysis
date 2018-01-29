package org.bianqi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.bianqi.entity.comment.Comments;

public class CommentDataInsert {

	public static void insert(Connection conn, String commentSql,
			Comments comments, long singId,long i) throws Exception {
		PreparedStatement pstmt = conn.prepareStatement(commentSql);
		pstmt.setLong(1, comments.getUser().getUserId());
		pstmt.setLong(2, comments.getCommentId());
		pstmt.setLong(3, comments.getTime());
		String content = comments.getContent().replaceAll(
				"[\ud800\udc00-\udbff\udfff\ud800-\udfff]", "");
		pstmt.setString(4, content);
		pstmt.setLong(5, comments.getLikedCount());
		pstmt.setLong(6, singId);
		String nickname = comments.getUser().getNickname()
				.replaceAll("[\ud800\udc00-\udbff\udfff\ud800-\udfff]", "");
		pstmt.setString(7, nickname);
		pstmt.setString(8, comments.getUser().getAvatarUrl());
		pstmt.executeUpdate();
		System.out.println(" 昵称:" + comments.getUser().getNickname()
				+ "\r评论内容为：" + comments.getContent() + "\r评论时间为:"
				+ comments.getTime() + "\r头像地址"
				+ comments.getUser().getAvatarUrl());
	}
}
