package com.news.linglian.serviceImpl;

import java.util.List;

import com.news.linglian.entity.City;

import com.news.linglian.dao.ICityDao;
import com.news.linglian.daoImpl.ICityDaoImpl;
import com.news.linglian.service.ICityService;

public class ICityServiceImpl implements ICityService {
	ICityDao dao = null;

	public ICityServiceImpl() {
		dao = new ICityDaoImpl();
	}
    public int update(City city, City keyCity) {
        return dao.update(city, keyCity);
    }
    public int updateOfId(City city, String id) {
        return dao.updateOfId(city, id);
    }
    public int updateOfCode(City city, String code) {
        return dao.updateOfCode(city, code);
    }
    public int updateOfName(City city, String name) {
        return dao.updateOfName(city, name);
    }
    public int updateOfProvincecode(City city, String provincecode) {
        return dao.updateOfProvincecode(city, provincecode);
    }
    public int updateOfIdAndCode(City city, String id, String code) {
        return dao.updateOfIdAndCode(city, id, code);
    }
    public int updateOfIdAndName(City city, String id, String name) {
        return dao.updateOfIdAndName(city, id, name);
    }
    public int updateOfIdAndProvincecode(City city, String id, String provincecode) {
        return dao.updateOfIdAndProvincecode(city, id, provincecode);
    }
    public int updateOfCodeAndName(City city, String code, String name) {
        return dao.updateOfCodeAndName(city, code, name);
    }
    public int updateOfCodeAndProvincecode(City city, String code, String provincecode) {
        return dao.updateOfCodeAndProvincecode(city, code, provincecode);
    }
    public int updateOfNameAndProvincecode(City city, String name, String provincecode) {
        return dao.updateOfNameAndProvincecode(city, name, provincecode);
    }
    public int remove(City city) {
        return dao.remove(city);
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
    public int removeOfProvincecode(String provincecode) {
        return dao.removeOfProvincecode(provincecode);
    }
    public int removeOfIdAndCode(String id, String code) {
        return dao.removeOfIdAndCode(id, code);
    }
    public int removeOfIdAndName(String id, String name) {
        return dao.removeOfIdAndName(id, name);
    }
    public int removeOfIdAndProvincecode(String id, String provincecode) {
        return dao.removeOfIdAndProvincecode(id, provincecode);
    }
    public int removeOfCodeAndName(String code, String name) {
        return dao.removeOfCodeAndName(code, name);
    }
    public int removeOfCodeAndProvincecode(String code, String provincecode) {
        return dao.removeOfCodeAndProvincecode(code, provincecode);
    }
    public int removeOfNameAndProvincecode(String name, String provincecode) {
        return dao.removeOfNameAndProvincecode(name, provincecode);
    }
    public int insert(City city) {
        return dao.insert(city);
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
    public int insertOfProvincecode(String provincecode) {
        return dao.insertOfProvincecode(provincecode);
    }
    public int insertOfIdAndCode(String id, String code) {
        return dao.insertOfIdAndCode(id, code);
    }
    public int insertOfIdAndName(String id, String name) {
        return dao.insertOfIdAndName(id, name);
    }
    public int insertOfIdAndProvincecode(String id, String provincecode) {
        return dao.insertOfIdAndProvincecode(id, provincecode);
    }
    public int insertOfCodeAndName(String code, String name) {
        return dao.insertOfCodeAndName(code, name);
    }
    public int insertOfCodeAndProvincecode(String code, String provincecode) {
        return dao.insertOfCodeAndProvincecode(code, provincecode);
    }
    public int insertOfNameAndProvincecode(String name, String provincecode) {
        return dao.insertOfNameAndProvincecode(name, provincecode);
    }
    public City getCity(City city) {
        return dao.getCity(city);
    }
    public City getCityOfId(String id) {
        return dao.getCityOfId(id);
    }
    public City getCityOfCode(String code) {
        return dao.getCityOfCode(code);
    }
    public City getCityOfName(String name) {
        return dao.getCityOfName(name);
    }
    public City getCityOfProvincecode(String provincecode) {
        return dao.getCityOfProvincecode(provincecode);
    }
    public City getCityOfIdAndCode(String id, String code) {
        return dao.getCityOfIdAndCode(id, code);
    }
    public City getCityOfIdAndName(String id, String name) {
        return dao.getCityOfIdAndName(id, name);
    }
    public City getCityOfIdAndProvincecode(String id, String provincecode) {
        return dao.getCityOfIdAndProvincecode(id, provincecode);
    }
    public City getCityOfCodeAndName(String code, String name) {
        return dao.getCityOfCodeAndName(code, name);
    }
    public City getCityOfCodeAndProvincecode(String code, String provincecode) {
        return dao.getCityOfCodeAndProvincecode(code, provincecode);
    }
    public City getCityOfNameAndProvincecode(String name, String provincecode) {
        return dao.getCityOfNameAndProvincecode(name, provincecode);
    }
    public List<City> getCitys(City city) {
        return dao.getCitys(city);
    }
    public List<City> getCitysOfId(String id) {
        return dao.getCitysOfId(id);
    }
    public List<City> getCitysOfCode(String code) {
        return dao.getCitysOfCode(code);
    }
    public List<City> getCitysOfName(String name) {
        return dao.getCitysOfName(name);
    }
    public List<City> getCitysOfProvincecode(String provincecode) {
        return dao.getCitysOfProvincecode(provincecode);
    }
    public List<City> getCitysOfIdAndCode(String id, String code) {
        return dao.getCitysOfIdAndCode(id, code);
    }
    public List<City> getCitysOfIdAndName(String id, String name) {
        return dao.getCitysOfIdAndName(id, name);
    }
    public List<City> getCitysOfIdAndProvincecode(String id, String provincecode) {
        return dao.getCitysOfIdAndProvincecode(id, provincecode);
    }
    public List<City> getCitysOfCodeAndName(String code, String name) {
        return dao.getCitysOfCodeAndName(code, name);
    }
    public List<City> getCitysOfCodeAndProvincecode(String code, String provincecode) {
        return dao.getCitysOfCodeAndProvincecode(code, provincecode);
    }
    public List<City> getCitysOfNameAndProvincecode(String name, String provincecode) {
        return dao.getCitysOfNameAndProvincecode(name, provincecode);
    }
}
