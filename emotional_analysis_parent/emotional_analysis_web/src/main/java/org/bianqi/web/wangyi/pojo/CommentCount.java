package org.bianqi.web.wangyi.pojo;

public class CommentCount {
    private Integer wordcountId;

    private String content;

    private Integer contentCount;

    public Integer getWordcountId() {
        return wordcountId;
    }

    public void setWordcountId(Integer wordcountId) {
        this.wordcountId = wordcountId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getContentCount() {
        return contentCount;
    }

    public void setContentCount(Integer contentCount) {
        this.contentCount = contentCount;
    }
}