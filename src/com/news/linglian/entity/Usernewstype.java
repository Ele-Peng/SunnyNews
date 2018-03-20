package com.news.linglian.entity;

public class Usernewstype {
    private String userNewsTypeId;
    private String userId;
    private String name;
    private String body;

    public String getUserNewsTypeId() {
        return userNewsTypeId;
    }

    public void setUserNewsTypeId(String userNewsTypeId) {
        this.userNewsTypeId = userNewsTypeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Usernewstype [userNewsTypeId=" + userNewsTypeId + ", userId=" + userId + ", name=" + name + ", body=" + body + ", ]";
    }

}
