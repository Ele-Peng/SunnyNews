package com.news.linglian.entity;

public class Newstype {
    private String newsTypeId;
    private String name;
    private String body;

    public String getNewsTypeId() {
        return newsTypeId;
    }

    public void setNewsTypeId(String newsTypeId) {
        this.newsTypeId = newsTypeId;
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
        return "Newstype [newsTypeId=" + newsTypeId + ", name=" + name + ", body=" + body + ", ]";
    }

}
