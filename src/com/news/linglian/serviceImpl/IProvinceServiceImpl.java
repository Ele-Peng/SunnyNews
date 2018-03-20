package com.news.linglian.serviceImpl;

import java.util.List;

import com.news.linglian.entity.Province;

import com.news.linglian.dao.IProvinceDao;
import com.news.linglian.daoImpl.IProvinceDaoImpl;
import com.news.linglian.service.IProvinceService;

public class IProvinceServiceImpl implements IProvinceService {
	IProvinceDao dao = null;

	public IProvinceServiceImpl() {
		dao = new IProvinceDaoImpl();
	}
    public int update(Province province, Province keyProvince) {
        return dao.update(province, keyProvince);
    }
    public int updateOfId(Province province, String id) {
        return dao.updateOfId(province, id);
    }
    public int updateOfCode(Province province, String code) {
        return dao.updateOfCode(province, code);
    }
    public int updateOfName(Province province, String name) {
        return dao.updateOfName(province, name);
    }
    public int updateOfIdAndCode(Province province, String id, String code) {
        return dao.updateOfIdAndCode(province, id, code);
    }
    public int updateOfIdAndName(Province province, String id, String name) {
        return dao.updateOfIdAndName(province, id, name);
    }
    public int updateOfCodeAndName(Province province, String code, String name) {
        return dao.updateOfCodeAndName(province, code, name);
    }
    public int remove(Province province) {
        return dao.remove(province);
    }
    public int removeOfId(String id) {
        return dao.removeOfId(id);
    }
    public int removeOfCode(String code) {
        return dao.removeOfCode(code);
    }
    public int removeOfName(String name) {
        return dao.removeOfName(name);
    }
    public int removeOfIdAndCode(String id, String code) {
        return dao.removeOfIdAndCode(id, code);
    }
    public int removeOfIdAndName(String id, String name) {
        return dao.removeOfIdAndName(id, name);
    }
    public int removeOfCodeAndName(String code, String name) {
        return dao.removeOfCodeAndName(code, name);
    }
    public int insert(Province province) {
        return dao.insert(province);
    }
    public int insertOfId(String id) {
        return dao.insertOfId(id);
    }
    public int insertOfCode(String code) {
        return dao.insertOfCode(code);
    }
    public int insertOfName(String name) {
        return dao.insertOfName(name);
    }
    public int insertOfIdAndCode(String id, String code) {
        return dao.insertOfIdAndCode(id, code);
    }
    public int insertOfIdAndName(String id, String name) {
        return dao.insertOfIdAndName(id, name);
    }
    public int insertOfCodeAndName(String code, String name) {
        return dao.insertOfCodeAndName(code, name);
    }
    public Province getProvince(Province province) {
        return dao.getProvince(province);
    }
    public Province getProvinceOfId(String id) {
        return dao.getProvinceOfId(id);
    }
    public Province getProvinceOfCode(String code) {
        return dao.getProvinceOfCode(code);
    }
    public Province getProvinceOfName(String name) {
        return dao.getProvinceOfName(name);
    }
    public Province getProvinceOfIdAndCode(String id, String code) {
        return dao.getProvinceOfIdAndCode(id, code);
    }
    public Province getProvinceOfIdAndName(String id, String name) {
        return dao.getProvinceOfIdAndName(id, name);
    }
    public Province getProvinceOfCodeAndName(String code, String name) {
        return dao.getProvinceOfCodeAndName(code, name);
    }
    public List<Province> getProvinces(Province province) {
        return dao.getProvinces(province);
    }
    public List<Province> getProvincesOfId(String id) {
        return dao.getProvincesOfId(id);
    }
    public List<Province> getProvincesOfCode(String code) {
        return dao.getProvincesOfCode(code);
    }
    public List<Province> getProvincesOfName(String name) {
        return dao.getProvincesOfName(name);
    }
    public List<Province> getProvincesOfIdAndCode(String id, String code) {
        return dao.getProvincesOfIdAndCode(id, code);
    }
    public List<Province> getProvincesOfIdAndName(String id, String name) {
        return dao.getProvincesOfIdAndName(id, name);
    }
    public List<Province> getProvincesOfCodeAndName(String code, String name) {
        return dao.getProvincesOfCodeAndName(code, name);
    }
}
