/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.linglian.serviceNImpl;

import com.news.linglian.daoN.IUserDaoN;
import com.news.linglian.daoNImpl.IUserDaoNImpl;
import com.news.linglian.entity.User;
import com.news.linglian.serviceImpl.IUserServiceImpl;
import com.news.linglian.serviceN.IUserServiceN;
import java.util.List;

/**
 *
 * @author lol
 */
public class IUserServiceNImpl extends IUserServiceImpl implements IUserServiceN {

    IUserDaoN dao = null;

    public IUserServiceNImpl() {
        dao = new IUserDaoNImpl();
    }

    @Override
    public List<User> getUsersLimit(int start, int size) {
        return dao.getUsersLimit(start, size);
    }
    
    public List<User> getUsersOfUsersIds(String[] newsIds) {
        return dao.getUsersOfUsersIds(newsIds);
    }
}
