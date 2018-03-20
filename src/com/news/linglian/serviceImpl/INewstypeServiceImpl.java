package com.news.linglian.serviceImpl;

import java.util.List;

import com.news.linglian.entity.Newstype;

import com.news.linglian.dao.INewstypeDao;
import com.news.linglian.daoImpl.INewstypeDaoImpl;
import com.news.linglian.service.INewstypeService;

public class INewstypeServiceImpl implements INewstypeService {
	INewstypeDao dao = null;

	public INewstypeServiceImpl() {
		dao = new INewstypeDaoImpl();
	}
    public int update(Newstype newstype, Newstype keyNewstype) {
        return dao.update(newstype, keyNewstype);
    }
    public int updateOfNewsTypeId(Newstype newstype, String newsTypeId) {
        return dao.updateOfNewsTypeId(newstype, newsTypeId);
    }
    public int updateOfName(Newstype newstype, String name) {
        return dao.updateOfName(newstype, name);
    }
    public int updateOfBody(Newstype newstype, String body) {
        return dao.updateOfBody(newstype, body);
    }
    public int updateOfNewsTypeIdAndName(Newstype newstype, String newsTypeId, String name) {
        return dao.updateOfNewsTypeIdAndName(newstype, newsTypeId, name);
    }
    public int updateOfNewsTypeIdAndBody(Newstype newstype, String newsTypeId, String body) {
        return dao.updateOfNewsTypeIdAndBody(newstype, newsTypeId, body);
    }
    public int updateOfNameAndBody(Newstype newstype, String name, String body) {
        return dao.updateOfNameAndBody(newstype, name, body);
    }
    public int remove(Newstype newstype) {
        return dao.remove(newstype);
    }
    public int removeOfNewsTypeId(String newsTypeId) {
        return dao.removeOfNewsTypeId(newsTypeId);
    }
    public int removeOfName(String name) {
        return dao.removeOfName(name);
    }
    public int removeOfBody(String body) {
        return dao.removeOfBody(body);
    }
    public int removeOfNewsTypeIdAndName(String newsTypeId, String name) {
        return dao.removeOfNewsTypeIdAndName(newsTypeId, name);
    }
    public int removeOfNewsTypeIdAndBody(String newsTypeId, String body) {
        return dao.removeOfNewsTypeIdAndBody(newsTypeId, body);
    }
    public int removeOfNameAndBody(String name, String body) {
        return dao.removeOfNameAndBody(name, body);
    }
    public int insert(Newstype newstype) {
        return dao.insert(newstype);
    }
    public int insertOfNewsTypeId(String newsTypeId) {
        return dao.insertOfNewsTypeId(newsTypeId);
    }
    public int insertOfName(String name) {
        return dao.insertOfName(name);
    }
    public int insertOfBody(String body) {
        return dao.insertOfBody(body);
    }
    public int insertOfNewsTypeIdAndName(String newsTypeId, String name) {
        return dao.insertOfNewsTypeIdAndName(newsTypeId, name);
    }
    public int insertOfNewsTypeIdAndBody(String newsTypeId, String body) {
        return dao.insertOfNewsTypeIdAndBody(newsTypeId, body);
    }
    public int insertOfNameAndBody(String name, String body) {
        return dao.insertOfNameAndBody(name, body);
    }
    public Newstype getNewstype(Newstype newstype) {
        return dao.getNewstype(newstype);
    }
    public Newstype getNewstypeOfNewsTypeId(String newsTypeId) {
        return dao.getNewstypeOfNewsTypeId(newsTypeId);
    }
    public Newstype getNewstypeOfName(String name) {
        return dao.getNewstypeOfName(name);
    }
    public Newstype getNewstypeOfBody(String body) {
        return dao.getNewstypeOfBody(body);
    }
    public Newstype getNewstypeOfNewsTypeIdAndName(String newsTypeId, String name) {
        return dao.getNewstypeOfNewsTypeIdAndName(newsTypeId, name);
    }
    public Newstype getNewstypeOfNewsTypeIdAndBody(String newsTypeId, String body) {
        return dao.getNewstypeOfNewsTypeIdAndBody(newsTypeId, body);
    }
    public Newstype getNewstypeOfNameAndBody(String name, String body) {
        return dao.getNewstypeOfNameAndBody(name, body);
    }
    public List<Newstype> getNewstypes(Newstype newstype) {
        return dao.getNewstypes(newstype);
    }
    public List<Newstype> getNewstypesOfNewsTypeId(String newsTypeId) {
        return dao.getNewstypesOfNewsTypeId(newsTypeId);
    }
    public List<Newstype> getNewstypesOfName(String name) {
        return dao.getNewstypesOfName(name);
    }
    public List<Newstype> getNewstypesOfBody(String body) {
        return dao.getNewstypesOfBody(body);
    }
    public List<Newstype> getNewstypesOfNewsTypeIdAndName(String newsTypeId, String name) {
        return dao.getNewstypesOfNewsTypeIdAndName(newsTypeId, name);
    }
    public List<Newstype> getNewstypesOfNewsTypeIdAndBody(String newsTypeId, String body) {
        return dao.getNewstypesOfNewsTypeIdAndBody(newsTypeId, body);
    }
    public List<Newstype> getNewstypesOfNameAndBody(String name, String body) {
        return dao.getNewstypesOfNameAndBody(name, body);
    }
}
