package com.news.linglian.daoImpl;

import java.util.List;

import com.news.linglian.entity.News;

import com.news.linglian.dao.INewsDao;
import db.DBMan;

public class INewsDaoImpl implements INewsDao {
    public int update(News news, News keyNews) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(news, keyNews, "news");
    }
    public int updateOfNewsId(News news, String newsId) {
        News kNews = new News();
        kNews.setNewsId(newsId);
        return update(news, kNews);
    }
    public int updateOfTitle(News news, String title) {
        News kNews = new News();
        kNews.setTitle(title);
        return update(news, kNews);
    }
    public int updateOfBody(News news, String body) {
        News kNews = new News();
        kNews.setBody(body);
        return update(news, kNews);
    }
    public int updateOfUserId(News news, String userId) {
        News kNews = new News();
        kNews.setUserId(userId);
        return update(news, kNews);
    }
    public int updateOfUserNewsTypeId(News news, String userNewsTypeId) {
        News kNews = new News();
        kNews.setUserNewsTypeId(userNewsTypeId);
        return update(news, kNews);
    }
    public int updateOfStatus(News news, String status) {
        News kNews = new News();
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfBuff(News news, String buff) {
        News kNews = new News();
        kNews.setBuff(buff);
        return update(news, kNews);
    }
    public int updateOfParam(News news, String param) {
        News kNews = new News();
        kNews.setParam(param);
        return update(news, kNews);
    }
    public int updateOfNewsTypeId(News news, String newsTypeId) {
        News kNews = new News();
        kNews.setNewsTypeId(newsTypeId);
        return update(news, kNews);
    }
    public int updateOfPath(News news, String path) {
        News kNews = new News();
        kNews.setPath(path);
        return update(news, kNews);
    }
    public int updateOfGood(News news, String good) {
        News kNews = new News();
        kNews.setGood(good);
        return update(news, kNews);
    }
    public int updateOfBad(News news, String bad) {
        News kNews = new News();
        kNews.setBad(bad);
        return update(news, kNews);
    }
    public int updateOfTime(News news, String time) {
        News kNews = new News();
        kNews.setTime(time);
        return update(news, kNews);
    }
    public int updateOfSearch(News news, String search) {
        News kNews = new News();
        kNews.setSearch(search);
        return update(news, kNews);
    }
    public int updateOfBUserIds(News news, String bUserIds) {
        News kNews = new News();
        kNews.setBUserIds(bUserIds);
        return update(news, kNews);
    }
    public int updateOfMoney(News news, String money) {
        News kNews = new News();
        kNews.setMoney(money);
        return update(news, kNews);
    }
    public int updateOfNewsIdAndTitle(News news, String newsId, String title) {
        News kNews = new News();
        kNews.setNewsId(newsId);
        kNews.setTitle(title);
        return update(news, kNews);
    }
    public int updateOfNewsIdAndBody(News news, String newsId, String body) {
        News kNews = new News();
        kNews.setNewsId(newsId);
        kNews.setBody(body);
        return update(news, kNews);
    }
    public int updateOfNewsIdAndUserId(News news, String newsId, String userId) {
        News kNews = new News();
        kNews.setNewsId(newsId);
        kNews.setUserId(userId);
        return update(news, kNews);
    }
    public int updateOfNewsIdAndUserNewsTypeId(News news, String newsId, String userNewsTypeId) {
        News kNews = new News();
        kNews.setNewsId(newsId);
        kNews.setUserNewsTypeId(userNewsTypeId);
        return update(news, kNews);
    }
    public int updateOfNewsIdAndStatus(News news, String newsId, String status) {
        News kNews = new News();
        kNews.setNewsId(newsId);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsIdAndBuff(News news, String newsId, String buff) {
        News kNews = new News();
        kNews.setNewsId(newsId);
        kNews.setBuff(buff);
        return update(news, kNews);
    }
    public int updateOfNewsIdAndParam(News news, String newsId, String param) {
        News kNews = new News();
        kNews.setNewsId(newsId);
        kNews.setParam(param);
        return update(news, kNews);
    }
    public int updateOfNewsIdAndNewsTypeId(News news, String newsId, String newsTypeId) {
        News kNews = new News();
        kNews.setNewsId(newsId);
        kNews.setNewsTypeId(newsTypeId);
        return update(news, kNews);
    }
    public int updateOfNewsIdAndPath(News news, String newsId, String path) {
        News kNews = new News();
        kNews.setNewsId(newsId);
        kNews.setPath(path);
        return update(news, kNews);
    }
    public int updateOfNewsIdAndGood(News news, String newsId, String good) {
        News kNews = new News();
        kNews.setNewsId(newsId);
        kNews.setGood(good);
        return update(news, kNews);
    }
    public int updateOfNewsIdAndBad(News news, String newsId, String bad) {
        News kNews = new News();
        kNews.setNewsId(newsId);
        kNews.setBad(bad);
        return update(news, kNews);
    }
    public int updateOfNewsIdAndTime(News news, String newsId, String time) {
        News kNews = new News();
        kNews.setNewsId(newsId);
        kNews.setTime(time);
        return update(news, kNews);
    }
    public int updateOfNewsIdAndSearch(News news, String newsId, String search) {
        News kNews = new News();
        kNews.setNewsId(newsId);
        kNews.setSearch(search);
        return update(news, kNews);
    }
    public int updateOfNewsIdAndBUserIds(News news, String newsId, String bUserIds) {
        News kNews = new News();
        kNews.setNewsId(newsId);
        kNews.setBUserIds(bUserIds);
        return update(news, kNews);
    }
    public int updateOfNewsIdAndMoney(News news, String newsId, String money) {
        News kNews = new News();
        kNews.setNewsId(newsId);
        kNews.setMoney(money);
        return update(news, kNews);
    }
    public int updateOfTitleAndBody(News news, String title, String body) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBody(body);
        return update(news, kNews);
    }
    public int updateOfTitleAndUserId(News news, String title, String userId) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setUserId(userId);
        return update(news, kNews);
    }
    public int updateOfTitleAndUserNewsTypeId(News news, String title, String userNewsTypeId) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setUserNewsTypeId(userNewsTypeId);
        return update(news, kNews);
    }
    public int updateOfTitleAndStatus(News news, String title, String status) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTitleAndBuff(News news, String title, String buff) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBuff(buff);
        return update(news, kNews);
    }
    public int updateOfTitleAndParam(News news, String title, String param) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setParam(param);
        return update(news, kNews);
    }
    public int updateOfTitleAndNewsTypeId(News news, String title, String newsTypeId) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setNewsTypeId(newsTypeId);
        return update(news, kNews);
    }
    public int updateOfTitleAndPath(News news, String title, String path) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setPath(path);
        return update(news, kNews);
    }
    public int updateOfTitleAndGood(News news, String title, String good) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setGood(good);
        return update(news, kNews);
    }
    public int updateOfTitleAndBad(News news, String title, String bad) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBad(bad);
        return update(news, kNews);
    }
    public int updateOfTitleAndTime(News news, String title, String time) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setTime(time);
        return update(news, kNews);
    }
    public int updateOfTitleAndSearch(News news, String title, String search) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setSearch(search);
        return update(news, kNews);
    }
    public int updateOfTitleAndBUserIds(News news, String title, String bUserIds) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBUserIds(bUserIds);
        return update(news, kNews);
    }
    public int updateOfTitleAndMoney(News news, String title, String money) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setMoney(money);
        return update(news, kNews);
    }
    public int updateOfBodyAndUserId(News news, String body, String userId) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setUserId(userId);
        return update(news, kNews);
    }
    public int updateOfBodyAndUserNewsTypeId(News news, String body, String userNewsTypeId) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setUserNewsTypeId(userNewsTypeId);
        return update(news, kNews);
    }
    public int updateOfBodyAndStatus(News news, String body, String status) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfBodyAndBuff(News news, String body, String buff) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setBuff(buff);
        return update(news, kNews);
    }
    public int updateOfBodyAndParam(News news, String body, String param) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setParam(param);
        return update(news, kNews);
    }
    public int updateOfBodyAndNewsTypeId(News news, String body, String newsTypeId) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setNewsTypeId(newsTypeId);
        return update(news, kNews);
    }
    public int updateOfBodyAndPath(News news, String body, String path) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setPath(path);
        return update(news, kNews);
    }
    public int updateOfBodyAndGood(News news, String body, String good) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setGood(good);
        return update(news, kNews);
    }
    public int updateOfBodyAndBad(News news, String body, String bad) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setBad(bad);
        return update(news, kNews);
    }
    public int updateOfBodyAndTime(News news, String body, String time) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setTime(time);
        return update(news, kNews);
    }
    public int updateOfBodyAndSearch(News news, String body, String search) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setSearch(search);
        return update(news, kNews);
    }
    public int updateOfBodyAndBUserIds(News news, String body, String bUserIds) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setBUserIds(bUserIds);
        return update(news, kNews);
    }
    public int updateOfBodyAndMoney(News news, String body, String money) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setMoney(money);
        return update(news, kNews);
    }
    public int updateOfUserIdAndUserNewsTypeId(News news, String userId, String userNewsTypeId) {
        News kNews = new News();
        kNews.setUserId(userId);
        kNews.setUserNewsTypeId(userNewsTypeId);
        return update(news, kNews);
    }
    public int updateOfUserIdAndStatus(News news, String userId, String status) {
        News kNews = new News();
        kNews.setUserId(userId);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfUserIdAndBuff(News news, String userId, String buff) {
        News kNews = new News();
        kNews.setUserId(userId);
        kNews.setBuff(buff);
        return update(news, kNews);
    }
    public int updateOfUserIdAndParam(News news, String userId, String param) {
        News kNews = new News();
        kNews.setUserId(userId);
        kNews.setParam(param);
        return update(news, kNews);
    }
    public int updateOfUserIdAndNewsTypeId(News news, String userId, String newsTypeId) {
        News kNews = new News();
        kNews.setUserId(userId);
        kNews.setNewsTypeId(newsTypeId);
        return update(news, kNews);
    }
    public int updateOfUserIdAndPath(News news, String userId, String path) {
        News kNews = new News();
        kNews.setUserId(userId);
        kNews.setPath(path);
        return update(news, kNews);
    }
    public int updateOfUserIdAndGood(News news, String userId, String good) {
        News kNews = new News();
        kNews.setUserId(userId);
        kNews.setGood(good);
        return update(news, kNews);
    }
    public int updateOfUserIdAndBad(News news, String userId, String bad) {
        News kNews = new News();
        kNews.setUserId(userId);
        kNews.setBad(bad);
        return update(news, kNews);
    }
    public int updateOfUserIdAndTime(News news, String userId, String time) {
        News kNews = new News();
        kNews.setUserId(userId);
        kNews.setTime(time);
        return update(news, kNews);
    }
    public int updateOfUserIdAndSearch(News news, String userId, String search) {
        News kNews = new News();
        kNews.setUserId(userId);
        kNews.setSearch(search);
        return update(news, kNews);
    }
    public int updateOfUserIdAndBUserIds(News news, String userId, String bUserIds) {
        News kNews = new News();
        kNews.setUserId(userId);
        kNews.setBUserIds(bUserIds);
        return update(news, kNews);
    }
    public int updateOfUserIdAndMoney(News news, String userId, String money) {
        News kNews = new News();
        kNews.setUserId(userId);
        kNews.setMoney(money);
        return update(news, kNews);
    }
    public int updateOfUserNewsTypeIdAndStatus(News news, String userNewsTypeId, String status) {
        News kNews = new News();
        kNews.setUserNewsTypeId(userNewsTypeId);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfUserNewsTypeIdAndBuff(News news, String userNewsTypeId, String buff) {
        News kNews = new News();
        kNews.setUserNewsTypeId(userNewsTypeId);
        kNews.setBuff(buff);
        return update(news, kNews);
    }
    public int updateOfUserNewsTypeIdAndParam(News news, String userNewsTypeId, String param) {
        News kNews = new News();
        kNews.setUserNewsTypeId(userNewsTypeId);
        kNews.setParam(param);
        return update(news, kNews);
    }
    public int updateOfUserNewsTypeIdAndNewsTypeId(News news, String userNewsTypeId, String newsTypeId) {
        News kNews = new News();
        kNews.setUserNewsTypeId(userNewsTypeId);
        kNews.setNewsTypeId(newsTypeId);
        return update(news, kNews);
    }
    public int updateOfUserNewsTypeIdAndPath(News news, String userNewsTypeId, String path) {
        News kNews = new News();
        kNews.setUserNewsTypeId(userNewsTypeId);
        kNews.setPath(path);
        return update(news, kNews);
    }
    public int updateOfUserNewsTypeIdAndGood(News news, String userNewsTypeId, String good) {
        News kNews = new News();
        kNews.setUserNewsTypeId(userNewsTypeId);
        kNews.setGood(good);
        return update(news, kNews);
    }
    public int updateOfUserNewsTypeIdAndBad(News news, String userNewsTypeId, String bad) {
        News kNews = new News();
        kNews.setUserNewsTypeId(userNewsTypeId);
        kNews.setBad(bad);
        return update(news, kNews);
    }
    public int updateOfUserNewsTypeIdAndTime(News news, String userNewsTypeId, String time) {
        News kNews = new News();
        kNews.setUserNewsTypeId(userNewsTypeId);
        kNews.setTime(time);
        return update(news, kNews);
    }
    public int updateOfUserNewsTypeIdAndSearch(News news, String userNewsTypeId, String search) {
        News kNews = new News();
        kNews.setUserNewsTypeId(userNewsTypeId);
        kNews.setSearch(search);
        return update(news, kNews);
    }
    public int updateOfUserNewsTypeIdAndBUserIds(News news, String userNewsTypeId, String bUserIds) {
        News kNews = new News();
        kNews.setUserNewsTypeId(userNewsTypeId);
        kNews.setBUserIds(bUserIds);
        return update(news, kNews);
    }
    public int updateOfUserNewsTypeIdAndMoney(News news, String userNewsTypeId, String money) {
        News kNews = new News();
        kNews.setUserNewsTypeId(userNewsTypeId);
        kNews.setMoney(money);
        return update(news, kNews);
    }
    public int updateOfStatusAndBuff(News news, String status, String buff) {
        News kNews = new News();
        kNews.setStatus(status);
        kNews.setBuff(buff);
        return update(news, kNews);
    }
    public int updateOfStatusAndParam(News news, String status, String param) {
        News kNews = new News();
        kNews.setStatus(status);
        kNews.setParam(param);
        return update(news, kNews);
    }
    public int updateOfStatusAndNewsTypeId(News news, String status, String newsTypeId) {
        News kNews = new News();
        kNews.setStatus(status);
        kNews.setNewsTypeId(newsTypeId);
        return update(news, kNews);
    }
    public int updateOfStatusAndPath(News news, String status, String path) {
        News kNews = new News();
        kNews.setStatus(status);
        kNews.setPath(path);
        return update(news, kNews);
    }
    public int updateOfStatusAndGood(News news, String status, String good) {
        News kNews = new News();
        kNews.setStatus(status);
        kNews.setGood(good);
        return update(news, kNews);
    }
    public int updateOfStatusAndBad(News news, String status, String bad) {
        News kNews = new News();
        kNews.setStatus(status);
        kNews.setBad(bad);
        return update(news, kNews);
    }
    public int updateOfStatusAndTime(News news, String status, String time) {
        News kNews = new News();
        kNews.setStatus(status);
        kNews.setTime(time);
        return update(news, kNews);
    }
    public int updateOfStatusAndSearch(News news, String status, String search) {
        News kNews = new News();
        kNews.setStatus(status);
        kNews.setSearch(search);
        return update(news, kNews);
    }
    public int updateOfStatusAndBUserIds(News news, String status, String bUserIds) {
        News kNews = new News();
        kNews.setStatus(status);
        kNews.setBUserIds(bUserIds);
        return update(news, kNews);
    }
    public int updateOfStatusAndMoney(News news, String status, String money) {
        News kNews = new News();
        kNews.setStatus(status);
        kNews.setMoney(money);
        return update(news, kNews);
    }
    public int updateOfBuffAndParam(News news, String buff, String param) {
        News kNews = new News();
        kNews.setBuff(buff);
        kNews.setParam(param);
        return update(news, kNews);
    }
    public int updateOfBuffAndNewsTypeId(News news, String buff, String newsTypeId) {
        News kNews = new News();
        kNews.setBuff(buff);
        kNews.setNewsTypeId(newsTypeId);
        return update(news, kNews);
    }
    public int updateOfBuffAndPath(News news, String buff, String path) {
        News kNews = new News();
        kNews.setBuff(buff);
        kNews.setPath(path);
        return update(news, kNews);
    }
    public int updateOfBuffAndGood(News news, String buff, String good) {
        News kNews = new News();
        kNews.setBuff(buff);
        kNews.setGood(good);
        return update(news, kNews);
    }
    public int updateOfBuffAndBad(News news, String buff, String bad) {
        News kNews = new News();
        kNews.setBuff(buff);
        kNews.setBad(bad);
        return update(news, kNews);
    }
    public int updateOfBuffAndTime(News news, String buff, String time) {
        News kNews = new News();
        kNews.setBuff(buff);
        kNews.setTime(time);
        return update(news, kNews);
    }
    public int updateOfBuffAndSearch(News news, String buff, String search) {
        News kNews = new News();
        kNews.setBuff(buff);
        kNews.setSearch(search);
        return update(news, kNews);
    }
    public int updateOfBuffAndBUserIds(News news, String buff, String bUserIds) {
        News kNews = new News();
        kNews.setBuff(buff);
        kNews.setBUserIds(bUserIds);
        return update(news, kNews);
    }
    public int updateOfBuffAndMoney(News news, String buff, String money) {
        News kNews = new News();
        kNews.setBuff(buff);
        kNews.setMoney(money);
        return update(news, kNews);
    }
    public int updateOfParamAndNewsTypeId(News news, String param, String newsTypeId) {
        News kNews = new News();
        kNews.setParam(param);
        kNews.setNewsTypeId(newsTypeId);
        return update(news, kNews);
    }
    public int updateOfParamAndPath(News news, String param, String path) {
        News kNews = new News();
        kNews.setParam(param);
        kNews.setPath(path);
        return update(news, kNews);
    }
    public int updateOfParamAndGood(News news, String param, String good) {
        News kNews = new News();
        kNews.setParam(param);
        kNews.setGood(good);
        return update(news, kNews);
    }
    public int updateOfParamAndBad(News news, String param, String bad) {
        News kNews = new News();
        kNews.setParam(param);
        kNews.setBad(bad);
        return update(news, kNews);
    }
    public int updateOfParamAndTime(News news, String param, String time) {
        News kNews = new News();
        kNews.setParam(param);
        kNews.setTime(time);
        return update(news, kNews);
    }
    public int updateOfParamAndSearch(News news, String param, String search) {
        News kNews = new News();
        kNews.setParam(param);
        kNews.setSearch(search);
        return update(news, kNews);
    }
    public int updateOfParamAndBUserIds(News news, String param, String bUserIds) {
        News kNews = new News();
        kNews.setParam(param);
        kNews.setBUserIds(bUserIds);
        return update(news, kNews);
    }
    public int updateOfParamAndMoney(News news, String param, String money) {
        News kNews = new News();
        kNews.setParam(param);
        kNews.setMoney(money);
        return update(news, kNews);
    }
    public int updateOfNewsTypeIdAndPath(News news, String newsTypeId, String path) {
        News kNews = new News();
        kNews.setNewsTypeId(newsTypeId);
        kNews.setPath(path);
        return update(news, kNews);
    }
    public int updateOfNewsTypeIdAndGood(News news, String newsTypeId, String good) {
        News kNews = new News();
        kNews.setNewsTypeId(newsTypeId);
        kNews.setGood(good);
        return update(news, kNews);
    }
    public int updateOfNewsTypeIdAndBad(News news, String newsTypeId, String bad) {
        News kNews = new News();
        kNews.setNewsTypeId(newsTypeId);
        kNews.setBad(bad);
        return update(news, kNews);
    }
    public int updateOfNewsTypeIdAndTime(News news, String newsTypeId, String time) {
        News kNews = new News();
        kNews.setNewsTypeId(newsTypeId);
        kNews.setTime(time);
        return update(news, kNews);
    }
    public int updateOfNewsTypeIdAndSearch(News news, String newsTypeId, String search) {
        News kNews = new News();
        kNews.setNewsTypeId(newsTypeId);
        kNews.setSearch(search);
        return update(news, kNews);
    }
    public int updateOfNewsTypeIdAndBUserIds(News news, String newsTypeId, String bUserIds) {
        News kNews = new News();
        kNews.setNewsTypeId(newsTypeId);
        kNews.setBUserIds(bUserIds);
        return update(news, kNews);
    }
    public int updateOfNewsTypeIdAndMoney(News news, String newsTypeId, String money) {
        News kNews = new News();
        kNews.setNewsTypeId(newsTypeId);
        kNews.setMoney(money);
        return update(news, kNews);
    }
    public int updateOfPathAndGood(News news, String path, String good) {
        News kNews = new News();
        kNews.setPath(path);
        kNews.setGood(good);
        return update(news, kNews);
    }
    public int updateOfPathAndBad(News news, String path, String bad) {
        News kNews = new News();
        kNews.setPath(path);
        kNews.setBad(bad);
        return update(news, kNews);
    }
    public int updateOfPathAndTime(News news, String path, String time) {
        News kNews = new News();
        kNews.setPath(path);
        kNews.setTime(time);
        return update(news, kNews);
    }
    public int updateOfPathAndSearch(News news, String path, String search) {
        News kNews = new News();
        kNews.setPath(path);
        kNews.setSearch(search);
        return update(news, kNews);
    }
    public int updateOfPathAndBUserIds(News news, String path, String bUserIds) {
        News kNews = new News();
        kNews.setPath(path);
        kNews.setBUserIds(bUserIds);
        return update(news, kNews);
    }
    public int updateOfPathAndMoney(News news, String path, String money) {
        News kNews = new News();
        kNews.setPath(path);
        kNews.setMoney(money);
        return update(news, kNews);
    }
    public int updateOfGoodAndBad(News news, String good, String bad) {
        News kNews = new News();
        kNews.setGood(good);
        kNews.setBad(bad);
        return update(news, kNews);
    }
    public int updateOfGoodAndTime(News news, String good, String time) {
        News kNews = new News();
        kNews.setGood(good);
        kNews.setTime(time);
        return update(news, kNews);
    }
    public int updateOfGoodAndSearch(News news, String good, String search) {
        News kNews = new News();
        kNews.setGood(good);
        kNews.setSearch(search);
        return update(news, kNews);
    }
    public int updateOfGoodAndBUserIds(News news, String good, String bUserIds) {
        News kNews = new News();
        kNews.setGood(good);
        kNews.setBUserIds(bUserIds);
        return update(news, kNews);
    }
    public int updateOfGoodAndMoney(News news, String good, String money) {
        News kNews = new News();
        kNews.setGood(good);
        kNews.setMoney(money);
        return update(news, kNews);
    }
    public int updateOfBadAndTime(News news, String bad, String time) {
        News kNews = new News();
        kNews.setBad(bad);
        kNews.setTime(time);
        return update(news, kNews);
    }
    public int updateOfBadAndSearch(News news, String bad, String search) {
        News kNews = new News();
        kNews.setBad(bad);
        kNews.setSearch(search);
        return update(news, kNews);
    }
    public int updateOfBadAndBUserIds(News news, String bad, String bUserIds) {
        News kNews = new News();
        kNews.setBad(bad);
        kNews.setBUserIds(bUserIds);
        return update(news, kNews);
    }
    public int updateOfBadAndMoney(News news, String bad, String money) {
        News kNews = new News();
        kNews.setBad(bad);
        kNews.setMoney(money);
        return update(news, kNews);
    }
    public int updateOfTimeAndSearch(News news, String time, String search) {
        News kNews = new News();
        kNews.setTime(time);
        kNews.setSearch(search);
        return update(news, kNews);
    }
    public int updateOfTimeAndBUserIds(News news, String time, String bUserIds) {
        News kNews = new News();
        kNews.setTime(time);
        kNews.setBUserIds(bUserIds);
        return update(news, kNews);
    }
    public int updateOfTimeAndMoney(News news, String time, String money) {
        News kNews = new News();
        kNews.setTime(time);
        kNews.setMoney(money);
        return update(news, kNews);
    }
    public int updateOfSearchAndBUserIds(News news, String search, String bUserIds) {
        News kNews = new News();
        kNews.setSearch(search);
        kNews.setBUserIds(bUserIds);
        return update(news, kNews);
    }
    public int updateOfSearchAndMoney(News news, String search, String money) {
        News kNews = new News();
        kNews.setSearch(search);
        kNews.setMoney(money);
        return update(news, kNews);
    }
    public int updateOfBUserIdsAndMoney(News news, String bUserIds, String money) {
        News kNews = new News();
        kNews.setBUserIds(bUserIds);
        kNews.setMoney(money);
        return update(news, kNews);
    }
    public int remove(News news) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(news, "news");
    }
    public int removeOfNewsId(String newsId) {
        News news = new News();
        news.setNewsId(newsId);
        return remove(news);
    }
    public int removeOfTitle(String title) {
        News news = new News();
        news.setTitle(title);
        return remove(news);
    }
    public int removeOfBody(String body) {
        News news = new News();
        news.setBody(body);
        return remove(news);
    }
    public int removeOfUserId(String userId) {
        News news = new News();
        news.setUserId(userId);
        return remove(news);
    }
    public int removeOfUserNewsTypeId(String userNewsTypeId) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        return remove(news);
    }
    public int removeOfStatus(String status) {
        News news = new News();
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfBuff(String buff) {
        News news = new News();
        news.setBuff(buff);
        return remove(news);
    }
    public int removeOfParam(String param) {
        News news = new News();
        news.setParam(param);
        return remove(news);
    }
    public int removeOfNewsTypeId(String newsTypeId) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        return remove(news);
    }
    public int removeOfPath(String path) {
        News news = new News();
        news.setPath(path);
        return remove(news);
    }
    public int removeOfGood(String good) {
        News news = new News();
        news.setGood(good);
        return remove(news);
    }
    public int removeOfBad(String bad) {
        News news = new News();
        news.setBad(bad);
        return remove(news);
    }
    public int removeOfTime(String time) {
        News news = new News();
        news.setTime(time);
        return remove(news);
    }
    public int removeOfSearch(String search) {
        News news = new News();
        news.setSearch(search);
        return remove(news);
    }
    public int removeOfBUserIds(String bUserIds) {
        News news = new News();
        news.setBUserIds(bUserIds);
        return remove(news);
    }
    public int removeOfMoney(String money) {
        News news = new News();
        news.setMoney(money);
        return remove(news);
    }
    public int removeOfNewsIdAndTitle(String newsId, String title) {
        News news = new News();
        news.setNewsId(newsId);
        news.setTitle(title);
        return remove(news);
    }
    public int removeOfNewsIdAndBody(String newsId, String body) {
        News news = new News();
        news.setNewsId(newsId);
        news.setBody(body);
        return remove(news);
    }
    public int removeOfNewsIdAndUserId(String newsId, String userId) {
        News news = new News();
        news.setNewsId(newsId);
        news.setUserId(userId);
        return remove(news);
    }
    public int removeOfNewsIdAndUserNewsTypeId(String newsId, String userNewsTypeId) {
        News news = new News();
        news.setNewsId(newsId);
        news.setUserNewsTypeId(userNewsTypeId);
        return remove(news);
    }
    public int removeOfNewsIdAndStatus(String newsId, String status) {
        News news = new News();
        news.setNewsId(newsId);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsIdAndBuff(String newsId, String buff) {
        News news = new News();
        news.setNewsId(newsId);
        news.setBuff(buff);
        return remove(news);
    }
    public int removeOfNewsIdAndParam(String newsId, String param) {
        News news = new News();
        news.setNewsId(newsId);
        news.setParam(param);
        return remove(news);
    }
    public int removeOfNewsIdAndNewsTypeId(String newsId, String newsTypeId) {
        News news = new News();
        news.setNewsId(newsId);
        news.setNewsTypeId(newsTypeId);
        return remove(news);
    }
    public int removeOfNewsIdAndPath(String newsId, String path) {
        News news = new News();
        news.setNewsId(newsId);
        news.setPath(path);
        return remove(news);
    }
    public int removeOfNewsIdAndGood(String newsId, String good) {
        News news = new News();
        news.setNewsId(newsId);
        news.setGood(good);
        return remove(news);
    }
    public int removeOfNewsIdAndBad(String newsId, String bad) {
        News news = new News();
        news.setNewsId(newsId);
        news.setBad(bad);
        return remove(news);
    }
    public int removeOfNewsIdAndTime(String newsId, String time) {
        News news = new News();
        news.setNewsId(newsId);
        news.setTime(time);
        return remove(news);
    }
    public int removeOfNewsIdAndSearch(String newsId, String search) {
        News news = new News();
        news.setNewsId(newsId);
        news.setSearch(search);
        return remove(news);
    }
    public int removeOfNewsIdAndBUserIds(String newsId, String bUserIds) {
        News news = new News();
        news.setNewsId(newsId);
        news.setBUserIds(bUserIds);
        return remove(news);
    }
    public int removeOfNewsIdAndMoney(String newsId, String money) {
        News news = new News();
        news.setNewsId(newsId);
        news.setMoney(money);
        return remove(news);
    }
    public int removeOfTitleAndBody(String title, String body) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        return remove(news);
    }
    public int removeOfTitleAndUserId(String title, String userId) {
        News news = new News();
        news.setTitle(title);
        news.setUserId(userId);
        return remove(news);
    }
    public int removeOfTitleAndUserNewsTypeId(String title, String userNewsTypeId) {
        News news = new News();
        news.setTitle(title);
        news.setUserNewsTypeId(userNewsTypeId);
        return remove(news);
    }
    public int removeOfTitleAndStatus(String title, String status) {
        News news = new News();
        news.setTitle(title);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTitleAndBuff(String title, String buff) {
        News news = new News();
        news.setTitle(title);
        news.setBuff(buff);
        return remove(news);
    }
    public int removeOfTitleAndParam(String title, String param) {
        News news = new News();
        news.setTitle(title);
        news.setParam(param);
        return remove(news);
    }
    public int removeOfTitleAndNewsTypeId(String title, String newsTypeId) {
        News news = new News();
        news.setTitle(title);
        news.setNewsTypeId(newsTypeId);
        return remove(news);
    }
    public int removeOfTitleAndPath(String title, String path) {
        News news = new News();
        news.setTitle(title);
        news.setPath(path);
        return remove(news);
    }
    public int removeOfTitleAndGood(String title, String good) {
        News news = new News();
        news.setTitle(title);
        news.setGood(good);
        return remove(news);
    }
    public int removeOfTitleAndBad(String title, String bad) {
        News news = new News();
        news.setTitle(title);
        news.setBad(bad);
        return remove(news);
    }
    public int removeOfTitleAndTime(String title, String time) {
        News news = new News();
        news.setTitle(title);
        news.setTime(time);
        return remove(news);
    }
    public int removeOfTitleAndSearch(String title, String search) {
        News news = new News();
        news.setTitle(title);
        news.setSearch(search);
        return remove(news);
    }
    public int removeOfTitleAndBUserIds(String title, String bUserIds) {
        News news = new News();
        news.setTitle(title);
        news.setBUserIds(bUserIds);
        return remove(news);
    }
    public int removeOfTitleAndMoney(String title, String money) {
        News news = new News();
        news.setTitle(title);
        news.setMoney(money);
        return remove(news);
    }
    public int removeOfBodyAndUserId(String body, String userId) {
        News news = new News();
        news.setBody(body);
        news.setUserId(userId);
        return remove(news);
    }
    public int removeOfBodyAndUserNewsTypeId(String body, String userNewsTypeId) {
        News news = new News();
        news.setBody(body);
        news.setUserNewsTypeId(userNewsTypeId);
        return remove(news);
    }
    public int removeOfBodyAndStatus(String body, String status) {
        News news = new News();
        news.setBody(body);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfBodyAndBuff(String body, String buff) {
        News news = new News();
        news.setBody(body);
        news.setBuff(buff);
        return remove(news);
    }
    public int removeOfBodyAndParam(String body, String param) {
        News news = new News();
        news.setBody(body);
        news.setParam(param);
        return remove(news);
    }
    public int removeOfBodyAndNewsTypeId(String body, String newsTypeId) {
        News news = new News();
        news.setBody(body);
        news.setNewsTypeId(newsTypeId);
        return remove(news);
    }
    public int removeOfBodyAndPath(String body, String path) {
        News news = new News();
        news.setBody(body);
        news.setPath(path);
        return remove(news);
    }
    public int removeOfBodyAndGood(String body, String good) {
        News news = new News();
        news.setBody(body);
        news.setGood(good);
        return remove(news);
    }
    public int removeOfBodyAndBad(String body, String bad) {
        News news = new News();
        news.setBody(body);
        news.setBad(bad);
        return remove(news);
    }
    public int removeOfBodyAndTime(String body, String time) {
        News news = new News();
        news.setBody(body);
        news.setTime(time);
        return remove(news);
    }
    public int removeOfBodyAndSearch(String body, String search) {
        News news = new News();
        news.setBody(body);
        news.setSearch(search);
        return remove(news);
    }
    public int removeOfBodyAndBUserIds(String body, String bUserIds) {
        News news = new News();
        news.setBody(body);
        news.setBUserIds(bUserIds);
        return remove(news);
    }
    public int removeOfBodyAndMoney(String body, String money) {
        News news = new News();
        news.setBody(body);
        news.setMoney(money);
        return remove(news);
    }
    public int removeOfUserIdAndUserNewsTypeId(String userId, String userNewsTypeId) {
        News news = new News();
        news.setUserId(userId);
        news.setUserNewsTypeId(userNewsTypeId);
        return remove(news);
    }
    public int removeOfUserIdAndStatus(String userId, String status) {
        News news = new News();
        news.setUserId(userId);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfUserIdAndBuff(String userId, String buff) {
        News news = new News();
        news.setUserId(userId);
        news.setBuff(buff);
        return remove(news);
    }
    public int removeOfUserIdAndParam(String userId, String param) {
        News news = new News();
        news.setUserId(userId);
        news.setParam(param);
        return remove(news);
    }
    public int removeOfUserIdAndNewsTypeId(String userId, String newsTypeId) {
        News news = new News();
        news.setUserId(userId);
        news.setNewsTypeId(newsTypeId);
        return remove(news);
    }
    public int removeOfUserIdAndPath(String userId, String path) {
        News news = new News();
        news.setUserId(userId);
        news.setPath(path);
        return remove(news);
    }
    public int removeOfUserIdAndGood(String userId, String good) {
        News news = new News();
        news.setUserId(userId);
        news.setGood(good);
        return remove(news);
    }
    public int removeOfUserIdAndBad(String userId, String bad) {
        News news = new News();
        news.setUserId(userId);
        news.setBad(bad);
        return remove(news);
    }
    public int removeOfUserIdAndTime(String userId, String time) {
        News news = new News();
        news.setUserId(userId);
        news.setTime(time);
        return remove(news);
    }
    public int removeOfUserIdAndSearch(String userId, String search) {
        News news = new News();
        news.setUserId(userId);
        news.setSearch(search);
        return remove(news);
    }
    public int removeOfUserIdAndBUserIds(String userId, String bUserIds) {
        News news = new News();
        news.setUserId(userId);
        news.setBUserIds(bUserIds);
        return remove(news);
    }
    public int removeOfUserIdAndMoney(String userId, String money) {
        News news = new News();
        news.setUserId(userId);
        news.setMoney(money);
        return remove(news);
    }
    public int removeOfUserNewsTypeIdAndStatus(String userNewsTypeId, String status) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfUserNewsTypeIdAndBuff(String userNewsTypeId, String buff) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setBuff(buff);
        return remove(news);
    }
    public int removeOfUserNewsTypeIdAndParam(String userNewsTypeId, String param) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setParam(param);
        return remove(news);
    }
    public int removeOfUserNewsTypeIdAndNewsTypeId(String userNewsTypeId, String newsTypeId) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setNewsTypeId(newsTypeId);
        return remove(news);
    }
    public int removeOfUserNewsTypeIdAndPath(String userNewsTypeId, String path) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setPath(path);
        return remove(news);
    }
    public int removeOfUserNewsTypeIdAndGood(String userNewsTypeId, String good) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setGood(good);
        return remove(news);
    }
    public int removeOfUserNewsTypeIdAndBad(String userNewsTypeId, String bad) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setBad(bad);
        return remove(news);
    }
    public int removeOfUserNewsTypeIdAndTime(String userNewsTypeId, String time) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setTime(time);
        return remove(news);
    }
    public int removeOfUserNewsTypeIdAndSearch(String userNewsTypeId, String search) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setSearch(search);
        return remove(news);
    }
    public int removeOfUserNewsTypeIdAndBUserIds(String userNewsTypeId, String bUserIds) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setBUserIds(bUserIds);
        return remove(news);
    }
    public int removeOfUserNewsTypeIdAndMoney(String userNewsTypeId, String money) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setMoney(money);
        return remove(news);
    }
    public int removeOfStatusAndBuff(String status, String buff) {
        News news = new News();
        news.setStatus(status);
        news.setBuff(buff);
        return remove(news);
    }
    public int removeOfStatusAndParam(String status, String param) {
        News news = new News();
        news.setStatus(status);
        news.setParam(param);
        return remove(news);
    }
    public int removeOfStatusAndNewsTypeId(String status, String newsTypeId) {
        News news = new News();
        news.setStatus(status);
        news.setNewsTypeId(newsTypeId);
        return remove(news);
    }
    public int removeOfStatusAndPath(String status, String path) {
        News news = new News();
        news.setStatus(status);
        news.setPath(path);
        return remove(news);
    }
    public int removeOfStatusAndGood(String status, String good) {
        News news = new News();
        news.setStatus(status);
        news.setGood(good);
        return remove(news);
    }
    public int removeOfStatusAndBad(String status, String bad) {
        News news = new News();
        news.setStatus(status);
        news.setBad(bad);
        return remove(news);
    }
    public int removeOfStatusAndTime(String status, String time) {
        News news = new News();
        news.setStatus(status);
        news.setTime(time);
        return remove(news);
    }
    public int removeOfStatusAndSearch(String status, String search) {
        News news = new News();
        news.setStatus(status);
        news.setSearch(search);
        return remove(news);
    }
    public int removeOfStatusAndBUserIds(String status, String bUserIds) {
        News news = new News();
        news.setStatus(status);
        news.setBUserIds(bUserIds);
        return remove(news);
    }
    public int removeOfStatusAndMoney(String status, String money) {
        News news = new News();
        news.setStatus(status);
        news.setMoney(money);
        return remove(news);
    }
    public int removeOfBuffAndParam(String buff, String param) {
        News news = new News();
        news.setBuff(buff);
        news.setParam(param);
        return remove(news);
    }
    public int removeOfBuffAndNewsTypeId(String buff, String newsTypeId) {
        News news = new News();
        news.setBuff(buff);
        news.setNewsTypeId(newsTypeId);
        return remove(news);
    }
    public int removeOfBuffAndPath(String buff, String path) {
        News news = new News();
        news.setBuff(buff);
        news.setPath(path);
        return remove(news);
    }
    public int removeOfBuffAndGood(String buff, String good) {
        News news = new News();
        news.setBuff(buff);
        news.setGood(good);
        return remove(news);
    }
    public int removeOfBuffAndBad(String buff, String bad) {
        News news = new News();
        news.setBuff(buff);
        news.setBad(bad);
        return remove(news);
    }
    public int removeOfBuffAndTime(String buff, String time) {
        News news = new News();
        news.setBuff(buff);
        news.setTime(time);
        return remove(news);
    }
    public int removeOfBuffAndSearch(String buff, String search) {
        News news = new News();
        news.setBuff(buff);
        news.setSearch(search);
        return remove(news);
    }
    public int removeOfBuffAndBUserIds(String buff, String bUserIds) {
        News news = new News();
        news.setBuff(buff);
        news.setBUserIds(bUserIds);
        return remove(news);
    }
    public int removeOfBuffAndMoney(String buff, String money) {
        News news = new News();
        news.setBuff(buff);
        news.setMoney(money);
        return remove(news);
    }
    public int removeOfParamAndNewsTypeId(String param, String newsTypeId) {
        News news = new News();
        news.setParam(param);
        news.setNewsTypeId(newsTypeId);
        return remove(news);
    }
    public int removeOfParamAndPath(String param, String path) {
        News news = new News();
        news.setParam(param);
        news.setPath(path);
        return remove(news);
    }
    public int removeOfParamAndGood(String param, String good) {
        News news = new News();
        news.setParam(param);
        news.setGood(good);
        return remove(news);
    }
    public int removeOfParamAndBad(String param, String bad) {
        News news = new News();
        news.setParam(param);
        news.setBad(bad);
        return remove(news);
    }
    public int removeOfParamAndTime(String param, String time) {
        News news = new News();
        news.setParam(param);
        news.setTime(time);
        return remove(news);
    }
    public int removeOfParamAndSearch(String param, String search) {
        News news = new News();
        news.setParam(param);
        news.setSearch(search);
        return remove(news);
    }
    public int removeOfParamAndBUserIds(String param, String bUserIds) {
        News news = new News();
        news.setParam(param);
        news.setBUserIds(bUserIds);
        return remove(news);
    }
    public int removeOfParamAndMoney(String param, String money) {
        News news = new News();
        news.setParam(param);
        news.setMoney(money);
        return remove(news);
    }
    public int removeOfNewsTypeIdAndPath(String newsTypeId, String path) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setPath(path);
        return remove(news);
    }
    public int removeOfNewsTypeIdAndGood(String newsTypeId, String good) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setGood(good);
        return remove(news);
    }
    public int removeOfNewsTypeIdAndBad(String newsTypeId, String bad) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setBad(bad);
        return remove(news);
    }
    public int removeOfNewsTypeIdAndTime(String newsTypeId, String time) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setTime(time);
        return remove(news);
    }
    public int removeOfNewsTypeIdAndSearch(String newsTypeId, String search) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setSearch(search);
        return remove(news);
    }
    public int removeOfNewsTypeIdAndBUserIds(String newsTypeId, String bUserIds) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setBUserIds(bUserIds);
        return remove(news);
    }
    public int removeOfNewsTypeIdAndMoney(String newsTypeId, String money) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setMoney(money);
        return remove(news);
    }
    public int removeOfPathAndGood(String path, String good) {
        News news = new News();
        news.setPath(path);
        news.setGood(good);
        return remove(news);
    }
    public int removeOfPathAndBad(String path, String bad) {
        News news = new News();
        news.setPath(path);
        news.setBad(bad);
        return remove(news);
    }
    public int removeOfPathAndTime(String path, String time) {
        News news = new News();
        news.setPath(path);
        news.setTime(time);
        return remove(news);
    }
    public int removeOfPathAndSearch(String path, String search) {
        News news = new News();
        news.setPath(path);
        news.setSearch(search);
        return remove(news);
    }
    public int removeOfPathAndBUserIds(String path, String bUserIds) {
        News news = new News();
        news.setPath(path);
        news.setBUserIds(bUserIds);
        return remove(news);
    }
    public int removeOfPathAndMoney(String path, String money) {
        News news = new News();
        news.setPath(path);
        news.setMoney(money);
        return remove(news);
    }
    public int removeOfGoodAndBad(String good, String bad) {
        News news = new News();
        news.setGood(good);
        news.setBad(bad);
        return remove(news);
    }
    public int removeOfGoodAndTime(String good, String time) {
        News news = new News();
        news.setGood(good);
        news.setTime(time);
        return remove(news);
    }
    public int removeOfGoodAndSearch(String good, String search) {
        News news = new News();
        news.setGood(good);
        news.setSearch(search);
        return remove(news);
    }
    public int removeOfGoodAndBUserIds(String good, String bUserIds) {
        News news = new News();
        news.setGood(good);
        news.setBUserIds(bUserIds);
        return remove(news);
    }
    public int removeOfGoodAndMoney(String good, String money) {
        News news = new News();
        news.setGood(good);
        news.setMoney(money);
        return remove(news);
    }
    public int removeOfBadAndTime(String bad, String time) {
        News news = new News();
        news.setBad(bad);
        news.setTime(time);
        return remove(news);
    }
    public int removeOfBadAndSearch(String bad, String search) {
        News news = new News();
        news.setBad(bad);
        news.setSearch(search);
        return remove(news);
    }
    public int removeOfBadAndBUserIds(String bad, String bUserIds) {
        News news = new News();
        news.setBad(bad);
        news.setBUserIds(bUserIds);
        return remove(news);
    }
    public int removeOfBadAndMoney(String bad, String money) {
        News news = new News();
        news.setBad(bad);
        news.setMoney(money);
        return remove(news);
    }
    public int removeOfTimeAndSearch(String time, String search) {
        News news = new News();
        news.setTime(time);
        news.setSearch(search);
        return remove(news);
    }
    public int removeOfTimeAndBUserIds(String time, String bUserIds) {
        News news = new News();
        news.setTime(time);
        news.setBUserIds(bUserIds);
        return remove(news);
    }
    public int removeOfTimeAndMoney(String time, String money) {
        News news = new News();
        news.setTime(time);
        news.setMoney(money);
        return remove(news);
    }
    public int removeOfSearchAndBUserIds(String search, String bUserIds) {
        News news = new News();
        news.setSearch(search);
        news.setBUserIds(bUserIds);
        return remove(news);
    }
    public int removeOfSearchAndMoney(String search, String money) {
        News news = new News();
        news.setSearch(search);
        news.setMoney(money);
        return remove(news);
    }
    public int removeOfBUserIdsAndMoney(String bUserIds, String money) {
        News news = new News();
        news.setBUserIds(bUserIds);
        news.setMoney(money);
        return remove(news);
    }
    public int insert(News news) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(news, "news");
    }
    public int insertOfNewsId(String newsId) {
        News news = new News();
        news.setNewsId(newsId);
        return insert(news);
    }
    public int insertOfTitle(String title) {
        News news = new News();
        news.setTitle(title);
        return insert(news);
    }
    public int insertOfBody(String body) {
        News news = new News();
        news.setBody(body);
        return insert(news);
    }
    public int insertOfUserId(String userId) {
        News news = new News();
        news.setUserId(userId);
        return insert(news);
    }
    public int insertOfUserNewsTypeId(String userNewsTypeId) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        return insert(news);
    }
    public int insertOfStatus(String status) {
        News news = new News();
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfBuff(String buff) {
        News news = new News();
        news.setBuff(buff);
        return insert(news);
    }
    public int insertOfParam(String param) {
        News news = new News();
        news.setParam(param);
        return insert(news);
    }
    public int insertOfNewsTypeId(String newsTypeId) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        return insert(news);
    }
    public int insertOfPath(String path) {
        News news = new News();
        news.setPath(path);
        return insert(news);
    }
    public int insertOfGood(String good) {
        News news = new News();
        news.setGood(good);
        return insert(news);
    }
    public int insertOfBad(String bad) {
        News news = new News();
        news.setBad(bad);
        return insert(news);
    }
    public int insertOfTime(String time) {
        News news = new News();
        news.setTime(time);
        return insert(news);
    }
    public int insertOfSearch(String search) {
        News news = new News();
        news.setSearch(search);
        return insert(news);
    }
    public int insertOfBUserIds(String bUserIds) {
        News news = new News();
        news.setBUserIds(bUserIds);
        return insert(news);
    }
    public int insertOfMoney(String money) {
        News news = new News();
        news.setMoney(money);
        return insert(news);
    }
    public int insertOfNewsIdAndTitle(String newsId, String title) {
        News news = new News();
        news.setNewsId(newsId);
        news.setTitle(title);
        return insert(news);
    }
    public int insertOfNewsIdAndBody(String newsId, String body) {
        News news = new News();
        news.setNewsId(newsId);
        news.setBody(body);
        return insert(news);
    }
    public int insertOfNewsIdAndUserId(String newsId, String userId) {
        News news = new News();
        news.setNewsId(newsId);
        news.setUserId(userId);
        return insert(news);
    }
    public int insertOfNewsIdAndUserNewsTypeId(String newsId, String userNewsTypeId) {
        News news = new News();
        news.setNewsId(newsId);
        news.setUserNewsTypeId(userNewsTypeId);
        return insert(news);
    }
    public int insertOfNewsIdAndStatus(String newsId, String status) {
        News news = new News();
        news.setNewsId(newsId);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsIdAndBuff(String newsId, String buff) {
        News news = new News();
        news.setNewsId(newsId);
        news.setBuff(buff);
        return insert(news);
    }
    public int insertOfNewsIdAndParam(String newsId, String param) {
        News news = new News();
        news.setNewsId(newsId);
        news.setParam(param);
        return insert(news);
    }
    public int insertOfNewsIdAndNewsTypeId(String newsId, String newsTypeId) {
        News news = new News();
        news.setNewsId(newsId);
        news.setNewsTypeId(newsTypeId);
        return insert(news);
    }
    public int insertOfNewsIdAndPath(String newsId, String path) {
        News news = new News();
        news.setNewsId(newsId);
        news.setPath(path);
        return insert(news);
    }
    public int insertOfNewsIdAndGood(String newsId, String good) {
        News news = new News();
        news.setNewsId(newsId);
        news.setGood(good);
        return insert(news);
    }
    public int insertOfNewsIdAndBad(String newsId, String bad) {
        News news = new News();
        news.setNewsId(newsId);
        news.setBad(bad);
        return insert(news);
    }
    public int insertOfNewsIdAndTime(String newsId, String time) {
        News news = new News();
        news.setNewsId(newsId);
        news.setTime(time);
        return insert(news);
    }
    public int insertOfNewsIdAndSearch(String newsId, String search) {
        News news = new News();
        news.setNewsId(newsId);
        news.setSearch(search);
        return insert(news);
    }
    public int insertOfNewsIdAndBUserIds(String newsId, String bUserIds) {
        News news = new News();
        news.setNewsId(newsId);
        news.setBUserIds(bUserIds);
        return insert(news);
    }
    public int insertOfNewsIdAndMoney(String newsId, String money) {
        News news = new News();
        news.setNewsId(newsId);
        news.setMoney(money);
        return insert(news);
    }
    public int insertOfTitleAndBody(String title, String body) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        return insert(news);
    }
    public int insertOfTitleAndUserId(String title, String userId) {
        News news = new News();
        news.setTitle(title);
        news.setUserId(userId);
        return insert(news);
    }
    public int insertOfTitleAndUserNewsTypeId(String title, String userNewsTypeId) {
        News news = new News();
        news.setTitle(title);
        news.setUserNewsTypeId(userNewsTypeId);
        return insert(news);
    }
    public int insertOfTitleAndStatus(String title, String status) {
        News news = new News();
        news.setTitle(title);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTitleAndBuff(String title, String buff) {
        News news = new News();
        news.setTitle(title);
        news.setBuff(buff);
        return insert(news);
    }
    public int insertOfTitleAndParam(String title, String param) {
        News news = new News();
        news.setTitle(title);
        news.setParam(param);
        return insert(news);
    }
    public int insertOfTitleAndNewsTypeId(String title, String newsTypeId) {
        News news = new News();
        news.setTitle(title);
        news.setNewsTypeId(newsTypeId);
        return insert(news);
    }
    public int insertOfTitleAndPath(String title, String path) {
        News news = new News();
        news.setTitle(title);
        news.setPath(path);
        return insert(news);
    }
    public int insertOfTitleAndGood(String title, String good) {
        News news = new News();
        news.setTitle(title);
        news.setGood(good);
        return insert(news);
    }
    public int insertOfTitleAndBad(String title, String bad) {
        News news = new News();
        news.setTitle(title);
        news.setBad(bad);
        return insert(news);
    }
    public int insertOfTitleAndTime(String title, String time) {
        News news = new News();
        news.setTitle(title);
        news.setTime(time);
        return insert(news);
    }
    public int insertOfTitleAndSearch(String title, String search) {
        News news = new News();
        news.setTitle(title);
        news.setSearch(search);
        return insert(news);
    }
    public int insertOfTitleAndBUserIds(String title, String bUserIds) {
        News news = new News();
        news.setTitle(title);
        news.setBUserIds(bUserIds);
        return insert(news);
    }
    public int insertOfTitleAndMoney(String title, String money) {
        News news = new News();
        news.setTitle(title);
        news.setMoney(money);
        return insert(news);
    }
    public int insertOfBodyAndUserId(String body, String userId) {
        News news = new News();
        news.setBody(body);
        news.setUserId(userId);
        return insert(news);
    }
    public int insertOfBodyAndUserNewsTypeId(String body, String userNewsTypeId) {
        News news = new News();
        news.setBody(body);
        news.setUserNewsTypeId(userNewsTypeId);
        return insert(news);
    }
    public int insertOfBodyAndStatus(String body, String status) {
        News news = new News();
        news.setBody(body);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfBodyAndBuff(String body, String buff) {
        News news = new News();
        news.setBody(body);
        news.setBuff(buff);
        return insert(news);
    }
    public int insertOfBodyAndParam(String body, String param) {
        News news = new News();
        news.setBody(body);
        news.setParam(param);
        return insert(news);
    }
    public int insertOfBodyAndNewsTypeId(String body, String newsTypeId) {
        News news = new News();
        news.setBody(body);
        news.setNewsTypeId(newsTypeId);
        return insert(news);
    }
    public int insertOfBodyAndPath(String body, String path) {
        News news = new News();
        news.setBody(body);
        news.setPath(path);
        return insert(news);
    }
    public int insertOfBodyAndGood(String body, String good) {
        News news = new News();
        news.setBody(body);
        news.setGood(good);
        return insert(news);
    }
    public int insertOfBodyAndBad(String body, String bad) {
        News news = new News();
        news.setBody(body);
        news.setBad(bad);
        return insert(news);
    }
    public int insertOfBodyAndTime(String body, String time) {
        News news = new News();
        news.setBody(body);
        news.setTime(time);
        return insert(news);
    }
    public int insertOfBodyAndSearch(String body, String search) {
        News news = new News();
        news.setBody(body);
        news.setSearch(search);
        return insert(news);
    }
    public int insertOfBodyAndBUserIds(String body, String bUserIds) {
        News news = new News();
        news.setBody(body);
        news.setBUserIds(bUserIds);
        return insert(news);
    }
    public int insertOfBodyAndMoney(String body, String money) {
        News news = new News();
        news.setBody(body);
        news.setMoney(money);
        return insert(news);
    }
    public int insertOfUserIdAndUserNewsTypeId(String userId, String userNewsTypeId) {
        News news = new News();
        news.setUserId(userId);
        news.setUserNewsTypeId(userNewsTypeId);
        return insert(news);
    }
    public int insertOfUserIdAndStatus(String userId, String status) {
        News news = new News();
        news.setUserId(userId);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfUserIdAndBuff(String userId, String buff) {
        News news = new News();
        news.setUserId(userId);
        news.setBuff(buff);
        return insert(news);
    }
    public int insertOfUserIdAndParam(String userId, String param) {
        News news = new News();
        news.setUserId(userId);
        news.setParam(param);
        return insert(news);
    }
    public int insertOfUserIdAndNewsTypeId(String userId, String newsTypeId) {
        News news = new News();
        news.setUserId(userId);
        news.setNewsTypeId(newsTypeId);
        return insert(news);
    }
    public int insertOfUserIdAndPath(String userId, String path) {
        News news = new News();
        news.setUserId(userId);
        news.setPath(path);
        return insert(news);
    }
    public int insertOfUserIdAndGood(String userId, String good) {
        News news = new News();
        news.setUserId(userId);
        news.setGood(good);
        return insert(news);
    }
    public int insertOfUserIdAndBad(String userId, String bad) {
        News news = new News();
        news.setUserId(userId);
        news.setBad(bad);
        return insert(news);
    }
    public int insertOfUserIdAndTime(String userId, String time) {
        News news = new News();
        news.setUserId(userId);
        news.setTime(time);
        return insert(news);
    }
    public int insertOfUserIdAndSearch(String userId, String search) {
        News news = new News();
        news.setUserId(userId);
        news.setSearch(search);
        return insert(news);
    }
    public int insertOfUserIdAndBUserIds(String userId, String bUserIds) {
        News news = new News();
        news.setUserId(userId);
        news.setBUserIds(bUserIds);
        return insert(news);
    }
    public int insertOfUserIdAndMoney(String userId, String money) {
        News news = new News();
        news.setUserId(userId);
        news.setMoney(money);
        return insert(news);
    }
    public int insertOfUserNewsTypeIdAndStatus(String userNewsTypeId, String status) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfUserNewsTypeIdAndBuff(String userNewsTypeId, String buff) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setBuff(buff);
        return insert(news);
    }
    public int insertOfUserNewsTypeIdAndParam(String userNewsTypeId, String param) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setParam(param);
        return insert(news);
    }
    public int insertOfUserNewsTypeIdAndNewsTypeId(String userNewsTypeId, String newsTypeId) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setNewsTypeId(newsTypeId);
        return insert(news);
    }
    public int insertOfUserNewsTypeIdAndPath(String userNewsTypeId, String path) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setPath(path);
        return insert(news);
    }
    public int insertOfUserNewsTypeIdAndGood(String userNewsTypeId, String good) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setGood(good);
        return insert(news);
    }
    public int insertOfUserNewsTypeIdAndBad(String userNewsTypeId, String bad) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setBad(bad);
        return insert(news);
    }
    public int insertOfUserNewsTypeIdAndTime(String userNewsTypeId, String time) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setTime(time);
        return insert(news);
    }
    public int insertOfUserNewsTypeIdAndSearch(String userNewsTypeId, String search) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setSearch(search);
        return insert(news);
    }
    public int insertOfUserNewsTypeIdAndBUserIds(String userNewsTypeId, String bUserIds) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setBUserIds(bUserIds);
        return insert(news);
    }
    public int insertOfUserNewsTypeIdAndMoney(String userNewsTypeId, String money) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setMoney(money);
        return insert(news);
    }
    public int insertOfStatusAndBuff(String status, String buff) {
        News news = new News();
        news.setStatus(status);
        news.setBuff(buff);
        return insert(news);
    }
    public int insertOfStatusAndParam(String status, String param) {
        News news = new News();
        news.setStatus(status);
        news.setParam(param);
        return insert(news);
    }
    public int insertOfStatusAndNewsTypeId(String status, String newsTypeId) {
        News news = new News();
        news.setStatus(status);
        news.setNewsTypeId(newsTypeId);
        return insert(news);
    }
    public int insertOfStatusAndPath(String status, String path) {
        News news = new News();
        news.setStatus(status);
        news.setPath(path);
        return insert(news);
    }
    public int insertOfStatusAndGood(String status, String good) {
        News news = new News();
        news.setStatus(status);
        news.setGood(good);
        return insert(news);
    }
    public int insertOfStatusAndBad(String status, String bad) {
        News news = new News();
        news.setStatus(status);
        news.setBad(bad);
        return insert(news);
    }
    public int insertOfStatusAndTime(String status, String time) {
        News news = new News();
        news.setStatus(status);
        news.setTime(time);
        return insert(news);
    }
    public int insertOfStatusAndSearch(String status, String search) {
        News news = new News();
        news.setStatus(status);
        news.setSearch(search);
        return insert(news);
    }
    public int insertOfStatusAndBUserIds(String status, String bUserIds) {
        News news = new News();
        news.setStatus(status);
        news.setBUserIds(bUserIds);
        return insert(news);
    }
    public int insertOfStatusAndMoney(String status, String money) {
        News news = new News();
        news.setStatus(status);
        news.setMoney(money);
        return insert(news);
    }
    public int insertOfBuffAndParam(String buff, String param) {
        News news = new News();
        news.setBuff(buff);
        news.setParam(param);
        return insert(news);
    }
    public int insertOfBuffAndNewsTypeId(String buff, String newsTypeId) {
        News news = new News();
        news.setBuff(buff);
        news.setNewsTypeId(newsTypeId);
        return insert(news);
    }
    public int insertOfBuffAndPath(String buff, String path) {
        News news = new News();
        news.setBuff(buff);
        news.setPath(path);
        return insert(news);
    }
    public int insertOfBuffAndGood(String buff, String good) {
        News news = new News();
        news.setBuff(buff);
        news.setGood(good);
        return insert(news);
    }
    public int insertOfBuffAndBad(String buff, String bad) {
        News news = new News();
        news.setBuff(buff);
        news.setBad(bad);
        return insert(news);
    }
    public int insertOfBuffAndTime(String buff, String time) {
        News news = new News();
        news.setBuff(buff);
        news.setTime(time);
        return insert(news);
    }
    public int insertOfBuffAndSearch(String buff, String search) {
        News news = new News();
        news.setBuff(buff);
        news.setSearch(search);
        return insert(news);
    }
    public int insertOfBuffAndBUserIds(String buff, String bUserIds) {
        News news = new News();
        news.setBuff(buff);
        news.setBUserIds(bUserIds);
        return insert(news);
    }
    public int insertOfBuffAndMoney(String buff, String money) {
        News news = new News();
        news.setBuff(buff);
        news.setMoney(money);
        return insert(news);
    }
    public int insertOfParamAndNewsTypeId(String param, String newsTypeId) {
        News news = new News();
        news.setParam(param);
        news.setNewsTypeId(newsTypeId);
        return insert(news);
    }
    public int insertOfParamAndPath(String param, String path) {
        News news = new News();
        news.setParam(param);
        news.setPath(path);
        return insert(news);
    }
    public int insertOfParamAndGood(String param, String good) {
        News news = new News();
        news.setParam(param);
        news.setGood(good);
        return insert(news);
    }
    public int insertOfParamAndBad(String param, String bad) {
        News news = new News();
        news.setParam(param);
        news.setBad(bad);
        return insert(news);
    }
    public int insertOfParamAndTime(String param, String time) {
        News news = new News();
        news.setParam(param);
        news.setTime(time);
        return insert(news);
    }
    public int insertOfParamAndSearch(String param, String search) {
        News news = new News();
        news.setParam(param);
        news.setSearch(search);
        return insert(news);
    }
    public int insertOfParamAndBUserIds(String param, String bUserIds) {
        News news = new News();
        news.setParam(param);
        news.setBUserIds(bUserIds);
        return insert(news);
    }
    public int insertOfParamAndMoney(String param, String money) {
        News news = new News();
        news.setParam(param);
        news.setMoney(money);
        return insert(news);
    }
    public int insertOfNewsTypeIdAndPath(String newsTypeId, String path) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setPath(path);
        return insert(news);
    }
    public int insertOfNewsTypeIdAndGood(String newsTypeId, String good) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setGood(good);
        return insert(news);
    }
    public int insertOfNewsTypeIdAndBad(String newsTypeId, String bad) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setBad(bad);
        return insert(news);
    }
    public int insertOfNewsTypeIdAndTime(String newsTypeId, String time) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setTime(time);
        return insert(news);
    }
    public int insertOfNewsTypeIdAndSearch(String newsTypeId, String search) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setSearch(search);
        return insert(news);
    }
    public int insertOfNewsTypeIdAndBUserIds(String newsTypeId, String bUserIds) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setBUserIds(bUserIds);
        return insert(news);
    }
    public int insertOfNewsTypeIdAndMoney(String newsTypeId, String money) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setMoney(money);
        return insert(news);
    }
    public int insertOfPathAndGood(String path, String good) {
        News news = new News();
        news.setPath(path);
        news.setGood(good);
        return insert(news);
    }
    public int insertOfPathAndBad(String path, String bad) {
        News news = new News();
        news.setPath(path);
        news.setBad(bad);
        return insert(news);
    }
    public int insertOfPathAndTime(String path, String time) {
        News news = new News();
        news.setPath(path);
        news.setTime(time);
        return insert(news);
    }
    public int insertOfPathAndSearch(String path, String search) {
        News news = new News();
        news.setPath(path);
        news.setSearch(search);
        return insert(news);
    }
    public int insertOfPathAndBUserIds(String path, String bUserIds) {
        News news = new News();
        news.setPath(path);
        news.setBUserIds(bUserIds);
        return insert(news);
    }
    public int insertOfPathAndMoney(String path, String money) {
        News news = new News();
        news.setPath(path);
        news.setMoney(money);
        return insert(news);
    }
    public int insertOfGoodAndBad(String good, String bad) {
        News news = new News();
        news.setGood(good);
        news.setBad(bad);
        return insert(news);
    }
    public int insertOfGoodAndTime(String good, String time) {
        News news = new News();
        news.setGood(good);
        news.setTime(time);
        return insert(news);
    }
    public int insertOfGoodAndSearch(String good, String search) {
        News news = new News();
        news.setGood(good);
        news.setSearch(search);
        return insert(news);
    }
    public int insertOfGoodAndBUserIds(String good, String bUserIds) {
        News news = new News();
        news.setGood(good);
        news.setBUserIds(bUserIds);
        return insert(news);
    }
    public int insertOfGoodAndMoney(String good, String money) {
        News news = new News();
        news.setGood(good);
        news.setMoney(money);
        return insert(news);
    }
    public int insertOfBadAndTime(String bad, String time) {
        News news = new News();
        news.setBad(bad);
        news.setTime(time);
        return insert(news);
    }
    public int insertOfBadAndSearch(String bad, String search) {
        News news = new News();
        news.setBad(bad);
        news.setSearch(search);
        return insert(news);
    }
    public int insertOfBadAndBUserIds(String bad, String bUserIds) {
        News news = new News();
        news.setBad(bad);
        news.setBUserIds(bUserIds);
        return insert(news);
    }
    public int insertOfBadAndMoney(String bad, String money) {
        News news = new News();
        news.setBad(bad);
        news.setMoney(money);
        return insert(news);
    }
    public int insertOfTimeAndSearch(String time, String search) {
        News news = new News();
        news.setTime(time);
        news.setSearch(search);
        return insert(news);
    }
    public int insertOfTimeAndBUserIds(String time, String bUserIds) {
        News news = new News();
        news.setTime(time);
        news.setBUserIds(bUserIds);
        return insert(news);
    }
    public int insertOfTimeAndMoney(String time, String money) {
        News news = new News();
        news.setTime(time);
        news.setMoney(money);
        return insert(news);
    }
    public int insertOfSearchAndBUserIds(String search, String bUserIds) {
        News news = new News();
        news.setSearch(search);
        news.setBUserIds(bUserIds);
        return insert(news);
    }
    public int insertOfSearchAndMoney(String search, String money) {
        News news = new News();
        news.setSearch(search);
        news.setMoney(money);
        return insert(news);
    }
    public int insertOfBUserIdsAndMoney(String bUserIds, String money) {
        News news = new News();
        news.setBUserIds(bUserIds);
        news.setMoney(money);
        return insert(news);
    }
    public News getNews(News news) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(news, "news");
    }
    public News getNewsOfNewsId(String newsId) {
        News news = new News();
        news.setNewsId(newsId);
        return getNews(news);
    }
    public News getNewsOfTitle(String title) {
        News news = new News();
        news.setTitle(title);
        return getNews(news);
    }
    public News getNewsOfBody(String body) {
        News news = new News();
        news.setBody(body);
        return getNews(news);
    }
    public News getNewsOfUserId(String userId) {
        News news = new News();
        news.setUserId(userId);
        return getNews(news);
    }
    public News getNewsOfUserNewsTypeId(String userNewsTypeId) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        return getNews(news);
    }
    public News getNewsOfStatus(String status) {
        News news = new News();
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfBuff(String buff) {
        News news = new News();
        news.setBuff(buff);
        return getNews(news);
    }
    public News getNewsOfParam(String param) {
        News news = new News();
        news.setParam(param);
        return getNews(news);
    }
    public News getNewsOfNewsTypeId(String newsTypeId) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        return getNews(news);
    }
    public News getNewsOfPath(String path) {
        News news = new News();
        news.setPath(path);
        return getNews(news);
    }
    public News getNewsOfGood(String good) {
        News news = new News();
        news.setGood(good);
        return getNews(news);
    }
    public News getNewsOfBad(String bad) {
        News news = new News();
        news.setBad(bad);
        return getNews(news);
    }
    public News getNewsOfTime(String time) {
        News news = new News();
        news.setTime(time);
        return getNews(news);
    }
    public News getNewsOfSearch(String search) {
        News news = new News();
        news.setSearch(search);
        return getNews(news);
    }
    public News getNewsOfBUserIds(String bUserIds) {
        News news = new News();
        news.setBUserIds(bUserIds);
        return getNews(news);
    }
    public News getNewsOfMoney(String money) {
        News news = new News();
        news.setMoney(money);
        return getNews(news);
    }
    public News getNewsOfNewsIdAndTitle(String newsId, String title) {
        News news = new News();
        news.setNewsId(newsId);
        news.setTitle(title);
        return getNews(news);
    }
    public News getNewsOfNewsIdAndBody(String newsId, String body) {
        News news = new News();
        news.setNewsId(newsId);
        news.setBody(body);
        return getNews(news);
    }
    public News getNewsOfNewsIdAndUserId(String newsId, String userId) {
        News news = new News();
        news.setNewsId(newsId);
        news.setUserId(userId);
        return getNews(news);
    }
    public News getNewsOfNewsIdAndUserNewsTypeId(String newsId, String userNewsTypeId) {
        News news = new News();
        news.setNewsId(newsId);
        news.setUserNewsTypeId(userNewsTypeId);
        return getNews(news);
    }
    public News getNewsOfNewsIdAndStatus(String newsId, String status) {
        News news = new News();
        news.setNewsId(newsId);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsIdAndBuff(String newsId, String buff) {
        News news = new News();
        news.setNewsId(newsId);
        news.setBuff(buff);
        return getNews(news);
    }
    public News getNewsOfNewsIdAndParam(String newsId, String param) {
        News news = new News();
        news.setNewsId(newsId);
        news.setParam(param);
        return getNews(news);
    }
    public News getNewsOfNewsIdAndNewsTypeId(String newsId, String newsTypeId) {
        News news = new News();
        news.setNewsId(newsId);
        news.setNewsTypeId(newsTypeId);
        return getNews(news);
    }
    public News getNewsOfNewsIdAndPath(String newsId, String path) {
        News news = new News();
        news.setNewsId(newsId);
        news.setPath(path);
        return getNews(news);
    }
    public News getNewsOfNewsIdAndGood(String newsId, String good) {
        News news = new News();
        news.setNewsId(newsId);
        news.setGood(good);
        return getNews(news);
    }
    public News getNewsOfNewsIdAndBad(String newsId, String bad) {
        News news = new News();
        news.setNewsId(newsId);
        news.setBad(bad);
        return getNews(news);
    }
    public News getNewsOfNewsIdAndTime(String newsId, String time) {
        News news = new News();
        news.setNewsId(newsId);
        news.setTime(time);
        return getNews(news);
    }
    public News getNewsOfNewsIdAndSearch(String newsId, String search) {
        News news = new News();
        news.setNewsId(newsId);
        news.setSearch(search);
        return getNews(news);
    }
    public News getNewsOfNewsIdAndBUserIds(String newsId, String bUserIds) {
        News news = new News();
        news.setNewsId(newsId);
        news.setBUserIds(bUserIds);
        return getNews(news);
    }
    public News getNewsOfNewsIdAndMoney(String newsId, String money) {
        News news = new News();
        news.setNewsId(newsId);
        news.setMoney(money);
        return getNews(news);
    }
    public News getNewsOfTitleAndBody(String title, String body) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        return getNews(news);
    }
    public News getNewsOfTitleAndUserId(String title, String userId) {
        News news = new News();
        news.setTitle(title);
        news.setUserId(userId);
        return getNews(news);
    }
    public News getNewsOfTitleAndUserNewsTypeId(String title, String userNewsTypeId) {
        News news = new News();
        news.setTitle(title);
        news.setUserNewsTypeId(userNewsTypeId);
        return getNews(news);
    }
    public News getNewsOfTitleAndStatus(String title, String status) {
        News news = new News();
        news.setTitle(title);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTitleAndBuff(String title, String buff) {
        News news = new News();
        news.setTitle(title);
        news.setBuff(buff);
        return getNews(news);
    }
    public News getNewsOfTitleAndParam(String title, String param) {
        News news = new News();
        news.setTitle(title);
        news.setParam(param);
        return getNews(news);
    }
    public News getNewsOfTitleAndNewsTypeId(String title, String newsTypeId) {
        News news = new News();
        news.setTitle(title);
        news.setNewsTypeId(newsTypeId);
        return getNews(news);
    }
    public News getNewsOfTitleAndPath(String title, String path) {
        News news = new News();
        news.setTitle(title);
        news.setPath(path);
        return getNews(news);
    }
    public News getNewsOfTitleAndGood(String title, String good) {
        News news = new News();
        news.setTitle(title);
        news.setGood(good);
        return getNews(news);
    }
    public News getNewsOfTitleAndBad(String title, String bad) {
        News news = new News();
        news.setTitle(title);
        news.setBad(bad);
        return getNews(news);
    }
    public News getNewsOfTitleAndTime(String title, String time) {
        News news = new News();
        news.setTitle(title);
        news.setTime(time);
        return getNews(news);
    }
    public News getNewsOfTitleAndSearch(String title, String search) {
        News news = new News();
        news.setTitle(title);
        news.setSearch(search);
        return getNews(news);
    }
    public News getNewsOfTitleAndBUserIds(String title, String bUserIds) {
        News news = new News();
        news.setTitle(title);
        news.setBUserIds(bUserIds);
        return getNews(news);
    }
    public News getNewsOfTitleAndMoney(String title, String money) {
        News news = new News();
        news.setTitle(title);
        news.setMoney(money);
        return getNews(news);
    }
    public News getNewsOfBodyAndUserId(String body, String userId) {
        News news = new News();
        news.setBody(body);
        news.setUserId(userId);
        return getNews(news);
    }
    public News getNewsOfBodyAndUserNewsTypeId(String body, String userNewsTypeId) {
        News news = new News();
        news.setBody(body);
        news.setUserNewsTypeId(userNewsTypeId);
        return getNews(news);
    }
    public News getNewsOfBodyAndStatus(String body, String status) {
        News news = new News();
        news.setBody(body);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfBodyAndBuff(String body, String buff) {
        News news = new News();
        news.setBody(body);
        news.setBuff(buff);
        return getNews(news);
    }
    public News getNewsOfBodyAndParam(String body, String param) {
        News news = new News();
        news.setBody(body);
        news.setParam(param);
        return getNews(news);
    }
    public News getNewsOfBodyAndNewsTypeId(String body, String newsTypeId) {
        News news = new News();
        news.setBody(body);
        news.setNewsTypeId(newsTypeId);
        return getNews(news);
    }
    public News getNewsOfBodyAndPath(String body, String path) {
        News news = new News();
        news.setBody(body);
        news.setPath(path);
        return getNews(news);
    }
    public News getNewsOfBodyAndGood(String body, String good) {
        News news = new News();
        news.setBody(body);
        news.setGood(good);
        return getNews(news);
    }
    public News getNewsOfBodyAndBad(String body, String bad) {
        News news = new News();
        news.setBody(body);
        news.setBad(bad);
        return getNews(news);
    }
    public News getNewsOfBodyAndTime(String body, String time) {
        News news = new News();
        news.setBody(body);
        news.setTime(time);
        return getNews(news);
    }
    public News getNewsOfBodyAndSearch(String body, String search) {
        News news = new News();
        news.setBody(body);
        news.setSearch(search);
        return getNews(news);
    }
    public News getNewsOfBodyAndBUserIds(String body, String bUserIds) {
        News news = new News();
        news.setBody(body);
        news.setBUserIds(bUserIds);
        return getNews(news);
    }
    public News getNewsOfBodyAndMoney(String body, String money) {
        News news = new News();
        news.setBody(body);
        news.setMoney(money);
        return getNews(news);
    }
    public News getNewsOfUserIdAndUserNewsTypeId(String userId, String userNewsTypeId) {
        News news = new News();
        news.setUserId(userId);
        news.setUserNewsTypeId(userNewsTypeId);
        return getNews(news);
    }
    public News getNewsOfUserIdAndStatus(String userId, String status) {
        News news = new News();
        news.setUserId(userId);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfUserIdAndBuff(String userId, String buff) {
        News news = new News();
        news.setUserId(userId);
        news.setBuff(buff);
        return getNews(news);
    }
    public News getNewsOfUserIdAndParam(String userId, String param) {
        News news = new News();
        news.setUserId(userId);
        news.setParam(param);
        return getNews(news);
    }
    public News getNewsOfUserIdAndNewsTypeId(String userId, String newsTypeId) {
        News news = new News();
        news.setUserId(userId);
        news.setNewsTypeId(newsTypeId);
        return getNews(news);
    }
    public News getNewsOfUserIdAndPath(String userId, String path) {
        News news = new News();
        news.setUserId(userId);
        news.setPath(path);
        return getNews(news);
    }
    public News getNewsOfUserIdAndGood(String userId, String good) {
        News news = new News();
        news.setUserId(userId);
        news.setGood(good);
        return getNews(news);
    }
    public News getNewsOfUserIdAndBad(String userId, String bad) {
        News news = new News();
        news.setUserId(userId);
        news.setBad(bad);
        return getNews(news);
    }
    public News getNewsOfUserIdAndTime(String userId, String time) {
        News news = new News();
        news.setUserId(userId);
        news.setTime(time);
        return getNews(news);
    }
    public News getNewsOfUserIdAndSearch(String userId, String search) {
        News news = new News();
        news.setUserId(userId);
        news.setSearch(search);
        return getNews(news);
    }
    public News getNewsOfUserIdAndBUserIds(String userId, String bUserIds) {
        News news = new News();
        news.setUserId(userId);
        news.setBUserIds(bUserIds);
        return getNews(news);
    }
    public News getNewsOfUserIdAndMoney(String userId, String money) {
        News news = new News();
        news.setUserId(userId);
        news.setMoney(money);
        return getNews(news);
    }
    public News getNewsOfUserNewsTypeIdAndStatus(String userNewsTypeId, String status) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfUserNewsTypeIdAndBuff(String userNewsTypeId, String buff) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setBuff(buff);
        return getNews(news);
    }
    public News getNewsOfUserNewsTypeIdAndParam(String userNewsTypeId, String param) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setParam(param);
        return getNews(news);
    }
    public News getNewsOfUserNewsTypeIdAndNewsTypeId(String userNewsTypeId, String newsTypeId) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setNewsTypeId(newsTypeId);
        return getNews(news);
    }
    public News getNewsOfUserNewsTypeIdAndPath(String userNewsTypeId, String path) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setPath(path);
        return getNews(news);
    }
    public News getNewsOfUserNewsTypeIdAndGood(String userNewsTypeId, String good) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setGood(good);
        return getNews(news);
    }
    public News getNewsOfUserNewsTypeIdAndBad(String userNewsTypeId, String bad) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setBad(bad);
        return getNews(news);
    }
    public News getNewsOfUserNewsTypeIdAndTime(String userNewsTypeId, String time) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setTime(time);
        return getNews(news);
    }
    public News getNewsOfUserNewsTypeIdAndSearch(String userNewsTypeId, String search) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setSearch(search);
        return getNews(news);
    }
    public News getNewsOfUserNewsTypeIdAndBUserIds(String userNewsTypeId, String bUserIds) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setBUserIds(bUserIds);
        return getNews(news);
    }
    public News getNewsOfUserNewsTypeIdAndMoney(String userNewsTypeId, String money) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setMoney(money);
        return getNews(news);
    }
    public News getNewsOfStatusAndBuff(String status, String buff) {
        News news = new News();
        news.setStatus(status);
        news.setBuff(buff);
        return getNews(news);
    }
    public News getNewsOfStatusAndParam(String status, String param) {
        News news = new News();
        news.setStatus(status);
        news.setParam(param);
        return getNews(news);
    }
    public News getNewsOfStatusAndNewsTypeId(String status, String newsTypeId) {
        News news = new News();
        news.setStatus(status);
        news.setNewsTypeId(newsTypeId);
        return getNews(news);
    }
    public News getNewsOfStatusAndPath(String status, String path) {
        News news = new News();
        news.setStatus(status);
        news.setPath(path);
        return getNews(news);
    }
    public News getNewsOfStatusAndGood(String status, String good) {
        News news = new News();
        news.setStatus(status);
        news.setGood(good);
        return getNews(news);
    }
    public News getNewsOfStatusAndBad(String status, String bad) {
        News news = new News();
        news.setStatus(status);
        news.setBad(bad);
        return getNews(news);
    }
    public News getNewsOfStatusAndTime(String status, String time) {
        News news = new News();
        news.setStatus(status);
        news.setTime(time);
        return getNews(news);
    }
    public News getNewsOfStatusAndSearch(String status, String search) {
        News news = new News();
        news.setStatus(status);
        news.setSearch(search);
        return getNews(news);
    }
    public News getNewsOfStatusAndBUserIds(String status, String bUserIds) {
        News news = new News();
        news.setStatus(status);
        news.setBUserIds(bUserIds);
        return getNews(news);
    }
    public News getNewsOfStatusAndMoney(String status, String money) {
        News news = new News();
        news.setStatus(status);
        news.setMoney(money);
        return getNews(news);
    }
    public News getNewsOfBuffAndParam(String buff, String param) {
        News news = new News();
        news.setBuff(buff);
        news.setParam(param);
        return getNews(news);
    }
    public News getNewsOfBuffAndNewsTypeId(String buff, String newsTypeId) {
        News news = new News();
        news.setBuff(buff);
        news.setNewsTypeId(newsTypeId);
        return getNews(news);
    }
    public News getNewsOfBuffAndPath(String buff, String path) {
        News news = new News();
        news.setBuff(buff);
        news.setPath(path);
        return getNews(news);
    }
    public News getNewsOfBuffAndGood(String buff, String good) {
        News news = new News();
        news.setBuff(buff);
        news.setGood(good);
        return getNews(news);
    }
    public News getNewsOfBuffAndBad(String buff, String bad) {
        News news = new News();
        news.setBuff(buff);
        news.setBad(bad);
        return getNews(news);
    }
    public News getNewsOfBuffAndTime(String buff, String time) {
        News news = new News();
        news.setBuff(buff);
        news.setTime(time);
        return getNews(news);
    }
    public News getNewsOfBuffAndSearch(String buff, String search) {
        News news = new News();
        news.setBuff(buff);
        news.setSearch(search);
        return getNews(news);
    }
    public News getNewsOfBuffAndBUserIds(String buff, String bUserIds) {
        News news = new News();
        news.setBuff(buff);
        news.setBUserIds(bUserIds);
        return getNews(news);
    }
    public News getNewsOfBuffAndMoney(String buff, String money) {
        News news = new News();
        news.setBuff(buff);
        news.setMoney(money);
        return getNews(news);
    }
    public News getNewsOfParamAndNewsTypeId(String param, String newsTypeId) {
        News news = new News();
        news.setParam(param);
        news.setNewsTypeId(newsTypeId);
        return getNews(news);
    }
    public News getNewsOfParamAndPath(String param, String path) {
        News news = new News();
        news.setParam(param);
        news.setPath(path);
        return getNews(news);
    }
    public News getNewsOfParamAndGood(String param, String good) {
        News news = new News();
        news.setParam(param);
        news.setGood(good);
        return getNews(news);
    }
    public News getNewsOfParamAndBad(String param, String bad) {
        News news = new News();
        news.setParam(param);
        news.setBad(bad);
        return getNews(news);
    }
    public News getNewsOfParamAndTime(String param, String time) {
        News news = new News();
        news.setParam(param);
        news.setTime(time);
        return getNews(news);
    }
    public News getNewsOfParamAndSearch(String param, String search) {
        News news = new News();
        news.setParam(param);
        news.setSearch(search);
        return getNews(news);
    }
    public News getNewsOfParamAndBUserIds(String param, String bUserIds) {
        News news = new News();
        news.setParam(param);
        news.setBUserIds(bUserIds);
        return getNews(news);
    }
    public News getNewsOfParamAndMoney(String param, String money) {
        News news = new News();
        news.setParam(param);
        news.setMoney(money);
        return getNews(news);
    }
    public News getNewsOfNewsTypeIdAndPath(String newsTypeId, String path) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setPath(path);
        return getNews(news);
    }
    public News getNewsOfNewsTypeIdAndGood(String newsTypeId, String good) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setGood(good);
        return getNews(news);
    }
    public News getNewsOfNewsTypeIdAndBad(String newsTypeId, String bad) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setBad(bad);
        return getNews(news);
    }
    public News getNewsOfNewsTypeIdAndTime(String newsTypeId, String time) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setTime(time);
        return getNews(news);
    }
    public News getNewsOfNewsTypeIdAndSearch(String newsTypeId, String search) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setSearch(search);
        return getNews(news);
    }
    public News getNewsOfNewsTypeIdAndBUserIds(String newsTypeId, String bUserIds) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setBUserIds(bUserIds);
        return getNews(news);
    }
    public News getNewsOfNewsTypeIdAndMoney(String newsTypeId, String money) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setMoney(money);
        return getNews(news);
    }
    public News getNewsOfPathAndGood(String path, String good) {
        News news = new News();
        news.setPath(path);
        news.setGood(good);
        return getNews(news);
    }
    public News getNewsOfPathAndBad(String path, String bad) {
        News news = new News();
        news.setPath(path);
        news.setBad(bad);
        return getNews(news);
    }
    public News getNewsOfPathAndTime(String path, String time) {
        News news = new News();
        news.setPath(path);
        news.setTime(time);
        return getNews(news);
    }
    public News getNewsOfPathAndSearch(String path, String search) {
        News news = new News();
        news.setPath(path);
        news.setSearch(search);
        return getNews(news);
    }
    public News getNewsOfPathAndBUserIds(String path, String bUserIds) {
        News news = new News();
        news.setPath(path);
        news.setBUserIds(bUserIds);
        return getNews(news);
    }
    public News getNewsOfPathAndMoney(String path, String money) {
        News news = new News();
        news.setPath(path);
        news.setMoney(money);
        return getNews(news);
    }
    public News getNewsOfGoodAndBad(String good, String bad) {
        News news = new News();
        news.setGood(good);
        news.setBad(bad);
        return getNews(news);
    }
    public News getNewsOfGoodAndTime(String good, String time) {
        News news = new News();
        news.setGood(good);
        news.setTime(time);
        return getNews(news);
    }
    public News getNewsOfGoodAndSearch(String good, String search) {
        News news = new News();
        news.setGood(good);
        news.setSearch(search);
        return getNews(news);
    }
    public News getNewsOfGoodAndBUserIds(String good, String bUserIds) {
        News news = new News();
        news.setGood(good);
        news.setBUserIds(bUserIds);
        return getNews(news);
    }
    public News getNewsOfGoodAndMoney(String good, String money) {
        News news = new News();
        news.setGood(good);
        news.setMoney(money);
        return getNews(news);
    }
    public News getNewsOfBadAndTime(String bad, String time) {
        News news = new News();
        news.setBad(bad);
        news.setTime(time);
        return getNews(news);
    }
    public News getNewsOfBadAndSearch(String bad, String search) {
        News news = new News();
        news.setBad(bad);
        news.setSearch(search);
        return getNews(news);
    }
    public News getNewsOfBadAndBUserIds(String bad, String bUserIds) {
        News news = new News();
        news.setBad(bad);
        news.setBUserIds(bUserIds);
        return getNews(news);
    }
    public News getNewsOfBadAndMoney(String bad, String money) {
        News news = new News();
        news.setBad(bad);
        news.setMoney(money);
        return getNews(news);
    }
    public News getNewsOfTimeAndSearch(String time, String search) {
        News news = new News();
        news.setTime(time);
        news.setSearch(search);
        return getNews(news);
    }
    public News getNewsOfTimeAndBUserIds(String time, String bUserIds) {
        News news = new News();
        news.setTime(time);
        news.setBUserIds(bUserIds);
        return getNews(news);
    }
    public News getNewsOfTimeAndMoney(String time, String money) {
        News news = new News();
        news.setTime(time);
        news.setMoney(money);
        return getNews(news);
    }
    public News getNewsOfSearchAndBUserIds(String search, String bUserIds) {
        News news = new News();
        news.setSearch(search);
        news.setBUserIds(bUserIds);
        return getNews(news);
    }
    public News getNewsOfSearchAndMoney(String search, String money) {
        News news = new News();
        news.setSearch(search);
        news.setMoney(money);
        return getNews(news);
    }
    public News getNewsOfBUserIdsAndMoney(String bUserIds, String money) {
        News news = new News();
        news.setBUserIds(bUserIds);
        news.setMoney(money);
        return getNews(news);
    }
    public List<News> getNewss(News news) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(news, "news");
    }
    public List<News> getNewssOfNewsId(String newsId) {
        News news = new News();
        news.setNewsId(newsId);
        return getNewss(news);
    }
    public List<News> getNewssOfTitle(String title) {
        News news = new News();
        news.setTitle(title);
        return getNewss(news);
    }
    public List<News> getNewssOfBody(String body) {
        News news = new News();
        news.setBody(body);
        return getNewss(news);
    }
    public List<News> getNewssOfUserId(String userId) {
        News news = new News();
        news.setUserId(userId);
        return getNewss(news);
    }
    public List<News> getNewssOfUserNewsTypeId(String userNewsTypeId) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        return getNewss(news);
    }
    public List<News> getNewssOfStatus(String status) {
        News news = new News();
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfBuff(String buff) {
        News news = new News();
        news.setBuff(buff);
        return getNewss(news);
    }
    public List<News> getNewssOfParam(String param) {
        News news = new News();
        news.setParam(param);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsTypeId(String newsTypeId) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        return getNewss(news);
    }
    public List<News> getNewssOfPath(String path) {
        News news = new News();
        news.setPath(path);
        return getNewss(news);
    }
    public List<News> getNewssOfGood(String good) {
        News news = new News();
        news.setGood(good);
        return getNewss(news);
    }
    public List<News> getNewssOfBad(String bad) {
        News news = new News();
        news.setBad(bad);
        return getNewss(news);
    }
    public List<News> getNewssOfTime(String time) {
        News news = new News();
        news.setTime(time);
        return getNewss(news);
    }
    public List<News> getNewssOfSearch(String search) {
        News news = new News();
        news.setSearch(search);
        return getNewss(news);
    }
    public List<News> getNewssOfBUserIds(String bUserIds) {
        News news = new News();
        news.setBUserIds(bUserIds);
        return getNewss(news);
    }
    public List<News> getNewssOfMoney(String money) {
        News news = new News();
        news.setMoney(money);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsIdAndTitle(String newsId, String title) {
        News news = new News();
        news.setNewsId(newsId);
        news.setTitle(title);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsIdAndBody(String newsId, String body) {
        News news = new News();
        news.setNewsId(newsId);
        news.setBody(body);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsIdAndUserId(String newsId, String userId) {
        News news = new News();
        news.setNewsId(newsId);
        news.setUserId(userId);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsIdAndUserNewsTypeId(String newsId, String userNewsTypeId) {
        News news = new News();
        news.setNewsId(newsId);
        news.setUserNewsTypeId(userNewsTypeId);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsIdAndStatus(String newsId, String status) {
        News news = new News();
        news.setNewsId(newsId);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsIdAndBuff(String newsId, String buff) {
        News news = new News();
        news.setNewsId(newsId);
        news.setBuff(buff);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsIdAndParam(String newsId, String param) {
        News news = new News();
        news.setNewsId(newsId);
        news.setParam(param);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsIdAndNewsTypeId(String newsId, String newsTypeId) {
        News news = new News();
        news.setNewsId(newsId);
        news.setNewsTypeId(newsTypeId);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsIdAndPath(String newsId, String path) {
        News news = new News();
        news.setNewsId(newsId);
        news.setPath(path);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsIdAndGood(String newsId, String good) {
        News news = new News();
        news.setNewsId(newsId);
        news.setGood(good);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsIdAndBad(String newsId, String bad) {
        News news = new News();
        news.setNewsId(newsId);
        news.setBad(bad);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsIdAndTime(String newsId, String time) {
        News news = new News();
        news.setNewsId(newsId);
        news.setTime(time);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsIdAndSearch(String newsId, String search) {
        News news = new News();
        news.setNewsId(newsId);
        news.setSearch(search);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsIdAndBUserIds(String newsId, String bUserIds) {
        News news = new News();
        news.setNewsId(newsId);
        news.setBUserIds(bUserIds);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsIdAndMoney(String newsId, String money) {
        News news = new News();
        news.setNewsId(newsId);
        news.setMoney(money);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBody(String title, String body) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndUserId(String title, String userId) {
        News news = new News();
        news.setTitle(title);
        news.setUserId(userId);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndUserNewsTypeId(String title, String userNewsTypeId) {
        News news = new News();
        news.setTitle(title);
        news.setUserNewsTypeId(userNewsTypeId);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndStatus(String title, String status) {
        News news = new News();
        news.setTitle(title);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBuff(String title, String buff) {
        News news = new News();
        news.setTitle(title);
        news.setBuff(buff);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndParam(String title, String param) {
        News news = new News();
        news.setTitle(title);
        news.setParam(param);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndNewsTypeId(String title, String newsTypeId) {
        News news = new News();
        news.setTitle(title);
        news.setNewsTypeId(newsTypeId);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndPath(String title, String path) {
        News news = new News();
        news.setTitle(title);
        news.setPath(path);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndGood(String title, String good) {
        News news = new News();
        news.setTitle(title);
        news.setGood(good);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBad(String title, String bad) {
        News news = new News();
        news.setTitle(title);
        news.setBad(bad);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndTime(String title, String time) {
        News news = new News();
        news.setTitle(title);
        news.setTime(time);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndSearch(String title, String search) {
        News news = new News();
        news.setTitle(title);
        news.setSearch(search);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBUserIds(String title, String bUserIds) {
        News news = new News();
        news.setTitle(title);
        news.setBUserIds(bUserIds);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndMoney(String title, String money) {
        News news = new News();
        news.setTitle(title);
        news.setMoney(money);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndUserId(String body, String userId) {
        News news = new News();
        news.setBody(body);
        news.setUserId(userId);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndUserNewsTypeId(String body, String userNewsTypeId) {
        News news = new News();
        news.setBody(body);
        news.setUserNewsTypeId(userNewsTypeId);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndStatus(String body, String status) {
        News news = new News();
        news.setBody(body);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndBuff(String body, String buff) {
        News news = new News();
        news.setBody(body);
        news.setBuff(buff);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndParam(String body, String param) {
        News news = new News();
        news.setBody(body);
        news.setParam(param);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndNewsTypeId(String body, String newsTypeId) {
        News news = new News();
        news.setBody(body);
        news.setNewsTypeId(newsTypeId);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndPath(String body, String path) {
        News news = new News();
        news.setBody(body);
        news.setPath(path);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndGood(String body, String good) {
        News news = new News();
        news.setBody(body);
        news.setGood(good);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndBad(String body, String bad) {
        News news = new News();
        news.setBody(body);
        news.setBad(bad);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndTime(String body, String time) {
        News news = new News();
        news.setBody(body);
        news.setTime(time);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndSearch(String body, String search) {
        News news = new News();
        news.setBody(body);
        news.setSearch(search);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndBUserIds(String body, String bUserIds) {
        News news = new News();
        news.setBody(body);
        news.setBUserIds(bUserIds);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndMoney(String body, String money) {
        News news = new News();
        news.setBody(body);
        news.setMoney(money);
        return getNewss(news);
    }
    public List<News> getNewssOfUserIdAndUserNewsTypeId(String userId, String userNewsTypeId) {
        News news = new News();
        news.setUserId(userId);
        news.setUserNewsTypeId(userNewsTypeId);
        return getNewss(news);
    }
    public List<News> getNewssOfUserIdAndStatus(String userId, String status) {
        News news = new News();
        news.setUserId(userId);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfUserIdAndBuff(String userId, String buff) {
        News news = new News();
        news.setUserId(userId);
        news.setBuff(buff);
        return getNewss(news);
    }
    public List<News> getNewssOfUserIdAndParam(String userId, String param) {
        News news = new News();
        news.setUserId(userId);
        news.setParam(param);
        return getNewss(news);
    }
    public List<News> getNewssOfUserIdAndNewsTypeId(String userId, String newsTypeId) {
        News news = new News();
        news.setUserId(userId);
        news.setNewsTypeId(newsTypeId);
        return getNewss(news);
    }
    public List<News> getNewssOfUserIdAndPath(String userId, String path) {
        News news = new News();
        news.setUserId(userId);
        news.setPath(path);
        return getNewss(news);
    }
    public List<News> getNewssOfUserIdAndGood(String userId, String good) {
        News news = new News();
        news.setUserId(userId);
        news.setGood(good);
        return getNewss(news);
    }
    public List<News> getNewssOfUserIdAndBad(String userId, String bad) {
        News news = new News();
        news.setUserId(userId);
        news.setBad(bad);
        return getNewss(news);
    }
    public List<News> getNewssOfUserIdAndTime(String userId, String time) {
        News news = new News();
        news.setUserId(userId);
        news.setTime(time);
        return getNewss(news);
    }
    public List<News> getNewssOfUserIdAndSearch(String userId, String search) {
        News news = new News();
        news.setUserId(userId);
        news.setSearch(search);
        return getNewss(news);
    }
    public List<News> getNewssOfUserIdAndBUserIds(String userId, String bUserIds) {
        News news = new News();
        news.setUserId(userId);
        news.setBUserIds(bUserIds);
        return getNewss(news);
    }
    public List<News> getNewssOfUserIdAndMoney(String userId, String money) {
        News news = new News();
        news.setUserId(userId);
        news.setMoney(money);
        return getNewss(news);
    }
    public List<News> getNewssOfUserNewsTypeIdAndStatus(String userNewsTypeId, String status) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfUserNewsTypeIdAndBuff(String userNewsTypeId, String buff) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setBuff(buff);
        return getNewss(news);
    }
    public List<News> getNewssOfUserNewsTypeIdAndParam(String userNewsTypeId, String param) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setParam(param);
        return getNewss(news);
    }
    public List<News> getNewssOfUserNewsTypeIdAndNewsTypeId(String userNewsTypeId, String newsTypeId) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setNewsTypeId(newsTypeId);
        return getNewss(news);
    }
    public List<News> getNewssOfUserNewsTypeIdAndPath(String userNewsTypeId, String path) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setPath(path);
        return getNewss(news);
    }
    public List<News> getNewssOfUserNewsTypeIdAndGood(String userNewsTypeId, String good) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setGood(good);
        return getNewss(news);
    }
    public List<News> getNewssOfUserNewsTypeIdAndBad(String userNewsTypeId, String bad) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setBad(bad);
        return getNewss(news);
    }
    public List<News> getNewssOfUserNewsTypeIdAndTime(String userNewsTypeId, String time) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setTime(time);
        return getNewss(news);
    }
    public List<News> getNewssOfUserNewsTypeIdAndSearch(String userNewsTypeId, String search) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setSearch(search);
        return getNewss(news);
    }
    public List<News> getNewssOfUserNewsTypeIdAndBUserIds(String userNewsTypeId, String bUserIds) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setBUserIds(bUserIds);
        return getNewss(news);
    }
    public List<News> getNewssOfUserNewsTypeIdAndMoney(String userNewsTypeId, String money) {
        News news = new News();
        news.setUserNewsTypeId(userNewsTypeId);
        news.setMoney(money);
        return getNewss(news);
    }
    public List<News> getNewssOfStatusAndBuff(String status, String buff) {
        News news = new News();
        news.setStatus(status);
        news.setBuff(buff);
        return getNewss(news);
    }
    public List<News> getNewssOfStatusAndParam(String status, String param) {
        News news = new News();
        news.setStatus(status);
        news.setParam(param);
        return getNewss(news);
    }
    public List<News> getNewssOfStatusAndNewsTypeId(String status, String newsTypeId) {
        News news = new News();
        news.setStatus(status);
        news.setNewsTypeId(newsTypeId);
        return getNewss(news);
    }
    public List<News> getNewssOfStatusAndPath(String status, String path) {
        News news = new News();
        news.setStatus(status);
        news.setPath(path);
        return getNewss(news);
    }
    public List<News> getNewssOfStatusAndGood(String status, String good) {
        News news = new News();
        news.setStatus(status);
        news.setGood(good);
        return getNewss(news);
    }
    public List<News> getNewssOfStatusAndBad(String status, String bad) {
        News news = new News();
        news.setStatus(status);
        news.setBad(bad);
        return getNewss(news);
    }
    public List<News> getNewssOfStatusAndTime(String status, String time) {
        News news = new News();
        news.setStatus(status);
        news.setTime(time);
        return getNewss(news);
    }
    public List<News> getNewssOfStatusAndSearch(String status, String search) {
        News news = new News();
        news.setStatus(status);
        news.setSearch(search);
        return getNewss(news);
    }
    public List<News> getNewssOfStatusAndBUserIds(String status, String bUserIds) {
        News news = new News();
        news.setStatus(status);
        news.setBUserIds(bUserIds);
        return getNewss(news);
    }
    public List<News> getNewssOfStatusAndMoney(String status, String money) {
        News news = new News();
        news.setStatus(status);
        news.setMoney(money);
        return getNewss(news);
    }
    public List<News> getNewssOfBuffAndParam(String buff, String param) {
        News news = new News();
        news.setBuff(buff);
        news.setParam(param);
        return getNewss(news);
    }
    public List<News> getNewssOfBuffAndNewsTypeId(String buff, String newsTypeId) {
        News news = new News();
        news.setBuff(buff);
        news.setNewsTypeId(newsTypeId);
        return getNewss(news);
    }
    public List<News> getNewssOfBuffAndPath(String buff, String path) {
        News news = new News();
        news.setBuff(buff);
        news.setPath(path);
        return getNewss(news);
    }
    public List<News> getNewssOfBuffAndGood(String buff, String good) {
        News news = new News();
        news.setBuff(buff);
        news.setGood(good);
        return getNewss(news);
    }
    public List<News> getNewssOfBuffAndBad(String buff, String bad) {
        News news = new News();
        news.setBuff(buff);
        news.setBad(bad);
        return getNewss(news);
    }
    public List<News> getNewssOfBuffAndTime(String buff, String time) {
        News news = new News();
        news.setBuff(buff);
        news.setTime(time);
        return getNewss(news);
    }
    public List<News> getNewssOfBuffAndSearch(String buff, String search) {
        News news = new News();
        news.setBuff(buff);
        news.setSearch(search);
        return getNewss(news);
    }
    public List<News> getNewssOfBuffAndBUserIds(String buff, String bUserIds) {
        News news = new News();
        news.setBuff(buff);
        news.setBUserIds(bUserIds);
        return getNewss(news);
    }
    public List<News> getNewssOfBuffAndMoney(String buff, String money) {
        News news = new News();
        news.setBuff(buff);
        news.setMoney(money);
        return getNewss(news);
    }
    public List<News> getNewssOfParamAndNewsTypeId(String param, String newsTypeId) {
        News news = new News();
        news.setParam(param);
        news.setNewsTypeId(newsTypeId);
        return getNewss(news);
    }
    public List<News> getNewssOfParamAndPath(String param, String path) {
        News news = new News();
        news.setParam(param);
        news.setPath(path);
        return getNewss(news);
    }
    public List<News> getNewssOfParamAndGood(String param, String good) {
        News news = new News();
        news.setParam(param);
        news.setGood(good);
        return getNewss(news);
    }
    public List<News> getNewssOfParamAndBad(String param, String bad) {
        News news = new News();
        news.setParam(param);
        news.setBad(bad);
        return getNewss(news);
    }
    public List<News> getNewssOfParamAndTime(String param, String time) {
        News news = new News();
        news.setParam(param);
        news.setTime(time);
        return getNewss(news);
    }
    public List<News> getNewssOfParamAndSearch(String param, String search) {
        News news = new News();
        news.setParam(param);
        news.setSearch(search);
        return getNewss(news);
    }
    public List<News> getNewssOfParamAndBUserIds(String param, String bUserIds) {
        News news = new News();
        news.setParam(param);
        news.setBUserIds(bUserIds);
        return getNewss(news);
    }
    public List<News> getNewssOfParamAndMoney(String param, String money) {
        News news = new News();
        news.setParam(param);
        news.setMoney(money);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsTypeIdAndPath(String newsTypeId, String path) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setPath(path);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsTypeIdAndGood(String newsTypeId, String good) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setGood(good);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsTypeIdAndBad(String newsTypeId, String bad) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setBad(bad);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsTypeIdAndTime(String newsTypeId, String time) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setTime(time);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsTypeIdAndSearch(String newsTypeId, String search) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setSearch(search);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsTypeIdAndBUserIds(String newsTypeId, String bUserIds) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setBUserIds(bUserIds);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsTypeIdAndMoney(String newsTypeId, String money) {
        News news = new News();
        news.setNewsTypeId(newsTypeId);
        news.setMoney(money);
        return getNewss(news);
    }
    public List<News> getNewssOfPathAndGood(String path, String good) {
        News news = new News();
        news.setPath(path);
        news.setGood(good);
        return getNewss(news);
    }
    public List<News> getNewssOfPathAndBad(String path, String bad) {
        News news = new News();
        news.setPath(path);
        news.setBad(bad);
        return getNewss(news);
    }
    public List<News> getNewssOfPathAndTime(String path, String time) {
        News news = new News();
        news.setPath(path);
        news.setTime(time);
        return getNewss(news);
    }
    public List<News> getNewssOfPathAndSearch(String path, String search) {
        News news = new News();
        news.setPath(path);
        news.setSearch(search);
        return getNewss(news);
    }
    public List<News> getNewssOfPathAndBUserIds(String path, String bUserIds) {
        News news = new News();
        news.setPath(path);
        news.setBUserIds(bUserIds);
        return getNewss(news);
    }
    public List<News> getNewssOfPathAndMoney(String path, String money) {
        News news = new News();
        news.setPath(path);
        news.setMoney(money);
        return getNewss(news);
    }
    public List<News> getNewssOfGoodAndBad(String good, String bad) {
        News news = new News();
        news.setGood(good);
        news.setBad(bad);
        return getNewss(news);
    }
    public List<News> getNewssOfGoodAndTime(String good, String time) {
        News news = new News();
        news.setGood(good);
        news.setTime(time);
        return getNewss(news);
    }
    public List<News> getNewssOfGoodAndSearch(String good, String search) {
        News news = new News();
        news.setGood(good);
        news.setSearch(search);
        return getNewss(news);
    }
    public List<News> getNewssOfGoodAndBUserIds(String good, String bUserIds) {
        News news = new News();
        news.setGood(good);
        news.setBUserIds(bUserIds);
        return getNewss(news);
    }
    public List<News> getNewssOfGoodAndMoney(String good, String money) {
        News news = new News();
        news.setGood(good);
        news.setMoney(money);
        return getNewss(news);
    }
    public List<News> getNewssOfBadAndTime(String bad, String time) {
        News news = new News();
        news.setBad(bad);
        news.setTime(time);
        return getNewss(news);
    }
    public List<News> getNewssOfBadAndSearch(String bad, String search) {
        News news = new News();
        news.setBad(bad);
        news.setSearch(search);
        return getNewss(news);
    }
    public List<News> getNewssOfBadAndBUserIds(String bad, String bUserIds) {
        News news = new News();
        news.setBad(bad);
        news.setBUserIds(bUserIds);
        return getNewss(news);
    }
    public List<News> getNewssOfBadAndMoney(String bad, String money) {
        News news = new News();
        news.setBad(bad);
        news.setMoney(money);
        return getNewss(news);
    }
    public List<News> getNewssOfTimeAndSearch(String time, String search) {
        News news = new News();
        news.setTime(time);
        news.setSearch(search);
        return getNewss(news);
    }
    public List<News> getNewssOfTimeAndBUserIds(String time, String bUserIds) {
        News news = new News();
        news.setTime(time);
        news.setBUserIds(bUserIds);
        return getNewss(news);
    }
    public List<News> getNewssOfTimeAndMoney(String time, String money) {
        News news = new News();
        news.setTime(time);
        news.setMoney(money);
        return getNewss(news);
    }
    public List<News> getNewssOfSearchAndBUserIds(String search, String bUserIds) {
        News news = new News();
        news.setSearch(search);
        news.setBUserIds(bUserIds);
        return getNewss(news);
    }
    public List<News> getNewssOfSearchAndMoney(String search, String money) {
        News news = new News();
        news.setSearch(search);
        news.setMoney(money);
        return getNewss(news);
    }
    public List<News> getNewssOfBUserIdsAndMoney(String bUserIds, String money) {
        News news = new News();
        news.setBUserIds(bUserIds);
        news.setMoney(money);
        return getNewss(news);
    }
}
