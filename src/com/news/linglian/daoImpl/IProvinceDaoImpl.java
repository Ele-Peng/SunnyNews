package com.news.linglian.daoImpl;

import java.util.List;

import com.news.linglian.entity.Province;

import com.news.linglian.dao.IProvinceDao;
import db.DBMan;

public class IProvinceDaoImpl implements IProvinceDao {
    public int update(Province province, Province keyProvince) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(province, keyProvince, "province");
    }
    public int updateOfId(Province province, String id) {
        Province kProvince = new Province();
        kProvince.setId(id);
        return update(province, kProvince);
    }
    public int updateOfCode(Province province, String code) {
        Province kProvince = new Province();
        kProvince.setCode(code);
        return update(province, kProvince);
    }
    public int updateOfName(Province province, String name) {
        Province kProvince = new Province();
        kProvince.setName(name);
        return update(province, kProvince);
    }
    public int updateOfIdAndCode(Province province, String id, String code) {
        Province kProvince = new Province();
        kProvince.setId(id);
        kProvince.setCode(code);
        return update(province, kProvince);
    }
    public int updateOfIdAndName(Province province, String id, String name) {
        Province kProvince = new Province();
        kProvince.setId(id);
        kProvince.setName(name);
        return update(province, kProvince);
    }
    public int updateOfCodeAndName(Province province, String code, String name) {
        Province kProvince = new Province();
        kProvince.setCode(code);
        kProvince.setName(name);
        return update(province, kProvince);
    }
    public int remove(Province province) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(province, "province");
    }
    public int removeOfId(String id) {
        Province province = new Province();
        province.setId(id);
        return remove(province);
    }
    public int removeOfCode(String code) {
        Province province = new Province();
        province.setCode(code);
        return remove(province);
    }
    public int removeOfName(String name) {
        Province province = new Province();
        province.setName(name);
        return remove(province);
    }
    public int removeOfIdAndCode(String id, String code) {
        Province province = new Province();
        province.setId(id);
        province.setCode(code);
        return remove(province);
    }
    public int removeOfIdAndName(String id, String name) {
        Province province = new Province();
        province.setId(id);
        province.setName(name);
        return remove(province);
    }
    public int removeOfCodeAndName(String code, String name) {
        Province province = new Province();
        province.setCode(code);
        province.setName(name);
        return remove(province);
    }
    public int insert(Province province) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(province, "province");
    }
    public int insertOfId(String id) {
        Province province = new Province();
        province.setId(id);
        return insert(province);
    }
    public int insertOfCode(String code) {
        Province province = new Province();
        province.setCode(code);
        return insert(province);
    }
    public int insertOfName(String name) {
        Province province = new Province();
        province.setName(name);
        return insert(province);
    }
    public int insertOfIdAndCode(String id, String code) {
        Province province = new Province();
        province.setId(id);
        province.setCode(code);
        return insert(province);
    }
    public int insertOfIdAndName(String id, String name) {
        Province province = new Province();
        province.setId(id);
        province.setName(name);
        return insert(province);
    }
    public int insertOfCodeAndName(String code, String name) {
        Province province = new Province();
        province.setCode(code);
        province.setName(name);
        return insert(province);
    }
    public Province getProvince(Province province) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(province, "province");
    }
    public Province getProvinceOfId(String id) {
        Province province = new Province();
        province.setId(id);
        return getProvince(province);
    }
    public Province getProvinceOfCode(String code) {
        Province province = new Province();
        province.setCode(code);
        return getProvince(province);
    }
    public Province getProvinceOfName(String name) {
        Province province = new Province();
        province.setName(name);
        return getProvince(province);
    }
    public Province getProvinceOfIdAndCode(String id, String code) {
        Province province = new Province();
        province.setId(id);
        province.setCode(code);
        return getProvince(province);
    }
    public Province getProvinceOfIdAndName(String id, String name) {
        Province province = new Province();
        province.setId(id);
        province.setName(name);
        return getProvince(province);
    }
    public Province getProvinceOfCodeAndName(String code, String name) {
        Province province = new Province();
        province.setCode(code);
        province.setName(name);
        return getProvince(province);
    }
    public List<Province> getProvinces(Province province) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(province, "province");
    }
    public List<Province> getProvincesOfId(String id) {
        Province province = new Province();
        province.setId(id);
        return getProvinces(province);
    }
    public List<Province> getProvincesOfCode(String code) {
        Province province = new Province();
        province.setCode(code);
        return getProvinces(province);
    }
    public List<Province> getProvincesOfName(String name) {
        Province province = new Province();
        province.setName(name);
        return getProvinces(province);
    }
    public List<Province> getProvincesOfIdAndCode(String id, String code) {
        Province province = new Province();
        province.setId(id);
        province.setCode(code);
        return getProvinces(province);
    }
    public List<Province> getProvincesOfIdAndName(String id, String name) {
        Province province = new Province();
        province.setId(id);
        province.setName(name);
        return getProvinces(province);
    }
    public List<Province> getProvincesOfCodeAndName(String code, String name) {
        Province province = new Province();
        province.setCode(code);
        province.setName(name);
        return getProvinces(province);
    }
}
