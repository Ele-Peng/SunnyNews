package com.news.linglian.entity;

public class Comment {
    private String commentId;
    private String newsId;
    private String ccommentId;
    private String body;
    private String time;
    private String good;
    private String bad;
    private String userId;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getCcommentId() {
        return ccommentId;
    }

    public void setCcommentId(String ccommentId) {
        this.ccommentId = ccommentId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Comment [commentId=" + commentId + ", newsId=" + newsId + ", ccommentId=" + ccommentId + ", body=" + body + ", time=" + time + ", good=" + good + ", bad=" + bad + ", userId=" + userId + ", ]";
    }

}
