/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.linglian.daoN;

import com.news.linglian.dao.IUserDao;
import com.news.linglian.entity.User;
import java.util.List;

/**
 *
 * @author lol
 */
public interface IUserDaoN extends IUserDao {
    public List<User> getUsersLimit(int start, int size);
    public List<User> getUsersOfUsersIds(String[] newsIds);
}
