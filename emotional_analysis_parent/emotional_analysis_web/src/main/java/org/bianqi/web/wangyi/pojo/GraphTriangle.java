package org.bianqi.web.wangyi.pojo;

public class GraphTriangle {
    private Integer triangleId;

    private Integer userId;

    private String name;

    private Float triangleTop;

    public Integer getTriangleId() {
        return triangleId;
    }

    public void setTriangleId(Integer triangleId) {
        this.triangleId = triangleId;
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

    public Float getTriangleTop() {
        return triangleTop;
    }

    public void setTriangleTop(Float triangleTop) {
        this.triangleTop = triangleTop;
    }
}