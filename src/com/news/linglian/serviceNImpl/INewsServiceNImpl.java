/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.linglian.serviceNImpl;

import com.news.linglian.daoN.INewsDaoN;
import com.news.linglian.daoN.IUserDaoN;
import com.news.linglian.daoNImpl.INewsDaoNImpl;
import com.news.linglian.daoNImpl.IUserDaoNImpl;
import com.news.linglian.entity.News;
import com.news.linglian.serviceImpl.INewsServiceImpl;
import com.news.linglian.serviceN.INewsServiceN;
import java.util.List;

/**
 *
 * @author lol
 */
public class INewsServiceNImpl extends INewsServiceImpl implements INewsServiceN {

    INewsDaoN dao = null;

    public INewsServiceNImpl() {
        dao = new INewsDaoNImpl();
    }

    @Override
    public List<News> queryOfUserIdNewssLimit(String userId, int start, int size) {
        return dao.queryOfUserIdNewssLimit(userId, start, size);
    }

    @Override
    public List<News> getNewssOfNewsIds(String[] newsIds) {
        return dao.getNewssOfNewsIds(newsIds);
    }

}
