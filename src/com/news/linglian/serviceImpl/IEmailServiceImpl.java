package com.news.linglian.serviceImpl;

import java.util.List;

import com.news.linglian.entity.Email;

import com.news.linglian.dao.IEmailDao;
import com.news.linglian.daoImpl.IEmailDaoImpl;
import com.news.linglian.service.IEmailService;

public class IEmailServiceImpl implements IEmailService {
	IEmailDao dao = null;

	public IEmailServiceImpl() {
		dao = new IEmailDaoImpl();
	}
    public int update(Email email, Email keyEmail) {
        return dao.update(email, keyEmail);
    }
    public int updateOfEmailId(Email email, String emailId) {
        return dao.updateOfEmailId(email, emailId);
    }
    public int updateOfFromUserId(Email email, String fromUserId) {
        return dao.updateOfFromUserId(email, fromUserId);
    }
    public int updateOfToUserId(Email email, String toUserId) {
        return dao.updateOfToUserId(email, toUserId);
    }
    public int updateOfNewsId(Email email, String newsId) {
        return dao.updateOfNewsId(email, newsId);
    }
    public int updateOfBody(Email email, String body) {
        return dao.updateOfBody(email, body);
    }
    public int updateOfTime(Email email, String time) {
        return dao.updateOfTime(email, time);
    }
    public int updateOfParam(Email email, String param) {
        return dao.updateOfParam(email, param);
    }
    public int updateOfStatus(Email email, String status) {
        return dao.updateOfStatus(email, status);
    }
    public int updateOfEmailIdAndFromUserId(Email email, String emailId, String fromUserId) {
        return dao.updateOfEmailIdAndFromUserId(email, emailId, fromUserId);
    }
    public int updateOfEmailIdAndToUserId(Email email, String emailId, String toUserId) {
        return dao.updateOfEmailIdAndToUserId(email, emailId, toUserId);
    }
    public int updateOfEmailIdAndNewsId(Email email, String emailId, String newsId) {
        return dao.updateOfEmailIdAndNewsId(email, emailId, newsId);
    }
    public int updateOfEmailIdAndBody(Email email, String emailId, String body) {
        return dao.updateOfEmailIdAndBody(email, emailId, body);
    }
    public int updateOfEmailIdAndTime(Email email, String emailId, String time) {
        return dao.updateOfEmailIdAndTime(email, emailId, time);
    }
    public int updateOfEmailIdAndParam(Email email, String emailId, String param) {
        return dao.updateOfEmailIdAndParam(email, emailId, param);
    }
    public int updateOfEmailIdAndStatus(Email email, String emailId, String status) {
        return dao.updateOfEmailIdAndStatus(email, emailId, status);
    }
    public int updateOfFromUserIdAndToUserId(Email email, String fromUserId, String toUserId) {
        return dao.updateOfFromUserIdAndToUserId(email, fromUserId, toUserId);
    }
    public int updateOfFromUserIdAndNewsId(Email email, String fromUserId, String newsId) {
        return dao.updateOfFromUserIdAndNewsId(email, fromUserId, newsId);
    }
    public int updateOfFromUserIdAndBody(Email email, String fromUserId, String body) {
        return dao.updateOfFromUserIdAndBody(email, fromUserId, body);
    }
    public int updateOfFromUserIdAndTime(Email email, String fromUserId, String time) {
        return dao.updateOfFromUserIdAndTime(email, fromUserId, time);
    }
    public int updateOfFromUserIdAndParam(Email email, String fromUserId, String param) {
        return dao.updateOfFromUserIdAndParam(email, fromUserId, param);
    }
    public int updateOfFromUserIdAndStatus(Email email, String fromUserId, String status) {
        return dao.updateOfFromUserIdAndStatus(email, fromUserId, status);
    }
    public int updateOfToUserIdAndNewsId(Email email, String toUserId, String newsId) {
        return dao.updateOfToUserIdAndNewsId(email, toUserId, newsId);
    }
    public int updateOfToUserIdAndBody(Email email, String toUserId, String body) {
        return dao.updateOfToUserIdAndBody(email, toUserId, body);
    }
    public int updateOfToUserIdAndTime(Email email, String toUserId, String time) {
        return dao.updateOfToUserIdAndTime(email, toUserId, time);
    }
    public int updateOfToUserIdAndParam(Email email, String toUserId, String param) {
        return dao.updateOfToUserIdAndParam(email, toUserId, param);
    }
    public int updateOfToUserIdAndStatus(Email email, String toUserId, String status) {
        return dao.updateOfToUserIdAndStatus(email, toUserId, status);
    }
    public int updateOfNewsIdAndBody(Email email, String newsId, String body) {
        return dao.updateOfNewsIdAndBody(email, newsId, body);
    }
    public int updateOfNewsIdAndTime(Email email, String newsId, String time) {
        return dao.updateOfNewsIdAndTime(email, newsId, time);
    }
    public int updateOfNewsIdAndParam(Email email, String newsId, String param) {
        return dao.updateOfNewsIdAndParam(email, newsId, param);
    }
    public int updateOfNewsIdAndStatus(Email email, String newsId, String status) {
        return dao.updateOfNewsIdAndStatus(email, newsId, status);
    }
    public int updateOfBodyAndTime(Email email, String body, String time) {
        return dao.updateOfBodyAndTime(email, body, time);
    }
    public int updateOfBodyAndParam(Email email, String body, String param) {
        return dao.updateOfBodyAndParam(email, body, param);
    }
    public int updateOfBodyAndStatus(Email email, String body, String status) {
        return dao.updateOfBodyAndStatus(email, body, status);
    }
    public int updateOfTimeAndParam(Email email, String time, String param) {
        return dao.updateOfTimeAndParam(email, time, param);
    }
    public int updateOfTimeAndStatus(Email email, String time, String status) {
        return dao.updateOfTimeAndStatus(email, time, status);
    }
    public int updateOfParamAndStatus(Email email, String param, String status) {
        return dao.updateOfParamAndStatus(email, param, status);
    }
    public int remove(Email email) {
        return dao.remove(email);
    }
    public int removeOfEmailId(String emailId) {
        return dao.removeOfEmailId(emailId);
    }
    public int removeOfFromUserId(String fromUserId) {
        return dao.removeOfFromUserId(fromUserId);
    }
    public int removeOfToUserId(String toUserId) {
        return dao.removeOfToUserId(toUserId);
    }
    public int removeOfNewsId(String newsId) {
        return dao.removeOfNewsId(newsId);
    }
    public int removeOfBody(String body) {
        return dao.removeOfBody(body);
    }
    public int removeOfTime(String time) {
        return dao.removeOfTime(time);
    }
    public int removeOfParam(String param) {
        return dao.removeOfParam(param);
    }
    public int removeOfStatus(String status) {
        return dao.removeOfStatus(status);
    }
    public int removeOfEmailIdAndFromUserId(String emailId, String fromUserId) {
        return dao.removeOfEmailIdAndFromUserId(emailId, fromUserId);
    }
    public int removeOfEmailIdAndToUserId(String emailId, String toUserId) {
        return dao.removeOfEmailIdAndToUserId(emailId, toUserId);
    }
    public int removeOfEmailIdAndNewsId(String emailId, String newsId) {
        return dao.removeOfEmailIdAndNewsId(emailId, newsId);
    }
    public int removeOfEmailIdAndBody(String emailId, String body) {
        return dao.removeOfEmailIdAndBody(emailId, body);
    }
    public int removeOfEmailIdAndTime(String emailId, String time) {
        return dao.removeOfEmailIdAndTime(emailId, time);
    }
    public int removeOfEmailIdAndParam(String emailId, String param) {
        return dao.removeOfEmailIdAndParam(emailId, param);
    }
    public int removeOfEmailIdAndStatus(String emailId, String status) {
        return dao.removeOfEmailIdAndStatus(emailId, status);
    }
    public int removeOfFromUserIdAndToUserId(String fromUserId, String toUserId) {
        return dao.removeOfFromUserIdAndToUserId(fromUserId, toUserId);
    }
    public int removeOfFromUserIdAndNewsId(String fromUserId, String newsId) {
        return dao.removeOfFromUserIdAndNewsId(fromUserId, newsId);
    }
    public int removeOfFromUserIdAndBody(String fromUserId, String body) {
        return dao.removeOfFromUserIdAndBody(fromUserId, body);
    }
    public int removeOfFromUserIdAndTime(String fromUserId, String time) {
        return dao.removeOfFromUserIdAndTime(fromUserId, time);
    }
    public int removeOfFromUserIdAndParam(String fromUserId, String param) {
        return dao.removeOfFromUserIdAndParam(fromUserId, param);
    }
    public int removeOfFromUserIdAndStatus(String fromUserId, String status) {
        return dao.removeOfFromUserIdAndStatus(fromUserId, status);
    }
    public int removeOfToUserIdAndNewsId(String toUserId, String newsId) {
        return dao.removeOfToUserIdAndNewsId(toUserId, newsId);
    }
    public int removeOfToUserIdAndBody(String toUserId, String body) {
        return dao.removeOfToUserIdAndBody(toUserId, body);
    }
    public int removeOfToUserIdAndTime(String toUserId, String time) {
        return dao.removeOfToUserIdAndTime(toUserId, time);
    }
    public int removeOfToUserIdAndParam(String toUserId, String param) {
        return dao.removeOfToUserIdAndParam(toUserId, param);
    }
    public int removeOfToUserIdAndStatus(String toUserId, String status) {
        return dao.removeOfToUserIdAndStatus(toUserId, status);
    }
    public int removeOfNewsIdAndBody(String newsId, String body) {
        return dao.removeOfNewsIdAndBody(newsId, body);
    }
    public int removeOfNewsIdAndTime(String newsId, String time) {
        return dao.removeOfNewsIdAndTime(newsId, time);
    }
    public int removeOfNewsIdAndParam(String newsId, String param) {
        return dao.removeOfNewsIdAndParam(newsId, param);
    }
    public int removeOfNewsIdAndStatus(String newsId, String status) {
        return dao.removeOfNewsIdAndStatus(newsId, status);
    }
    public int removeOfBodyAndTime(String body, String time) {
        return dao.removeOfBodyAndTime(body, time);
    }
    public int removeOfBodyAndParam(String body, String param) {
        return dao.removeOfBodyAndParam(body, param);
    }
    public int removeOfBodyAndStatus(String body, String status) {
        return dao.removeOfBodyAndStatus(body, status);
    }
    public int removeOfTimeAndParam(String time, String param) {
        return dao.removeOfTimeAndParam(time, param);
    }
    public int removeOfTimeAndStatus(String time, String status) {
        return dao.removeOfTimeAndStatus(time, status);
    }
    public int removeOfParamAndStatus(String param, String status) {
        return dao.removeOfParamAndStatus(param, status);
    }
    public int insert(Email email) {
        return dao.insert(email);
    }
    public int insertOfEmailId(String emailId) {
        return dao.insertOfEmailId(emailId);
    }
    public int insertOfFromUserId(String fromUserId) {
        return dao.insertOfFromUserId(fromUserId);
    }
    public int insertOfToUserId(String toUserId) {
        return dao.insertOfToUserId(toUserId);
    }
    public int insertOfNewsId(String newsId) {
        return dao.insertOfNewsId(newsId);
    }
    public int insertOfBody(String body) {
        return dao.insertOfBody(body);
    }
    public int insertOfTime(String time) {
        return dao.insertOfTime(time);
    }
    public int insertOfParam(String param) {
        return dao.insertOfParam(param);
    }
    public int insertOfStatus(String status) {
        return dao.insertOfStatus(status);
    }
    public int insertOfEmailIdAndFromUserId(String emailId, String fromUserId) {
        return dao.insertOfEmailIdAndFromUserId(emailId, fromUserId);
    }
    public int insertOfEmailIdAndToUserId(String emailId, String toUserId) {
        return dao.insertOfEmailIdAndToUserId(emailId, toUserId);
    }
    public int insertOfEmailIdAndNewsId(String emailId, String newsId) {
        return dao.insertOfEmailIdAndNewsId(emailId, newsId);
    }
    public int insertOfEmailIdAndBody(String emailId, String body) {
        return dao.insertOfEmailIdAndBody(emailId, body);
    }
    public int insertOfEmailIdAndTime(String emailId, String time) {
        return dao.insertOfEmailIdAndTime(emailId, time);
    }
    public int insertOfEmailIdAndParam(String emailId, String param) {
        return dao.insertOfEmailIdAndParam(emailId, param);
    }
    public int insertOfEmailIdAndStatus(String emailId, String status) {
        return dao.insertOfEmailIdAndStatus(emailId, status);
    }
    public int insertOfFromUserIdAndToUserId(String fromUserId, String toUserId) {
        return dao.insertOfFromUserIdAndToUserId(fromUserId, toUserId);
    }
    public int insertOfFromUserIdAndNewsId(String fromUserId, String newsId) {
        return dao.insertOfFromUserIdAndNewsId(fromUserId, newsId);
    }
    public int insertOfFromUserIdAndBody(String fromUserId, String body) {
        return dao.insertOfFromUserIdAndBody(fromUserId, body);
    }
    public int insertOfFromUserIdAndTime(String fromUserId, String time) {
        return dao.insertOfFromUserIdAndTime(fromUserId, time);
    }
    public int insertOfFromUserIdAndParam(String fromUserId, String param) {
        return dao.insertOfFromUserIdAndParam(fromUserId, param);
    }
    public int insertOfFromUserIdAndStatus(String fromUserId, String status) {
        return dao.insertOfFromUserIdAndStatus(fromUserId, status);
    }
    public int insertOfToUserIdAndNewsId(String toUserId, String newsId) {
        return dao.insertOfToUserIdAndNewsId(toUserId, newsId);
    }
    public int insertOfToUserIdAndBody(String toUserId, String body) {
        return dao.insertOfToUserIdAndBody(toUserId, body);
    }
    public int insertOfToUserIdAndTime(String toUserId, String time) {
        return dao.insertOfToUserIdAndTime(toUserId, time);
    }
    public int insertOfToUserIdAndParam(String toUserId, String param) {
        return dao.insertOfToUserIdAndParam(toUserId, param);
    }
    public int insertOfToUserIdAndStatus(String toUserId, String status) {
        return dao.insertOfToUserIdAndStatus(toUserId, status);
    }
    public int insertOfNewsIdAndBody(String newsId, String body) {
        return dao.insertOfNewsIdAndBody(newsId, body);
    }
    public int insertOfNewsIdAndTime(String newsId, String time) {
        return dao.insertOfNewsIdAndTime(newsId, time);
    }
    public int insertOfNewsIdAndParam(String newsId, String param) {
        return dao.insertOfNewsIdAndParam(newsId, param);
    }
    public int insertOfNewsIdAndStatus(String newsId, String status) {
        return dao.insertOfNewsIdAndStatus(newsId, status);
    }
    public int insertOfBodyAndTime(String body, String time) {
        return dao.insertOfBodyAndTime(body, time);
    }
    public int insertOfBodyAndParam(String body, String param) {
        return dao.insertOfBodyAndParam(body, param);
    }
    public int insertOfBodyAndStatus(String body, String status) {
        return dao.insertOfBodyAndStatus(body, status);
    }
    public int insertOfTimeAndParam(String time, String param) {
        return dao.insertOfTimeAndParam(time, param);
    }
    public int insertOfTimeAndStatus(String time, String status) {
        return dao.insertOfTimeAndStatus(time, status);
    }
    public int insertOfParamAndStatus(String param, String status) {
        return dao.insertOfParamAndStatus(param, status);
    }
    public Email getEmail(Email email) {
        return dao.getEmail(email);
    }
    public Email getEmailOfEmailId(String emailId) {
        return dao.getEmailOfEmailId(emailId);
    }
    public Email getEmailOfFromUserId(String fromUserId) {
        return dao.getEmailOfFromUserId(fromUserId);
    }
    public Email getEmailOfToUserId(String toUserId) {
        return dao.getEmailOfToUserId(toUserId);
    }
    public Email getEmailOfNewsId(String newsId) {
        return dao.getEmailOfNewsId(newsId);
    }
    public Email getEmailOfBody(String body) {
        return dao.getEmailOfBody(body);
    }
    public Email getEmailOfTime(String time) {
        return dao.getEmailOfTime(time);
    }
    public Email getEmailOfParam(String param) {
        return dao.getEmailOfParam(param);
    }
    public Email getEmailOfStatus(String status) {
        return dao.getEmailOfStatus(status);
    }
    public Email getEmailOfEmailIdAndFromUserId(String emailId, String fromUserId) {
        return dao.getEmailOfEmailIdAndFromUserId(emailId, fromUserId);
    }
    public Email getEmailOfEmailIdAndToUserId(String emailId, String toUserId) {
        return dao.getEmailOfEmailIdAndToUserId(emailId, toUserId);
    }
    public Email getEmailOfEmailIdAndNewsId(String emailId, String newsId) {
        return dao.getEmailOfEmailIdAndNewsId(emailId, newsId);
    }
    public Email getEmailOfEmailIdAndBody(String emailId, String body) {
        return dao.getEmailOfEmailIdAndBody(emailId, body);
    }
    public Email getEmailOfEmailIdAndTime(String emailId, String time) {
        return dao.getEmailOfEmailIdAndTime(emailId, time);
    }
    public Email getEmailOfEmailIdAndParam(String emailId, String param) {
        return dao.getEmailOfEmailIdAndParam(emailId, param);
    }
    public Email getEmailOfEmailIdAndStatus(String emailId, String status) {
        return dao.getEmailOfEmailIdAndStatus(emailId, status);
    }
    public Email getEmailOfFromUserIdAndToUserId(String fromUserId, String toUserId) {
        return dao.getEmailOfFromUserIdAndToUserId(fromUserId, toUserId);
    }
    public Email getEmailOfFromUserIdAndNewsId(String fromUserId, String newsId) {
        return dao.getEmailOfFromUserIdAndNewsId(fromUserId, newsId);
    }
    public Email getEmailOfFromUserIdAndBody(String fromUserId, String body) {
        return dao.getEmailOfFromUserIdAndBody(fromUserId, body);
    }
    public Email getEmailOfFromUserIdAndTime(String fromUserId, String time) {
        return dao.getEmailOfFromUserIdAndTime(fromUserId, time);
    }
    public Email getEmailOfFromUserIdAndParam(String fromUserId, String param) {
        return dao.getEmailOfFromUserIdAndParam(fromUserId, param);
    }
    public Email getEmailOfFromUserIdAndStatus(String fromUserId, String status) {
        return dao.getEmailOfFromUserIdAndStatus(fromUserId, status);
    }
    public Email getEmailOfToUserIdAndNewsId(String toUserId, String newsId) {
        return dao.getEmailOfToUserIdAndNewsId(toUserId, newsId);
    }
    public Email getEmailOfToUserIdAndBody(String toUserId, String body) {
        return dao.getEmailOfToUserIdAndBody(toUserId, body);
    }
    public Email getEmailOfToUserIdAndTime(String toUserId, String time) {
        return dao.getEmailOfToUserIdAndTime(toUserId, time);
    }
    public Email getEmailOfToUserIdAndParam(String toUserId, String param) {
        return dao.getEmailOfToUserIdAndParam(toUserId, param);
    }
    public Email getEmailOfToUserIdAndStatus(String toUserId, String status) {
        return dao.getEmailOfToUserIdAndStatus(toUserId, status);
    }
    public Email getEmailOfNewsIdAndBody(String newsId, String body) {
        return dao.getEmailOfNewsIdAndBody(newsId, body);
    }
    public Email getEmailOfNewsIdAndTime(String newsId, String time) {
        return dao.getEmailOfNewsIdAndTime(newsId, time);
    }
    public Email getEmailOfNewsIdAndParam(String newsId, String param) {
        return dao.getEmailOfNewsIdAndParam(newsId, param);
    }
    public Email getEmailOfNewsIdAndStatus(String newsId, String status) {
        return dao.getEmailOfNewsIdAndStatus(newsId, status);
    }
    public Email getEmailOfBodyAndTime(String body, String time) {
        return dao.getEmailOfBodyAndTime(body, time);
    }
    public Email getEmailOfBodyAndParam(String body, String param) {
        return dao.getEmailOfBodyAndParam(body, param);
    }
    public Email getEmailOfBodyAndStatus(String body, String status) {
        return dao.getEmailOfBodyAndStatus(body, status);
    }
    public Email getEmailOfTimeAndParam(String time, String param) {
        return dao.getEmailOfTimeAndParam(time, param);
    }
    public Email getEmailOfTimeAndStatus(String time, String status) {
        return dao.getEmailOfTimeAndStatus(time, status);
    }
    public Email getEmailOfParamAndStatus(String param, String status) {
        return dao.getEmailOfParamAndStatus(param, status);
    }
    public List<Email> getEmails(Email email) {
        return dao.getEmails(email);
    }
    public List<Email> getEmailsOfEmailId(String emailId) {
        return dao.getEmailsOfEmailId(emailId);
    }
    public List<Email> getEmailsOfFromUserId(String fromUserId) {
        return dao.getEmailsOfFromUserId(fromUserId);
    }
    public List<Email> getEmailsOfToUserId(String toUserId) {
        return dao.getEmailsOfToUserId(toUserId);
    }
    public List<Email> getEmailsOfNewsId(String newsId) {
        return dao.getEmailsOfNewsId(newsId);
    }
    public List<Email> getEmailsOfBody(String body) {
        return dao.getEmailsOfBody(body);
    }
    public List<Email> getEmailsOfTime(String time) {
        return dao.getEmailsOfTime(time);
    }
    public List<Email> getEmailsOfParam(String param) {
        return dao.getEmailsOfParam(param);
    }
    public List<Email> getEmailsOfStatus(String status) {
        return dao.getEmailsOfStatus(status);
    }
    public List<Email> getEmailsOfEmailIdAndFromUserId(String emailId, String fromUserId) {
        return dao.getEmailsOfEmailIdAndFromUserId(emailId, fromUserId);
    }
    public List<Email> getEmailsOfEmailIdAndToUserId(String emailId, String toUserId) {
        return dao.getEmailsOfEmailIdAndToUserId(emailId, toUserId);
    }
    public List<Email> getEmailsOfEmailIdAndNewsId(String emailId, String newsId) {
        return dao.getEmailsOfEmailIdAndNewsId(emailId, newsId);
    }
    public List<Email> getEmailsOfEmailIdAndBody(String emailId, String body) {
        return dao.getEmailsOfEmailIdAndBody(emailId, body);
    }
    public List<Email> getEmailsOfEmailIdAndTime(String emailId, String time) {
        return dao.getEmailsOfEmailIdAndTime(emailId, time);
    }
    public List<Email> getEmailsOfEmailIdAndParam(String emailId, String param) {
        return dao.getEmailsOfEmailIdAndParam(emailId, param);
    }
    public List<Email> getEmailsOfEmailIdAndStatus(String emailId, String status) {
        return dao.getEmailsOfEmailIdAndStatus(emailId, status);
    }
    public List<Email> getEmailsOfFromUserIdAndToUserId(String fromUserId, String toUserId) {
        return dao.getEmailsOfFromUserIdAndToUserId(fromUserId, toUserId);
    }
    public List<Email> getEmailsOfFromUserIdAndNewsId(String fromUserId, String newsId) {
        return dao.getEmailsOfFromUserIdAndNewsId(fromUserId, newsId);
    }
    public List<Email> getEmailsOfFromUserIdAndBody(String fromUserId, String body) {
        return dao.getEmailsOfFromUserIdAndBody(fromUserId, body);
    }
    public List<Email> getEmailsOfFromUserIdAndTime(String fromUserId, String time) {
        return dao.getEmailsOfFromUserIdAndTime(fromUserId, time);
    }
    public List<Email> getEmailsOfFromUserIdAndParam(String fromUserId, String param) {
        return dao.getEmailsOfFromUserIdAndParam(fromUserId, param);
    }
    public List<Email> getEmailsOfFromUserIdAndStatus(String fromUserId, String status) {
        return dao.getEmailsOfFromUserIdAndStatus(fromUserId, status);
    }
    public List<Email> getEmailsOfToUserIdAndNewsId(String toUserId, String newsId) {
        return dao.getEmailsOfToUserIdAndNewsId(toUserId, newsId);
    }
    public List<Email> getEmailsOfToUserIdAndBody(String toUserId, String body) {
        return dao.getEmailsOfToUserIdAndBody(toUserId, body);
    }
    public List<Email> getEmailsOfToUserIdAndTime(String toUserId, String time) {
        return dao.getEmailsOfToUserIdAndTime(toUserId, time);
    }
    public List<Email> getEmailsOfToUserIdAndParam(String toUserId, String param) {
        return dao.getEmailsOfToUserIdAndParam(toUserId, param);
    }
    public List<Email> getEmailsOfToUserIdAndStatus(String toUserId, String status) {
        return dao.getEmailsOfToUserIdAndStatus(toUserId, status);
    }
    public List<Email> getEmailsOfNewsIdAndBody(String newsId, String body) {
        return dao.getEmailsOfNewsIdAndBody(newsId, body);
    }
    public List<Email> getEmailsOfNewsIdAndTime(String newsId, String time) {
        return dao.getEmailsOfNewsIdAndTime(newsId, time);
    }
    public List<Email> getEmailsOfNewsIdAndParam(String newsId, String param) {
        return dao.getEmailsOfNewsIdAndParam(newsId, param);
    }
    public List<Email> getEmailsOfNewsIdAndStatus(String newsId, String status) {
        return dao.getEmailsOfNewsIdAndStatus(newsId, status);
    }
    public List<Email> getEmailsOfBodyAndTime(String body, String time) {
        return dao.getEmailsOfBodyAndTime(body, time);
    }
    public List<Email> getEmailsOfBodyAndParam(String body, String param) {
        return dao.getEmailsOfBodyAndParam(body, param);
    }
    public List<Email> getEmailsOfBodyAndStatus(String body, String status) {
        return dao.getEmailsOfBodyAndStatus(body, status);
    }
    public List<Email> getEmailsOfTimeAndParam(String time, String param) {
        return dao.getEmailsOfTimeAndParam(time, param);
    }
    public List<Email> getEmailsOfTimeAndStatus(String time, String status) {
        return dao.getEmailsOfTimeAndStatus(time, status);
    }
    public List<Email> getEmailsOfParamAndStatus(String param, String status) {
        return dao.getEmailsOfParamAndStatus(param, status);
    }
}
