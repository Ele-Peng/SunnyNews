/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.linglian.serviceN;

import com.news.linglian.dao.IUserDao;
import com.news.linglian.daoImpl.IUserDaoImpl;
import com.news.linglian.daoN.IUserDaoN;
import com.news.linglian.daoNImpl.IUserDaoNImpl;
import com.news.linglian.entity.User;
import com.news.linglian.service.IUserService;
import java.util.List;

/**
 *
 * @author lol
 */
public interface IUserServiceN extends IUserService {

    public List<User> getUsersLimit(int start, int size);
    public List<User> getUsersOfUsersIds(String[] newsIds);
}
