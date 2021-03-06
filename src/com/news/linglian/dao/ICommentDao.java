package com.news.linglian.dao;

import java.util.List;

import com.news.linglian.entity.Comment;

public interface ICommentDao {
    public int update(Comment comment, Comment keyComment);
    public int updateOfCommentId(Comment comment, String commentId);
    public int updateOfNewsId(Comment comment, String newsId);
    public int updateOfCcommentId(Comment comment, String ccommentId);
    public int updateOfBody(Comment comment, String body);
    public int updateOfTime(Comment comment, String time);
    public int updateOfGood(Comment comment, String good);
    public int updateOfBad(Comment comment, String bad);
    public int updateOfUserId(Comment comment, String userId);
    public int updateOfCommentIdAndNewsId(Comment comment, String commentId, String newsId);
    public int updateOfCommentIdAndCcommentId(Comment comment, String commentId, String ccommentId);
    public int updateOfCommentIdAndBody(Comment comment, String commentId, String body);
    public int updateOfCommentIdAndTime(Comment comment, String commentId, String time);
    public int updateOfCommentIdAndGood(Comment comment, String commentId, String good);
    public int updateOfCommentIdAndBad(Comment comment, String commentId, String bad);
    public int updateOfCommentIdAndUserId(Comment comment, String commentId, String userId);
    public int updateOfNewsIdAndCcommentId(Comment comment, String newsId, String ccommentId);
    public int updateOfNewsIdAndBody(Comment comment, String newsId, String body);
    public int updateOfNewsIdAndTime(Comment comment, String newsId, String time);
    public int updateOfNewsIdAndGood(Comment comment, String newsId, String good);
    public int updateOfNewsIdAndBad(Comment comment, String newsId, String bad);
    public int updateOfNewsIdAndUserId(Comment comment, String newsId, String userId);
    public int updateOfCcommentIdAndBody(Comment comment, String ccommentId, String body);
    public int updateOfCcommentIdAndTime(Comment comment, String ccommentId, String time);
    public int updateOfCcommentIdAndGood(Comment comment, String ccommentId, String good);
    public int updateOfCcommentIdAndBad(Comment comment, String ccommentId, String bad);
    public int updateOfCcommentIdAndUserId(Comment comment, String ccommentId, String userId);
    public int updateOfBodyAndTime(Comment comment, String body, String time);
    public int updateOfBodyAndGood(Comment comment, String body, String good);
    public int updateOfBodyAndBad(Comment comment, String body, String bad);
    public int updateOfBodyAndUserId(Comment comment, String body, String userId);
    public int updateOfTimeAndGood(Comment comment, String time, String good);
    public int updateOfTimeAndBad(Comment comment, String time, String bad);
    public int updateOfTimeAndUserId(Comment comment, String time, String userId);
    public int updateOfGoodAndBad(Comment comment, String good, String bad);
    public int updateOfGoodAndUserId(Comment comment, String good, String userId);
    public int updateOfBadAndUserId(Comment comment, String bad, String userId);
    public int remove(Comment comment);
    public int removeOfCommentId(String commentId);
    public int removeOfNewsId(String newsId);
    public int removeOfCcommentId(String ccommentId);
    public int removeOfBody(String body);
    public int removeOfTime(String time);
    public int removeOfGood(String good);
    public int removeOfBad(String bad);
    public int removeOfUserId(String userId);
    public int removeOfCommentIdAndNewsId(String commentId, String newsId);
    public int removeOfCommentIdAndCcommentId(String commentId, String ccommentId);
    public int removeOfCommentIdAndBody(String commentId, String body);
    public int removeOfCommentIdAndTime(String commentId, String time);
    public int removeOfCommentIdAndGood(String commentId, String good);
    public int removeOfCommentIdAndBad(String commentId, String bad);
    public int removeOfCommentIdAndUserId(String commentId, String userId);
    public int removeOfNewsIdAndCcommentId(String newsId, String ccommentId);
    public int removeOfNewsIdAndBody(String newsId, String body);
    public int removeOfNewsIdAndTime(String newsId, String time);
    public int removeOfNewsIdAndGood(String newsId, String good);
    public int removeOfNewsIdAndBad(String newsId, String bad);
    public int removeOfNewsIdAndUserId(String newsId, String userId);
    public int removeOfCcommentIdAndBody(String ccommentId, String body);
    public int removeOfCcommentIdAndTime(String ccommentId, String time);
    public int removeOfCcommentIdAndGood(String ccommentId, String good);
    public int removeOfCcommentIdAndBad(String ccommentId, String bad);
    public int removeOfCcommentIdAndUserId(String ccommentId, String userId);
    public int removeOfBodyAndTime(String body, String time);
    public int removeOfBodyAndGood(String body, String good);
    public int removeOfBodyAndBad(String body, String bad);
    public int removeOfBodyAndUserId(String body, String userId);
    public int removeOfTimeAndGood(String time, String good);
    public int removeOfTimeAndBad(String time, String bad);
    public int removeOfTimeAndUserId(String time, String userId);
    public int removeOfGoodAndBad(String good, String bad);
    public int removeOfGoodAndUserId(String good, String userId);
    public int removeOfBadAndUserId(String bad, String userId);
    public int insert(Comment comment);
    public int insertOfCommentId(String commentId);
    public int insertOfNewsId(String newsId);
    public int insertOfCcommentId(String ccommentId);
    public int insertOfBody(String body);
    public int insertOfTime(String time);
    public int insertOfGood(String good);
    public int insertOfBad(String bad);
    public int insertOfUserId(String userId);
    public int insertOfCommentIdAndNewsId(String commentId, String newsId);
    public int insertOfCommentIdAndCcommentId(String commentId, String ccommentId);
    public int insertOfCommentIdAndBody(String commentId, String body);
    public int insertOfCommentIdAndTime(String commentId, String time);
    public int insertOfCommentIdAndGood(String commentId, String good);
    public int insertOfCommentIdAndBad(String commentId, String bad);
    public int insertOfCommentIdAndUserId(String commentId, String userId);
    public int insertOfNewsIdAndCcommentId(String newsId, String ccommentId);
    public int insertOfNewsIdAndBody(String newsId, String body);
    public int insertOfNewsIdAndTime(String newsId, String time);
    public int insertOfNewsIdAndGood(String newsId, String good);
    public int insertOfNewsIdAndBad(String newsId, String bad);
    public int insertOfNewsIdAndUserId(String newsId, String userId);
    public int insertOfCcommentIdAndBody(String ccommentId, String body);
    public int insertOfCcommentIdAndTime(String ccommentId, String time);
    public int insertOfCcommentIdAndGood(String ccommentId, String good);
    public int insertOfCcommentIdAndBad(String ccommentId, String bad);
    public int insertOfCcommentIdAndUserId(String ccommentId, String userId);
    public int insertOfBodyAndTime(String body, String time);
    public int insertOfBodyAndGood(String body, String good);
    public int insertOfBodyAndBad(String body, String bad);
    public int insertOfBodyAndUserId(String body, String userId);
    public int insertOfTimeAndGood(String time, String good);
    public int insertOfTimeAndBad(String time, String bad);
    public int insertOfTimeAndUserId(String time, String userId);
    public int insertOfGoodAndBad(String good, String bad);
    public int insertOfGoodAndUserId(String good, String userId);
    public int insertOfBadAndUserId(String bad, String userId);
    public Comment getComment(Comment comment);
    public Comment getCommentOfCommentId(String commentId);
    public Comment getCommentOfNewsId(String newsId);
    public Comment getCommentOfCcommentId(String ccommentId);
    public Comment getCommentOfBody(String body);
    public Comment getCommentOfTime(String time);
    public Comment getCommentOfGood(String good);
    public Comment getCommentOfBad(String bad);
    public Comment getCommentOfUserId(String userId);
    public Comment getCommentOfCommentIdAndNewsId(String commentId, String newsId);
    public Comment getCommentOfCommentIdAndCcommentId(String commentId, String ccommentId);
    public Comment getCommentOfCommentIdAndBody(String commentId, String body);
    public Comment getCommentOfCommentIdAndTime(String commentId, String time);
    public Comment getCommentOfCommentIdAndGood(String commentId, String good);
    public Comment getCommentOfCommentIdAndBad(String commentId, String bad);
    public Comment getCommentOfCommentIdAndUserId(String commentId, String userId);
    public Comment getCommentOfNewsIdAndCcommentId(String newsId, String ccommentId);
    public Comment getCommentOfNewsIdAndBody(String newsId, String body);
    public Comment getCommentOfNewsIdAndTime(String newsId, String time);
    public Comment getCommentOfNewsIdAndGood(String newsId, String good);
    public Comment getCommentOfNewsIdAndBad(String newsId, String bad);
    public Comment getCommentOfNewsIdAndUserId(String newsId, String userId);
    public Comment getCommentOfCcommentIdAndBody(String ccommentId, String body);
    public Comment getCommentOfCcommentIdAndTime(String ccommentId, String time);
    public Comment getCommentOfCcommentIdAndGood(String ccommentId, String good);
    public Comment getCommentOfCcommentIdAndBad(String ccommentId, String bad);
    public Comment getCommentOfCcommentIdAndUserId(String ccommentId, String userId);
    public Comment getCommentOfBodyAndTime(String body, String time);
    public Comment getCommentOfBodyAndGood(String body, String good);
    public Comment getCommentOfBodyAndBad(String body, String bad);
    public Comment getCommentOfBodyAndUserId(String body, String userId);
    public Comment getCommentOfTimeAndGood(String time, String good);
    public Comment getCommentOfTimeAndBad(String time, String bad);
    public Comment getCommentOfTimeAndUserId(String time, String userId);
    public Comment getCommentOfGoodAndBad(String good, String bad);
    public Comment getCommentOfGoodAndUserId(String good, String userId);
    public Comment getCommentOfBadAndUserId(String bad, String userId);
    public List<Comment> getComments(Comment comment);
    public List<Comment> getCommentsOfCommentId(String commentId);
    public List<Comment> getCommentsOfNewsId(String newsId);
    public List<Comment> getCommentsOfCcommentId(String ccommentId);
    public List<Comment> getCommentsOfBody(String body);
    public List<Comment> getCommentsOfTime(String time);
    public List<Comment> getCommentsOfGood(String good);
    public List<Comment> getCommentsOfBad(String bad);
    public List<Comment> getCommentsOfUserId(String userId);
    public List<Comment> getCommentsOfCommentIdAndNewsId(String commentId, String newsId);
    public List<Comment> getCommentsOfCommentIdAndCcommentId(String commentId, String ccommentId);
    public List<Comment> getCommentsOfCommentIdAndBody(String commentId, String body);
    public List<Comment> getCommentsOfCommentIdAndTime(String commentId, String time);
    public List<Comment> getCommentsOfCommentIdAndGood(String commentId, String good);
    public List<Comment> getCommentsOfCommentIdAndBad(String commentId, String bad);
    public List<Comment> getCommentsOfCommentIdAndUserId(String commentId, String userId);
    public List<Comment> getCommentsOfNewsIdAndCcommentId(String newsId, String ccommentId);
    public List<Comment> getCommentsOfNewsIdAndBody(String newsId, String body);
    public List<Comment> getCommentsOfNewsIdAndTime(String newsId, String time);
    public List<Comment> getCommentsOfNewsIdAndGood(String newsId, String good);
    public List<Comment> getCommentsOfNewsIdAndBad(String newsId, String bad);
    public List<Comment> getCommentsOfNewsIdAndUserId(String newsId, String userId);
    public List<Comment> getCommentsOfCcommentIdAndBody(String ccommentId, String body);
    public List<Comment> getCommentsOfCcommentIdAndTime(String ccommentId, String time);
    public List<Comment> getCommentsOfCcommentIdAndGood(String ccommentId, String good);
    public List<Comment> getCommentsOfCcommentIdAndBad(String ccommentId, String bad);
    public List<Comment> getCommentsOfCcommentIdAndUserId(String ccommentId, String userId);
    public List<Comment> getCommentsOfBodyAndTime(String body, String time);
    public List<Comment> getCommentsOfBodyAndGood(String body, String good);
    public List<Comment> getCommentsOfBodyAndBad(String body, String bad);
    public List<Comment> getCommentsOfBodyAndUserId(String body, String userId);
    public List<Comment> getCommentsOfTimeAndGood(String time, String good);
    public List<Comment> getCommentsOfTimeAndBad(String time, String bad);
    public List<Comment> getCommentsOfTimeAndUserId(String time, String userId);
    public List<Comment> getCommentsOfGoodAndBad(String good, String bad);
    public List<Comment> getCommentsOfGoodAndUserId(String good, String userId);
    public List<Comment> getCommentsOfBadAndUserId(String bad, String userId);
}
