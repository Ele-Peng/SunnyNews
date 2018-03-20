package com.news.linglian.serviceImpl;

import java.util.List;

import com.news.linglian.entity.Usernewstype;

import com.news.linglian.dao.IUsernewstypeDao;
import com.news.linglian.daoImpl.IUsernewstypeDaoImpl;
import com.news.linglian.service.IUsernewstypeService;

public class IUsernewstypeServiceImpl implements IUsernewstypeService {
	IUsernewstypeDao dao = null;

	public IUsernewstypeServiceImpl() {
		dao = new IUsernewstypeDaoImpl();
	}
    public int update(Usernewstype usernewstype, Usernewstype keyUsernewstype) {
        return dao.update(usernewstype, keyUsernewstype);
    }
    public int updateOfUserNewsTypeId(Usernewstype usernewstype, String userNewsTypeId) {
        return dao.updateOfUserNewsTypeId(usernewstype, userNewsTypeId);
    }
    public int updateOfUserId(Usernewstype usernewstype, String userId) {
        return dao.updateOfUserId(usernewstype, userId);
    }
    public int updateOfName(Usernewstype usernewstype, String name) {
        return dao.updateOfName(usernewstype, name);
    }
    public int updateOfBody(Usernewstype usernewstype, String body) {
        return dao.updateOfBody(usernewstype, body);
    }
    public int updateOfUserNewsTypeIdAndUserId(Usernewstype usernewstype, String userNewsTypeId, String userId) {
        return dao.updateOfUserNewsTypeIdAndUserId(usernewstype, userNewsTypeId, userId);
    }
    public int updateOfUserNewsTypeIdAndName(Usernewstype usernewstype, String userNewsTypeId, String name) {
        return dao.updateOfUserNewsTypeIdAndName(usernewstype, userNewsTypeId, name);
    }
    public int updateOfUserNewsTypeIdAndBody(Usernewstype usernewstype, String userNewsTypeId, String body) {
        return dao.updateOfUserNewsTypeIdAndBody(usernewstype, userNewsTypeId, body);
    }
    public int updateOfUserIdAndName(Usernewstype usernewstype, String userId, String name) {
        return dao.updateOfUserIdAndName(usernewstype, userId, name);
    }
    public int updateOfUserIdAndBody(Usernewstype usernewstype, String userId, String body) {
        return dao.updateOfUserIdAndBody(usernewstype, userId, body);
    }
    public int updateOfNameAndBody(Usernewstype usernewstype, String name, String body) {
        return dao.updateOfNameAndBody(usernewstype, name, body);
    }
    public int remove(Usernewstype usernewstype) {
        return dao.remove(usernewstype);
    }
    public int removeOfUserNewsTypeId(String userNewsTypeId) {
        return dao.removeOfUserNewsTypeId(userNewsTypeId);
    }
    public int removeOfUserId(String userId) {
        return dao.removeOfUserId(userId);
    }
    public int removeOfName(String name) {
        return dao.removeOfName(name);
    }
    public int removeOfBody(String body) {
        return dao.removeOfBody(body);
    }
    public int removeOfUserNewsTypeIdAndUserId(String userNewsTypeId, String userId) {
        return dao.removeOfUserNewsTypeIdAndUserId(userNewsTypeId, userId);
    }
    public int removeOfUserNewsTypeIdAndName(String userNewsTypeId, String name) {
        return dao.removeOfUserNewsTypeIdAndName(userNewsTypeId, name);
    }
    public int removeOfUserNewsTypeIdAndBody(String userNewsTypeId, String body) {
        return dao.removeOfUserNewsTypeIdAndBody(userNewsTypeId, body);
    }
    public int removeOfUserIdAndName(String userId, String name) {
        return dao.removeOfUserIdAndName(userId, name);
    }
    public int removeOfUserIdAndBody(String userId, String body) {
        return dao.removeOfUserIdAndBody(userId, body);
    }
    public int removeOfNameAndBody(String name, String body) {
        return dao.removeOfNameAndBody(name, body);
    }
    public int insert(Usernewstype usernewstype) {
        return dao.insert(usernewstype);
    }
    public int insertOfUserNewsTypeId(String userNewsTypeId) {
        return dao.insertOfUserNewsTypeId(userNewsTypeId);
    }
    public int insertOfUserId(String userId) {
        return dao.insertOfUserId(userId);
    }
    public int insertOfName(String name) {
        return dao.insertOfName(name);
    }
    public int insertOfBody(String body) {
        return dao.insertOfBody(body);
    }
    public int insertOfUserNewsTypeIdAndUserId(String userNewsTypeId, String userId) {
        return dao.insertOfUserNewsTypeIdAndUserId(userNewsTypeId, userId);
    }
    public int insertOfUserNewsTypeIdAndName(String userNewsTypeId, String name) {
        return dao.insertOfUserNewsTypeIdAndName(userNewsTypeId, name);
    }
    public int insertOfUserNewsTypeIdAndBody(String userNewsTypeId, String body) {
        return dao.insertOfUserNewsTypeIdAndBody(userNewsTypeId, body);
    }
    public int insertOfUserIdAndName(String userId, String name) {
        return dao.insertOfUserIdAndName(userId, name);
    }
    public int insertOfUserIdAndBody(String userId, String body) {
        return dao.insertOfUserIdAndBody(userId, body);
    }
    public int insertOfNameAndBody(String name, String body) {
        return dao.insertOfNameAndBody(name, body);
    }
    public Usernewstype getUsernewstype(Usernewstype usernewstype) {
        return dao.getUsernewstype(usernewstype);
    }
    public Usernewstype getUsernewstypeOfUserNewsTypeId(String userNewsTypeId) {
        return dao.getUsernewstypeOfUserNewsTypeId(userNewsTypeId);
    }
    public Usernewstype getUsernewstypeOfUserId(String userId) {
        return dao.getUsernewstypeOfUserId(userId);
    }
    public Usernewstype getUsernewstypeOfName(String name) {
        return dao.getUsernewstypeOfName(name);
    }
    public Usernewstype getUsernewstypeOfBody(String body) {
        return dao.getUsernewstypeOfBody(body);
    }
    public Usernewstype getUsernewstypeOfUserNewsTypeIdAndUserId(String userNewsTypeId, String userId) {
        return dao.getUsernewstypeOfUserNewsTypeIdAndUserId(userNewsTypeId, userId);
    }
    public Usernewstype getUsernewstypeOfUserNewsTypeIdAndName(String userNewsTypeId, String name) {
        return dao.getUsernewstypeOfUserNewsTypeIdAndName(userNewsTypeId, name);
    }
    public Usernewstype getUsernewstypeOfUserNewsTypeIdAndBody(String userNewsTypeId, String body) {
        return dao.getUsernewstypeOfUserNewsTypeIdAndBody(userNewsTypeId, body);
    }
    public Usernewstype getUsernewstypeOfUserIdAndName(String userId, String name) {
        return dao.getUsernewstypeOfUserIdAndName(userId, name);
    }
    public Usernewstype getUsernewstypeOfUserIdAndBody(String userId, String body) {
        return dao.getUsernewstypeOfUserIdAndBody(userId, body);
    }
    public Usernewstype getUsernewstypeOfNameAndBody(String name, String body) {
        return dao.getUsernewstypeOfNameAndBody(name, body);
    }
    public List<Usernewstype> getUsernewstypes(Usernewstype usernewstype) {
        return dao.getUsernewstypes(usernewstype);
    }
    public List<Usernewstype> getUsernewstypesOfUserNewsTypeId(String userNewsTypeId) {
        return dao.getUsernewstypesOfUserNewsTypeId(userNewsTypeId);
    }
    public List<Usernewstype> getUsernewstypesOfUserId(String userId) {
        return dao.getUsernewstypesOfUserId(userId);
    }
    public List<Usernewstype> getUsernewstypesOfName(String name) {
        return dao.getUsernewstypesOfName(name);
    }
    public List<Usernewstype> getUsernewstypesOfBody(String body) {
        return dao.getUsernewstypesOfBody(body);
    }
    public List<Usernewstype> getUsernewstypesOfUserNewsTypeIdAndUserId(String userNewsTypeId, String userId) {
        return dao.getUsernewstypesOfUserNewsTypeIdAndUserId(userNewsTypeId, userId);
    }
    public List<Usernewstype> getUsernewstypesOfUserNewsTypeIdAndName(String userNewsTypeId, String name) {
        return dao.getUsernewstypesOfUserNewsTypeIdAndName(userNewsTypeId, name);
    }
    public List<Usernewstype> getUsernewstypesOfUserNewsTypeIdAndBody(String userNewsTypeId, String body) {
        return dao.getUsernewstypesOfUserNewsTypeIdAndBody(userNewsTypeId, body);
    }
    public List<Usernewstype> getUsernewstypesOfUserIdAndName(String userId, String name) {
        return dao.getUsernewstypesOfUserIdAndName(userId, name);
    }
    public List<Usernewstype> getUsernewstypesOfUserIdAndBody(String userId, String body) {
        return dao.getUsernewstypesOfUserIdAndBody(userId, body);
    }
    public List<Usernewstype> getUsernewstypesOfNameAndBody(String name, String body) {
        return dao.getUsernewstypesOfNameAndBody(name, body);
    }
}
