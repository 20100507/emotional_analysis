package org.bianqi.web.wangyi.pojo;

public class UserGender {
    private Integer genderId;

    private String gender;

    private Integer genderCount;

    public Integer getGenderId() {
        return genderId;
    }

    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getGenderCount() {
        return genderCount;
    }

    public void setGenderCount(Integer genderCount) {
        this.genderCount = genderCount;
    }
}