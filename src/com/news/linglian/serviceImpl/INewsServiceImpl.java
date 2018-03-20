package com.news.linglian.serviceImpl;

import java.util.List;

import com.news.linglian.entity.News;

import com.news.linglian.dao.INewsDao;
import com.news.linglian.daoImpl.INewsDaoImpl;
import com.news.linglian.service.INewsService;

public class INewsServiceImpl implements INewsService {
	INewsDao dao = null;

	public INewsServiceImpl() {
		dao = new INewsDaoImpl();
	}
    public int update(News news, News keyNews) {
        return dao.update(news, keyNews);
    }
    public int updateOfNewsId(News news, String newsId) {
        return dao.updateOfNewsId(news, newsId);
    }
    public int updateOfTitle(News news, String title) {
        return dao.updateOfTitle(news, title);
    }
    public int updateOfBody(News news, String body) {
        return dao.updateOfBody(news, body);
    }
    public int updateOfUserId(News news, String userId) {
        return dao.updateOfUserId(news, userId);
    }
    public int updateOfUserNewsTypeId(News news, String userNewsTypeId) {
        return dao.updateOfUserNewsTypeId(news, userNewsTypeId);
    }
    public int updateOfStatus(News news, String status) {
        return dao.updateOfStatus(news, status);
    }
    public int updateOfBuff(News news, String buff) {
        return dao.updateOfBuff(news, buff);
    }
    public int updateOfParam(News news, String param) {
        return dao.updateOfParam(news, param);
    }
    public int updateOfNewsTypeId(News news, String newsTypeId) {
        return dao.updateOfNewsTypeId(news, newsTypeId);
    }
    public int updateOfPath(News news, String path) {
        return dao.updateOfPath(news, path);
    }
    public int updateOfGood(News news, String good) {
        return dao.updateOfGood(news, good);
    }
    public int updateOfBad(News news, String bad) {
        return dao.updateOfBad(news, bad);
    }
    public int updateOfTime(News news, String time) {
        return dao.updateOfTime(news, time);
    }
    public int updateOfSearch(News news, String search) {
        return dao.updateOfSearch(news, search);
    }
    public int updateOfBUserIds(News news, String bUserIds) {
        return dao.updateOfBUserIds(news, bUserIds);
    }
    public int updateOfMoney(News news, String money) {
        return dao.updateOfMoney(news, money);
    }
    public int updateOfNewsIdAndTitle(News news, String newsId, String title) {
        return dao.updateOfNewsIdAndTitle(news, newsId, title);
    }
    public int updateOfNewsIdAndBody(News news, String newsId, String body) {
        return dao.updateOfNewsIdAndBody(news, newsId, body);
    }
    public int updateOfNewsIdAndUserId(News news, String newsId, String userId) {
        return dao.updateOfNewsIdAndUserId(news, newsId, userId);
    }
    public int updateOfNewsIdAndUserNewsTypeId(News news, String newsId, String userNewsTypeId) {
        return dao.updateOfNewsIdAndUserNewsTypeId(news, newsId, userNewsTypeId);
    }
    public int updateOfNewsIdAndStatus(News news, String newsId, String status) {
        return dao.updateOfNewsIdAndStatus(news, newsId, status);
    }
    public int updateOfNewsIdAndBuff(News news, String newsId, String buff) {
        return dao.updateOfNewsIdAndBuff(news, newsId, buff);
    }
    public int updateOfNewsIdAndParam(News news, String newsId, String param) {
        return dao.updateOfNewsIdAndParam(news, newsId, param);
    }
    public int updateOfNewsIdAndNewsTypeId(News news, String newsId, String newsTypeId) {
        return dao.updateOfNewsIdAndNewsTypeId(news, newsId, newsTypeId);
    }
    public int updateOfNewsIdAndPath(News news, String newsId, String path) {
        return dao.updateOfNewsIdAndPath(news, newsId, path);
    }
    public int updateOfNewsIdAndGood(News news, String newsId, String good) {
        return dao.updateOfNewsIdAndGood(news, newsId, good);
    }
    public int updateOfNewsIdAndBad(News news, String newsId, String bad) {
        return dao.updateOfNewsIdAndBad(news, newsId, bad);
    }
    public int updateOfNewsIdAndTime(News news, String newsId, String time) {
        return dao.updateOfNewsIdAndTime(news, newsId, time);
    }
    public int updateOfNewsIdAndSearch(News news, String newsId, String search) {
        return dao.updateOfNewsIdAndSearch(news, newsId, search);
    }
    public int updateOfNewsIdAndBUserIds(News news, String newsId, String bUserIds) {
        return dao.updateOfNewsIdAndBUserIds(news, newsId, bUserIds);
    }
    public int updateOfNewsIdAndMoney(News news, String newsId, String money) {
        return dao.updateOfNewsIdAndMoney(news, newsId, money);
    }
    public int updateOfTitleAndBody(News news, String title, String body) {
        return dao.updateOfTitleAndBody(news, title, body);
    }
    public int updateOfTitleAndUserId(News news, String title, String userId) {
        return dao.updateOfTitleAndUserId(news, title, userId);
    }
    public int updateOfTitleAndUserNewsTypeId(News news, String title, String userNewsTypeId) {
        return dao.updateOfTitleAndUserNewsTypeId(news, title, userNewsTypeId);
    }
    public int updateOfTitleAndStatus(News news, String title, String status) {
        return dao.updateOfTitleAndStatus(news, title, status);
    }
    public int updateOfTitleAndBuff(News news, String title, String buff) {
        return dao.updateOfTitleAndBuff(news, title, buff);
    }
    public int updateOfTitleAndParam(News news, String title, String param) {
        return dao.updateOfTitleAndParam(news, title, param);
    }
    public int updateOfTitleAndNewsTypeId(News news, String title, String newsTypeId) {
        return dao.updateOfTitleAndNewsTypeId(news, title, newsTypeId);
    }
    public int updateOfTitleAndPath(News news, String title, String path) {
        return dao.updateOfTitleAndPath(news, title, path);
    }
    public int updateOfTitleAndGood(News news, String title, String good) {
        return dao.updateOfTitleAndGood(news, title, good);
    }
    public int updateOfTitleAndBad(News news, String title, String bad) {
        return dao.updateOfTitleAndBad(news, title, bad);
    }
    public int updateOfTitleAndTime(News news, String title, String time) {
        return dao.updateOfTitleAndTime(news, title, time);
    }
    public int updateOfTitleAndSearch(News news, String title, String search) {
        return dao.updateOfTitleAndSearch(news, title, search);
    }
    public int updateOfTitleAndBUserIds(News news, String title, String bUserIds) {
        return dao.updateOfTitleAndBUserIds(news, title, bUserIds);
    }
    public int updateOfTitleAndMoney(News news, String title, String money) {
        return dao.updateOfTitleAndMoney(news, title, money);
    }
    public int updateOfBodyAndUserId(News news, String body, String userId) {
        return dao.updateOfBodyAndUserId(news, body, userId);
    }
    public int updateOfBodyAndUserNewsTypeId(News news, String body, String userNewsTypeId) {
        return dao.updateOfBodyAndUserNewsTypeId(news, body, userNewsTypeId);
    }
    public int updateOfBodyAndStatus(News news, String body, String status) {
        return dao.updateOfBodyAndStatus(news, body, status);
    }
    public int updateOfBodyAndBuff(News news, String body, String buff) {
        return dao.updateOfBodyAndBuff(news, body, buff);
    }
    public int updateOfBodyAndParam(News news, String body, String param) {
        return dao.updateOfBodyAndParam(news, body, param);
    }
    public int updateOfBodyAndNewsTypeId(News news, String body, String newsTypeId) {
        return dao.updateOfBodyAndNewsTypeId(news, body, newsTypeId);
    }
    public int updateOfBodyAndPath(News news, String body, String path) {
        return dao.updateOfBodyAndPath(news, body, path);
    }
    public int updateOfBodyAndGood(News news, String body, String good) {
        return dao.updateOfBodyAndGood(news, body, good);
    }
    public int updateOfBodyAndBad(News news, String body, String bad) {
        return dao.updateOfBodyAndBad(news, body, bad);
    }
    public int updateOfBodyAndTime(News news, String body, String time) {
        return dao.updateOfBodyAndTime(news, body, time);
    }
    public int updateOfBodyAndSearch(News news, String body, String search) {
        return dao.updateOfBodyAndSearch(news, body, search);
    }
    public int updateOfBodyAndBUserIds(News news, String body, String bUserIds) {
        return dao.updateOfBodyAndBUserIds(news, body, bUserIds);
    }
    public int updateOfBodyAndMoney(News news, String body, String money) {
        return dao.updateOfBodyAndMoney(news, body, money);
    }
    public int updateOfUserIdAndUserNewsTypeId(News news, String userId, String userNewsTypeId) {
        return dao.updateOfUserIdAndUserNewsTypeId(news, userId, userNewsTypeId);
    }
    public int updateOfUserIdAndStatus(News news, String userId, String status) {
        return dao.updateOfUserIdAndStatus(news, userId, status);
    }
    public int updateOfUserIdAndBuff(News news, String userId, String buff) {
        return dao.updateOfUserIdAndBuff(news, userId, buff);
    }
    public int updateOfUserIdAndParam(News news, String userId, String param) {
        return dao.updateOfUserIdAndParam(news, userId, param);
    }
    public int updateOfUserIdAndNewsTypeId(News news, String userId, String newsTypeId) {
        return dao.updateOfUserIdAndNewsTypeId(news, userId, newsTypeId);
    }
    public int updateOfUserIdAndPath(News news, String userId, String path) {
        return dao.updateOfUserIdAndPath(news, userId, path);
    }
    public int updateOfUserIdAndGood(News news, String userId, String good) {
        return dao.updateOfUserIdAndGood(news, userId, good);
    }
    public int updateOfUserIdAndBad(News news, String userId, String bad) {
        return dao.updateOfUserIdAndBad(news, userId, bad);
    }
    public int updateOfUserIdAndTime(News news, String userId, String time) {
        return dao.updateOfUserIdAndTime(news, userId, time);
    }
    public int updateOfUserIdAndSearch(News news, String userId, String search) {
        return dao.updateOfUserIdAndSearch(news, userId, search);
    }
    public int updateOfUserIdAndBUserIds(News news, String userId, String bUserIds) {
        return dao.updateOfUserIdAndBUserIds(news, userId, bUserIds);
    }
    public int updateOfUserIdAndMoney(News news, String userId, String money) {
        return dao.updateOfUserIdAndMoney(news, userId, money);
    }
    public int updateOfUserNewsTypeIdAndStatus(News news, String userNewsTypeId, String status) {
        return dao.updateOfUserNewsTypeIdAndStatus(news, userNewsTypeId, status);
    }
    public int updateOfUserNewsTypeIdAndBuff(News news, String userNewsTypeId, String buff) {
        return dao.updateOfUserNewsTypeIdAndBuff(news, userNewsTypeId, buff);
    }
    public int updateOfUserNewsTypeIdAndParam(News news, String userNewsTypeId, String param) {
        return dao.updateOfUserNewsTypeIdAndParam(news, userNewsTypeId, param);
    }
    public int updateOfUserNewsTypeIdAndNewsTypeId(News news, String userNewsTypeId, String newsTypeId) {
        return dao.updateOfUserNewsTypeIdAndNewsTypeId(news, userNewsTypeId, newsTypeId);
    }
    public int updateOfUserNewsTypeIdAndPath(News news, String userNewsTypeId, String path) {
        return dao.updateOfUserNewsTypeIdAndPath(news, userNewsTypeId, path);
    }
    public int updateOfUserNewsTypeIdAndGood(News news, String userNewsTypeId, String good) {
        return dao.updateOfUserNewsTypeIdAndGood(news, userNewsTypeId, good);
    }
    public int updateOfUserNewsTypeIdAndBad(News news, String userNewsTypeId, String bad) {
        return dao.updateOfUserNewsTypeIdAndBad(news, userNewsTypeId, bad);
    }
    public int updateOfUserNewsTypeIdAndTime(News news, String userNewsTypeId, String time) {
        return dao.updateOfUserNewsTypeIdAndTime(news, userNewsTypeId, time);
    }
    public int updateOfUserNewsTypeIdAndSearch(News news, String userNewsTypeId, String search) {
        return dao.updateOfUserNewsTypeIdAndSearch(news, userNewsTypeId, search);
    }
    public int updateOfUserNewsTypeIdAndBUserIds(News news, String userNewsTypeId, String bUserIds) {
        return dao.updateOfUserNewsTypeIdAndBUserIds(news, userNewsTypeId, bUserIds);
    }
    public int updateOfUserNewsTypeIdAndMoney(News news, String userNewsTypeId, String money) {
        return dao.updateOfUserNewsTypeIdAndMoney(news, userNewsTypeId, money);
    }
    public int updateOfStatusAndBuff(News news, String status, String buff) {
        return dao.updateOfStatusAndBuff(news, status, buff);
    }
    public int updateOfStatusAndParam(News news, String status, String param) {
        return dao.updateOfStatusAndParam(news, status, param);
    }
    public int updateOfStatusAndNewsTypeId(News news, String status, String newsTypeId) {
        return dao.updateOfStatusAndNewsTypeId(news, status, newsTypeId);
    }
    public int updateOfStatusAndPath(News news, String status, String path) {
        return dao.updateOfStatusAndPath(news, status, path);
    }
    public int updateOfStatusAndGood(News news, String status, String good) {
        return dao.updateOfStatusAndGood(news, status, good);
    }
    public int updateOfStatusAndBad(News news, String status, String bad) {
        return dao.updateOfStatusAndBad(news, status, bad);
    }
    public int updateOfStatusAndTime(News news, String status, String time) {
        return dao.updateOfStatusAndTime(news, status, time);
    }
    public int updateOfStatusAndSearch(News news, String status, String search) {
        return dao.updateOfStatusAndSearch(news, status, search);
    }
    public int updateOfStatusAndBUserIds(News news, String status, String bUserIds) {
        return dao.updateOfStatusAndBUserIds(news, status, bUserIds);
    }
    public int updateOfStatusAndMoney(News news, String status, String money) {
        return dao.updateOfStatusAndMoney(news, status, money);
    }
    public int updateOfBuffAndParam(News news, String buff, String param) {
        return dao.updateOfBuffAndParam(news, buff, param);
    }
    public int updateOfBuffAndNewsTypeId(News news, String buff, String newsTypeId) {
        return dao.updateOfBuffAndNewsTypeId(news, buff, newsTypeId);
    }
    public int updateOfBuffAndPath(News news, String buff, String path) {
        return dao.updateOfBuffAndPath(news, buff, path);
    }
    public int updateOfBuffAndGood(News news, String buff, String good) {
        return dao.updateOfBuffAndGood(news, buff, good);
    }
    public int updateOfBuffAndBad(News news, String buff, String bad) {
        return dao.updateOfBuffAndBad(news, buff, bad);
    }
    public int updateOfBuffAndTime(News news, String buff, String time) {
        return dao.updateOfBuffAndTime(news, buff, time);
    }
    public int updateOfBuffAndSearch(News news, String buff, String search) {
        return dao.updateOfBuffAndSearch(news, buff, search);
    }
    public int updateOfBuffAndBUserIds(News news, String buff, String bUserIds) {
        return dao.updateOfBuffAndBUserIds(news, buff, bUserIds);
    }
    public int updateOfBuffAndMoney(News news, String buff, String money) {
        return dao.updateOfBuffAndMoney(news, buff, money);
    }
    public int updateOfParamAndNewsTypeId(News news, String param, String newsTypeId) {
        return dao.updateOfParamAndNewsTypeId(news, param, newsTypeId);
    }
    public int updateOfParamAndPath(News news, String param, String path) {
        return dao.updateOfParamAndPath(news, param, path);
    }
    public int updateOfParamAndGood(News news, String param, String good) {
        return dao.updateOfParamAndGood(news, param, good);
    }
    public int updateOfParamAndBad(News news, String param, String bad) {
        return dao.updateOfParamAndBad(news, param, bad);
    }
    public int updateOfParamAndTime(News news, String param, String time) {
        return dao.updateOfParamAndTime(news, param, time);
    }
    public int updateOfParamAndSearch(News news, String param, String search) {
        return dao.updateOfParamAndSearch(news, param, search);
    }
    public int updateOfParamAndBUserIds(News news, String param, String bUserIds) {
        return dao.updateOfParamAndBUserIds(news, param, bUserIds);
    }
    public int updateOfParamAndMoney(News news, String param, String money) {
        return dao.updateOfParamAndMoney(news, param, money);
    }
    public int updateOfNewsTypeIdAndPath(News news, String newsTypeId, String path) {
        return dao.updateOfNewsTypeIdAndPath(news, newsTypeId, path);
    }
    public int updateOfNewsTypeIdAndGood(News news, String newsTypeId, String good) {
        return dao.updateOfNewsTypeIdAndGood(news, newsTypeId, good);
    }
    public int updateOfNewsTypeIdAndBad(News news, String newsTypeId, String bad) {
        return dao.updateOfNewsTypeIdAndBad(news, newsTypeId, bad);
    }
    public int updateOfNewsTypeIdAndTime(News news, String newsTypeId, String time) {
        return dao.updateOfNewsTypeIdAndTime(news, newsTypeId, time);
    }
    public int updateOfNewsTypeIdAndSearch(News news, String newsTypeId, String search) {
        return dao.updateOfNewsTypeIdAndSearch(news, newsTypeId, search);
    }
    public int updateOfNewsTypeIdAndBUserIds(News news, String newsTypeId, String bUserIds) {
        return dao.updateOfNewsTypeIdAndBUserIds(news, newsTypeId, bUserIds);
    }
    public int updateOfNewsTypeIdAndMoney(News news, String newsTypeId, String money) {
        return dao.updateOfNewsTypeIdAndMoney(news, newsTypeId, money);
    }
    public int updateOfPathAndGood(News news, String path, String good) {
        return dao.updateOfPathAndGood(news, path, good);
    }
    public int updateOfPathAndBad(News news, String path, String bad) {
        return dao.updateOfPathAndBad(news, path, bad);
    }
    public int updateOfPathAndTime(News news, String path, String time) {
        return dao.updateOfPathAndTime(news, path, time);
    }
    public int updateOfPathAndSearch(News news, String path, String search) {
        return dao.updateOfPathAndSearch(news, path, search);
    }
    public int updateOfPathAndBUserIds(News news, String path, String bUserIds) {
        return dao.updateOfPathAndBUserIds(news, path, bUserIds);
    }
    public int updateOfPathAndMoney(News news, String path, String money) {
        return dao.updateOfPathAndMoney(news, path, money);
    }
    public int updateOfGoodAndBad(News news, String good, String bad) {
        return dao.updateOfGoodAndBad(news, good, bad);
    }
    public int updateOfGoodAndTime(News news, String good, String time) {
        return dao.updateOfGoodAndTime(news, good, time);
    }
    public int updateOfGoodAndSearch(News news, String good, String search) {
        return dao.updateOfGoodAndSearch(news, good, search);
    }
    public int updateOfGoodAndBUserIds(News news, String good, String bUserIds) {
        return dao.updateOfGoodAndBUserIds(news, good, bUserIds);
    }
    public int updateOfGoodAndMoney(News news, String good, String money) {
        return dao.updateOfGoodAndMoney(news, good, money);
    }
    public int updateOfBadAndTime(News news, String bad, String time) {
        return dao.updateOfBadAndTime(news, bad, time);
    }
    public int updateOfBadAndSearch(News news, String bad, String search) {
        return dao.updateOfBadAndSearch(news, bad, search);
    }
    public int updateOfBadAndBUserIds(News news, String bad, String bUserIds) {
        return dao.updateOfBadAndBUserIds(news, bad, bUserIds);
    }
    public int updateOfBadAndMoney(News news, String bad, String money) {
        return dao.updateOfBadAndMoney(news, bad, money);
    }
    public int updateOfTimeAndSearch(News news, String time, String search) {
        return dao.updateOfTimeAndSearch(news, time, search);
    }
    public int updateOfTimeAndBUserIds(News news, String time, String bUserIds) {
        return dao.updateOfTimeAndBUserIds(news, time, bUserIds);
    }
    public int updateOfTimeAndMoney(News news, String time, String money) {
        return dao.updateOfTimeAndMoney(news, time, money);
    }
    public int updateOfSearchAndBUserIds(News news, String search, String bUserIds) {
        return dao.updateOfSearchAndBUserIds(news, search, bUserIds);
    }
    public int updateOfSearchAndMoney(News news, String search, String money) {
        return dao.updateOfSearchAndMoney(news, search, money);
    }
    public int updateOfBUserIdsAndMoney(News news, String bUserIds, String money) {
        return dao.updateOfBUserIdsAndMoney(news, bUserIds, money);
    }
    public int remove(News news) {
        return dao.remove(news);
    }
    public int removeOfNewsId(String newsId) {
        return dao.removeOfNewsId(newsId);
    }
    public int removeOfTitle(String title) {
        return dao.removeOfTitle(title);
    }
    public int removeOfBody(String body) {
        return dao.removeOfBody(body);
    }
    public int removeOfUserId(String userId) {
        return dao.removeOfUserId(userId);
    }
    public int removeOfUserNewsTypeId(String userNewsTypeId) {
        return dao.removeOfUserNewsTypeId(userNewsTypeId);
    }
    public int removeOfStatus(String status) {
        return dao.removeOfStatus(status);
    }
    public int removeOfBuff(String buff) {
        return dao.removeOfBuff(buff);
    }
    public int removeOfParam(String param) {
        return dao.removeOfParam(param);
    }
    public int removeOfNewsTypeId(String newsTypeId) {
        return dao.removeOfNewsTypeId(newsTypeId);
    }
    public int removeOfPath(String path) {
        return dao.removeOfPath(path);
    }
    public int removeOfGood(String good) {
        return dao.removeOfGood(good);
    }
    public int removeOfBad(String bad) {
        return dao.removeOfBad(bad);
    }
    public int removeOfTime(String time) {
        return dao.removeOfTime(time);
    }
    public int removeOfSearch(String search) {
        return dao.removeOfSearch(search);
    }
    public int removeOfBUserIds(String bUserIds) {
        return dao.removeOfBUserIds(bUserIds);
    }
    public int removeOfMoney(String money) {
        return dao.removeOfMoney(money);
    }
    public int removeOfNewsIdAndTitle(String newsId, String title) {
        return dao.removeOfNewsIdAndTitle(newsId, title);
    }
    public int removeOfNewsIdAndBody(String newsId, String body) {
        return dao.removeOfNewsIdAndBody(newsId, body);
    }
    public int removeOfNewsIdAndUserId(String newsId, String userId) {
        return dao.removeOfNewsIdAndUserId(newsId, userId);
    }
    public int removeOfNewsIdAndUserNewsTypeId(String newsId, String userNewsTypeId) {
        return dao.removeOfNewsIdAndUserNewsTypeId(newsId, userNewsTypeId);
    }
    public int removeOfNewsIdAndStatus(String newsId, String status) {
        return dao.removeOfNewsIdAndStatus(newsId, status);
    }
    public int removeOfNewsIdAndBuff(String newsId, String buff) {
        return dao.removeOfNewsIdAndBuff(newsId, buff);
    }
    public int removeOfNewsIdAndParam(String newsId, String param) {
        return dao.removeOfNewsIdAndParam(newsId, param);
    }
    public int removeOfNewsIdAndNewsTypeId(String newsId, String newsTypeId) {
        return dao.removeOfNewsIdAndNewsTypeId(newsId, newsTypeId);
    }
    public int removeOfNewsIdAndPath(String newsId, String path) {
        return dao.removeOfNewsIdAndPath(newsId, path);
    }
    public int removeOfNewsIdAndGood(String newsId, String good) {
        return dao.removeOfNewsIdAndGood(newsId, good);
    }
    public int removeOfNewsIdAndBad(String newsId, String bad) {
        return dao.removeOfNewsIdAndBad(newsId, bad);
    }
    public int removeOfNewsIdAndTime(String newsId, String time) {
        return dao.removeOfNewsIdAndTime(newsId, time);
    }
    public int removeOfNewsIdAndSearch(String newsId, String search) {
        return dao.removeOfNewsIdAndSearch(newsId, search);
    }
    public int removeOfNewsIdAndBUserIds(String newsId, String bUserIds) {
        return dao.removeOfNewsIdAndBUserIds(newsId, bUserIds);
    }
    public int removeOfNewsIdAndMoney(String newsId, String money) {
        return dao.removeOfNewsIdAndMoney(newsId, money);
    }
    public int removeOfTitleAndBody(String title, String body) {
        return dao.removeOfTitleAndBody(title, body);
    }
    public int removeOfTitleAndUserId(String title, String userId) {
        return dao.removeOfTitleAndUserId(title, userId);
    }
    public int removeOfTitleAndUserNewsTypeId(String title, String userNewsTypeId) {
        return dao.removeOfTitleAndUserNewsTypeId(title, userNewsTypeId);
    }
    public int removeOfTitleAndStatus(String title, String status) {
        return dao.removeOfTitleAndStatus(title, status);
    }
    public int removeOfTitleAndBuff(String title, String buff) {
        return dao.removeOfTitleAndBuff(title, buff);
    }
    public int removeOfTitleAndParam(String title, String param) {
        return dao.removeOfTitleAndParam(title, param);
    }
    public int removeOfTitleAndNewsTypeId(String title, String newsTypeId) {
        return dao.removeOfTitleAndNewsTypeId(title, newsTypeId);
    }
    public int removeOfTitleAndPath(String title, String path) {
        return dao.removeOfTitleAndPath(title, path);
    }
    public int removeOfTitleAndGood(String title, String good) {
        return dao.removeOfTitleAndGood(title, good);
    }
    public int removeOfTitleAndBad(String title, String bad) {
        return dao.removeOfTitleAndBad(title, bad);
    }
    public int removeOfTitleAndTime(String title, String time) {
        return dao.removeOfTitleAndTime(title, time);
    }
    public int removeOfTitleAndSearch(String title, String search) {
        return dao.removeOfTitleAndSearch(title, search);
    }
    public int removeOfTitleAndBUserIds(String title, String bUserIds) {
        return dao.removeOfTitleAndBUserIds(title, bUserIds);
    }
    public int removeOfTitleAndMoney(String title, String money) {
        return dao.removeOfTitleAndMoney(title, money);
    }
    public int removeOfBodyAndUserId(String body, String userId) {
        return dao.removeOfBodyAndUserId(body, userId);
    }
    public int removeOfBodyAndUserNewsTypeId(String body, String userNewsTypeId) {
        return dao.removeOfBodyAndUserNewsTypeId(body, userNewsTypeId);
    }
    public int removeOfBodyAndStatus(String body, String status) {
        return dao.removeOfBodyAndStatus(body, status);
    }
    public int removeOfBodyAndBuff(String body, String buff) {
        return dao.removeOfBodyAndBuff(body, buff);
    }
    public int removeOfBodyAndParam(String body, String param) {
        return dao.removeOfBodyAndParam(body, param);
    }
    public int removeOfBodyAndNewsTypeId(String body, String newsTypeId) {
        return dao.removeOfBodyAndNewsTypeId(body, newsTypeId);
    }
    public int removeOfBodyAndPath(String body, String path) {
        return dao.removeOfBodyAndPath(body, path);
    }
    public int removeOfBodyAndGood(String body, String good) {
        return dao.removeOfBodyAndGood(body, good);
    }
    public int removeOfBodyAndBad(String body, String bad) {
        return dao.removeOfBodyAndBad(body, bad);
    }
    public int removeOfBodyAndTime(String body, String time) {
        return dao.removeOfBodyAndTime(body, time);
    }
    public int removeOfBodyAndSearch(String body, String search) {
        return dao.removeOfBodyAndSearch(body, search);
    }
    public int removeOfBodyAndBUserIds(String body, String bUserIds) {
        return dao.removeOfBodyAndBUserIds(body, bUserIds);
    }
    public int removeOfBodyAndMoney(String body, String money) {
        return dao.removeOfBodyAndMoney(body, money);
    }
    public int removeOfUserIdAndUserNewsTypeId(String userId, String userNewsTypeId) {
        return dao.removeOfUserIdAndUserNewsTypeId(userId, userNewsTypeId);
    }
    public int removeOfUserIdAndStatus(String userId, String status) {
        return dao.removeOfUserIdAndStatus(userId, status);
    }
    public int removeOfUserIdAndBuff(String userId, String buff) {
        return dao.removeOfUserIdAndBuff(userId, buff);
    }
    public int removeOfUserIdAndParam(String userId, String param) {
        return dao.removeOfUserIdAndParam(userId, param);
    }
    public int removeOfUserIdAndNewsTypeId(String userId, String newsTypeId) {
        return dao.removeOfUserIdAndNewsTypeId(userId, newsTypeId);
    }
    public int removeOfUserIdAndPath(String userId, String path) {
        return dao.removeOfUserIdAndPath(userId, path);
    }
    public int removeOfUserIdAndGood(String userId, String good) {
        return dao.removeOfUserIdAndGood(userId, good);
    }
    public int removeOfUserIdAndBad(String userId, String bad) {
        return dao.removeOfUserIdAndBad(userId, bad);
    }
    public int removeOfUserIdAndTime(String userId, String time) {
        return dao.removeOfUserIdAndTime(userId, time);
    }
    public int removeOfUserIdAndSearch(String userId, String search) {
        return dao.removeOfUserIdAndSearch(userId, search);
    }
    public int removeOfUserIdAndBUserIds(String userId, String bUserIds) {
        return dao.removeOfUserIdAndBUserIds(userId, bUserIds);
    }
    public int removeOfUserIdAndMoney(String userId, String money) {
        return dao.removeOfUserIdAndMoney(userId, money);
    }
    public int removeOfUserNewsTypeIdAndStatus(String userNewsTypeId, String status) {
        return dao.removeOfUserNewsTypeIdAndStatus(userNewsTypeId, status);
    }
    public int removeOfUserNewsTypeIdAndBuff(String userNewsTypeId, String buff) {
        return dao.removeOfUserNewsTypeIdAndBuff(userNewsTypeId, buff);
    }
    public int removeOfUserNewsTypeIdAndParam(String userNewsTypeId, String param) {
        return dao.removeOfUserNewsTypeIdAndParam(userNewsTypeId, param);
    }
    public int removeOfUserNewsTypeIdAndNewsTypeId(String userNewsTypeId, String newsTypeId) {
        return dao.removeOfUserNewsTypeIdAndNewsTypeId(userNewsTypeId, newsTypeId);
    }
    public int removeOfUserNewsTypeIdAndPath(String userNewsTypeId, String path) {
        return dao.removeOfUserNewsTypeIdAndPath(userNewsTypeId, path);
    }
    public int removeOfUserNewsTypeIdAndGood(String userNewsTypeId, String good) {
        return dao.removeOfUserNewsTypeIdAndGood(userNewsTypeId, good);
    }
    public int removeOfUserNewsTypeIdAndBad(String userNewsTypeId, String bad) {
        return dao.removeOfUserNewsTypeIdAndBad(userNewsTypeId, bad);
    }
    public int removeOfUserNewsTypeIdAndTime(String userNewsTypeId, String time) {
        return dao.removeOfUserNewsTypeIdAndTime(userNewsTypeId, time);
    }
    public int removeOfUserNewsTypeIdAndSearch(String userNewsTypeId, String search) {
        return dao.removeOfUserNewsTypeIdAndSearch(userNewsTypeId, search);
    }
    public int removeOfUserNewsTypeIdAndBUserIds(String userNewsTypeId, String bUserIds) {
        return dao.removeOfUserNewsTypeIdAndBUserIds(userNewsTypeId, bUserIds);
    }
    public int removeOfUserNewsTypeIdAndMoney(String userNewsTypeId, String money) {
        return dao.removeOfUserNewsTypeIdAndMoney(userNewsTypeId, money);
    }
    public int removeOfStatusAndBuff(String status, String buff) {
        return dao.removeOfStatusAndBuff(status, buff);
    }
    public int removeOfStatusAndParam(String status, String param) {
        return dao.removeOfStatusAndParam(status, param);
    }
    public int removeOfStatusAndNewsTypeId(String status, String newsTypeId) {
        return dao.removeOfStatusAndNewsTypeId(status, newsTypeId);
    }
    public int removeOfStatusAndPath(String status, String path) {
        return dao.removeOfStatusAndPath(status, path);
    }
    public int removeOfStatusAndGood(String status, String good) {
        return dao.removeOfStatusAndGood(status, good);
    }
    public int removeOfStatusAndBad(String status, String bad) {
        return dao.removeOfStatusAndBad(status, bad);
    }
    public int removeOfStatusAndTime(String status, String time) {
        return dao.removeOfStatusAndTime(status, time);
    }
    public int removeOfStatusAndSearch(String status, String search) {
        return dao.removeOfStatusAndSearch(status, search);
    }
    public int removeOfStatusAndBUserIds(String status, String bUserIds) {
        return dao.removeOfStatusAndBUserIds(status, bUserIds);
    }
    public int removeOfStatusAndMoney(String status, String money) {
        return dao.removeOfStatusAndMoney(status, money);
    }
    public int removeOfBuffAndParam(String buff, String param) {
        return dao.removeOfBuffAndParam(buff, param);
    }
    public int removeOfBuffAndNewsTypeId(String buff, String newsTypeId) {
        return dao.removeOfBuffAndNewsTypeId(buff, newsTypeId);
    }
    public int removeOfBuffAndPath(String buff, String path) {
        return dao.removeOfBuffAndPath(buff, path);
    }
    public int removeOfBuffAndGood(String buff, String good) {
        return dao.removeOfBuffAndGood(buff, good);
    }
    public int removeOfBuffAndBad(String buff, String bad) {
        return dao.removeOfBuffAndBad(buff, bad);
    }
    public int removeOfBuffAndTime(String buff, String time) {
        return dao.removeOfBuffAndTime(buff, time);
    }
    public int removeOfBuffAndSearch(String buff, String search) {
        return dao.removeOfBuffAndSearch(buff, search);
    }
    public int removeOfBuffAndBUserIds(String buff, String bUserIds) {
        return dao.removeOfBuffAndBUserIds(buff, bUserIds);
    }
    public int removeOfBuffAndMoney(String buff, String money) {
        return dao.removeOfBuffAndMoney(buff, money);
    }
    public int removeOfParamAndNewsTypeId(String param, String newsTypeId) {
        return dao.removeOfParamAndNewsTypeId(param, newsTypeId);
    }
    public int removeOfParamAndPath(String param, String path) {
        return dao.removeOfParamAndPath(param, path);
    }
    public int removeOfParamAndGood(String param, String good) {
        return dao.removeOfParamAndGood(param, good);
    }
    public int removeOfParamAndBad(String param, String bad) {
        return dao.removeOfParamAndBad(param, bad);
    }
    public int removeOfParamAndTime(String param, String time) {
        return dao.removeOfParamAndTime(param, time);
    }
    public int removeOfParamAndSearch(String param, String search) {
        return dao.removeOfParamAndSearch(param, search);
    }
    public int removeOfParamAndBUserIds(String param, String bUserIds) {
        return dao.removeOfParamAndBUserIds(param, bUserIds);
    }
    public int removeOfParamAndMoney(String param, String money) {
        return dao.removeOfParamAndMoney(param, money);
    }
    public int removeOfNewsTypeIdAndPath(String newsTypeId, String path) {
        return dao.removeOfNewsTypeIdAndPath(newsTypeId, path);
    }
    public int removeOfNewsTypeIdAndGood(String newsTypeId, String good) {
        return dao.removeOfNewsTypeIdAndGood(newsTypeId, good);
    }
    public int removeOfNewsTypeIdAndBad(String newsTypeId, String bad) {
        return dao.removeOfNewsTypeIdAndBad(newsTypeId, bad);
    }
    public int removeOfNewsTypeIdAndTime(String newsTypeId, String time) {
        return dao.removeOfNewsTypeIdAndTime(newsTypeId, time);
    }
    public int removeOfNewsTypeIdAndSearch(String newsTypeId, String search) {
        return dao.removeOfNewsTypeIdAndSearch(newsTypeId, search);
    }
    public int removeOfNewsTypeIdAndBUserIds(String newsTypeId, String bUserIds) {
        return dao.removeOfNewsTypeIdAndBUserIds(newsTypeId, bUserIds);
    }
    public int removeOfNewsTypeIdAndMoney(String newsTypeId, String money) {
        return dao.removeOfNewsTypeIdAndMoney(newsTypeId, money);
    }
    public int removeOfPathAndGood(String path, String good) {
        return dao.removeOfPathAndGood(path, good);
    }
    public int removeOfPathAndBad(String path, String bad) {
        return dao.removeOfPathAndBad(path, bad);
    }
    public int removeOfPathAndTime(String path, String time) {
        return dao.removeOfPathAndTime(path, time);
    }
    public int removeOfPathAndSearch(String path, String search) {
        return dao.removeOfPathAndSearch(path, search);
    }
    public int removeOfPathAndBUserIds(String path, String bUserIds) {
        return dao.removeOfPathAndBUserIds(path, bUserIds);
    }
    public int removeOfPathAndMoney(String path, String money) {
        return dao.removeOfPathAndMoney(path, money);
    }
    public int removeOfGoodAndBad(String good, String bad) {
        return dao.removeOfGoodAndBad(good, bad);
    }
    public int removeOfGoodAndTime(String good, String time) {
        return dao.removeOfGoodAndTime(good, time);
    }
    public int removeOfGoodAndSearch(String good, String search) {
        return dao.removeOfGoodAndSearch(good, search);
    }
    public int removeOfGoodAndBUserIds(String good, String bUserIds) {
        return dao.removeOfGoodAndBUserIds(good, bUserIds);
    }
    public int removeOfGoodAndMoney(String good, String money) {
        return dao.removeOfGoodAndMoney(good, money);
    }
    public int removeOfBadAndTime(String bad, String time) {
        return dao.removeOfBadAndTime(bad, time);
    }
    public int removeOfBadAndSearch(String bad, String search) {
        return dao.removeOfBadAndSearch(bad, search);
    }
    public int removeOfBadAndBUserIds(String bad, String bUserIds) {
        return dao.removeOfBadAndBUserIds(bad, bUserIds);
    }
    public int removeOfBadAndMoney(String bad, String money) {
        return dao.removeOfBadAndMoney(bad, money);
    }
    public int removeOfTimeAndSearch(String time, String search) {
        return dao.removeOfTimeAndSearch(time, search);
    }
    public int removeOfTimeAndBUserIds(String time, String bUserIds) {
        return dao.removeOfTimeAndBUserIds(time, bUserIds);
    }
    public int removeOfTimeAndMoney(String time, String money) {
        return dao.removeOfTimeAndMoney(time, money);
    }
    public int removeOfSearchAndBUserIds(String search, String bUserIds) {
        return dao.removeOfSearchAndBUserIds(search, bUserIds);
    }
    public int removeOfSearchAndMoney(String search, String money) {
        return dao.removeOfSearchAndMoney(search, money);
    }
    public int removeOfBUserIdsAndMoney(String bUserIds, String money) {
        return dao.removeOfBUserIdsAndMoney(bUserIds, money);
    }
    public int insert(News news) {
        return dao.insert(news);
    }
    public int insertOfNewsId(String newsId) {
        return dao.insertOfNewsId(newsId);
    }
    public int insertOfTitle(String title) {
        return dao.insertOfTitle(title);
    }
    public int insertOfBody(String body) {
        return dao.insertOfBody(body);
    }
    public int insertOfUserId(String userId) {
        return dao.insertOfUserId(userId);
    }
    public int insertOfUserNewsTypeId(String userNewsTypeId) {
        return dao.insertOfUserNewsTypeId(userNewsTypeId);
    }
    public int insertOfStatus(String status) {
        return dao.insertOfStatus(status);
    }
    public int insertOfBuff(String buff) {
        return dao.insertOfBuff(buff);
    }
    public int insertOfParam(String param) {
        return dao.insertOfParam(param);
    }
    public int insertOfNewsTypeId(String newsTypeId) {
        return dao.insertOfNewsTypeId(newsTypeId);
    }
    public int insertOfPath(String path) {
        return dao.insertOfPath(path);
    }
    public int insertOfGood(String good) {
        return dao.insertOfGood(good);
    }
    public int insertOfBad(String bad) {
        return dao.insertOfBad(bad);
    }
    public int insertOfTime(String time) {
        return dao.insertOfTime(time);
    }
    public int insertOfSearch(String search) {
        return dao.insertOfSearch(search);
    }
    public int insertOfBUserIds(String bUserIds) {
        return dao.insertOfBUserIds(bUserIds);
    }
    public int insertOfMoney(String money) {
        return dao.insertOfMoney(money);
    }
    public int insertOfNewsIdAndTitle(String newsId, String title) {
        return dao.insertOfNewsIdAndTitle(newsId, title);
    }
    public int insertOfNewsIdAndBody(String newsId, String body) {
        return dao.insertOfNewsIdAndBody(newsId, body);
    }
    public int insertOfNewsIdAndUserId(String newsId, String userId) {
        return dao.insertOfNewsIdAndUserId(newsId, userId);
    }
    public int insertOfNewsIdAndUserNewsTypeId(String newsId, String userNewsTypeId) {
        return dao.insertOfNewsIdAndUserNewsTypeId(newsId, userNewsTypeId);
    }
    public int insertOfNewsIdAndStatus(String newsId, String status) {
        return dao.insertOfNewsIdAndStatus(newsId, status);
    }
    public int insertOfNewsIdAndBuff(String newsId, String buff) {
        return dao.insertOfNewsIdAndBuff(newsId, buff);
    }
    public int insertOfNewsIdAndParam(String newsId, String param) {
        return dao.insertOfNewsIdAndParam(newsId, param);
    }
    public int insertOfNewsIdAndNewsTypeId(String newsId, String newsTypeId) {
        return dao.insertOfNewsIdAndNewsTypeId(newsId, newsTypeId);
    }
    public int insertOfNewsIdAndPath(String newsId, String path) {
        return dao.insertOfNewsIdAndPath(newsId, path);
    }
    public int insertOfNewsIdAndGood(String newsId, String good) {
        return dao.insertOfNewsIdAndGood(newsId, good);
    }
    public int insertOfNewsIdAndBad(String newsId, String bad) {
        return dao.insertOfNewsIdAndBad(newsId, bad);
    }
    public int insertOfNewsIdAndTime(String newsId, String time) {
        return dao.insertOfNewsIdAndTime(newsId, time);
    }
    public int insertOfNewsIdAndSearch(String newsId, String search) {
        return dao.insertOfNewsIdAndSearch(newsId, search);
    }
    public int insertOfNewsIdAndBUserIds(String newsId, String bUserIds) {
        return dao.insertOfNewsIdAndBUserIds(newsId, bUserIds);
    }
    public int insertOfNewsIdAndMoney(String newsId, String money) {
        return dao.insertOfNewsIdAndMoney(newsId, money);
    }
    public int insertOfTitleAndBody(String title, String body) {
        return dao.insertOfTitleAndBody(title, body);
    }
    public int insertOfTitleAndUserId(String title, String userId) {
        return dao.insertOfTitleAndUserId(title, userId);
    }
    public int insertOfTitleAndUserNewsTypeId(String title, String userNewsTypeId) {
        return dao.insertOfTitleAndUserNewsTypeId(title, userNewsTypeId);
    }
    public int insertOfTitleAndStatus(String title, String status) {
        return dao.insertOfTitleAndStatus(title, status);
    }
    public int insertOfTitleAndBuff(String title, String buff) {
        return dao.insertOfTitleAndBuff(title, buff);
    }
    public int insertOfTitleAndParam(String title, String param) {
        return dao.insertOfTitleAndParam(title, param);
    }
    public int insertOfTitleAndNewsTypeId(String title, String newsTypeId) {
        return dao.insertOfTitleAndNewsTypeId(title, newsTypeId);
    }
    public int insertOfTitleAndPath(String title, String path) {
        return dao.insertOfTitleAndPath(title, path);
    }
    public int insertOfTitleAndGood(String title, String good) {
        return dao.insertOfTitleAndGood(title, good);
    }
    public int insertOfTitleAndBad(String title, String bad) {
        return dao.insertOfTitleAndBad(title, bad);
    }
    public int insertOfTitleAndTime(String title, String time) {
        return dao.insertOfTitleAndTime(title, time);
    }
    public int insertOfTitleAndSearch(String title, String search) {
        return dao.insertOfTitleAndSearch(title, search);
    }
    public int insertOfTitleAndBUserIds(String title, String bUserIds) {
        return dao.insertOfTitleAndBUserIds(title, bUserIds);
    }
    public int insertOfTitleAndMoney(String title, String money) {
        return dao.insertOfTitleAndMoney(title, money);
    }
    public int insertOfBodyAndUserId(String body, String userId) {
        return dao.insertOfBodyAndUserId(body, userId);
    }
    public int insertOfBodyAndUserNewsTypeId(String body, String userNewsTypeId) {
        return dao.insertOfBodyAndUserNewsTypeId(body, userNewsTypeId);
    }
    public int insertOfBodyAndStatus(String body, String status) {
        return dao.insertOfBodyAndStatus(body, status);
    }
    public int insertOfBodyAndBuff(String body, String buff) {
        return dao.insertOfBodyAndBuff(body, buff);
    }
    public int insertOfBodyAndParam(String body, String param) {
        return dao.insertOfBodyAndParam(body, param);
    }
    public int insertOfBodyAndNewsTypeId(String body, String newsTypeId) {
        return dao.insertOfBodyAndNewsTypeId(body, newsTypeId);
    }
    public int insertOfBodyAndPath(String body, String path) {
        return dao.insertOfBodyAndPath(body, path);
    }
    public int insertOfBodyAndGood(String body, String good) {
        return dao.insertOfBodyAndGood(body, good);
    }
    public int insertOfBodyAndBad(String body, String bad) {
        return dao.insertOfBodyAndBad(body, bad);
    }
    public int insertOfBodyAndTime(String body, String time) {
        return dao.insertOfBodyAndTime(body, time);
    }
    public int insertOfBodyAndSearch(String body, String search) {
        return dao.insertOfBodyAndSearch(body, search);
    }
    public int insertOfBodyAndBUserIds(String body, String bUserIds) {
        return dao.insertOfBodyAndBUserIds(body, bUserIds);
    }
    public int insertOfBodyAndMoney(String body, String money) {
        return dao.insertOfBodyAndMoney(body, money);
    }
    public int insertOfUserIdAndUserNewsTypeId(String userId, String userNewsTypeId) {
        return dao.insertOfUserIdAndUserNewsTypeId(userId, userNewsTypeId);
    }
    public int insertOfUserIdAndStatus(String userId, String status) {
        return dao.insertOfUserIdAndStatus(userId, status);
    }
    public int insertOfUserIdAndBuff(String userId, String buff) {
        return dao.insertOfUserIdAndBuff(userId, buff);
    }
    public int insertOfUserIdAndParam(String userId, String param) {
        return dao.insertOfUserIdAndParam(userId, param);
    }
    public int insertOfUserIdAndNewsTypeId(String userId, String newsTypeId) {
        return dao.insertOfUserIdAndNewsTypeId(userId, newsTypeId);
    }
    public int insertOfUserIdAndPath(String userId, String path) {
        return dao.insertOfUserIdAndPath(userId, path);
    }
    public int insertOfUserIdAndGood(String userId, String good) {
        return dao.insertOfUserIdAndGood(userId, good);
    }
    public int insertOfUserIdAndBad(String userId, String bad) {
        return dao.insertOfUserIdAndBad(userId, bad);
    }
    public int insertOfUserIdAndTime(String userId, String time) {
        return dao.insertOfUserIdAndTime(userId, time);
    }
    public int insertOfUserIdAndSearch(String userId, String search) {
        return dao.insertOfUserIdAndSearch(userId, search);
    }
    public int insertOfUserIdAndBUserIds(String userId, String bUserIds) {
        return dao.insertOfUserIdAndBUserIds(userId, bUserIds);
    }
    public int insertOfUserIdAndMoney(String userId, String money) {
        return dao.insertOfUserIdAndMoney(userId, money);
    }
    public int insertOfUserNewsTypeIdAndStatus(String userNewsTypeId, String status) {
        return dao.insertOfUserNewsTypeIdAndStatus(userNewsTypeId, status);
    }
    public int insertOfUserNewsTypeIdAndBuff(String userNewsTypeId, String buff) {
        return dao.insertOfUserNewsTypeIdAndBuff(userNewsTypeId, buff);
    }
    public int insertOfUserNewsTypeIdAndParam(String userNewsTypeId, String param) {
        return dao.insertOfUserNewsTypeIdAndParam(userNewsTypeId, param);
    }
    public int insertOfUserNewsTypeIdAndNewsTypeId(String userNewsTypeId, String newsTypeId) {
        return dao.insertOfUserNewsTypeIdAndNewsTypeId(userNewsTypeId, newsTypeId);
    }
    public int insertOfUserNewsTypeIdAndPath(String userNewsTypeId, String path) {
        return dao.insertOfUserNewsTypeIdAndPath(userNewsTypeId, path);
    }
    public int insertOfUserNewsTypeIdAndGood(String userNewsTypeId, String good) {
        return dao.insertOfUserNewsTypeIdAndGood(userNewsTypeId, good);
    }
    public int insertOfUserNewsTypeIdAndBad(String userNewsTypeId, String bad) {
        return dao.insertOfUserNewsTypeIdAndBad(userNewsTypeId, bad);
    }
    public int insertOfUserNewsTypeIdAndTime(String userNewsTypeId, String time) {
        return dao.insertOfUserNewsTypeIdAndTime(userNewsTypeId, time);
    }
    public int insertOfUserNewsTypeIdAndSearch(String userNewsTypeId, String search) {
        return dao.insertOfUserNewsTypeIdAndSearch(userNewsTypeId, search);
    }
    public int insertOfUserNewsTypeIdAndBUserIds(String userNewsTypeId, String bUserIds) {
        return dao.insertOfUserNewsTypeIdAndBUserIds(userNewsTypeId, bUserIds);
    }
    public int insertOfUserNewsTypeIdAndMoney(String userNewsTypeId, String money) {
        return dao.insertOfUserNewsTypeIdAndMoney(userNewsTypeId, money);
    }
    public int insertOfStatusAndBuff(String status, String buff) {
        return dao.insertOfStatusAndBuff(status, buff);
    }
    public int insertOfStatusAndParam(String status, String param) {
        return dao.insertOfStatusAndParam(status, param);
    }
    public int insertOfStatusAndNewsTypeId(String status, String newsTypeId) {
        return dao.insertOfStatusAndNewsTypeId(status, newsTypeId);
    }
    public int insertOfStatusAndPath(String status, String path) {
        return dao.insertOfStatusAndPath(status, path);
    }
    public int insertOfStatusAndGood(String status, String good) {
        return dao.insertOfStatusAndGood(status, good);
    }
    public int insertOfStatusAndBad(String status, String bad) {
        return dao.insertOfStatusAndBad(status, bad);
    }
    public int insertOfStatusAndTime(String status, String time) {
        return dao.insertOfStatusAndTime(status, time);
    }
    public int insertOfStatusAndSearch(String status, String search) {
        return dao.insertOfStatusAndSearch(status, search);
    }
    public int insertOfStatusAndBUserIds(String status, String bUserIds) {
        return dao.insertOfStatusAndBUserIds(status, bUserIds);
    }
    public int insertOfStatusAndMoney(String status, String money) {
        return dao.insertOfStatusAndMoney(status, money);
    }
    public int insertOfBuffAndParam(String buff, String param) {
        return dao.insertOfBuffAndParam(buff, param);
    }
    public int insertOfBuffAndNewsTypeId(String buff, String newsTypeId) {
        return dao.insertOfBuffAndNewsTypeId(buff, newsTypeId);
    }
    public int insertOfBuffAndPath(String buff, String path) {
        return dao.insertOfBuffAndPath(buff, path);
    }
    public int insertOfBuffAndGood(String buff, String good) {
        return dao.insertOfBuffAndGood(buff, good);
    }
    public int insertOfBuffAndBad(String buff, String bad) {
        return dao.insertOfBuffAndBad(buff, bad);
    }
    public int insertOfBuffAndTime(String buff, String time) {
        return dao.insertOfBuffAndTime(buff, time);
    }
    public int insertOfBuffAndSearch(String buff, String search) {
        return dao.insertOfBuffAndSearch(buff, search);
    }
    public int insertOfBuffAndBUserIds(String buff, String bUserIds) {
        return dao.insertOfBuffAndBUserIds(buff, bUserIds);
    }
    public int insertOfBuffAndMoney(String buff, String money) {
        return dao.insertOfBuffAndMoney(buff, money);
    }
    public int insertOfParamAndNewsTypeId(String param, String newsTypeId) {
        return dao.insertOfParamAndNewsTypeId(param, newsTypeId);
    }
    public int insertOfParamAndPath(String param, String path) {
        return dao.insertOfParamAndPath(param, path);
    }
    public int insertOfParamAndGood(String param, String good) {
        return dao.insertOfParamAndGood(param, good);
    }
    public int insertOfParamAndBad(String param, String bad) {
        return dao.insertOfParamAndBad(param, bad);
    }
    public int insertOfParamAndTime(String param, String time) {
        return dao.insertOfParamAndTime(param, time);
    }
    public int insertOfParamAndSearch(String param, String search) {
        return dao.insertOfParamAndSearch(param, search);
    }
    public int insertOfParamAndBUserIds(String param, String bUserIds) {
        return dao.insertOfParamAndBUserIds(param, bUserIds);
    }
    public int insertOfParamAndMoney(String param, String money) {
        return dao.insertOfParamAndMoney(param, money);
    }
    public int insertOfNewsTypeIdAndPath(String newsTypeId, String path) {
        return dao.insertOfNewsTypeIdAndPath(newsTypeId, path);
    }
    public int insertOfNewsTypeIdAndGood(String newsTypeId, String good) {
        return dao.insertOfNewsTypeIdAndGood(newsTypeId, good);
    }
    public int insertOfNewsTypeIdAndBad(String newsTypeId, String bad) {
        return dao.insertOfNewsTypeIdAndBad(newsTypeId, bad);
    }
    public int insertOfNewsTypeIdAndTime(String newsTypeId, String time) {
        return dao.insertOfNewsTypeIdAndTime(newsTypeId, time);
    }
    public int insertOfNewsTypeIdAndSearch(String newsTypeId, String search) {
        return dao.insertOfNewsTypeIdAndSearch(newsTypeId, search);
    }
    public int insertOfNewsTypeIdAndBUserIds(String newsTypeId, String bUserIds) {
        return dao.insertOfNewsTypeIdAndBUserIds(newsTypeId, bUserIds);
    }
    public int insertOfNewsTypeIdAndMoney(String newsTypeId, String money) {
        return dao.insertOfNewsTypeIdAndMoney(newsTypeId, money);
    }
    public int insertOfPathAndGood(String path, String good) {
        return dao.insertOfPathAndGood(path, good);
    }
    public int insertOfPathAndBad(String path, String bad) {
        return dao.insertOfPathAndBad(path, bad);
    }
    public int insertOfPathAndTime(String path, String time) {
        return dao.insertOfPathAndTime(path, time);
    }
    public int insertOfPathAndSearch(String path, String search) {
        return dao.insertOfPathAndSearch(path, search);
    }
    public int insertOfPathAndBUserIds(String path, String bUserIds) {
        return dao.insertOfPathAndBUserIds(path, bUserIds);
    }
    public int insertOfPathAndMoney(String path, String money) {
        return dao.insertOfPathAndMoney(path, money);
    }
    public int insertOfGoodAndBad(String good, String bad) {
        return dao.insertOfGoodAndBad(good, bad);
    }
    public int insertOfGoodAndTime(String good, String time) {
        return dao.insertOfGoodAndTime(good, time);
    }
    public int insertOfGoodAndSearch(String good, String search) {
        return dao.insertOfGoodAndSearch(good, search);
    }
    public int insertOfGoodAndBUserIds(String good, String bUserIds) {
        return dao.insertOfGoodAndBUserIds(good, bUserIds);
    }
    public int insertOfGoodAndMoney(String good, String money) {
        return dao.insertOfGoodAndMoney(good, money);
    }
    public int insertOfBadAndTime(String bad, String time) {
        return dao.insertOfBadAndTime(bad, time);
    }
    public int insertOfBadAndSearch(String bad, String search) {
        return dao.insertOfBadAndSearch(bad, search);
    }
    public int insertOfBadAndBUserIds(String bad, String bUserIds) {
        return dao.insertOfBadAndBUserIds(bad, bUserIds);
    }
    public int insertOfBadAndMoney(String bad, String money) {
        return dao.insertOfBadAndMoney(bad, money);
    }
    public int insertOfTimeAndSearch(String time, String search) {
        return dao.insertOfTimeAndSearch(time, search);
    }
    public int insertOfTimeAndBUserIds(String time, String bUserIds) {
        return dao.insertOfTimeAndBUserIds(time, bUserIds);
    }
    public int insertOfTimeAndMoney(String time, String money) {
        return dao.insertOfTimeAndMoney(time, money);
    }
    public int insertOfSearchAndBUserIds(String search, String bUserIds) {
        return dao.insertOfSearchAndBUserIds(search, bUserIds);
    }
    public int insertOfSearchAndMoney(String search, String money) {
        return dao.insertOfSearchAndMoney(search, money);
    }
    public int insertOfBUserIdsAndMoney(String bUserIds, String money) {
        return dao.insertOfBUserIdsAndMoney(bUserIds, money);
    }
    public News getNews(News news) {
        return dao.getNews(news);
    }
    public News getNewsOfNewsId(String newsId) {
        return dao.getNewsOfNewsId(newsId);
    }
    public News getNewsOfTitle(String title) {
        return dao.getNewsOfTitle(title);
    }
    public News getNewsOfBody(String body) {
        return dao.getNewsOfBody(body);
    }
    public News getNewsOfUserId(String userId) {
        return dao.getNewsOfUserId(userId);
    }
    public News getNewsOfUserNewsTypeId(String userNewsTypeId) {
        return dao.getNewsOfUserNewsTypeId(userNewsTypeId);
    }
    public News getNewsOfStatus(String status) {
        return dao.getNewsOfStatus(status);
    }
    public News getNewsOfBuff(String buff) {
        return dao.getNewsOfBuff(buff);
    }
    public News getNewsOfParam(String param) {
        return dao.getNewsOfParam(param);
    }
    public News getNewsOfNewsTypeId(String newsTypeId) {
        return dao.getNewsOfNewsTypeId(newsTypeId);
    }
    public News getNewsOfPath(String path) {
        return dao.getNewsOfPath(path);
    }
    public News getNewsOfGood(String good) {
        return dao.getNewsOfGood(good);
    }
    public News getNewsOfBad(String bad) {
        return dao.getNewsOfBad(bad);
    }
    public News getNewsOfTime(String time) {
        return dao.getNewsOfTime(time);
    }
    public News getNewsOfSearch(String search) {
        return dao.getNewsOfSearch(search);
    }
    public News getNewsOfBUserIds(String bUserIds) {
        return dao.getNewsOfBUserIds(bUserIds);
    }
    public News getNewsOfMoney(String money) {
        return dao.getNewsOfMoney(money);
    }
    public News getNewsOfNewsIdAndTitle(String newsId, String title) {
        return dao.getNewsOfNewsIdAndTitle(newsId, title);
    }
    public News getNewsOfNewsIdAndBody(String newsId, String body) {
        return dao.getNewsOfNewsIdAndBody(newsId, body);
    }
    public News getNewsOfNewsIdAndUserId(String newsId, String userId) {
        return dao.getNewsOfNewsIdAndUserId(newsId, userId);
    }
    public News getNewsOfNewsIdAndUserNewsTypeId(String newsId, String userNewsTypeId) {
        return dao.getNewsOfNewsIdAndUserNewsTypeId(newsId, userNewsTypeId);
    }
    public News getNewsOfNewsIdAndStatus(String newsId, String status) {
        return dao.getNewsOfNewsIdAndStatus(newsId, status);
    }
    public News getNewsOfNewsIdAndBuff(String newsId, String buff) {
        return dao.getNewsOfNewsIdAndBuff(newsId, buff);
    }
    public News getNewsOfNewsIdAndParam(String newsId, String param) {
        return dao.getNewsOfNewsIdAndParam(newsId, param);
    }
    public News getNewsOfNewsIdAndNewsTypeId(String newsId, String newsTypeId) {
        return dao.getNewsOfNewsIdAndNewsTypeId(newsId, newsTypeId);
    }
    public News getNewsOfNewsIdAndPath(String newsId, String path) {
        return dao.getNewsOfNewsIdAndPath(newsId, path);
    }
    public News getNewsOfNewsIdAndGood(String newsId, String good) {
        return dao.getNewsOfNewsIdAndGood(newsId, good);
    }
    public News getNewsOfNewsIdAndBad(String newsId, String bad) {
        return dao.getNewsOfNewsIdAndBad(newsId, bad);
    }
    public News getNewsOfNewsIdAndTime(String newsId, String time) {
        return dao.getNewsOfNewsIdAndTime(newsId, time);
    }
    public News getNewsOfNewsIdAndSearch(String newsId, String search) {
        return dao.getNewsOfNewsIdAndSearch(newsId, search);
    }
    public News getNewsOfNewsIdAndBUserIds(String newsId, String bUserIds) {
        return dao.getNewsOfNewsIdAndBUserIds(newsId, bUserIds);
    }
    public News getNewsOfNewsIdAndMoney(String newsId, String money) {
        return dao.getNewsOfNewsIdAndMoney(newsId, money);
    }
    public News getNewsOfTitleAndBody(String title, String body) {
        return dao.getNewsOfTitleAndBody(title, body);
    }
    public News getNewsOfTitleAndUserId(String title, String userId) {
        return dao.getNewsOfTitleAndUserId(title, userId);
    }
    public News getNewsOfTitleAndUserNewsTypeId(String title, String userNewsTypeId) {
        return dao.getNewsOfTitleAndUserNewsTypeId(title, userNewsTypeId);
    }
    public News getNewsOfTitleAndStatus(String title, String status) {
        return dao.getNewsOfTitleAndStatus(title, status);
    }
    public News getNewsOfTitleAndBuff(String title, String buff) {
        return dao.getNewsOfTitleAndBuff(title, buff);
    }
    public News getNewsOfTitleAndParam(String title, String param) {
        return dao.getNewsOfTitleAndParam(title, param);
    }
    public News getNewsOfTitleAndNewsTypeId(String title, String newsTypeId) {
        return dao.getNewsOfTitleAndNewsTypeId(title, newsTypeId);
    }
    public News getNewsOfTitleAndPath(String title, String path) {
        return dao.getNewsOfTitleAndPath(title, path);
    }
    public News getNewsOfTitleAndGood(String title, String good) {
        return dao.getNewsOfTitleAndGood(title, good);
    }
    public News getNewsOfTitleAndBad(String title, String bad) {
        return dao.getNewsOfTitleAndBad(title, bad);
    }
    public News getNewsOfTitleAndTime(String title, String time) {
        return dao.getNewsOfTitleAndTime(title, time);
    }
    public News getNewsOfTitleAndSearch(String title, String search) {
        return dao.getNewsOfTitleAndSearch(title, search);
    }
    public News getNewsOfTitleAndBUserIds(String title, String bUserIds) {
        return dao.getNewsOfTitleAndBUserIds(title, bUserIds);
    }
    public News getNewsOfTitleAndMoney(String title, String money) {
        return dao.getNewsOfTitleAndMoney(title, money);
    }
    public News getNewsOfBodyAndUserId(String body, String userId) {
        return dao.getNewsOfBodyAndUserId(body, userId);
    }
    public News getNewsOfBodyAndUserNewsTypeId(String body, String userNewsTypeId) {
        return dao.getNewsOfBodyAndUserNewsTypeId(body, userNewsTypeId);
    }
    public News getNewsOfBodyAndStatus(String body, String status) {
        return dao.getNewsOfBodyAndStatus(body, status);
    }
    public News getNewsOfBodyAndBuff(String body, String buff) {
        return dao.getNewsOfBodyAndBuff(body, buff);
    }
    public News getNewsOfBodyAndParam(String body, String param) {
        return dao.getNewsOfBodyAndParam(body, param);
    }
    public News getNewsOfBodyAndNewsTypeId(String body, String newsTypeId) {
        return dao.getNewsOfBodyAndNewsTypeId(body, newsTypeId);
    }
    public News getNewsOfBodyAndPath(String body, String path) {
        return dao.getNewsOfBodyAndPath(body, path);
    }
    public News getNewsOfBodyAndGood(String body, String good) {
        return dao.getNewsOfBodyAndGood(body, good);
    }
    public News getNewsOfBodyAndBad(String body, String bad) {
        return dao.getNewsOfBodyAndBad(body, bad);
    }
    public News getNewsOfBodyAndTime(String body, String time) {
        return dao.getNewsOfBodyAndTime(body, time);
    }
    public News getNewsOfBodyAndSearch(String body, String search) {
        return dao.getNewsOfBodyAndSearch(body, search);
    }
    public News getNewsOfBodyAndBUserIds(String body, String bUserIds) {
        return dao.getNewsOfBodyAndBUserIds(body, bUserIds);
    }
    public News getNewsOfBodyAndMoney(String body, String money) {
        return dao.getNewsOfBodyAndMoney(body, money);
    }
    public News getNewsOfUserIdAndUserNewsTypeId(String userId, String userNewsTypeId) {
        return dao.getNewsOfUserIdAndUserNewsTypeId(userId, userNewsTypeId);
    }
    public News getNewsOfUserIdAndStatus(String userId, String status) {
        return dao.getNewsOfUserIdAndStatus(userId, status);
    }
    public News getNewsOfUserIdAndBuff(String userId, String buff) {
        return dao.getNewsOfUserIdAndBuff(userId, buff);
    }
    public News getNewsOfUserIdAndParam(String userId, String param) {
        return dao.getNewsOfUserIdAndParam(userId, param);
    }
    public News getNewsOfUserIdAndNewsTypeId(String userId, String newsTypeId) {
        return dao.getNewsOfUserIdAndNewsTypeId(userId, newsTypeId);
    }
    public News getNewsOfUserIdAndPath(String userId, String path) {
        return dao.getNewsOfUserIdAndPath(userId, path);
    }
    public News getNewsOfUserIdAndGood(String userId, String good) {
        return dao.getNewsOfUserIdAndGood(userId, good);
    }
    public News getNewsOfUserIdAndBad(String userId, String bad) {
        return dao.getNewsOfUserIdAndBad(userId, bad);
    }
    public News getNewsOfUserIdAndTime(String userId, String time) {
        return dao.getNewsOfUserIdAndTime(userId, time);
    }
    public News getNewsOfUserIdAndSearch(String userId, String search) {
        return dao.getNewsOfUserIdAndSearch(userId, search);
    }
    public News getNewsOfUserIdAndBUserIds(String userId, String bUserIds) {
        return dao.getNewsOfUserIdAndBUserIds(userId, bUserIds);
    }
    public News getNewsOfUserIdAndMoney(String userId, String money) {
        return dao.getNewsOfUserIdAndMoney(userId, money);
    }
    public News getNewsOfUserNewsTypeIdAndStatus(String userNewsTypeId, String status) {
        return dao.getNewsOfUserNewsTypeIdAndStatus(userNewsTypeId, status);
    }
    public News getNewsOfUserNewsTypeIdAndBuff(String userNewsTypeId, String buff) {
        return dao.getNewsOfUserNewsTypeIdAndBuff(userNewsTypeId, buff);
    }
    public News getNewsOfUserNewsTypeIdAndParam(String userNewsTypeId, String param) {
        return dao.getNewsOfUserNewsTypeIdAndParam(userNewsTypeId, param);
    }
    public News getNewsOfUserNewsTypeIdAndNewsTypeId(String userNewsTypeId, String newsTypeId) {
        return dao.getNewsOfUserNewsTypeIdAndNewsTypeId(userNewsTypeId, newsTypeId);
    }
    public News getNewsOfUserNewsTypeIdAndPath(String userNewsTypeId, String path) {
        return dao.getNewsOfUserNewsTypeIdAndPath(userNewsTypeId, path);
    }
    public News getNewsOfUserNewsTypeIdAndGood(String userNewsTypeId, String good) {
        return dao.getNewsOfUserNewsTypeIdAndGood(userNewsTypeId, good);
    }
    public News getNewsOfUserNewsTypeIdAndBad(String userNewsTypeId, String bad) {
        return dao.getNewsOfUserNewsTypeIdAndBad(userNewsTypeId, bad);
    }
    public News getNewsOfUserNewsTypeIdAndTime(String userNewsTypeId, String time) {
        return dao.getNewsOfUserNewsTypeIdAndTime(userNewsTypeId, time);
    }
    public News getNewsOfUserNewsTypeIdAndSearch(String userNewsTypeId, String search) {
        return dao.getNewsOfUserNewsTypeIdAndSearch(userNewsTypeId, search);
    }
    public News getNewsOfUserNewsTypeIdAndBUserIds(String userNewsTypeId, String bUserIds) {
        return dao.getNewsOfUserNewsTypeIdAndBUserIds(userNewsTypeId, bUserIds);
    }
    public News getNewsOfUserNewsTypeIdAndMoney(String userNewsTypeId, String money) {
        return dao.getNewsOfUserNewsTypeIdAndMoney(userNewsTypeId, money);
    }
    public News getNewsOfStatusAndBuff(String status, String buff) {
        return dao.getNewsOfStatusAndBuff(status, buff);
    }
    public News getNewsOfStatusAndParam(String status, String param) {
        return dao.getNewsOfStatusAndParam(status, param);
    }
    public News getNewsOfStatusAndNewsTypeId(String status, String newsTypeId) {
        return dao.getNewsOfStatusAndNewsTypeId(status, newsTypeId);
    }
    public News getNewsOfStatusAndPath(String status, String path) {
        return dao.getNewsOfStatusAndPath(status, path);
    }
    public News getNewsOfStatusAndGood(String status, String good) {
        return dao.getNewsOfStatusAndGood(status, good);
    }
    public News getNewsOfStatusAndBad(String status, String bad) {
        return dao.getNewsOfStatusAndBad(status, bad);
    }
    public News getNewsOfStatusAndTime(String status, String time) {
        return dao.getNewsOfStatusAndTime(status, time);
    }
    public News getNewsOfStatusAndSearch(String status, String search) {
        return dao.getNewsOfStatusAndSearch(status, search);
    }
    public News getNewsOfStatusAndBUserIds(String status, String bUserIds) {
        return dao.getNewsOfStatusAndBUserIds(status, bUserIds);
    }
    public News getNewsOfStatusAndMoney(String status, String money) {
        return dao.getNewsOfStatusAndMoney(status, money);
    }
    public News getNewsOfBuffAndParam(String buff, String param) {
        return dao.getNewsOfBuffAndParam(buff, param);
    }
    public News getNewsOfBuffAndNewsTypeId(String buff, String newsTypeId) {
        return dao.getNewsOfBuffAndNewsTypeId(buff, newsTypeId);
    }
    public News getNewsOfBuffAndPath(String buff, String path) {
        return dao.getNewsOfBuffAndPath(buff, path);
    }
    public News getNewsOfBuffAndGood(String buff, String good) {
        return dao.getNewsOfBuffAndGood(buff, good);
    }
    public News getNewsOfBuffAndBad(String buff, String bad) {
        return dao.getNewsOfBuffAndBad(buff, bad);
    }
    public News getNewsOfBuffAndTime(String buff, String time) {
        return dao.getNewsOfBuffAndTime(buff, time);
    }
    public News getNewsOfBuffAndSearch(String buff, String search) {
        return dao.getNewsOfBuffAndSearch(buff, search);
    }
    public News getNewsOfBuffAndBUserIds(String buff, String bUserIds) {
        return dao.getNewsOfBuffAndBUserIds(buff, bUserIds);
    }
    public News getNewsOfBuffAndMoney(String buff, String money) {
        return dao.getNewsOfBuffAndMoney(buff, money);
    }
    public News getNewsOfParamAndNewsTypeId(String param, String newsTypeId) {
        return dao.getNewsOfParamAndNewsTypeId(param, newsTypeId);
    }
    public News getNewsOfParamAndPath(String param, String path) {
        return dao.getNewsOfParamAndPath(param, path);
    }
    public News getNewsOfParamAndGood(String param, String good) {
        return dao.getNewsOfParamAndGood(param, good);
    }
    public News getNewsOfParamAndBad(String param, String bad) {
        return dao.getNewsOfParamAndBad(param, bad);
    }
    public News getNewsOfParamAndTime(String param, String time) {
        return dao.getNewsOfParamAndTime(param, time);
    }
    public News getNewsOfParamAndSearch(String param, String search) {
        return dao.getNewsOfParamAndSearch(param, search);
    }
    public News getNewsOfParamAndBUserIds(String param, String bUserIds) {
        return dao.getNewsOfParamAndBUserIds(param, bUserIds);
    }
    public News getNewsOfParamAndMoney(String param, String money) {
        return dao.getNewsOfParamAndMoney(param, money);
    }
    public News getNewsOfNewsTypeIdAndPath(String newsTypeId, String path) {
        return dao.getNewsOfNewsTypeIdAndPath(newsTypeId, path);
    }
    public News getNewsOfNewsTypeIdAndGood(String newsTypeId, String good) {
        return dao.getNewsOfNewsTypeIdAndGood(newsTypeId, good);
    }
    public News getNewsOfNewsTypeIdAndBad(String newsTypeId, String bad) {
        return dao.getNewsOfNewsTypeIdAndBad(newsTypeId, bad);
    }
    public News getNewsOfNewsTypeIdAndTime(String newsTypeId, String time) {
        return dao.getNewsOfNewsTypeIdAndTime(newsTypeId, time);
    }
    public News getNewsOfNewsTypeIdAndSearch(String newsTypeId, String search) {
        return dao.getNewsOfNewsTypeIdAndSearch(newsTypeId, search);
    }
    public News getNewsOfNewsTypeIdAndBUserIds(String newsTypeId, String bUserIds) {
        return dao.getNewsOfNewsTypeIdAndBUserIds(newsTypeId, bUserIds);
    }
    public News getNewsOfNewsTypeIdAndMoney(String newsTypeId, String money) {
        return dao.getNewsOfNewsTypeIdAndMoney(newsTypeId, money);
    }
    public News getNewsOfPathAndGood(String path, String good) {
        return dao.getNewsOfPathAndGood(path, good);
    }
    public News getNewsOfPathAndBad(String path, String bad) {
        return dao.getNewsOfPathAndBad(path, bad);
    }
    public News getNewsOfPathAndTime(String path, String time) {
        return dao.getNewsOfPathAndTime(path, time);
    }
    public News getNewsOfPathAndSearch(String path, String search) {
        return dao.getNewsOfPathAndSearch(path, search);
    }
    public News getNewsOfPathAndBUserIds(String path, String bUserIds) {
        return dao.getNewsOfPathAndBUserIds(path, bUserIds);
    }
    public News getNewsOfPathAndMoney(String path, String money) {
        return dao.getNewsOfPathAndMoney(path, money);
    }
    public News getNewsOfGoodAndBad(String good, String bad) {
        return dao.getNewsOfGoodAndBad(good, bad);
    }
    public News getNewsOfGoodAndTime(String good, String time) {
        return dao.getNewsOfGoodAndTime(good, time);
    }
    public News getNewsOfGoodAndSearch(String good, String search) {
        return dao.getNewsOfGoodAndSearch(good, search);
    }
    public News getNewsOfGoodAndBUserIds(String good, String bUserIds) {
        return dao.getNewsOfGoodAndBUserIds(good, bUserIds);
    }
    public News getNewsOfGoodAndMoney(String good, String money) {
        return dao.getNewsOfGoodAndMoney(good, money);
    }
    public News getNewsOfBadAndTime(String bad, String time) {
        return dao.getNewsOfBadAndTime(bad, time);
    }
    public News getNewsOfBadAndSearch(String bad, String search) {
        return dao.getNewsOfBadAndSearch(bad, search);
    }
    public News getNewsOfBadAndBUserIds(String bad, String bUserIds) {
        return dao.getNewsOfBadAndBUserIds(bad, bUserIds);
    }
    public News getNewsOfBadAndMoney(String bad, String money) {
        return dao.getNewsOfBadAndMoney(bad, money);
    }
    public News getNewsOfTimeAndSearch(String time, String search) {
        return dao.getNewsOfTimeAndSearch(time, search);
    }
    public News getNewsOfTimeAndBUserIds(String time, String bUserIds) {
        return dao.getNewsOfTimeAndBUserIds(time, bUserIds);
    }
    public News getNewsOfTimeAndMoney(String time, String money) {
        return dao.getNewsOfTimeAndMoney(time, money);
    }
    public News getNewsOfSearchAndBUserIds(String search, String bUserIds) {
        return dao.getNewsOfSearchAndBUserIds(search, bUserIds);
    }
    public News getNewsOfSearchAndMoney(String search, String money) {
        return dao.getNewsOfSearchAndMoney(search, money);
    }
    public News getNewsOfBUserIdsAndMoney(String bUserIds, String money) {
        return dao.getNewsOfBUserIdsAndMoney(bUserIds, money);
    }
    public List<News> getNewss(News news) {
        return dao.getNewss(news);
    }
    public List<News> getNewssOfNewsId(String newsId) {
        return dao.getNewssOfNewsId(newsId);
    }
    public List<News> getNewssOfTitle(String title) {
        return dao.getNewssOfTitle(title);
    }
    public List<News> getNewssOfBody(String body) {
        return dao.getNewssOfBody(body);
    }
    public List<News> getNewssOfUserId(String userId) {
        return dao.getNewssOfUserId(userId);
    }
    public List<News> getNewssOfUserNewsTypeId(String userNewsTypeId) {
        return dao.getNewssOfUserNewsTypeId(userNewsTypeId);
    }
    public List<News> getNewssOfStatus(String status) {
        return dao.getNewssOfStatus(status);
    }
    public List<News> getNewssOfBuff(String buff) {
        return dao.getNewssOfBuff(buff);
    }
    public List<News> getNewssOfParam(String param) {
        return dao.getNewssOfParam(param);
    }
    public List<News> getNewssOfNewsTypeId(String newsTypeId) {
        return dao.getNewssOfNewsTypeId(newsTypeId);
    }
    public List<News> getNewssOfPath(String path) {
        return dao.getNewssOfPath(path);
    }
    public List<News> getNewssOfGood(String good) {
        return dao.getNewssOfGood(good);
    }
    public List<News> getNewssOfBad(String bad) {
        return dao.getNewssOfBad(bad);
    }
    public List<News> getNewssOfTime(String time) {
        return dao.getNewssOfTime(time);
    }
    public List<News> getNewssOfSearch(String search) {
        return dao.getNewssOfSearch(search);
    }
    public List<News> getNewssOfBUserIds(String bUserIds) {
        return dao.getNewssOfBUserIds(bUserIds);
    }
    public List<News> getNewssOfMoney(String money) {
        return dao.getNewssOfMoney(money);
    }
    public List<News> getNewssOfNewsIdAndTitle(String newsId, String title) {
        return dao.getNewssOfNewsIdAndTitle(newsId, title);
    }
    public List<News> getNewssOfNewsIdAndBody(String newsId, String body) {
        return dao.getNewssOfNewsIdAndBody(newsId, body);
    }
    public List<News> getNewssOfNewsIdAndUserId(String newsId, String userId) {
        return dao.getNewssOfNewsIdAndUserId(newsId, userId);
    }
    public List<News> getNewssOfNewsIdAndUserNewsTypeId(String newsId, String userNewsTypeId) {
        return dao.getNewssOfNewsIdAndUserNewsTypeId(newsId, userNewsTypeId);
    }
    public List<News> getNewssOfNewsIdAndStatus(String newsId, String status) {
        return dao.getNewssOfNewsIdAndStatus(newsId, status);
    }
    public List<News> getNewssOfNewsIdAndBuff(String newsId, String buff) {
        return dao.getNewssOfNewsIdAndBuff(newsId, buff);
    }
    public List<News> getNewssOfNewsIdAndParam(String newsId, String param) {
        return dao.getNewssOfNewsIdAndParam(newsId, param);
    }
    public List<News> getNewssOfNewsIdAndNewsTypeId(String newsId, String newsTypeId) {
        return dao.getNewssOfNewsIdAndNewsTypeId(newsId, newsTypeId);
    }
    public List<News> getNewssOfNewsIdAndPath(String newsId, String path) {
        return dao.getNewssOfNewsIdAndPath(newsId, path);
    }
    public List<News> getNewssOfNewsIdAndGood(String newsId, String good) {
        return dao.getNewssOfNewsIdAndGood(newsId, good);
    }
    public List<News> getNewssOfNewsIdAndBad(String newsId, String bad) {
        return dao.getNewssOfNewsIdAndBad(newsId, bad);
    }
    public List<News> getNewssOfNewsIdAndTime(String newsId, String time) {
        return dao.getNewssOfNewsIdAndTime(newsId, time);
    }
    public List<News> getNewssOfNewsIdAndSearch(String newsId, String search) {
        return dao.getNewssOfNewsIdAndSearch(newsId, search);
    }
    public List<News> getNewssOfNewsIdAndBUserIds(String newsId, String bUserIds) {
        return dao.getNewssOfNewsIdAndBUserIds(newsId, bUserIds);
    }
    public List<News> getNewssOfNewsIdAndMoney(String newsId, String money) {
        return dao.getNewssOfNewsIdAndMoney(newsId, money);
    }
    public List<News> getNewssOfTitleAndBody(String title, String body) {
        return dao.getNewssOfTitleAndBody(title, body);
    }
    public List<News> getNewssOfTitleAndUserId(String title, String userId) {
        return dao.getNewssOfTitleAndUserId(title, userId);
    }
    public List<News> getNewssOfTitleAndUserNewsTypeId(String title, String userNewsTypeId) {
        return dao.getNewssOfTitleAndUserNewsTypeId(title, userNewsTypeId);
    }
    public List<News> getNewssOfTitleAndStatus(String title, String status) {
        return dao.getNewssOfTitleAndStatus(title, status);
    }
    public List<News> getNewssOfTitleAndBuff(String title, String buff) {
        return dao.getNewssOfTitleAndBuff(title, buff);
    }
    public List<News> getNewssOfTitleAndParam(String title, String param) {
        return dao.getNewssOfTitleAndParam(title, param);
    }
    public List<News> getNewssOfTitleAndNewsTypeId(String title, String newsTypeId) {
        return dao.getNewssOfTitleAndNewsTypeId(title, newsTypeId);
    }
    public List<News> getNewssOfTitleAndPath(String title, String path) {
        return dao.getNewssOfTitleAndPath(title, path);
    }
    public List<News> getNewssOfTitleAndGood(String title, String good) {
        return dao.getNewssOfTitleAndGood(title, good);
    }
    public List<News> getNewssOfTitleAndBad(String title, String bad) {
        return dao.getNewssOfTitleAndBad(title, bad);
    }
    public List<News> getNewssOfTitleAndTime(String title, String time) {
        return dao.getNewssOfTitleAndTime(title, time);
    }
    public List<News> getNewssOfTitleAndSearch(String title, String search) {
        return dao.getNewssOfTitleAndSearch(title, search);
    }
    public List<News> getNewssOfTitleAndBUserIds(String title, String bUserIds) {
        return dao.getNewssOfTitleAndBUserIds(title, bUserIds);
    }
    public List<News> getNewssOfTitleAndMoney(String title, String money) {
        return dao.getNewssOfTitleAndMoney(title, money);
    }
    public List<News> getNewssOfBodyAndUserId(String body, String userId) {
        return dao.getNewssOfBodyAndUserId(body, userId);
    }
    public List<News> getNewssOfBodyAndUserNewsTypeId(String body, String userNewsTypeId) {
        return dao.getNewssOfBodyAndUserNewsTypeId(body, userNewsTypeId);
    }
    public List<News> getNewssOfBodyAndStatus(String body, String status) {
        return dao.getNewssOfBodyAndStatus(body, status);
    }
    public List<News> getNewssOfBodyAndBuff(String body, String buff) {
        return dao.getNewssOfBodyAndBuff(body, buff);
    }
    public List<News> getNewssOfBodyAndParam(String body, String param) {
        return dao.getNewssOfBodyAndParam(body, param);
    }
    public List<News> getNewssOfBodyAndNewsTypeId(String body, String newsTypeId) {
        return dao.getNewssOfBodyAndNewsTypeId(body, newsTypeId);
    }
    public List<News> getNewssOfBodyAndPath(String body, String path) {
        return dao.getNewssOfBodyAndPath(body, path);
    }
    public List<News> getNewssOfBodyAndGood(String body, String good) {
        return dao.getNewssOfBodyAndGood(body, good);
    }
    public List<News> getNewssOfBodyAndBad(String body, String bad) {
        return dao.getNewssOfBodyAndBad(body, bad);
    }
    public List<News> getNewssOfBodyAndTime(String body, String time) {
        return dao.getNewssOfBodyAndTime(body, time);
    }
    public List<News> getNewssOfBodyAndSearch(String body, String search) {
        return dao.getNewssOfBodyAndSearch(body, search);
    }
    public List<News> getNewssOfBodyAndBUserIds(String body, String bUserIds) {
        return dao.getNewssOfBodyAndBUserIds(body, bUserIds);
    }
    public List<News> getNewssOfBodyAndMoney(String body, String money) {
        return dao.getNewssOfBodyAndMoney(body, money);
    }
    public List<News> getNewssOfUserIdAndUserNewsTypeId(String userId, String userNewsTypeId) {
        return dao.getNewssOfUserIdAndUserNewsTypeId(userId, userNewsTypeId);
    }
    public List<News> getNewssOfUserIdAndStatus(String userId, String status) {
        return dao.getNewssOfUserIdAndStatus(userId, status);
    }
    public List<News> getNewssOfUserIdAndBuff(String userId, String buff) {
        return dao.getNewssOfUserIdAndBuff(userId, buff);
    }
    public List<News> getNewssOfUserIdAndParam(String userId, String param) {
        return dao.getNewssOfUserIdAndParam(userId, param);
    }
    public List<News> getNewssOfUserIdAndNewsTypeId(String userId, String newsTypeId) {
        return dao.getNewssOfUserIdAndNewsTypeId(userId, newsTypeId);
    }
    public List<News> getNewssOfUserIdAndPath(String userId, String path) {
        return dao.getNewssOfUserIdAndPath(userId, path);
    }
    public List<News> getNewssOfUserIdAndGood(String userId, String good) {
        return dao.getNewssOfUserIdAndGood(userId, good);
    }
    public List<News> getNewssOfUserIdAndBad(String userId, String bad) {
        return dao.getNewssOfUserIdAndBad(userId, bad);
    }
    public List<News> getNewssOfUserIdAndTime(String userId, String time) {
        return dao.getNewssOfUserIdAndTime(userId, time);
    }
    public List<News> getNewssOfUserIdAndSearch(String userId, String search) {
        return dao.getNewssOfUserIdAndSearch(userId, search);
    }
    public List<News> getNewssOfUserIdAndBUserIds(String userId, String bUserIds) {
        return dao.getNewssOfUserIdAndBUserIds(userId, bUserIds);
    }
    public List<News> getNewssOfUserIdAndMoney(String userId, String money) {
        return dao.getNewssOfUserIdAndMoney(userId, money);
    }
    public List<News> getNewssOfUserNewsTypeIdAndStatus(String userNewsTypeId, String status) {
        return dao.getNewssOfUserNewsTypeIdAndStatus(userNewsTypeId, status);
    }
    public List<News> getNewssOfUserNewsTypeIdAndBuff(String userNewsTypeId, String buff) {
        return dao.getNewssOfUserNewsTypeIdAndBuff(userNewsTypeId, buff);
    }
    public List<News> getNewssOfUserNewsTypeIdAndParam(String userNewsTypeId, String param) {
        return dao.getNewssOfUserNewsTypeIdAndParam(userNewsTypeId, param);
    }
    public List<News> getNewssOfUserNewsTypeIdAndNewsTypeId(String userNewsTypeId, String newsTypeId) {
        return dao.getNewssOfUserNewsTypeIdAndNewsTypeId(userNewsTypeId, newsTypeId);
    }
    public List<News> getNewssOfUserNewsTypeIdAndPath(String userNewsTypeId, String path) {
        return dao.getNewssOfUserNewsTypeIdAndPath(userNewsTypeId, path);
    }
    public List<News> getNewssOfUserNewsTypeIdAndGood(String userNewsTypeId, String good) {
        return dao.getNewssOfUserNewsTypeIdAndGood(userNewsTypeId, good);
    }
    public List<News> getNewssOfUserNewsTypeIdAndBad(String userNewsTypeId, String bad) {
        return dao.getNewssOfUserNewsTypeIdAndBad(userNewsTypeId, bad);
    }
    public List<News> getNewssOfUserNewsTypeIdAndTime(String userNewsTypeId, String time) {
        return dao.getNewssOfUserNewsTypeIdAndTime(userNewsTypeId, time);
    }
    public List<News> getNewssOfUserNewsTypeIdAndSearch(String userNewsTypeId, String search) {
        return dao.getNewssOfUserNewsTypeIdAndSearch(userNewsTypeId, search);
    }
    public List<News> getNewssOfUserNewsTypeIdAndBUserIds(String userNewsTypeId, String bUserIds) {
        return dao.getNewssOfUserNewsTypeIdAndBUserIds(userNewsTypeId, bUserIds);
    }
    public List<News> getNewssOfUserNewsTypeIdAndMoney(String userNewsTypeId, String money) {
        return dao.getNewssOfUserNewsTypeIdAndMoney(userNewsTypeId, money);
    }
    public List<News> getNewssOfStatusAndBuff(String status, String buff) {
        return dao.getNewssOfStatusAndBuff(status, buff);
    }
    public List<News> getNewssOfStatusAndParam(String status, String param) {
        return dao.getNewssOfStatusAndParam(status, param);
    }
    public List<News> getNewssOfStatusAndNewsTypeId(String status, String newsTypeId) {
        return dao.getNewssOfStatusAndNewsTypeId(status, newsTypeId);
    }
    public List<News> getNewssOfStatusAndPath(String status, String path) {
        return dao.getNewssOfStatusAndPath(status, path);
    }
    public List<News> getNewssOfStatusAndGood(String status, String good) {
        return dao.getNewssOfStatusAndGood(status, good);
    }
    public List<News> getNewssOfStatusAndBad(String status, String bad) {
        return dao.getNewssOfStatusAndBad(status, bad);
    }
    public List<News> getNewssOfStatusAndTime(String status, String time) {
        return dao.getNewssOfStatusAndTime(status, time);
    }
    public List<News> getNewssOfStatusAndSearch(String status, String search) {
        return dao.getNewssOfStatusAndSearch(status, search);
    }
    public List<News> getNewssOfStatusAndBUserIds(String status, String bUserIds) {
        return dao.getNewssOfStatusAndBUserIds(status, bUserIds);
    }
    public List<News> getNewssOfStatusAndMoney(String status, String money) {
        return dao.getNewssOfStatusAndMoney(status, money);
    }
    public List<News> getNewssOfBuffAndParam(String buff, String param) {
        return dao.getNewssOfBuffAndParam(buff, param);
    }
    public List<News> getNewssOfBuffAndNewsTypeId(String buff, String newsTypeId) {
        return dao.getNewssOfBuffAndNewsTypeId(buff, newsTypeId);
    }
    public List<News> getNewssOfBuffAndPath(String buff, String path) {
        return dao.getNewssOfBuffAndPath(buff, path);
    }
    public List<News> getNewssOfBuffAndGood(String buff, String good) {
        return dao.getNewssOfBuffAndGood(buff, good);
    }
    public List<News> getNewssOfBuffAndBad(String buff, String bad) {
        return dao.getNewssOfBuffAndBad(buff, bad);
    }
    public List<News> getNewssOfBuffAndTime(String buff, String time) {
        return dao.getNewssOfBuffAndTime(buff, time);
    }
    public List<News> getNewssOfBuffAndSearch(String buff, String search) {
        return dao.getNewssOfBuffAndSearch(buff, search);
    }
    public List<News> getNewssOfBuffAndBUserIds(String buff, String bUserIds) {
        return dao.getNewssOfBuffAndBUserIds(buff, bUserIds);
    }
    public List<News> getNewssOfBuffAndMoney(String buff, String money) {
        return dao.getNewssOfBuffAndMoney(buff, money);
    }
    public List<News> getNewssOfParamAndNewsTypeId(String param, String newsTypeId) {
        return dao.getNewssOfParamAndNewsTypeId(param, newsTypeId);
    }
    public List<News> getNewssOfParamAndPath(String param, String path) {
        return dao.getNewssOfParamAndPath(param, path);
    }
    public List<News> getNewssOfParamAndGood(String param, String good) {
        return dao.getNewssOfParamAndGood(param, good);
    }
    public List<News> getNewssOfParamAndBad(String param, String bad) {
        return dao.getNewssOfParamAndBad(param, bad);
    }
    public List<News> getNewssOfParamAndTime(String param, String time) {
        return dao.getNewssOfParamAndTime(param, time);
    }
    public List<News> getNewssOfParamAndSearch(String param, String search) {
        return dao.getNewssOfParamAndSearch(param, search);
    }
    public List<News> getNewssOfParamAndBUserIds(String param, String bUserIds) {
        return dao.getNewssOfParamAndBUserIds(param, bUserIds);
    }
    public List<News> getNewssOfParamAndMoney(String param, String money) {
        return dao.getNewssOfParamAndMoney(param, money);
    }
    public List<News> getNewssOfNewsTypeIdAndPath(String newsTypeId, String path) {
        return dao.getNewssOfNewsTypeIdAndPath(newsTypeId, path);
    }
    public List<News> getNewssOfNewsTypeIdAndGood(String newsTypeId, String good) {
        return dao.getNewssOfNewsTypeIdAndGood(newsTypeId, good);
    }
    public List<News> getNewssOfNewsTypeIdAndBad(String newsTypeId, String bad) {
        return dao.getNewssOfNewsTypeIdAndBad(newsTypeId, bad);
    }
    public List<News> getNewssOfNewsTypeIdAndTime(String newsTypeId, String time) {
        return dao.getNewssOfNewsTypeIdAndTime(newsTypeId, time);
    }
    public List<News> getNewssOfNewsTypeIdAndSearch(String newsTypeId, String search) {
        return dao.getNewssOfNewsTypeIdAndSearch(newsTypeId, search);
    }
    public List<News> getNewssOfNewsTypeIdAndBUserIds(String newsTypeId, String bUserIds) {
        return dao.getNewssOfNewsTypeIdAndBUserIds(newsTypeId, bUserIds);
    }
    public List<News> getNewssOfNewsTypeIdAndMoney(String newsTypeId, String money) {
        return dao.getNewssOfNewsTypeIdAndMoney(newsTypeId, money);
    }
    public List<News> getNewssOfPathAndGood(String path, String good) {
        return dao.getNewssOfPathAndGood(path, good);
    }
    public List<News> getNewssOfPathAndBad(String path, String bad) {
        return dao.getNewssOfPathAndBad(path, bad);
    }
    public List<News> getNewssOfPathAndTime(String path, String time) {
        return dao.getNewssOfPathAndTime(path, time);
    }
    public List<News> getNewssOfPathAndSearch(String path, String search) {
        return dao.getNewssOfPathAndSearch(path, search);
    }
    public List<News> getNewssOfPathAndBUserIds(String path, String bUserIds) {
        return dao.getNewssOfPathAndBUserIds(path, bUserIds);
    }
    public List<News> getNewssOfPathAndMoney(String path, String money) {
        return dao.getNewssOfPathAndMoney(path, money);
    }
    public List<News> getNewssOfGoodAndBad(String good, String bad) {
        return dao.getNewssOfGoodAndBad(good, bad);
    }
    public List<News> getNewssOfGoodAndTime(String good, String time) {
        return dao.getNewssOfGoodAndTime(good, time);
    }
    public List<News> getNewssOfGoodAndSearch(String good, String search) {
        return dao.getNewssOfGoodAndSearch(good, search);
    }
    public List<News> getNewssOfGoodAndBUserIds(String good, String bUserIds) {
        return dao.getNewssOfGoodAndBUserIds(good, bUserIds);
    }
    public List<News> getNewssOfGoodAndMoney(String good, String money) {
        return dao.getNewssOfGoodAndMoney(good, money);
    }
    public List<News> getNewssOfBadAndTime(String bad, String time) {
        return dao.getNewssOfBadAndTime(bad, time);
    }
    public List<News> getNewssOfBadAndSearch(String bad, String search) {
        return dao.getNewssOfBadAndSearch(bad, search);
    }
    public List<News> getNewssOfBadAndBUserIds(String bad, String bUserIds) {
        return dao.getNewssOfBadAndBUserIds(bad, bUserIds);
    }
    public List<News> getNewssOfBadAndMoney(String bad, String money) {
        return dao.getNewssOfBadAndMoney(bad, money);
    }
    public List<News> getNewssOfTimeAndSearch(String time, String search) {
        return dao.getNewssOfTimeAndSearch(time, search);
    }
    public List<News> getNewssOfTimeAndBUserIds(String time, String bUserIds) {
        return dao.getNewssOfTimeAndBUserIds(time, bUserIds);
    }
    public List<News> getNewssOfTimeAndMoney(String time, String money) {
        return dao.getNewssOfTimeAndMoney(time, money);
    }
    public List<News> getNewssOfSearchAndBUserIds(String search, String bUserIds) {
        return dao.getNewssOfSearchAndBUserIds(search, bUserIds);
    }
    public List<News> getNewssOfSearchAndMoney(String search, String money) {
        return dao.getNewssOfSearchAndMoney(search, money);
    }
    public List<News> getNewssOfBUserIdsAndMoney(String bUserIds, String money) {
        return dao.getNewssOfBUserIdsAndMoney(bUserIds, money);
    }
}
