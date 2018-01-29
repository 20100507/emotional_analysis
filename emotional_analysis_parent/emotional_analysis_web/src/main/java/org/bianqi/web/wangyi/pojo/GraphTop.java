package org.bianqi.web.wangyi.pojo;

public class GraphTop {
    private Integer graphtopIp;

    private Integer userId;

    private String name;

    private Float top;

    public Integer getGraphtopIp() {
        return graphtopIp;
    }

    public void setGraphtopIp(Integer graphtopIp) {
        this.graphtopIp = graphtopIp;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getTop() {
        return top;
    }

    public void setTop(Float top) {
        this.top = top;
    }
}