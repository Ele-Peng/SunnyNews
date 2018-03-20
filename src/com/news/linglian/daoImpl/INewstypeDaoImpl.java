package com.news.linglian.daoImpl;

import java.util.List;

import com.news.linglian.entity.Newstype;

import com.news.linglian.dao.INewstypeDao;
import db.DBMan;

public class INewstypeDaoImpl implements INewstypeDao {
    public int update(Newstype newstype, Newstype keyNewstype) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(newstype, keyNewstype, "newstype");
    }
    public int updateOfNewsTypeId(Newstype newstype, String newsTypeId) {
        Newstype kNewstype = new Newstype();
        kNewstype.setNewsTypeId(newsTypeId);
        return update(newstype, kNewstype);
    }
    public int updateOfName(Newstype newstype, String name) {
        Newstype kNewstype = new Newstype();
        kNewstype.setName(name);
        return update(newstype, kNewstype);
    }
    public int updateOfBody(Newstype newstype, String body) {
        Newstype kNewstype = new Newstype();
        kNewstype.setBody(body);
        return update(newstype, kNewstype);
    }
    public int updateOfNewsTypeIdAndName(Newstype newstype, String newsTypeId, String name) {
        Newstype kNewstype = new Newstype();
        kNewstype.setNewsTypeId(newsTypeId);
        kNewstype.setName(name);
        return update(newstype, kNewstype);
    }
    public int updateOfNewsTypeIdAndBody(Newstype newstype, String newsTypeId, String body) {
        Newstype kNewstype = new Newstype();
        kNewstype.setNewsTypeId(newsTypeId);
        kNewstype.setBody(body);
        return update(newstype, kNewstype);
    }
    public int updateOfNameAndBody(Newstype newstype, String name, String body) {
        Newstype kNewstype = new Newstype();
        kNewstype.setName(name);
        kNewstype.setBody(body);
        return update(newstype, kNewstype);
    }
    public int remove(Newstype newstype) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(newstype, "newstype");
    }
    public int removeOfNewsTypeId(String newsTypeId) {
        Newstype newstype = new Newstype();
        newstype.setNewsTypeId(newsTypeId);
        return remove(newstype);
    }
    public int removeOfName(String name) {
        Newstype newstype = new Newstype();
        newstype.setName(name);
        return remove(newstype);
    }
    public int removeOfBody(String body) {
        Newstype newstype = new Newstype();
        newstype.setBody(body);
        return remove(newstype);
    }
    public int removeOfNewsTypeIdAndName(String newsTypeId, String name) {
        Newstype newstype = new Newstype();
        newstype.setNewsTypeId(newsTypeId);
        newstype.setName(name);
        return remove(newstype);
    }
    public int removeOfNewsTypeIdAndBody(String newsTypeId, String body) {
        Newstype newstype = new Newstype();
        newstype.setNewsTypeId(newsTypeId);
        newstype.setBody(body);
        return remove(newstype);
    }
    public int removeOfNameAndBody(String name, String body) {
        Newstype newstype = new Newstype();
        newstype.setName(name);
        newstype.setBody(body);
        return remove(newstype);
    }
    public int insert(Newstype newstype) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(newstype, "newstype");
    }
    public int insertOfNewsTypeId(String newsTypeId) {
        Newstype newstype = new Newstype();
        newstype.setNewsTypeId(newsTypeId);
        return insert(newstype);
    }
    public int insertOfName(String name) {
        Newstype newstype = new Newstype();
        newstype.setName(name);
        return insert(newstype);
    }
    public int insertOfBody(String body) {
        Newstype newstype = new Newstype();
        newstype.setBody(body);
        return insert(newstype);
    }
    public int insertOfNewsTypeIdAndName(String newsTypeId, String name) {
        Newstype newstype = new Newstype();
        newstype.setNewsTypeId(newsTypeId);
        newstype.setName(name);
        return insert(newstype);
    }
    public int insertOfNewsTypeIdAndBody(String newsTypeId, String body) {
        Newstype newstype = new Newstype();
        newstype.setNewsTypeId(newsTypeId);
        newstype.setBody(body);
        return insert(newstype);
    }
    public int insertOfNameAndBody(String name, String body) {
        Newstype newstype = new Newstype();
        newstype.setName(name);
        newstype.setBody(body);
        return insert(newstype);
    }
    public Newstype getNewstype(Newstype newstype) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(newstype, "newstype");
    }
    public Newstype getNewstypeOfNewsTypeId(String newsTypeId) {
        Newstype newstype = new Newstype();
        newstype.setNewsTypeId(newsTypeId);
        return getNewstype(newstype);
    }
    public Newstype getNewstypeOfName(String name) {
        Newstype newstype = new Newstype();
        newstype.setName(name);
        return getNewstype(newstype);
    }
    public Newstype getNewstypeOfBody(String body) {
        Newstype newstype = new Newstype();
        newstype.setBody(body);
        return getNewstype(newstype);
    }
    public Newstype getNewstypeOfNewsTypeIdAndName(String newsTypeId, String name) {
        Newstype newstype = new Newstype();
        newstype.setNewsTypeId(newsTypeId);
        newstype.setName(name);
        return getNewstype(newstype);
    }
    public Newstype getNewstypeOfNewsTypeIdAndBody(String newsTypeId, String body) {
        Newstype newstype = new Newstype();
        newstype.setNewsTypeId(newsTypeId);
        newstype.setBody(body);
        return getNewstype(newstype);
    }
    public Newstype getNewstypeOfNameAndBody(String name, String body) {
        Newstype newstype = new Newstype();
        newstype.setName(name);
        newstype.setBody(body);
        return getNewstype(newstype);
    }
    public List<Newstype> getNewstypes(Newstype newstype) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(newstype, "newstype");
    }
    public List<Newstype> getNewstypesOfNewsTypeId(String newsTypeId) {
        Newstype newstype = new Newstype();
        newstype.setNewsTypeId(newsTypeId);
        return getNewstypes(newstype);
    }
    public List<Newstype> getNewstypesOfName(String name) {
        Newstype newstype = new Newstype();
        newstype.setName(name);
        return getNewstypes(newstype);
    }
    public List<Newstype> getNewstypesOfBody(String body) {
        Newstype newstype = new Newstype();
        newstype.setBody(body);
        return getNewstypes(newstype);
    }
    public List<Newstype> getNewstypesOfNewsTypeIdAndName(String newsTypeId, String name) {
        Newstype newstype = new Newstype();
        newstype.setNewsTypeId(newsTypeId);
        newstype.setName(name);
        return getNewstypes(newstype);
    }
    public List<Newstype> getNewstypesOfNewsTypeIdAndBody(String newsTypeId, String body) {
        Newstype newstype = new Newstype();
        newstype.setNewsTypeId(newsTypeId);
        newstype.setBody(body);
        return getNewstypes(newstype);
    }
    public List<Newstype> getNewstypesOfNameAndBody(String name, String body) {
        Newstype newstype = new Newstype();
        newstype.setName(name);
        newstype.setBody(body);
        return getNewstypes(newstype);
    }
}
