/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.linglian.daoNImpl;

import com.news.linglian.daoImpl.INewsDaoImpl;
import com.news.linglian.daoN.INewsDaoN;
import com.news.linglian.entity.News;
import com.news.linglian.entity.User;
import db.DBMan;
import java.util.ArrayList;
import java.util.List;
import util.ArrayUtil;
import util.ClassUtil;
import util.SqlUtil;

/**
 *
 * @author lol
 */
public class INewsDaoNImpl extends INewsDaoImpl implements INewsDaoN {

    @Override
    public List<News> queryOfUserIdNewssLimit(String userId, int start, int size) {
        String sql = new SqlUtil()
                .addDataName("news")
                .setStatus(SqlUtil.SQL_SELECT)
                .addBeforeWheres(ClassUtil.getName(News.class))
                .addAfterWheres("userId", "=")
                .addLast("order by time desc limit ?, ?")
                .build();
        return DBMan.getInstance().queryWithoutThrow(News.class, sql, userId, start, size);
    }

    @Override
    public List<News> getNewssOfNewsIds(String[] newsIds) {
        if (newsIds.length == 0) {
            return new ArrayList<News>();
        }
        StringBuffer str = new StringBuffer();
        str.append("in (");
        int index = 0;
        for (String s : newsIds) {
            if (index != 0) {
                str.append(",");
            }
            str.append(" ?");
            index++;
        }
        str.append(")");
        String sql = new SqlUtil()
                .addDataName("news")
                .setStatus(SqlUtil.SQL_SELECT)
                .addBeforeWheres(ClassUtil.getName(News.class))
                .addAfterWheres("newsId", str.toString())
                .build();
        System.out.println(sql);
        return DBMan.getInstance().queryWithoutThrow(News.class, sql, newsIds);
    }

    public static void main(String[] args) {
        List<String> s = new ArrayList();
        s.add("1");
        s.add("3");
        s.add("4");
        INewsDaoNImpl n = new INewsDaoNImpl();
        System.out.println(n.getNewssOfNewsIds(ArrayUtil.toStringArray(s)));
    }

}
