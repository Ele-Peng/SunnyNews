package com.news.linglian.daoImpl;

import java.util.List;

import com.news.linglian.entity.Comment;

import com.news.linglian.dao.ICommentDao;
import db.DBMan;

public class ICommentDaoImpl implements ICommentDao {
    public int update(Comment comment, Comment keyComment) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(comment, keyComment, "comment");
    }
    public int updateOfCommentId(Comment comment, String commentId) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        return update(comment, kComment);
    }
    public int updateOfNewsId(Comment comment, String newsId) {
        Comment kComment = new Comment();
        kComment.setNewsId(newsId);
        return update(comment, kComment);
    }
    public int updateOfCcommentId(Comment comment, String ccommentId) {
        Comment kComment = new Comment();
        kComment.setCcommentId(ccommentId);
        return update(comment, kComment);
    }
    public int updateOfBody(Comment comment, String body) {
        Comment kComment = new Comment();
        kComment.setBody(body);
        return update(comment, kComment);
    }
    public int updateOfTime(Comment comment, String time) {
        Comment kComment = new Comment();
        kComment.setTime(time);
        return update(comment, kComment);
    }
    public int updateOfGood(Comment comment, String good) {
        Comment kComment = new Comment();
        kComment.setGood(good);
        return update(comment, kComment);
    }
    public int updateOfBad(Comment comment, String bad) {
        Comment kComment = new Comment();
        kComment.setBad(bad);
        return update(comment, kComment);
    }
    public int updateOfUserId(Comment comment, String userId) {
        Comment kComment = new Comment();
        kComment.setUserId(userId);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndNewsId(Comment comment, String commentId, String newsId) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setNewsId(newsId);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndCcommentId(Comment comment, String commentId, String ccommentId) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setCcommentId(ccommentId);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndBody(Comment comment, String commentId, String body) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setBody(body);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndTime(Comment comment, String commentId, String time) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setTime(time);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndGood(Comment comment, String commentId, String good) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setGood(good);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndBad(Comment comment, String commentId, String bad) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setBad(bad);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndUserId(Comment comment, String commentId, String userId) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setUserId(userId);
        return update(comment, kComment);
    }
    public int updateOfNewsIdAndCcommentId(Comment comment, String newsId, String ccommentId) {
        Comment kComment = new Comment();
        kComment.setNewsId(newsId);
        kComment.setCcommentId(ccommentId);
        return update(comment, kComment);
    }
    public int updateOfNewsIdAndBody(Comment comment, String newsId, String body) {
        Comment kComment = new Comment();
        kComment.setNewsId(newsId);
        kComment.setBody(body);
        return update(comment, kComment);
    }
    public int updateOfNewsIdAndTime(Comment comment, String newsId, String time) {
        Comment kComment = new Comment();
        kComment.setNewsId(newsId);
        kComment.setTime(time);
        return update(comment, kComment);
    }
    public int updateOfNewsIdAndGood(Comment comment, String newsId, String good) {
        Comment kComment = new Comment();
        kComment.setNewsId(newsId);
        kComment.setGood(good);
        return update(comment, kComment);
    }
    public int updateOfNewsIdAndBad(Comment comment, String newsId, String bad) {
        Comment kComment = new Comment();
        kComment.setNewsId(newsId);
        kComment.setBad(bad);
        return update(comment, kComment);
    }
    public int updateOfNewsIdAndUserId(Comment comment, String newsId, String userId) {
        Comment kComment = new Comment();
        kComment.setNewsId(newsId);
        kComment.setUserId(userId);
        return update(comment, kComment);
    }
    public int updateOfCcommentIdAndBody(Comment comment, String ccommentId, String body) {
        Comment kComment = new Comment();
        kComment.setCcommentId(ccommentId);
        kComment.setBody(body);
        return update(comment, kComment);
    }
    public int updateOfCcommentIdAndTime(Comment comment, String ccommentId, String time) {
        Comment kComment = new Comment();
        kComment.setCcommentId(ccommentId);
        kComment.setTime(time);
        return update(comment, kComment);
    }
    public int updateOfCcommentIdAndGood(Comment comment, String ccommentId, String good) {
        Comment kComment = new Comment();
        kComment.setCcommentId(ccommentId);
        kComment.setGood(good);
        return update(comment, kComment);
    }
    public int updateOfCcommentIdAndBad(Comment comment, String ccommentId, String bad) {
        Comment kComment = new Comment();
        kComment.setCcommentId(ccommentId);
        kComment.setBad(bad);
        return update(comment, kComment);
    }
    public int updateOfCcommentIdAndUserId(Comment comment, String ccommentId, String userId) {
        Comment kComment = new Comment();
        kComment.setCcommentId(ccommentId);
        kComment.setUserId(userId);
        return update(comment, kComment);
    }
    public int updateOfBodyAndTime(Comment comment, String body, String time) {
        Comment kComment = new Comment();
        kComment.setBody(body);
        kComment.setTime(time);
        return update(comment, kComment);
    }
    public int updateOfBodyAndGood(Comment comment, String body, String good) {
        Comment kComment = new Comment();
        kComment.setBody(body);
        kComment.setGood(good);
        return update(comment, kComment);
    }
    public int updateOfBodyAndBad(Comment comment, String body, String bad) {
        Comment kComment = new Comment();
        kComment.setBody(body);
        kComment.setBad(bad);
        return update(comment, kComment);
    }
    public int updateOfBodyAndUserId(Comment comment, String body, String userId) {
        Comment kComment = new Comment();
        kComment.setBody(body);
        kComment.setUserId(userId);
        return update(comment, kComment);
    }
    public int updateOfTimeAndGood(Comment comment, String time, String good) {
        Comment kComment = new Comment();
        kComment.setTime(time);
        kComment.setGood(good);
        return update(comment, kComment);
    }
    public int updateOfTimeAndBad(Comment comment, String time, String bad) {
        Comment kComment = new Comment();
        kComment.setTime(time);
        kComment.setBad(bad);
        return update(comment, kComment);
    }
    public int updateOfTimeAndUserId(Comment comment, String time, String userId) {
        Comment kComment = new Comment();
        kComment.setTime(time);
        kComment.setUserId(userId);
        return update(comment, kComment);
    }
    public int updateOfGoodAndBad(Comment comment, String good, String bad) {
        Comment kComment = new Comment();
        kComment.setGood(good);
        kComment.setBad(bad);
        return update(comment, kComment);
    }
    public int updateOfGoodAndUserId(Comment comment, String good, String userId) {
        Comment kComment = new Comment();
        kComment.setGood(good);
        kComment.setUserId(userId);
        return update(comment, kComment);
    }
    public int updateOfBadAndUserId(Comment comment, String bad, String userId) {
        Comment kComment = new Comment();
        kComment.setBad(bad);
        kComment.setUserId(userId);
        return update(comment, kComment);
    }
    public int remove(Comment comment) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(comment, "comment");
    }
    public int removeOfCommentId(String commentId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        return remove(comment);
    }
    public int removeOfNewsId(String newsId) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        return remove(comment);
    }
    public int removeOfCcommentId(String ccommentId) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        return remove(comment);
    }
    public int removeOfBody(String body) {
        Comment comment = new Comment();
        comment.setBody(body);
        return remove(comment);
    }
    public int removeOfTime(String time) {
        Comment comment = new Comment();
        comment.setTime(time);
        return remove(comment);
    }
    public int removeOfGood(String good) {
        Comment comment = new Comment();
        comment.setGood(good);
        return remove(comment);
    }
    public int removeOfBad(String bad) {
        Comment comment = new Comment();
        comment.setBad(bad);
        return remove(comment);
    }
    public int removeOfUserId(String userId) {
        Comment comment = new Comment();
        comment.setUserId(userId);
        return remove(comment);
    }
    public int removeOfCommentIdAndNewsId(String commentId, String newsId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setNewsId(newsId);
        return remove(comment);
    }
    public int removeOfCommentIdAndCcommentId(String commentId, String ccommentId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setCcommentId(ccommentId);
        return remove(comment);
    }
    public int removeOfCommentIdAndBody(String commentId, String body) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBody(body);
        return remove(comment);
    }
    public int removeOfCommentIdAndTime(String commentId, String time) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setTime(time);
        return remove(comment);
    }
    public int removeOfCommentIdAndGood(String commentId, String good) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setGood(good);
        return remove(comment);
    }
    public int removeOfCommentIdAndBad(String commentId, String bad) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBad(bad);
        return remove(comment);
    }
    public int removeOfCommentIdAndUserId(String commentId, String userId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setUserId(userId);
        return remove(comment);
    }
    public int removeOfNewsIdAndCcommentId(String newsId, String ccommentId) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setCcommentId(ccommentId);
        return remove(comment);
    }
    public int removeOfNewsIdAndBody(String newsId, String body) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setBody(body);
        return remove(comment);
    }
    public int removeOfNewsIdAndTime(String newsId, String time) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setTime(time);
        return remove(comment);
    }
    public int removeOfNewsIdAndGood(String newsId, String good) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setGood(good);
        return remove(comment);
    }
    public int removeOfNewsIdAndBad(String newsId, String bad) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setBad(bad);
        return remove(comment);
    }
    public int removeOfNewsIdAndUserId(String newsId, String userId) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setUserId(userId);
        return remove(comment);
    }
    public int removeOfCcommentIdAndBody(String ccommentId, String body) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setBody(body);
        return remove(comment);
    }
    public int removeOfCcommentIdAndTime(String ccommentId, String time) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setTime(time);
        return remove(comment);
    }
    public int removeOfCcommentIdAndGood(String ccommentId, String good) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setGood(good);
        return remove(comment);
    }
    public int removeOfCcommentIdAndBad(String ccommentId, String bad) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setBad(bad);
        return remove(comment);
    }
    public int removeOfCcommentIdAndUserId(String ccommentId, String userId) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setUserId(userId);
        return remove(comment);
    }
    public int removeOfBodyAndTime(String body, String time) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setTime(time);
        return remove(comment);
    }
    public int removeOfBodyAndGood(String body, String good) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setGood(good);
        return remove(comment);
    }
    public int removeOfBodyAndBad(String body, String bad) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setBad(bad);
        return remove(comment);
    }
    public int removeOfBodyAndUserId(String body, String userId) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setUserId(userId);
        return remove(comment);
    }
    public int removeOfTimeAndGood(String time, String good) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setGood(good);
        return remove(comment);
    }
    public int removeOfTimeAndBad(String time, String bad) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setBad(bad);
        return remove(comment);
    }
    public int removeOfTimeAndUserId(String time, String userId) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setUserId(userId);
        return remove(comment);
    }
    public int removeOfGoodAndBad(String good, String bad) {
        Comment comment = new Comment();
        comment.setGood(good);
        comment.setBad(bad);
        return remove(comment);
    }
    public int removeOfGoodAndUserId(String good, String userId) {
        Comment comment = new Comment();
        comment.setGood(good);
        comment.setUserId(userId);
        return remove(comment);
    }
    public int removeOfBadAndUserId(String bad, String userId) {
        Comment comment = new Comment();
        comment.setBad(bad);
        comment.setUserId(userId);
        return remove(comment);
    }
    public int insert(Comment comment) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(comment, "comment");
    }
    public int insertOfCommentId(String commentId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        return insert(comment);
    }
    public int insertOfNewsId(String newsId) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        return insert(comment);
    }
    public int insertOfCcommentId(String ccommentId) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        return insert(comment);
    }
    public int insertOfBody(String body) {
        Comment comment = new Comment();
        comment.setBody(body);
        return insert(comment);
    }
    public int insertOfTime(String time) {
        Comment comment = new Comment();
        comment.setTime(time);
        return insert(comment);
    }
    public int insertOfGood(String good) {
        Comment comment = new Comment();
        comment.setGood(good);
        return insert(comment);
    }
    public int insertOfBad(String bad) {
        Comment comment = new Comment();
        comment.setBad(bad);
        return insert(comment);
    }
    public int insertOfUserId(String userId) {
        Comment comment = new Comment();
        comment.setUserId(userId);
        return insert(comment);
    }
    public int insertOfCommentIdAndNewsId(String commentId, String newsId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setNewsId(newsId);
        return insert(comment);
    }
    public int insertOfCommentIdAndCcommentId(String commentId, String ccommentId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setCcommentId(ccommentId);
        return insert(comment);
    }
    public int insertOfCommentIdAndBody(String commentId, String body) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBody(body);
        return insert(comment);
    }
    public int insertOfCommentIdAndTime(String commentId, String time) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setTime(time);
        return insert(comment);
    }
    public int insertOfCommentIdAndGood(String commentId, String good) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setGood(good);
        return insert(comment);
    }
    public int insertOfCommentIdAndBad(String commentId, String bad) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBad(bad);
        return insert(comment);
    }
    public int insertOfCommentIdAndUserId(String commentId, String userId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setUserId(userId);
        return insert(comment);
    }
    public int insertOfNewsIdAndCcommentId(String newsId, String ccommentId) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setCcommentId(ccommentId);
        return insert(comment);
    }
    public int insertOfNewsIdAndBody(String newsId, String body) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setBody(body);
        return insert(comment);
    }
    public int insertOfNewsIdAndTime(String newsId, String time) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setTime(time);
        return insert(comment);
    }
    public int insertOfNewsIdAndGood(String newsId, String good) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setGood(good);
        return insert(comment);
    }
    public int insertOfNewsIdAndBad(String newsId, String bad) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setBad(bad);
        return insert(comment);
    }
    public int insertOfNewsIdAndUserId(String newsId, String userId) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setUserId(userId);
        return insert(comment);
    }
    public int insertOfCcommentIdAndBody(String ccommentId, String body) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setBody(body);
        return insert(comment);
    }
    public int insertOfCcommentIdAndTime(String ccommentId, String time) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setTime(time);
        return insert(comment);
    }
    public int insertOfCcommentIdAndGood(String ccommentId, String good) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setGood(good);
        return insert(comment);
    }
    public int insertOfCcommentIdAndBad(String ccommentId, String bad) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setBad(bad);
        return insert(comment);
    }
    public int insertOfCcommentIdAndUserId(String ccommentId, String userId) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setUserId(userId);
        return insert(comment);
    }
    public int insertOfBodyAndTime(String body, String time) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setTime(time);
        return insert(comment);
    }
    public int insertOfBodyAndGood(String body, String good) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setGood(good);
        return insert(comment);
    }
    public int insertOfBodyAndBad(String body, String bad) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setBad(bad);
        return insert(comment);
    }
    public int insertOfBodyAndUserId(String body, String userId) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setUserId(userId);
        return insert(comment);
    }
    public int insertOfTimeAndGood(String time, String good) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setGood(good);
        return insert(comment);
    }
    public int insertOfTimeAndBad(String time, String bad) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setBad(bad);
        return insert(comment);
    }
    public int insertOfTimeAndUserId(String time, String userId) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setUserId(userId);
        return insert(comment);
    }
    public int insertOfGoodAndBad(String good, String bad) {
        Comment comment = new Comment();
        comment.setGood(good);
        comment.setBad(bad);
        return insert(comment);
    }
    public int insertOfGoodAndUserId(String good, String userId) {
        Comment comment = new Comment();
        comment.setGood(good);
        comment.setUserId(userId);
        return insert(comment);
    }
    public int insertOfBadAndUserId(String bad, String userId) {
        Comment comment = new Comment();
        comment.setBad(bad);
        comment.setUserId(userId);
        return insert(comment);
    }
    public Comment getComment(Comment comment) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(comment, "comment");
    }
    public Comment getCommentOfCommentId(String commentId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        return getComment(comment);
    }
    public Comment getCommentOfNewsId(String newsId) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        return getComment(comment);
    }
    public Comment getCommentOfCcommentId(String ccommentId) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        return getComment(comment);
    }
    public Comment getCommentOfBody(String body) {
        Comment comment = new Comment();
        comment.setBody(body);
        return getComment(comment);
    }
    public Comment getCommentOfTime(String time) {
        Comment comment = new Comment();
        comment.setTime(time);
        return getComment(comment);
    }
    public Comment getCommentOfGood(String good) {
        Comment comment = new Comment();
        comment.setGood(good);
        return getComment(comment);
    }
    public Comment getCommentOfBad(String bad) {
        Comment comment = new Comment();
        comment.setBad(bad);
        return getComment(comment);
    }
    public Comment getCommentOfUserId(String userId) {
        Comment comment = new Comment();
        comment.setUserId(userId);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndNewsId(String commentId, String newsId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setNewsId(newsId);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndCcommentId(String commentId, String ccommentId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setCcommentId(ccommentId);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndBody(String commentId, String body) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBody(body);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndTime(String commentId, String time) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setTime(time);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndGood(String commentId, String good) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setGood(good);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndBad(String commentId, String bad) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBad(bad);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndUserId(String commentId, String userId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setUserId(userId);
        return getComment(comment);
    }
    public Comment getCommentOfNewsIdAndCcommentId(String newsId, String ccommentId) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setCcommentId(ccommentId);
        return getComment(comment);
    }
    public Comment getCommentOfNewsIdAndBody(String newsId, String body) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setBody(body);
        return getComment(comment);
    }
    public Comment getCommentOfNewsIdAndTime(String newsId, String time) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setTime(time);
        return getComment(comment);
    }
    public Comment getCommentOfNewsIdAndGood(String newsId, String good) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setGood(good);
        return getComment(comment);
    }
    public Comment getCommentOfNewsIdAndBad(String newsId, String bad) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setBad(bad);
        return getComment(comment);
    }
    public Comment getCommentOfNewsIdAndUserId(String newsId, String userId) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setUserId(userId);
        return getComment(comment);
    }
    public Comment getCommentOfCcommentIdAndBody(String ccommentId, String body) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setBody(body);
        return getComment(comment);
    }
    public Comment getCommentOfCcommentIdAndTime(String ccommentId, String time) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setTime(time);
        return getComment(comment);
    }
    public Comment getCommentOfCcommentIdAndGood(String ccommentId, String good) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setGood(good);
        return getComment(comment);
    }
    public Comment getCommentOfCcommentIdAndBad(String ccommentId, String bad) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setBad(bad);
        return getComment(comment);
    }
    public Comment getCommentOfCcommentIdAndUserId(String ccommentId, String userId) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setUserId(userId);
        return getComment(comment);
    }
    public Comment getCommentOfBodyAndTime(String body, String time) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setTime(time);
        return getComment(comment);
    }
    public Comment getCommentOfBodyAndGood(String body, String good) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setGood(good);
        return getComment(comment);
    }
    public Comment getCommentOfBodyAndBad(String body, String bad) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setBad(bad);
        return getComment(comment);
    }
    public Comment getCommentOfBodyAndUserId(String body, String userId) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setUserId(userId);
        return getComment(comment);
    }
    public Comment getCommentOfTimeAndGood(String time, String good) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setGood(good);
        return getComment(comment);
    }
    public Comment getCommentOfTimeAndBad(String time, String bad) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setBad(bad);
        return getComment(comment);
    }
    public Comment getCommentOfTimeAndUserId(String time, String userId) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setUserId(userId);
        return getComment(comment);
    }
    public Comment getCommentOfGoodAndBad(String good, String bad) {
        Comment comment = new Comment();
        comment.setGood(good);
        comment.setBad(bad);
        return getComment(comment);
    }
    public Comment getCommentOfGoodAndUserId(String good, String userId) {
        Comment comment = new Comment();
        comment.setGood(good);
        comment.setUserId(userId);
        return getComment(comment);
    }
    public Comment getCommentOfBadAndUserId(String bad, String userId) {
        Comment comment = new Comment();
        comment.setBad(bad);
        comment.setUserId(userId);
        return getComment(comment);
    }
    public List<Comment> getComments(Comment comment) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(comment, "comment");
    }
    public List<Comment> getCommentsOfCommentId(String commentId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfNewsId(String newsId) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCcommentId(String ccommentId) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfBody(String body) {
        Comment comment = new Comment();
        comment.setBody(body);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfTime(String time) {
        Comment comment = new Comment();
        comment.setTime(time);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfGood(String good) {
        Comment comment = new Comment();
        comment.setGood(good);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfBad(String bad) {
        Comment comment = new Comment();
        comment.setBad(bad);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfUserId(String userId) {
        Comment comment = new Comment();
        comment.setUserId(userId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndNewsId(String commentId, String newsId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setNewsId(newsId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndCcommentId(String commentId, String ccommentId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setCcommentId(ccommentId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndBody(String commentId, String body) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBody(body);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndTime(String commentId, String time) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setTime(time);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndGood(String commentId, String good) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setGood(good);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndBad(String commentId, String bad) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBad(bad);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndUserId(String commentId, String userId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setUserId(userId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfNewsIdAndCcommentId(String newsId, String ccommentId) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setCcommentId(ccommentId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfNewsIdAndBody(String newsId, String body) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setBody(body);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfNewsIdAndTime(String newsId, String time) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setTime(time);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfNewsIdAndGood(String newsId, String good) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setGood(good);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfNewsIdAndBad(String newsId, String bad) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setBad(bad);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfNewsIdAndUserId(String newsId, String userId) {
        Comment comment = new Comment();
        comment.setNewsId(newsId);
        comment.setUserId(userId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCcommentIdAndBody(String ccommentId, String body) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setBody(body);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCcommentIdAndTime(String ccommentId, String time) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setTime(time);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCcommentIdAndGood(String ccommentId, String good) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setGood(good);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCcommentIdAndBad(String ccommentId, String bad) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setBad(bad);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCcommentIdAndUserId(String ccommentId, String userId) {
        Comment comment = new Comment();
        comment.setCcommentId(ccommentId);
        comment.setUserId(userId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfBodyAndTime(String body, String time) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setTime(time);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfBodyAndGood(String body, String good) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setGood(good);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfBodyAndBad(String body, String bad) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setBad(bad);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfBodyAndUserId(String body, String userId) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setUserId(userId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfTimeAndGood(String time, String good) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setGood(good);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfTimeAndBad(String time, String bad) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setBad(bad);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfTimeAndUserId(String time, String userId) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setUserId(userId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfGoodAndBad(String good, String bad) {
        Comment comment = new Comment();
        comment.setGood(good);
        comment.setBad(bad);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfGoodAndUserId(String good, String userId) {
        Comment comment = new Comment();
        comment.setGood(good);
        comment.setUserId(userId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfBadAndUserId(String bad, String userId) {
        Comment comment = new Comment();
        comment.setBad(bad);
        comment.setUserId(userId);
        return getComments(comment);
    }
}
