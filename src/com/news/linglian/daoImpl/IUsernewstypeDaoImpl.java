package com.news.linglian.daoImpl;

import java.util.List;

import com.news.linglian.entity.Usernewstype;

import com.news.linglian.dao.IUsernewstypeDao;
import db.DBMan;

public class IUsernewstypeDaoImpl implements IUsernewstypeDao {
    public int update(Usernewstype usernewstype, Usernewstype keyUsernewstype) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(usernewstype, keyUsernewstype, "usernewstype");
    }
    public int updateOfUserNewsTypeId(Usernewstype usernewstype, String userNewsTypeId) {
        Usernewstype kUsernewstype = new Usernewstype();
        kUsernewstype.setUserNewsTypeId(userNewsTypeId);
        return update(usernewstype, kUsernewstype);
    }
    public int updateOfUserId(Usernewstype usernewstype, String userId) {
        Usernewstype kUsernewstype = new Usernewstype();
        kUsernewstype.setUserId(userId);
        return update(usernewstype, kUsernewstype);
    }
    public int updateOfName(Usernewstype usernewstype, String name) {
        Usernewstype kUsernewstype = new Usernewstype();
        kUsernewstype.setName(name);
        return update(usernewstype, kUsernewstype);
    }
    public int updateOfBody(Usernewstype usernewstype, String body) {
        Usernewstype kUsernewstype = new Usernewstype();
        kUsernewstype.setBody(body);
        return update(usernewstype, kUsernewstype);
    }
    public int updateOfUserNewsTypeIdAndUserId(Usernewstype usernewstype, String userNewsTypeId, String userId) {
        Usernewstype kUsernewstype = new Usernewstype();
        kUsernewstype.setUserNewsTypeId(userNewsTypeId);
        kUsernewstype.setUserId(userId);
        return update(usernewstype, kUsernewstype);
    }
    public int updateOfUserNewsTypeIdAndName(Usernewstype usernewstype, String userNewsTypeId, String name) {
        Usernewstype kUsernewstype = new Usernewstype();
        kUsernewstype.setUserNewsTypeId(userNewsTypeId);
        kUsernewstype.setName(name);
        return update(usernewstype, kUsernewstype);
    }
    public int updateOfUserNewsTypeIdAndBody(Usernewstype usernewstype, String userNewsTypeId, String body) {
        Usernewstype kUsernewstype = new Usernewstype();
        kUsernewstype.setUserNewsTypeId(userNewsTypeId);
        kUsernewstype.setBody(body);
        return update(usernewstype, kUsernewstype);
    }
    public int updateOfUserIdAndName(Usernewstype usernewstype, String userId, String name) {
        Usernewstype kUsernewstype = new Usernewstype();
        kUsernewstype.setUserId(userId);
        kUsernewstype.setName(name);
        return update(usernewstype, kUsernewstype);
    }
    public int updateOfUserIdAndBody(Usernewstype usernewstype, String userId, String body) {
        Usernewstype kUsernewstype = new Usernewstype();
        kUsernewstype.setUserId(userId);
        kUsernewstype.setBody(body);
        return update(usernewstype, kUsernewstype);
    }
    public int updateOfNameAndBody(Usernewstype usernewstype, String name, String body) {
        Usernewstype kUsernewstype = new Usernewstype();
        kUsernewstype.setName(name);
        kUsernewstype.setBody(body);
        return update(usernewstype, kUsernewstype);
    }
    public int remove(Usernewstype usernewstype) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(usernewstype, "usernewstype");
    }
    public int removeOfUserNewsTypeId(String userNewsTypeId) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserNewsTypeId(userNewsTypeId);
        return remove(usernewstype);
    }
    public int removeOfUserId(String userId) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserId(userId);
        return remove(usernewstype);
    }
    public int removeOfName(String name) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setName(name);
        return remove(usernewstype);
    }
    public int removeOfBody(String body) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setBody(body);
        return remove(usernewstype);
    }
    public int removeOfUserNewsTypeIdAndUserId(String userNewsTypeId, String userId) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserNewsTypeId(userNewsTypeId);
        usernewstype.setUserId(userId);
        return remove(usernewstype);
    }
    public int removeOfUserNewsTypeIdAndName(String userNewsTypeId, String name) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserNewsTypeId(userNewsTypeId);
        usernewstype.setName(name);
        return remove(usernewstype);
    }
    public int removeOfUserNewsTypeIdAndBody(String userNewsTypeId, String body) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserNewsTypeId(userNewsTypeId);
        usernewstype.setBody(body);
        return remove(usernewstype);
    }
    public int removeOfUserIdAndName(String userId, String name) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserId(userId);
        usernewstype.setName(name);
        return remove(usernewstype);
    }
    public int removeOfUserIdAndBody(String userId, String body) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserId(userId);
        usernewstype.setBody(body);
        return remove(usernewstype);
    }
    public int removeOfNameAndBody(String name, String body) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setName(name);
        usernewstype.setBody(body);
        return remove(usernewstype);
    }
    public int insert(Usernewstype usernewstype) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(usernewstype, "usernewstype");
    }
    public int insertOfUserNewsTypeId(String userNewsTypeId) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserNewsTypeId(userNewsTypeId);
        return insert(usernewstype);
    }
    public int insertOfUserId(String userId) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserId(userId);
        return insert(usernewstype);
    }
    public int insertOfName(String name) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setName(name);
        return insert(usernewstype);
    }
    public int insertOfBody(String body) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setBody(body);
        return insert(usernewstype);
    }
    public int insertOfUserNewsTypeIdAndUserId(String userNewsTypeId, String userId) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserNewsTypeId(userNewsTypeId);
        usernewstype.setUserId(userId);
        return insert(usernewstype);
    }
    public int insertOfUserNewsTypeIdAndName(String userNewsTypeId, String name) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserNewsTypeId(userNewsTypeId);
        usernewstype.setName(name);
        return insert(usernewstype);
    }
    public int insertOfUserNewsTypeIdAndBody(String userNewsTypeId, String body) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserNewsTypeId(userNewsTypeId);
        usernewstype.setBody(body);
        return insert(usernewstype);
    }
    public int insertOfUserIdAndName(String userId, String name) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserId(userId);
        usernewstype.setName(name);
        return insert(usernewstype);
    }
    public int insertOfUserIdAndBody(String userId, String body) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserId(userId);
        usernewstype.setBody(body);
        return insert(usernewstype);
    }
    public int insertOfNameAndBody(String name, String body) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setName(name);
        usernewstype.setBody(body);
        return insert(usernewstype);
    }
    public Usernewstype getUsernewstype(Usernewstype usernewstype) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(usernewstype, "usernewstype");
    }
    public Usernewstype getUsernewstypeOfUserNewsTypeId(String userNewsTypeId) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserNewsTypeId(userNewsTypeId);
        return getUsernewstype(usernewstype);
    }
    public Usernewstype getUsernewstypeOfUserId(String userId) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserId(userId);
        return getUsernewstype(usernewstype);
    }
    public Usernewstype getUsernewstypeOfName(String name) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setName(name);
        return getUsernewstype(usernewstype);
    }
    public Usernewstype getUsernewstypeOfBody(String body) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setBody(body);
        return getUsernewstype(usernewstype);
    }
    public Usernewstype getUsernewstypeOfUserNewsTypeIdAndUserId(String userNewsTypeId, String userId) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserNewsTypeId(userNewsTypeId);
        usernewstype.setUserId(userId);
        return getUsernewstype(usernewstype);
    }
    public Usernewstype getUsernewstypeOfUserNewsTypeIdAndName(String userNewsTypeId, String name) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserNewsTypeId(userNewsTypeId);
        usernewstype.setName(name);
        return getUsernewstype(usernewstype);
    }
    public Usernewstype getUsernewstypeOfUserNewsTypeIdAndBody(String userNewsTypeId, String body) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserNewsTypeId(userNewsTypeId);
        usernewstype.setBody(body);
        return getUsernewstype(usernewstype);
    }
    public Usernewstype getUsernewstypeOfUserIdAndName(String userId, String name) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserId(userId);
        usernewstype.setName(name);
        return getUsernewstype(usernewstype);
    }
    public Usernewstype getUsernewstypeOfUserIdAndBody(String userId, String body) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserId(userId);
        usernewstype.setBody(body);
        return getUsernewstype(usernewstype);
    }
    public Usernewstype getUsernewstypeOfNameAndBody(String name, String body) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setName(name);
        usernewstype.setBody(body);
        return getUsernewstype(usernewstype);
    }
    public List<Usernewstype> getUsernewstypes(Usernewstype usernewstype) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(usernewstype, "usernewstype");
    }
    public List<Usernewstype> getUsernewstypesOfUserNewsTypeId(String userNewsTypeId) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserNewsTypeId(userNewsTypeId);
        return getUsernewstypes(usernewstype);
    }
    public List<Usernewstype> getUsernewstypesOfUserId(String userId) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserId(userId);
        return getUsernewstypes(usernewstype);
    }
    public List<Usernewstype> getUsernewstypesOfName(String name) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setName(name);
        return getUsernewstypes(usernewstype);
    }
    public List<Usernewstype> getUsernewstypesOfBody(String body) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setBody(body);
        return getUsernewstypes(usernewstype);
    }
    public List<Usernewstype> getUsernewstypesOfUserNewsTypeIdAndUserId(String userNewsTypeId, String userId) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserNewsTypeId(userNewsTypeId);
        usernewstype.setUserId(userId);
        return getUsernewstypes(usernewstype);
    }
    public List<Usernewstype> getUsernewstypesOfUserNewsTypeIdAndName(String userNewsTypeId, String name) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserNewsTypeId(userNewsTypeId);
        usernewstype.setName(name);
        return getUsernewstypes(usernewstype);
    }
    public List<Usernewstype> getUsernewstypesOfUserNewsTypeIdAndBody(String userNewsTypeId, String body) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserNewsTypeId(userNewsTypeId);
        usernewstype.setBody(body);
        return getUsernewstypes(usernewstype);
    }
    public List<Usernewstype> getUsernewstypesOfUserIdAndName(String userId, String name) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserId(userId);
        usernewstype.setName(name);
        return getUsernewstypes(usernewstype);
    }
    public List<Usernewstype> getUsernewstypesOfUserIdAndBody(String userId, String body) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setUserId(userId);
        usernewstype.setBody(body);
        return getUsernewstypes(usernewstype);
    }
    public List<Usernewstype> getUsernewstypesOfNameAndBody(String name, String body) {
        Usernewstype usernewstype = new Usernewstype();
        usernewstype.setName(name);
        usernewstype.setBody(body);
        return getUsernewstypes(usernewstype);
    }
}
