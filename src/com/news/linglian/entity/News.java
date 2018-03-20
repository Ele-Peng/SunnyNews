package com.news.linglian.entity;

public class News {
    private String newsId;
    private String title;
    private String body;
    private String userId;
    private String userNewsTypeId;
    private String status;
    private String buff;
    private String param;
    private String newsTypeId;
    private String path;
    private String good;
    private String bad;
    private String time;
    private String search;
    private String bUserIds;
    private String money;

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNewsTypeId() {
        return userNewsTypeId;
    }

    public void setUserNewsTypeId(String userNewsTypeId) {
        this.userNewsTypeId = userNewsTypeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBuff() {
        return buff;
    }

    public void setBuff(String buff) {
        this.buff = buff;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getNewsTypeId() {
        return newsTypeId;
    }

    public void setNewsTypeId(String newsTypeId) {
        this.newsTypeId = newsTypeId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public String getBad() {
        return bad;
    }

    public void setBad(String bad) {
        this.bad = bad;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getBUserIds() {
        return bUserIds;
    }

    public void setBUserIds(String bUserIds) {
        this.bUserIds = bUserIds;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "News [newsId=" + newsId + ", title=" + title + ", body=" + body + ", userId=" + userId + ", userNewsTypeId=" + userNewsTypeId + ", status=" + status + ", buff=" + buff + ", param=" + param + ", newsTypeId=" + newsTypeId + ", path=" + path + ", good=" + good + ", bad=" + bad + ", time=" + time + ", search=" + search + ", bUserIds=" + bUserIds + ", money=" + money + ", ]";
    }

}
