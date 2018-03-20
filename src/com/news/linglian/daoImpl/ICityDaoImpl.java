package com.news.linglian.daoImpl;

import java.util.List;

import com.news.linglian.entity.City;

import com.news.linglian.dao.ICityDao;
import db.DBMan;

public class ICityDaoImpl implements ICityDao {
    public int update(City city, City keyCity) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(city, keyCity, "city");
    }
    public int updateOfId(City city, String id) {
        City kCity = new City();
        kCity.setId(id);
        return update(city, kCity);
    }
    public int updateOfCode(City city, String code) {
        City kCity = new City();
        kCity.setCode(code);
        return update(city, kCity);
    }
    public int updateOfName(City city, String name) {
        City kCity = new City();
        kCity.setName(name);
        return update(city, kCity);
    }
    public int updateOfProvincecode(City city, String provincecode) {
        City kCity = new City();
        kCity.setProvincecode(provincecode);
        return update(city, kCity);
    }
    public int updateOfIdAndCode(City city, String id, String code) {
        City kCity = new City();
        kCity.setId(id);
        kCity.setCode(code);
        return update(city, kCity);
    }
    public int updateOfIdAndName(City city, String id, String name) {
        City kCity = new City();
        kCity.setId(id);
        kCity.setName(name);
        return update(city, kCity);
    }
    public int updateOfIdAndProvincecode(City city, String id, String provincecode) {
        City kCity = new City();
        kCity.setId(id);
        kCity.setProvincecode(provincecode);
        return update(city, kCity);
    }
    public int updateOfCodeAndName(City city, String code, String name) {
        City kCity = new City();
        kCity.setCode(code);
        kCity.setName(name);
        return update(city, kCity);
    }
    public int updateOfCodeAndProvincecode(City city, String code, String provincecode) {
        City kCity = new City();
        kCity.setCode(code);
        kCity.setProvincecode(provincecode);
        return update(city, kCity);
    }
    public int updateOfNameAndProvincecode(City city, String name, String provincecode) {
        City kCity = new City();
        kCity.setName(name);
        kCity.setProvincecode(provincecode);
        return update(city, kCity);
    }
    public int remove(City city) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(city, "city");
    }
    public int removeOfId(String id) {
        City city = new City();
        city.setId(id);
        return remove(city);
    }
    public int removeOfCode(String code) {
        City city = new City();
        city.setCode(code);
        return remove(city);
    }
    public int removeOfName(String name) {
        City city = new City();
        city.setName(name);
        return remove(city);
    }
    public int removeOfProvincecode(String provincecode) {
        City city = new City();
        city.setProvincecode(provincecode);
        return remove(city);
    }
    public int removeOfIdAndCode(String id, String code) {
        City city = new City();
        city.setId(id);
        city.setCode(code);
        return remove(city);
    }
    public int removeOfIdAndName(String id, String name) {
        City city = new City();
        city.setId(id);
        city.setName(name);
        return remove(city);
    }
    public int removeOfIdAndProvincecode(String id, String provincecode) {
        City city = new City();
        city.setId(id);
        city.setProvincecode(provincecode);
        return remove(city);
    }
    public int removeOfCodeAndName(String code, String name) {
        City city = new City();
        city.setCode(code);
        city.setName(name);
        return remove(city);
    }
    public int removeOfCodeAndProvincecode(String code, String provincecode) {
        City city = new City();
        city.setCode(code);
        city.setProvincecode(provincecode);
        return remove(city);
    }
    public int removeOfNameAndProvincecode(String name, String provincecode) {
        City city = new City();
        city.setName(name);
        city.setProvincecode(provincecode);
        return remove(city);
    }
    public int insert(City city) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(city, "city");
    }
    public int insertOfId(String id) {
        City city = new City();
        city.setId(id);
        return insert(city);
    }
    public int insertOfCode(String code) {
        City city = new City();
        city.setCode(code);
        return insert(city);
    }
    public int insertOfName(String name) {
        City city = new City();
        city.setName(name);
        return insert(city);
    }
    public int insertOfProvincecode(String provincecode) {
        City city = new City();
        city.setProvincecode(provincecode);
        return insert(city);
    }
    public int insertOfIdAndCode(String id, String code) {
        City city = new City();
        city.setId(id);
        city.setCode(code);
        return insert(city);
    }
    public int insertOfIdAndName(String id, String name) {
        City city = new City();
        city.setId(id);
        city.setName(name);
        return insert(city);
    }
    public int insertOfIdAndProvincecode(String id, String provincecode) {
        City city = new City();
        city.setId(id);
        city.setProvincecode(provincecode);
        return insert(city);
    }
    public int insertOfCodeAndName(String code, String name) {
        City city = new City();
        city.setCode(code);
        city.setName(name);
        return insert(city);
    }
    public int insertOfCodeAndProvincecode(String code, String provincecode) {
        City city = new City();
        city.setCode(code);
        city.setProvincecode(provincecode);
        return insert(city);
    }
    public int insertOfNameAndProvincecode(String name, String provincecode) {
        City city = new City();
        city.setName(name);
        city.setProvincecode(provincecode);
        return insert(city);
    }
    public City getCity(City city) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(city, "city");
    }
    public City getCityOfId(String id) {
        City city = new City();
        city.setId(id);
        return getCity(city);
    }
    public City getCityOfCode(String code) {
        City city = new City();
        city.setCode(code);
        return getCity(city);
    }
    public City getCityOfName(String name) {
        City city = new City();
        city.setName(name);
        return getCity(city);
    }
    public City getCityOfProvincecode(String provincecode) {
        City city = new City();
        city.setProvincecode(provincecode);
        return getCity(city);
    }
    public City getCityOfIdAndCode(String id, String code) {
        City city = new City();
        city.setId(id);
        city.setCode(code);
        return getCity(city);
    }
    public City getCityOfIdAndName(String id, String name) {
        City city = new City();
        city.setId(id);
        city.setName(name);
        return getCity(city);
    }
    public City getCityOfIdAndProvincecode(String id, String provincecode) {
        City city = new City();
        city.setId(id);
        city.setProvincecode(provincecode);
        return getCity(city);
    }
    public City getCityOfCodeAndName(String code, String name) {
        City city = new City();
        city.setCode(code);
        city.setName(name);
        return getCity(city);
    }
    public City getCityOfCodeAndProvincecode(String code, String provincecode) {
        City city = new City();
        city.setCode(code);
        city.setProvincecode(provincecode);
        return getCity(city);
    }
    public City getCityOfNameAndProvincecode(String name, String provincecode) {
        City city = new City();
        city.setName(name);
        city.setProvincecode(provincecode);
        return getCity(city);
    }
    public List<City> getCitys(City city) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(city, "city");
    }
    public List<City> getCitysOfId(String id) {
        City city = new City();
        city.setId(id);
        return getCitys(city);
    }
    public List<City> getCitysOfCode(String code) {
        City city = new City();
        city.setCode(code);
        return getCitys(city);
    }
    public List<City> getCitysOfName(String name) {
        City city = new City();
        city.setName(name);
        return getCitys(city);
    }
    public List<City> getCitysOfProvincecode(String provincecode) {
        City city = new City();
        city.setProvincecode(provincecode);
        return getCitys(city);
    }
    public List<City> getCitysOfIdAndCode(String id, String code) {
        City city = new City();
        city.setId(id);
        city.setCode(code);
        return getCitys(city);
    }
    public List<City> getCitysOfIdAndName(String id, String name) {
        City city = new City();
        city.setId(id);
        city.setName(name);
        return getCitys(city);
    }
    public List<City> getCitysOfIdAndProvincecode(String id, String provincecode) {
        City city = new City();
        city.setId(id);
        city.setProvincecode(provincecode);
        return getCitys(city);
    }
    public List<City> getCitysOfCodeAndName(String code, String name) {
        City city = new City();
        city.setCode(code);
        city.setName(name);
        return getCitys(city);
    }
    public List<City> getCitysOfCodeAndProvincecode(String code, String provincecode) {
        City city = new City();
        city.setCode(code);
        city.setProvincecode(provincecode);
        return getCitys(city);
    }
    public List<City> getCitysOfNameAndProvincecode(String name, String provincecode) {
        City city = new City();
        city.setName(name);
        city.setProvincecode(provincecode);
        return getCitys(city);
    }
}
