/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.linglian.daoNImpl;

import com.news.linglian.daoImpl.IEmailDaoImpl;
import com.news.linglian.daoImpl.IUserDaoImpl;
import com.news.linglian.daoN.IEmailDaoN;
import com.news.linglian.daoN.IUserDaoN;
import com.news.linglian.entity.Email;
import com.news.linglian.entity.User;
import db.DBMan;
import db.DBUtil;
import java.util.List;
import util.ArrayUtil;
import util.ClassUtil;
import util.SqlUtil;

/**
 *
 * @author lol
 */
public class IEmailDaoNImpl extends IEmailDaoImpl implements IEmailDaoN {

    @Override
    public List<Email> getEmailLimit(Email t, int start, int size) {
        return DBUtil.getObjectLimit("email", "time", t, start, size);
    }

    public static void main(String[] args) {
        IEmailDaoNImpl e = new IEmailDaoNImpl();
        Email t = new Email();
        t.setToUserId("8");
        t.setStatus("0");
        System.out.println(e.getEmailLimit(t, 0, 4));
    }
}
