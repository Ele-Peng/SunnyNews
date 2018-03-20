/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.linglian.daoN;

import com.news.linglian.dao.ICommentDao;
import com.news.linglian.dao.IEmailDao;
import com.news.linglian.entity.Email;
import com.news.linglian.entity.User;
import db.DBMan;
import java.util.List;
import util.ClassUtil;
import util.SqlUtil;

/**
 *
 * @author lol
 */
public interface IEmailDaoN  extends IEmailDao{

    public List<Email> getEmailLimit(Email t, int start, int size);
}
