package com.news.linglian.serviceImpl;

import java.util.List;

import com.news.linglian.entity.Comment;

import com.news.linglian.dao.ICommentDao;
import com.news.linglian.daoImpl.ICommentDaoImpl;
import com.news.linglian.service.ICommentService;

public class ICommentServiceImpl implements ICommentService {
	ICommentDao dao = null;

	public ICommentServiceImpl() {
		dao = new ICommentDaoImpl();
	}
    public int update(Comment comment, Comment keyComment) {
        return dao.update(comment, keyComment);
    }
    public int updateOfCommentId(Comment comment, String commentId) {
        return dao.updateOfCommentId(comment, commentId);
    }
    public int updateOfNewsId(Comment comment, String newsId) {
        return dao.updateOfNewsId(comment, newsId);
    }
    public int updateOfCcommentId(Comment comment, String ccommentId) {
        return dao.updateOfCcommentId(comment, ccommentId);
    }
    public int updateOfBody(Comment comment, String body) {
        return dao.updateOfBody(comment, body);
    }
    public int updateOfTime(Comment comment, String time) {
        return dao.updateOfTime(comment, time);
    }
    public int updateOfGood(Comment comment, String good) {
        return dao.updateOfGood(comment, good);
    }
    public int updateOfBad(Comment comment, String bad) {
        return dao.updateOfBad(comment, bad);
    }
    public int updateOfUserId(Comment comment, String userId) {
        return dao.updateOfUserId(comment, userId);
    }
    public int updateOfCommentIdAndNewsId(Comment comment, String commentId, String newsId) {
        return dao.updateOfCommentIdAndNewsId(comment, commentId, newsId);
    }
    public int updateOfCommentIdAndCcommentId(Comment comment, String commentId, String ccommentId) {
        return dao.updateOfCommentIdAndCcommentId(comment, commentId, ccommentId);
    }
    public int updateOfCommentIdAndBody(Comment comment, String commentId, String body) {
        return dao.updateOfCommentIdAndBody(comment, commentId, body);
    }
    public int updateOfCommentIdAndTime(Comment comment, String commentId, String time) {
        return dao.updateOfCommentIdAndTime(comment, commentId, time);
    }
    public int updateOfCommentIdAndGood(Comment comment, String commentId, String good) {
        return dao.updateOfCommentIdAndGood(comment, commentId, good);
    }
    public int updateOfCommentIdAndBad(Comment comment, String commentId, String bad) {
        return dao.updateOfCommentIdAndBad(comment, commentId, bad);
    }
    public int updateOfCommentIdAndUserId(Comment comment, String commentId, String userId) {
        return dao.updateOfCommentIdAndUserId(comment, commentId, userId);
    }
    public int updateOfNewsIdAndCcommentId(Comment comment, String newsId, String ccommentId) {
        return dao.updateOfNewsIdAndCcommentId(comment, newsId, ccommentId);
    }
    public int updateOfNewsIdAndBody(Comment comment, String newsId, String body) {
        return dao.updateOfNewsIdAndBody(comment, newsId, body);
    }
    public int updateOfNewsIdAndTime(Comment comment, String newsId, String time) {
        return dao.updateOfNewsIdAndTime(comment, newsId, time);
    }
    public int updateOfNewsIdAndGood(Comment comment, String newsId, String good) {
        return dao.updateOfNewsIdAndGood(comment, newsId, good);
    }
    public int updateOfNewsIdAndBad(Comment comment, String newsId, String bad) {
        return dao.updateOfNewsIdAndBad(comment, newsId, bad);
    }
    public int updateOfNewsIdAndUserId(Comment comment, String newsId, String userId) {
        return dao.updateOfNewsIdAndUserId(comment, newsId, userId);
    }
    public int updateOfCcommentIdAndBody(Comment comment, String ccommentId, String body) {
        return dao.updateOfCcommentIdAndBody(comment, ccommentId, body);
    }
    public int updateOfCcommentIdAndTime(Comment comment, String ccommentId, String time) {
        return dao.updateOfCcommentIdAndTime(comment, ccommentId, time);
    }
    public int updateOfCcommentIdAndGood(Comment comment, String ccommentId, String good) {
        return dao.updateOfCcommentIdAndGood(comment, ccommentId, good);
    }
    public int updateOfCcommentIdAndBad(Comment comment, String ccommentId, String bad) {
        return dao.updateOfCcommentIdAndBad(comment, ccommentId, bad);
    }
    public int updateOfCcommentIdAndUserId(Comment comment, String ccommentId, String userId) {
        return dao.updateOfCcommentIdAndUserId(comment, ccommentId, userId);
    }
    public int updateOfBodyAndTime(Comment comment, String body, String time) {
        return dao.updateOfBodyAndTime(comment, body, time);
    }
    public int updateOfBodyAndGood(Comment comment, String body, String good) {
        return dao.updateOfBodyAndGood(comment, body, good);
    }
    public int updateOfBodyAndBad(Comment comment, String body, String bad) {
        return dao.updateOfBodyAndBad(comment, body, bad);
    }
    public int updateOfBodyAndUserId(Comment comment, String body, String userId) {
        return dao.updateOfBodyAndUserId(comment, body, userId);
    }
    public int updateOfTimeAndGood(Comment comment, String time, String good) {
        return dao.updateOfTimeAndGood(comment, time, good);
    }
    public int updateOfTimeAndBad(Comment comment, String time, String bad) {
        return dao.updateOfTimeAndBad(comment, time, bad);
    }
    public int updateOfTimeAndUserId(Comment comment, String time, String userId) {
        return dao.updateOfTimeAndUserId(comment, time, userId);
    }
    public int updateOfGoodAndBad(Comment comment, String good, String bad) {
        return dao.updateOfGoodAndBad(comment, good, bad);
    }
    public int updateOfGoodAndUserId(Comment comment, String good, String userId) {
        return dao.updateOfGoodAndUserId(comment, good, userId);
    }
    public int updateOfBadAndUserId(Comment comment, String bad, String userId) {
        return dao.updateOfBadAndUserId(comment, bad, userId);
    }
    public int remove(Comment comment) {
        return dao.remove(comment);
    }
    public int removeOfCommentId(String commentId) {
        return dao.removeOfCommentId(commentId);
    }
    public int removeOfNewsId(String newsId) {
        return dao.removeOfNewsId(newsId);
    }
    public int removeOfCcommentId(String ccommentId) {
        return dao.removeOfCcommentId(ccommentId);
    }
    public int removeOfBody(String body) {
        return dao.removeOfBody(body);
    }
    public int removeOfTime(String time) {
        return dao.removeOfTime(time);
    }
    public int removeOfGood(String good) {
        return dao.removeOfGood(good);
    }
    public int removeOfBad(String bad) {
        return dao.removeOfBad(bad);
    }
    public int removeOfUserId(String userId) {
        return dao.removeOfUserId(userId);
    }
    public int removeOfCommentIdAndNewsId(String commentId, String newsId) {
        return dao.removeOfCommentIdAndNewsId(commentId, newsId);
    }
    public int removeOfCommentIdAndCcommentId(String commentId, String ccommentId) {
        return dao.removeOfCommentIdAndCcommentId(commentId, ccommentId);
    }
    public int removeOfCommentIdAndBody(String commentId, String body) {
        return dao.removeOfCommentIdAndBody(commentId, body);
    }
    public int removeOfCommentIdAndTime(String commentId, String time) {
        return dao.removeOfCommentIdAndTime(commentId, time);
    }
    public int removeOfCommentIdAndGood(String commentId, String good) {
        return dao.removeOfCommentIdAndGood(commentId, good);
    }
    public int removeOfCommentIdAndBad(String commentId, String bad) {
        return dao.removeOfCommentIdAndBad(commentId, bad);
    }
    public int removeOfCommentIdAndUserId(String commentId, String userId) {
        return dao.removeOfCommentIdAndUserId(commentId, userId);
    }
    public int removeOfNewsIdAndCcommentId(String newsId, String ccommentId) {
        return dao.removeOfNewsIdAndCcommentId(newsId, ccommentId);
    }
    public int removeOfNewsIdAndBody(String newsId, String body) {
        return dao.removeOfNewsIdAndBody(newsId, body);
    }
    public int removeOfNewsIdAndTime(String newsId, String time) {
        return dao.removeOfNewsIdAndTime(newsId, time);
    }
    public int removeOfNewsIdAndGood(String newsId, String good) {
        return dao.removeOfNewsIdAndGood(newsId, good);
    }
    public int removeOfNewsIdAndBad(String newsId, String bad) {
        return dao.removeOfNewsIdAndBad(newsId, bad);
    }
    public int removeOfNewsIdAndUserId(String newsId, String userId) {
        return dao.removeOfNewsIdAndUserId(newsId, userId);
    }
    public int removeOfCcommentIdAndBody(String ccommentId, String body) {
        return dao.removeOfCcommentIdAndBody(ccommentId, body);
    }
    public int removeOfCcommentIdAndTime(String ccommentId, String time) {
        return dao.removeOfCcommentIdAndTime(ccommentId, time);
    }
    public int removeOfCcommentIdAndGood(String ccommentId, String good) {
        return dao.removeOfCcommentIdAndGood(ccommentId, good);
    }
    public int removeOfCcommentIdAndBad(String ccommentId, String bad) {
        return dao.removeOfCcommentIdAndBad(ccommentId, bad);
    }
    public int removeOfCcommentIdAndUserId(String ccommentId, String userId) {
        return dao.removeOfCcommentIdAndUserId(ccommentId, userId);
    }
    public int removeOfBodyAndTime(String body, String time) {
        return dao.removeOfBodyAndTime(body, time);
    }
    public int removeOfBodyAndGood(String body, String good) {
        return dao.removeOfBodyAndGood(body, good);
    }
    public int removeOfBodyAndBad(String body, String bad) {
        return dao.removeOfBodyAndBad(body, bad);
    }
    public int removeOfBodyAndUserId(String body, String userId) {
        return dao.removeOfBodyAndUserId(body, userId);
    }
    public int removeOfTimeAndGood(String time, String good) {
        return dao.removeOfTimeAndGood(time, good);
    }
    public int removeOfTimeAndBad(String time, String bad) {
        return dao.removeOfTimeAndBad(time, bad);
    }
    public int removeOfTimeAndUserId(String time, String userId) {
        return dao.removeOfTimeAndUserId(time, userId);
    }
    public int removeOfGoodAndBad(String good, String bad) {
        return dao.removeOfGoodAndBad(good, bad);
    }
    public int removeOfGoodAndUserId(String good, String userId) {
        return dao.removeOfGoodAndUserId(good, userId);
    }
    public int removeOfBadAndUserId(String bad, String userId) {
        return dao.removeOfBadAndUserId(bad, userId);
    }
    public int insert(Comment comment) {
        return dao.insert(comment);
    }
    public int insertOfCommentId(String commentId) {
        return dao.insertOfCommentId(commentId);
    }
    public int insertOfNewsId(String newsId) {
        return dao.insertOfNewsId(newsId);
    }
    public int insertOfCcommentId(String ccommentId) {
        return dao.insertOfCcommentId(ccommentId);
    }
    public int insertOfBody(String body) {
        return dao.insertOfBody(body);
    }
    public int insertOfTime(String time) {
        return dao.insertOfTime(time);
    }
    public int insertOfGood(String good) {
        return dao.insertOfGood(good);
    }
    public int insertOfBad(String bad) {
        return dao.insertOfBad(bad);
    }
    public int insertOfUserId(String userId) {
        return dao.insertOfUserId(userId);
    }
    public int insertOfCommentIdAndNewsId(String commentId, String newsId) {
        return dao.insertOfCommentIdAndNewsId(commentId, newsId);
    }
    public int insertOfCommentIdAndCcommentId(String commentId, String ccommentId) {
        return dao.insertOfCommentIdAndCcommentId(commentId, ccommentId);
    }
    public int insertOfCommentIdAndBody(String commentId, String body) {
        return dao.insertOfCommentIdAndBody(commentId, body);
    }
    public int insertOfCommentIdAndTime(String commentId, String time) {
        return dao.insertOfCommentIdAndTime(commentId, time);
    }
    public int insertOfCommentIdAndGood(String commentId, String good) {
        return dao.insertOfCommentIdAndGood(commentId, good);
    }
    public int insertOfCommentIdAndBad(String commentId, String bad) {
        return dao.insertOfCommentIdAndBad(commentId, bad);
    }
    public int insertOfCommentIdAndUserId(String commentId, String userId) {
        return dao.insertOfCommentIdAndUserId(commentId, userId);
    }
    public int insertOfNewsIdAndCcommentId(String newsId, String ccommentId) {
        return dao.insertOfNewsIdAndCcommentId(newsId, ccommentId);
    }
    public int insertOfNewsIdAndBody(String newsId, String body) {
        return dao.insertOfNewsIdAndBody(newsId, body);
    }
    public int insertOfNewsIdAndTime(String newsId, String time) {
        return dao.insertOfNewsIdAndTime(newsId, time);
    }
    public int insertOfNewsIdAndGood(String newsId, String good) {
        return dao.insertOfNewsIdAndGood(newsId, good);
    }
    public int insertOfNewsIdAndBad(String newsId, String bad) {
        return dao.insertOfNewsIdAndBad(newsId, bad);
    }
    public int insertOfNewsIdAndUserId(String newsId, String userId) {
        return dao.insertOfNewsIdAndUserId(newsId, userId);
    }
    public int insertOfCcommentIdAndBody(String ccommentId, String body) {
        return dao.insertOfCcommentIdAndBody(ccommentId, body);
    }
    public int insertOfCcommentIdAndTime(String ccommentId, String time) {
        return dao.insertOfCcommentIdAndTime(ccommentId, time);
    }
    public int insertOfCcommentIdAndGood(String ccommentId, String good) {
        return dao.insertOfCcommentIdAndGood(ccommentId, good);
    }
    public int insertOfCcommentIdAndBad(String ccommentId, String bad) {
        return dao.insertOfCcommentIdAndBad(ccommentId, bad);
    }
    public int insertOfCcommentIdAndUserId(String ccommentId, String userId) {
        return dao.insertOfCcommentIdAndUserId(ccommentId, userId);
    }
    public int insertOfBodyAndTime(String body, String time) {
        return dao.insertOfBodyAndTime(body, time);
    }
    public int insertOfBodyAndGood(String body, String good) {
        return dao.insertOfBodyAndGood(body, good);
    }
    public int insertOfBodyAndBad(String body, String bad) {
        return dao.insertOfBodyAndBad(body, bad);
    }
    public int insertOfBodyAndUserId(String body, String userId) {
        return dao.insertOfBodyAndUserId(body, userId);
    }
    public int insertOfTimeAndGood(String time, String good) {
        return dao.insertOfTimeAndGood(time, good);
    }
    public int insertOfTimeAndBad(String time, String bad) {
        return dao.insertOfTimeAndBad(time, bad);
    }
    public int insertOfTimeAndUserId(String time, String userId) {
        return dao.insertOfTimeAndUserId(time, userId);
    }
    public int insertOfGoodAndBad(String good, String bad) {
        return dao.insertOfGoodAndBad(good, bad);
    }
    public int insertOfGoodAndUserId(String good, String userId) {
        return dao.insertOfGoodAndUserId(good, userId);
    }
    public int insertOfBadAndUserId(String bad, String userId) {
        return dao.insertOfBadAndUserId(bad, userId);
    }
    public Comment getComment(Comment comment) {
        return dao.getComment(comment);
    }
    public Comment getCommentOfCommentId(String commentId) {
        return dao.getCommentOfCommentId(commentId);
    }
    public Comment getCommentOfNewsId(String newsId) {
        return dao.getCommentOfNewsId(newsId);
    }
    public Comment getCommentOfCcommentId(String ccommentId) {
        return dao.getCommentOfCcommentId(ccommentId);
    }
    public Comment getCommentOfBody(String body) {
        return dao.getCommentOfBody(body);
    }
    public Comment getCommentOfTime(String time) {
        return dao.getCommentOfTime(time);
    }
    public Comment getCommentOfGood(String good) {
        return dao.getCommentOfGood(good);
    }
    public Comment getCommentOfBad(String bad) {
        return dao.getCommentOfBad(bad);
    }
    public Comment getCommentOfUserId(String userId) {
        return dao.getCommentOfUserId(userId);
    }
    public Comment getCommentOfCommentIdAndNewsId(String commentId, String newsId) {
        return dao.getCommentOfCommentIdAndNewsId(commentId, newsId);
    }
    public Comment getCommentOfCommentIdAndCcommentId(String commentId, String ccommentId) {
        return dao.getCommentOfCommentIdAndCcommentId(commentId, ccommentId);
    }
    public Comment getCommentOfCommentIdAndBody(String commentId, String body) {
        return dao.getCommentOfCommentIdAndBody(commentId, body);
    }
    public Comment getCommentOfCommentIdAndTime(String commentId, String time) {
        return dao.getCommentOfCommentIdAndTime(commentId, time);
    }
    public Comment getCommentOfCommentIdAndGood(String commentId, String good) {
        return dao.getCommentOfCommentIdAndGood(commentId, good);
    }
    public Comment getCommentOfCommentIdAndBad(String commentId, String bad) {
        return dao.getCommentOfCommentIdAndBad(commentId, bad);
    }
    public Comment getCommentOfCommentIdAndUserId(String commentId, String userId) {
        return dao.getCommentOfCommentIdAndUserId(commentId, userId);
    }
    public Comment getCommentOfNewsIdAndCcommentId(String newsId, String ccommentId) {
        return dao.getCommentOfNewsIdAndCcommentId(newsId, ccommentId);
    }
    public Comment getCommentOfNewsIdAndBody(String newsId, String body) {
        return dao.getCommentOfNewsIdAndBody(newsId, body);
    }
    public Comment getCommentOfNewsIdAndTime(String newsId, String time) {
        return dao.getCommentOfNewsIdAndTime(newsId, time);
    }
    public Comment getCommentOfNewsIdAndGood(String newsId, String good) {
        return dao.getCommentOfNewsIdAndGood(newsId, good);
    }
    public Comment getCommentOfNewsIdAndBad(String newsId, String bad) {
        return dao.getCommentOfNewsIdAndBad(newsId, bad);
    }
    public Comment getCommentOfNewsIdAndUserId(String newsId, String userId) {
        return dao.getCommentOfNewsIdAndUserId(newsId, userId);
    }
    public Comment getCommentOfCcommentIdAndBody(String ccommentId, String body) {
        return dao.getCommentOfCcommentIdAndBody(ccommentId, body);
    }
    public Comment getCommentOfCcommentIdAndTime(String ccommentId, String time) {
        return dao.getCommentOfCcommentIdAndTime(ccommentId, time);
    }
    public Comment getCommentOfCcommentIdAndGood(String ccommentId, String good) {
        return dao.getCommentOfCcommentIdAndGood(ccommentId, good);
    }
    public Comment getCommentOfCcommentIdAndBad(String ccommentId, String bad) {
        return dao.getCommentOfCcommentIdAndBad(ccommentId, bad);
    }
    public Comment getCommentOfCcommentIdAndUserId(String ccommentId, String userId) {
        return dao.getCommentOfCcommentIdAndUserId(ccommentId, userId);
    }
    public Comment getCommentOfBodyAndTime(String body, String time) {
        return dao.getCommentOfBodyAndTime(body, time);
    }
    public Comment getCommentOfBodyAndGood(String body, String good) {
        return dao.getCommentOfBodyAndGood(body, good);
    }
    public Comment getCommentOfBodyAndBad(String body, String bad) {
        return dao.getCommentOfBodyAndBad(body, bad);
    }
    public Comment getCommentOfBodyAndUserId(String body, String userId) {
        return dao.getCommentOfBodyAndUserId(body, userId);
    }
    public Comment getCommentOfTimeAndGood(String time, String good) {
        return dao.getCommentOfTimeAndGood(time, good);
    }
    public Comment getCommentOfTimeAndBad(String time, String bad) {
        return dao.getCommentOfTimeAndBad(time, bad);
    }
    public Comment getCommentOfTimeAndUserId(String time, String userId) {
        return dao.getCommentOfTimeAndUserId(time, userId);
    }
    public Comment getCommentOfGoodAndBad(String good, String bad) {
        return dao.getCommentOfGoodAndBad(good, bad);
    }
    public Comment getCommentOfGoodAndUserId(String good, String userId) {
        return dao.getCommentOfGoodAndUserId(good, userId);
    }
    public Comment getCommentOfBadAndUserId(String bad, String userId) {
        return dao.getCommentOfBadAndUserId(bad, userId);
    }
    public List<Comment> getComments(Comment comment) {
        return dao.getComments(comment);
    }
    public List<Comment> getCommentsOfCommentId(String commentId) {
        return dao.getCommentsOfCommentId(commentId);
    }
    public List<Comment> getCommentsOfNewsId(String newsId) {
        return dao.getCommentsOfNewsId(newsId);
    }
    public List<Comment> getCommentsOfCcommentId(String ccommentId) {
        return dao.getCommentsOfCcommentId(ccommentId);
    }
    public List<Comment> getCommentsOfBody(String body) {
        return dao.getCommentsOfBody(body);
    }
    public List<Comment> getCommentsOfTime(String time) {
        return dao.getCommentsOfTime(time);
    }
    public List<Comment> getCommentsOfGood(String good) {
        return dao.getCommentsOfGood(good);
    }
    public List<Comment> getCommentsOfBad(String bad) {
        return dao.getCommentsOfBad(bad);
    }
    public List<Comment> getCommentsOfUserId(String userId) {
        return dao.getCommentsOfUserId(userId);
    }
    public List<Comment> getCommentsOfCommentIdAndNewsId(String commentId, String newsId) {
        return dao.getCommentsOfCommentIdAndNewsId(commentId, newsId);
    }
    public List<Comment> getCommentsOfCommentIdAndCcommentId(String commentId, String ccommentId) {
        return dao.getCommentsOfCommentIdAndCcommentId(commentId, ccommentId);
    }
    public List<Comment> getCommentsOfCommentIdAndBody(String commentId, String body) {
        return dao.getCommentsOfCommentIdAndBody(commentId, body);
    }
    public List<Comment> getCommentsOfCommentIdAndTime(String commentId, String time) {
        return dao.getCommentsOfCommentIdAndTime(commentId, time);
    }
    public List<Comment> getCommentsOfCommentIdAndGood(String commentId, String good) {
        return dao.getCommentsOfCommentIdAndGood(commentId, good);
    }
    public List<Comment> getCommentsOfCommentIdAndBad(String commentId, String bad) {
        return dao.getCommentsOfCommentIdAndBad(commentId, bad);
    }
    public List<Comment> getCommentsOfCommentIdAndUserId(String commentId, String userId) {
        return dao.getCommentsOfCommentIdAndUserId(commentId, userId);
    }
    public List<Comment> getCommentsOfNewsIdAndCcommentId(String newsId, String ccommentId) {
        return dao.getCommentsOfNewsIdAndCcommentId(newsId, ccommentId);
    }
    public List<Comment> getCommentsOfNewsIdAndBody(String newsId, String body) {
        return dao.getCommentsOfNewsIdAndBody(newsId, body);
    }
    public List<Comment> getCommentsOfNewsIdAndTime(String newsId, String time) {
        return dao.getCommentsOfNewsIdAndTime(newsId, time);
    }
    public List<Comment> getCommentsOfNewsIdAndGood(String newsId, String good) {
        return dao.getCommentsOfNewsIdAndGood(newsId, good);
    }
    public List<Comment> getCommentsOfNewsIdAndBad(String newsId, String bad) {
        return dao.getCommentsOfNewsIdAndBad(newsId, bad);
    }
    public List<Comment> getCommentsOfNewsIdAndUserId(String newsId, String userId) {
        return dao.getCommentsOfNewsIdAndUserId(newsId, userId);
    }
    public List<Comment> getCommentsOfCcommentIdAndBody(String ccommentId, String body) {
        return dao.getCommentsOfCcommentIdAndBody(ccommentId, body);
    }
    public List<Comment> getCommentsOfCcommentIdAndTime(String ccommentId, String time) {
        return dao.getCommentsOfCcommentIdAndTime(ccommentId, time);
    }
    public List<Comment> getCommentsOfCcommentIdAndGood(String ccommentId, String good) {
        return dao.getCommentsOfCcommentIdAndGood(ccommentId, good);
    }
    public List<Comment> getCommentsOfCcommentIdAndBad(String ccommentId, String bad) {
        return dao.getCommentsOfCcommentIdAndBad(ccommentId, bad);
    }
    public List<Comment> getCommentsOfCcommentIdAndUserId(String ccommentId, String userId) {
        return dao.getCommentsOfCcommentIdAndUserId(ccommentId, userId);
    }
    public List<Comment> getCommentsOfBodyAndTime(String body, String time) {
        return dao.getCommentsOfBodyAndTime(body, time);
    }
    public List<Comment> getCommentsOfBodyAndGood(String body, String good) {
        return dao.getCommentsOfBodyAndGood(body, good);
    }
    public List<Comment> getCommentsOfBodyAndBad(String body, String bad) {
        return dao.getCommentsOfBodyAndBad(body, bad);
    }
    public List<Comment> getCommentsOfBodyAndUserId(String body, String userId) {
        return dao.getCommentsOfBodyAndUserId(body, userId);
    }
    public List<Comment> getCommentsOfTimeAndGood(String time, String good) {
        return dao.getCommentsOfTimeAndGood(time, good);
    }
    public List<Comment> getCommentsOfTimeAndBad(String time, String bad) {
        return dao.getCommentsOfTimeAndBad(time, bad);
    }
    public List<Comment> getCommentsOfTimeAndUserId(String time, String userId) {
        return dao.getCommentsOfTimeAndUserId(time, userId);
    }
    public List<Comment> getCommentsOfGoodAndBad(String good, String bad) {
        return dao.getCommentsOfGoodAndBad(good, bad);
    }
    public List<Comment> getCommentsOfGoodAndUserId(String good, String userId) {
        return dao.getCommentsOfGoodAndUserId(good, userId);
    }
    public List<Comment> getCommentsOfBadAndUserId(String bad, String userId) {
        return dao.getCommentsOfBadAndUserId(bad, userId);
    }
}
