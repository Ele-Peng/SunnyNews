package com.news.linglian.daoImpl;

import java.util.List;

import com.news.linglian.entity.Email;

import com.news.linglian.dao.IEmailDao;
import db.DBMan;

public class IEmailDaoImpl implements IEmailDao {
    public int update(Email email, Email keyEmail) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(email, keyEmail, "email");
    }
    public int updateOfEmailId(Email email, String emailId) {
        Email kEmail = new Email();
        kEmail.setEmailId(emailId);
        return update(email, kEmail);
    }
    public int updateOfFromUserId(Email email, String fromUserId) {
        Email kEmail = new Email();
        kEmail.setFromUserId(fromUserId);
        return update(email, kEmail);
    }
    public int updateOfToUserId(Email email, String toUserId) {
        Email kEmail = new Email();
        kEmail.setToUserId(toUserId);
        return update(email, kEmail);
    }
    public int updateOfNewsId(Email email, String newsId) {
        Email kEmail = new Email();
        kEmail.setNewsId(newsId);
        return update(email, kEmail);
    }
    public int updateOfBody(Email email, String body) {
        Email kEmail = new Email();
        kEmail.setBody(body);
        return update(email, kEmail);
    }
    public int updateOfTime(Email email, String time) {
        Email kEmail = new Email();
        kEmail.setTime(time);
        return update(email, kEmail);
    }
    public int updateOfParam(Email email, String param) {
        Email kEmail = new Email();
        kEmail.setParam(param);
        return update(email, kEmail);
    }
    public int updateOfStatus(Email email, String status) {
        Email kEmail = new Email();
        kEmail.setStatus(status);
        return update(email, kEmail);
    }
    public int updateOfEmailIdAndFromUserId(Email email, String emailId, String fromUserId) {
        Email kEmail = new Email();
        kEmail.setEmailId(emailId);
        kEmail.setFromUserId(fromUserId);
        return update(email, kEmail);
    }
    public int updateOfEmailIdAndToUserId(Email email, String emailId, String toUserId) {
        Email kEmail = new Email();
        kEmail.setEmailId(emailId);
        kEmail.setToUserId(toUserId);
        return update(email, kEmail);
    }
    public int updateOfEmailIdAndNewsId(Email email, String emailId, String newsId) {
        Email kEmail = new Email();
        kEmail.setEmailId(emailId);
        kEmail.setNewsId(newsId);
        return update(email, kEmail);
    }
    public int updateOfEmailIdAndBody(Email email, String emailId, String body) {
        Email kEmail = new Email();
        kEmail.setEmailId(emailId);
        kEmail.setBody(body);
        return update(email, kEmail);
    }
    public int updateOfEmailIdAndTime(Email email, String emailId, String time) {
        Email kEmail = new Email();
        kEmail.setEmailId(emailId);
        kEmail.setTime(time);
        return update(email, kEmail);
    }
    public int updateOfEmailIdAndParam(Email email, String emailId, String param) {
        Email kEmail = new Email();
        kEmail.setEmailId(emailId);
        kEmail.setParam(param);
        return update(email, kEmail);
    }
    public int updateOfEmailIdAndStatus(Email email, String emailId, String status) {
        Email kEmail = new Email();
        kEmail.setEmailId(emailId);
        kEmail.setStatus(status);
        return update(email, kEmail);
    }
    public int updateOfFromUserIdAndToUserId(Email email, String fromUserId, String toUserId) {
        Email kEmail = new Email();
        kEmail.setFromUserId(fromUserId);
        kEmail.setToUserId(toUserId);
        return update(email, kEmail);
    }
    public int updateOfFromUserIdAndNewsId(Email email, String fromUserId, String newsId) {
        Email kEmail = new Email();
        kEmail.setFromUserId(fromUserId);
        kEmail.setNewsId(newsId);
        return update(email, kEmail);
    }
    public int updateOfFromUserIdAndBody(Email email, String fromUserId, String body) {
        Email kEmail = new Email();
        kEmail.setFromUserId(fromUserId);
        kEmail.setBody(body);
        return update(email, kEmail);
    }
    public int updateOfFromUserIdAndTime(Email email, String fromUserId, String time) {
        Email kEmail = new Email();
        kEmail.setFromUserId(fromUserId);
        kEmail.setTime(time);
        return update(email, kEmail);
    }
    public int updateOfFromUserIdAndParam(Email email, String fromUserId, String param) {
        Email kEmail = new Email();
        kEmail.setFromUserId(fromUserId);
        kEmail.setParam(param);
        return update(email, kEmail);
    }
    public int updateOfFromUserIdAndStatus(Email email, String fromUserId, String status) {
        Email kEmail = new Email();
        kEmail.setFromUserId(fromUserId);
        kEmail.setStatus(status);
        return update(email, kEmail);
    }
    public int updateOfToUserIdAndNewsId(Email email, String toUserId, String newsId) {
        Email kEmail = new Email();
        kEmail.setToUserId(toUserId);
        kEmail.setNewsId(newsId);
        return update(email, kEmail);
    }
    public int updateOfToUserIdAndBody(Email email, String toUserId, String body) {
        Email kEmail = new Email();
        kEmail.setToUserId(toUserId);
        kEmail.setBody(body);
        return update(email, kEmail);
    }
    public int updateOfToUserIdAndTime(Email email, String toUserId, String time) {
        Email kEmail = new Email();
        kEmail.setToUserId(toUserId);
        kEmail.setTime(time);
        return update(email, kEmail);
    }
    public int updateOfToUserIdAndParam(Email email, String toUserId, String param) {
        Email kEmail = new Email();
        kEmail.setToUserId(toUserId);
        kEmail.setParam(param);
        return update(email, kEmail);
    }
    public int updateOfToUserIdAndStatus(Email email, String toUserId, String status) {
        Email kEmail = new Email();
        kEmail.setToUserId(toUserId);
        kEmail.setStatus(status);
        return update(email, kEmail);
    }
    public int updateOfNewsIdAndBody(Email email, String newsId, String body) {
        Email kEmail = new Email();
        kEmail.setNewsId(newsId);
        kEmail.setBody(body);
        return update(email, kEmail);
    }
    public int updateOfNewsIdAndTime(Email email, String newsId, String time) {
        Email kEmail = new Email();
        kEmail.setNewsId(newsId);
        kEmail.setTime(time);
        return update(email, kEmail);
    }
    public int updateOfNewsIdAndParam(Email email, String newsId, String param) {
        Email kEmail = new Email();
        kEmail.setNewsId(newsId);
        kEmail.setParam(param);
        return update(email, kEmail);
    }
    public int updateOfNewsIdAndStatus(Email email, String newsId, String status) {
        Email kEmail = new Email();
        kEmail.setNewsId(newsId);
        kEmail.setStatus(status);
        return update(email, kEmail);
    }
    public int updateOfBodyAndTime(Email email, String body, String time) {
        Email kEmail = new Email();
        kEmail.setBody(body);
        kEmail.setTime(time);
        return update(email, kEmail);
    }
    public int updateOfBodyAndParam(Email email, String body, String param) {
        Email kEmail = new Email();
        kEmail.setBody(body);
        kEmail.setParam(param);
        return update(email, kEmail);
    }
    public int updateOfBodyAndStatus(Email email, String body, String status) {
        Email kEmail = new Email();
        kEmail.setBody(body);
        kEmail.setStatus(status);
        return update(email, kEmail);
    }
    public int updateOfTimeAndParam(Email email, String time, String param) {
        Email kEmail = new Email();
        kEmail.setTime(time);
        kEmail.setParam(param);
        return update(email, kEmail);
    }
    public int updateOfTimeAndStatus(Email email, String time, String status) {
        Email kEmail = new Email();
        kEmail.setTime(time);
        kEmail.setStatus(status);
        return update(email, kEmail);
    }
    public int updateOfParamAndStatus(Email email, String param, String status) {
        Email kEmail = new Email();
        kEmail.setParam(param);
        kEmail.setStatus(status);
        return update(email, kEmail);
    }
    public int remove(Email email) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(email, "email");
    }
    public int removeOfEmailId(String emailId) {
        Email email = new Email();
        email.setEmailId(emailId);
        return remove(email);
    }
    public int removeOfFromUserId(String fromUserId) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        return remove(email);
    }
    public int removeOfToUserId(String toUserId) {
        Email email = new Email();
        email.setToUserId(toUserId);
        return remove(email);
    }
    public int removeOfNewsId(String newsId) {
        Email email = new Email();
        email.setNewsId(newsId);
        return remove(email);
    }
    public int removeOfBody(String body) {
        Email email = new Email();
        email.setBody(body);
        return remove(email);
    }
    public int removeOfTime(String time) {
        Email email = new Email();
        email.setTime(time);
        return remove(email);
    }
    public int removeOfParam(String param) {
        Email email = new Email();
        email.setParam(param);
        return remove(email);
    }
    public int removeOfStatus(String status) {
        Email email = new Email();
        email.setStatus(status);
        return remove(email);
    }
    public int removeOfEmailIdAndFromUserId(String emailId, String fromUserId) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setFromUserId(fromUserId);
        return remove(email);
    }
    public int removeOfEmailIdAndToUserId(String emailId, String toUserId) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setToUserId(toUserId);
        return remove(email);
    }
    public int removeOfEmailIdAndNewsId(String emailId, String newsId) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setNewsId(newsId);
        return remove(email);
    }
    public int removeOfEmailIdAndBody(String emailId, String body) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setBody(body);
        return remove(email);
    }
    public int removeOfEmailIdAndTime(String emailId, String time) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setTime(time);
        return remove(email);
    }
    public int removeOfEmailIdAndParam(String emailId, String param) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setParam(param);
        return remove(email);
    }
    public int removeOfEmailIdAndStatus(String emailId, String status) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setStatus(status);
        return remove(email);
    }
    public int removeOfFromUserIdAndToUserId(String fromUserId, String toUserId) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setToUserId(toUserId);
        return remove(email);
    }
    public int removeOfFromUserIdAndNewsId(String fromUserId, String newsId) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setNewsId(newsId);
        return remove(email);
    }
    public int removeOfFromUserIdAndBody(String fromUserId, String body) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setBody(body);
        return remove(email);
    }
    public int removeOfFromUserIdAndTime(String fromUserId, String time) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setTime(time);
        return remove(email);
    }
    public int removeOfFromUserIdAndParam(String fromUserId, String param) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setParam(param);
        return remove(email);
    }
    public int removeOfFromUserIdAndStatus(String fromUserId, String status) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setStatus(status);
        return remove(email);
    }
    public int removeOfToUserIdAndNewsId(String toUserId, String newsId) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setNewsId(newsId);
        return remove(email);
    }
    public int removeOfToUserIdAndBody(String toUserId, String body) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setBody(body);
        return remove(email);
    }
    public int removeOfToUserIdAndTime(String toUserId, String time) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setTime(time);
        return remove(email);
    }
    public int removeOfToUserIdAndParam(String toUserId, String param) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setParam(param);
        return remove(email);
    }
    public int removeOfToUserIdAndStatus(String toUserId, String status) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setStatus(status);
        return remove(email);
    }
    public int removeOfNewsIdAndBody(String newsId, String body) {
        Email email = new Email();
        email.setNewsId(newsId);
        email.setBody(body);
        return remove(email);
    }
    public int removeOfNewsIdAndTime(String newsId, String time) {
        Email email = new Email();
        email.setNewsId(newsId);
        email.setTime(time);
        return remove(email);
    }
    public int removeOfNewsIdAndParam(String newsId, String param) {
        Email email = new Email();
        email.setNewsId(newsId);
        email.setParam(param);
        return remove(email);
    }
    public int removeOfNewsIdAndStatus(String newsId, String status) {
        Email email = new Email();
        email.setNewsId(newsId);
        email.setStatus(status);
        return remove(email);
    }
    public int removeOfBodyAndTime(String body, String time) {
        Email email = new Email();
        email.setBody(body);
        email.setTime(time);
        return remove(email);
    }
    public int removeOfBodyAndParam(String body, String param) {
        Email email = new Email();
        email.setBody(body);
        email.setParam(param);
        return remove(email);
    }
    public int removeOfBodyAndStatus(String body, String status) {
        Email email = new Email();
        email.setBody(body);
        email.setStatus(status);
        return remove(email);
    }
    public int removeOfTimeAndParam(String time, String param) {
        Email email = new Email();
        email.setTime(time);
        email.setParam(param);
        return remove(email);
    }
    public int removeOfTimeAndStatus(String time, String status) {
        Email email = new Email();
        email.setTime(time);
        email.setStatus(status);
        return remove(email);
    }
    public int removeOfParamAndStatus(String param, String status) {
        Email email = new Email();
        email.setParam(param);
        email.setStatus(status);
        return remove(email);
    }
    public int insert(Email email) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(email, "email");
    }
    public int insertOfEmailId(String emailId) {
        Email email = new Email();
        email.setEmailId(emailId);
        return insert(email);
    }
    public int insertOfFromUserId(String fromUserId) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        return insert(email);
    }
    public int insertOfToUserId(String toUserId) {
        Email email = new Email();
        email.setToUserId(toUserId);
        return insert(email);
    }
    public int insertOfNewsId(String newsId) {
        Email email = new Email();
        email.setNewsId(newsId);
        return insert(email);
    }
    public int insertOfBody(String body) {
        Email email = new Email();
        email.setBody(body);
        return insert(email);
    }
    public int insertOfTime(String time) {
        Email email = new Email();
        email.setTime(time);
        return insert(email);
    }
    public int insertOfParam(String param) {
        Email email = new Email();
        email.setParam(param);
        return insert(email);
    }
    public int insertOfStatus(String status) {
        Email email = new Email();
        email.setStatus(status);
        return insert(email);
    }
    public int insertOfEmailIdAndFromUserId(String emailId, String fromUserId) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setFromUserId(fromUserId);
        return insert(email);
    }
    public int insertOfEmailIdAndToUserId(String emailId, String toUserId) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setToUserId(toUserId);
        return insert(email);
    }
    public int insertOfEmailIdAndNewsId(String emailId, String newsId) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setNewsId(newsId);
        return insert(email);
    }
    public int insertOfEmailIdAndBody(String emailId, String body) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setBody(body);
        return insert(email);
    }
    public int insertOfEmailIdAndTime(String emailId, String time) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setTime(time);
        return insert(email);
    }
    public int insertOfEmailIdAndParam(String emailId, String param) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setParam(param);
        return insert(email);
    }
    public int insertOfEmailIdAndStatus(String emailId, String status) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setStatus(status);
        return insert(email);
    }
    public int insertOfFromUserIdAndToUserId(String fromUserId, String toUserId) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setToUserId(toUserId);
        return insert(email);
    }
    public int insertOfFromUserIdAndNewsId(String fromUserId, String newsId) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setNewsId(newsId);
        return insert(email);
    }
    public int insertOfFromUserIdAndBody(String fromUserId, String body) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setBody(body);
        return insert(email);
    }
    public int insertOfFromUserIdAndTime(String fromUserId, String time) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setTime(time);
        return insert(email);
    }
    public int insertOfFromUserIdAndParam(String fromUserId, String param) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setParam(param);
        return insert(email);
    }
    public int insertOfFromUserIdAndStatus(String fromUserId, String status) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setStatus(status);
        return insert(email);
    }
    public int insertOfToUserIdAndNewsId(String toUserId, String newsId) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setNewsId(newsId);
        return insert(email);
    }
    public int insertOfToUserIdAndBody(String toUserId, String body) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setBody(body);
        return insert(email);
    }
    public int insertOfToUserIdAndTime(String toUserId, String time) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setTime(time);
        return insert(email);
    }
    public int insertOfToUserIdAndParam(String toUserId, String param) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setParam(param);
        return insert(email);
    }
    public int insertOfToUserIdAndStatus(String toUserId, String status) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setStatus(status);
        return insert(email);
    }
    public int insertOfNewsIdAndBody(String newsId, String body) {
        Email email = new Email();
        email.setNewsId(newsId);
        email.setBody(body);
        return insert(email);
    }
    public int insertOfNewsIdAndTime(String newsId, String time) {
        Email email = new Email();
        email.setNewsId(newsId);
        email.setTime(time);
        return insert(email);
    }
    public int insertOfNewsIdAndParam(String newsId, String param) {
        Email email = new Email();
        email.setNewsId(newsId);
        email.setParam(param);
        return insert(email);
    }
    public int insertOfNewsIdAndStatus(String newsId, String status) {
        Email email = new Email();
        email.setNewsId(newsId);
        email.setStatus(status);
        return insert(email);
    }
    public int insertOfBodyAndTime(String body, String time) {
        Email email = new Email();
        email.setBody(body);
        email.setTime(time);
        return insert(email);
    }
    public int insertOfBodyAndParam(String body, String param) {
        Email email = new Email();
        email.setBody(body);
        email.setParam(param);
        return insert(email);
    }
    public int insertOfBodyAndStatus(String body, String status) {
        Email email = new Email();
        email.setBody(body);
        email.setStatus(status);
        return insert(email);
    }
    public int insertOfTimeAndParam(String time, String param) {
        Email email = new Email();
        email.setTime(time);
        email.setParam(param);
        return insert(email);
    }
    public int insertOfTimeAndStatus(String time, String status) {
        Email email = new Email();
        email.setTime(time);
        email.setStatus(status);
        return insert(email);
    }
    public int insertOfParamAndStatus(String param, String status) {
        Email email = new Email();
        email.setParam(param);
        email.setStatus(status);
        return insert(email);
    }
    public Email getEmail(Email email) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(email, "email");
    }
    public Email getEmailOfEmailId(String emailId) {
        Email email = new Email();
        email.setEmailId(emailId);
        return getEmail(email);
    }
    public Email getEmailOfFromUserId(String fromUserId) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        return getEmail(email);
    }
    public Email getEmailOfToUserId(String toUserId) {
        Email email = new Email();
        email.setToUserId(toUserId);
        return getEmail(email);
    }
    public Email getEmailOfNewsId(String newsId) {
        Email email = new Email();
        email.setNewsId(newsId);
        return getEmail(email);
    }
    public Email getEmailOfBody(String body) {
        Email email = new Email();
        email.setBody(body);
        return getEmail(email);
    }
    public Email getEmailOfTime(String time) {
        Email email = new Email();
        email.setTime(time);
        return getEmail(email);
    }
    public Email getEmailOfParam(String param) {
        Email email = new Email();
        email.setParam(param);
        return getEmail(email);
    }
    public Email getEmailOfStatus(String status) {
        Email email = new Email();
        email.setStatus(status);
        return getEmail(email);
    }
    public Email getEmailOfEmailIdAndFromUserId(String emailId, String fromUserId) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setFromUserId(fromUserId);
        return getEmail(email);
    }
    public Email getEmailOfEmailIdAndToUserId(String emailId, String toUserId) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setToUserId(toUserId);
        return getEmail(email);
    }
    public Email getEmailOfEmailIdAndNewsId(String emailId, String newsId) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setNewsId(newsId);
        return getEmail(email);
    }
    public Email getEmailOfEmailIdAndBody(String emailId, String body) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setBody(body);
        return getEmail(email);
    }
    public Email getEmailOfEmailIdAndTime(String emailId, String time) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setTime(time);
        return getEmail(email);
    }
    public Email getEmailOfEmailIdAndParam(String emailId, String param) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setParam(param);
        return getEmail(email);
    }
    public Email getEmailOfEmailIdAndStatus(String emailId, String status) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setStatus(status);
        return getEmail(email);
    }
    public Email getEmailOfFromUserIdAndToUserId(String fromUserId, String toUserId) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setToUserId(toUserId);
        return getEmail(email);
    }
    public Email getEmailOfFromUserIdAndNewsId(String fromUserId, String newsId) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setNewsId(newsId);
        return getEmail(email);
    }
    public Email getEmailOfFromUserIdAndBody(String fromUserId, String body) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setBody(body);
        return getEmail(email);
    }
    public Email getEmailOfFromUserIdAndTime(String fromUserId, String time) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setTime(time);
        return getEmail(email);
    }
    public Email getEmailOfFromUserIdAndParam(String fromUserId, String param) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setParam(param);
        return getEmail(email);
    }
    public Email getEmailOfFromUserIdAndStatus(String fromUserId, String status) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setStatus(status);
        return getEmail(email);
    }
    public Email getEmailOfToUserIdAndNewsId(String toUserId, String newsId) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setNewsId(newsId);
        return getEmail(email);
    }
    public Email getEmailOfToUserIdAndBody(String toUserId, String body) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setBody(body);
        return getEmail(email);
    }
    public Email getEmailOfToUserIdAndTime(String toUserId, String time) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setTime(time);
        return getEmail(email);
    }
    public Email getEmailOfToUserIdAndParam(String toUserId, String param) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setParam(param);
        return getEmail(email);
    }
    public Email getEmailOfToUserIdAndStatus(String toUserId, String status) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setStatus(status);
        return getEmail(email);
    }
    public Email getEmailOfNewsIdAndBody(String newsId, String body) {
        Email email = new Email();
        email.setNewsId(newsId);
        email.setBody(body);
        return getEmail(email);
    }
    public Email getEmailOfNewsIdAndTime(String newsId, String time) {
        Email email = new Email();
        email.setNewsId(newsId);
        email.setTime(time);
        return getEmail(email);
    }
    public Email getEmailOfNewsIdAndParam(String newsId, String param) {
        Email email = new Email();
        email.setNewsId(newsId);
        email.setParam(param);
        return getEmail(email);
    }
    public Email getEmailOfNewsIdAndStatus(String newsId, String status) {
        Email email = new Email();
        email.setNewsId(newsId);
        email.setStatus(status);
        return getEmail(email);
    }
    public Email getEmailOfBodyAndTime(String body, String time) {
        Email email = new Email();
        email.setBody(body);
        email.setTime(time);
        return getEmail(email);
    }
    public Email getEmailOfBodyAndParam(String body, String param) {
        Email email = new Email();
        email.setBody(body);
        email.setParam(param);
        return getEmail(email);
    }
    public Email getEmailOfBodyAndStatus(String body, String status) {
        Email email = new Email();
        email.setBody(body);
        email.setStatus(status);
        return getEmail(email);
    }
    public Email getEmailOfTimeAndParam(String time, String param) {
        Email email = new Email();
        email.setTime(time);
        email.setParam(param);
        return getEmail(email);
    }
    public Email getEmailOfTimeAndStatus(String time, String status) {
        Email email = new Email();
        email.setTime(time);
        email.setStatus(status);
        return getEmail(email);
    }
    public Email getEmailOfParamAndStatus(String param, String status) {
        Email email = new Email();
        email.setParam(param);
        email.setStatus(status);
        return getEmail(email);
    }
    public List<Email> getEmails(Email email) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(email, "email");
    }
    public List<Email> getEmailsOfEmailId(String emailId) {
        Email email = new Email();
        email.setEmailId(emailId);
        return getEmails(email);
    }
    public List<Email> getEmailsOfFromUserId(String fromUserId) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        return getEmails(email);
    }
    public List<Email> getEmailsOfToUserId(String toUserId) {
        Email email = new Email();
        email.setToUserId(toUserId);
        return getEmails(email);
    }
    public List<Email> getEmailsOfNewsId(String newsId) {
        Email email = new Email();
        email.setNewsId(newsId);
        return getEmails(email);
    }
    public List<Email> getEmailsOfBody(String body) {
        Email email = new Email();
        email.setBody(body);
        return getEmails(email);
    }
    public List<Email> getEmailsOfTime(String time) {
        Email email = new Email();
        email.setTime(time);
        return getEmails(email);
    }
    public List<Email> getEmailsOfParam(String param) {
        Email email = new Email();
        email.setParam(param);
        return getEmails(email);
    }
    public List<Email> getEmailsOfStatus(String status) {
        Email email = new Email();
        email.setStatus(status);
        return getEmails(email);
    }
    public List<Email> getEmailsOfEmailIdAndFromUserId(String emailId, String fromUserId) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setFromUserId(fromUserId);
        return getEmails(email);
    }
    public List<Email> getEmailsOfEmailIdAndToUserId(String emailId, String toUserId) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setToUserId(toUserId);
        return getEmails(email);
    }
    public List<Email> getEmailsOfEmailIdAndNewsId(String emailId, String newsId) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setNewsId(newsId);
        return getEmails(email);
    }
    public List<Email> getEmailsOfEmailIdAndBody(String emailId, String body) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setBody(body);
        return getEmails(email);
    }
    public List<Email> getEmailsOfEmailIdAndTime(String emailId, String time) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setTime(time);
        return getEmails(email);
    }
    public List<Email> getEmailsOfEmailIdAndParam(String emailId, String param) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setParam(param);
        return getEmails(email);
    }
    public List<Email> getEmailsOfEmailIdAndStatus(String emailId, String status) {
        Email email = new Email();
        email.setEmailId(emailId);
        email.setStatus(status);
        return getEmails(email);
    }
    public List<Email> getEmailsOfFromUserIdAndToUserId(String fromUserId, String toUserId) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setToUserId(toUserId);
        return getEmails(email);
    }
    public List<Email> getEmailsOfFromUserIdAndNewsId(String fromUserId, String newsId) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setNewsId(newsId);
        return getEmails(email);
    }
    public List<Email> getEmailsOfFromUserIdAndBody(String fromUserId, String body) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setBody(body);
        return getEmails(email);
    }
    public List<Email> getEmailsOfFromUserIdAndTime(String fromUserId, String time) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setTime(time);
        return getEmails(email);
    }
    public List<Email> getEmailsOfFromUserIdAndParam(String fromUserId, String param) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setParam(param);
        return getEmails(email);
    }
    public List<Email> getEmailsOfFromUserIdAndStatus(String fromUserId, String status) {
        Email email = new Email();
        email.setFromUserId(fromUserId);
        email.setStatus(status);
        return getEmails(email);
    }
    public List<Email> getEmailsOfToUserIdAndNewsId(String toUserId, String newsId) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setNewsId(newsId);
        return getEmails(email);
    }
    public List<Email> getEmailsOfToUserIdAndBody(String toUserId, String body) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setBody(body);
        return getEmails(email);
    }
    public List<Email> getEmailsOfToUserIdAndTime(String toUserId, String time) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setTime(time);
        return getEmails(email);
    }
    public List<Email> getEmailsOfToUserIdAndParam(String toUserId, String param) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setParam(param);
        return getEmails(email);
    }
    public List<Email> getEmailsOfToUserIdAndStatus(String toUserId, String status) {
        Email email = new Email();
        email.setToUserId(toUserId);
        email.setStatus(status);
        return getEmails(email);
    }
    public List<Email> getEmailsOfNewsIdAndBody(String newsId, String body) {
        Email email = new Email();
        email.setNewsId(newsId);
        email.setBody(body);
        return getEmails(email);
    }
    public List<Email> getEmailsOfNewsIdAndTime(String newsId, String time) {
        Email email = new Email();
        email.setNewsId(newsId);
        email.setTime(time);
        return getEmails(email);
    }
    public List<Email> getEmailsOfNewsIdAndParam(String newsId, String param) {
        Email email = new Email();
        email.setNewsId(newsId);
        email.setParam(param);
        return getEmails(email);
    }
    public List<Email> getEmailsOfNewsIdAndStatus(String newsId, String status) {
        Email email = new Email();
        email.setNewsId(newsId);
        email.setStatus(status);
        return getEmails(email);
    }
    public List<Email> getEmailsOfBodyAndTime(String body, String time) {
        Email email = new Email();
        email.setBody(body);
        email.setTime(time);
        return getEmails(email);
    }
    public List<Email> getEmailsOfBodyAndParam(String body, String param) {
        Email email = new Email();
        email.setBody(body);
        email.setParam(param);
        return getEmails(email);
    }
    public List<Email> getEmailsOfBodyAndStatus(String body, String status) {
        Email email = new Email();
        email.setBody(body);
        email.setStatus(status);
        return getEmails(email);
    }
    public List<Email> getEmailsOfTimeAndParam(String time, String param) {
        Email email = new Email();
        email.setTime(time);
        email.setParam(param);
        return getEmails(email);
    }
    public List<Email> getEmailsOfTimeAndStatus(String time, String status) {
        Email email = new Email();
        email.setTime(time);
        email.setStatus(status);
        return getEmails(email);
    }
    public List<Email> getEmailsOfParamAndStatus(String param, String status) {
        Email email = new Email();
        email.setParam(param);
        email.setStatus(status);
        return getEmails(email);
    }
}
