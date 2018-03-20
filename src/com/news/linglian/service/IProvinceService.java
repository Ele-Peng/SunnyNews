package com.news.linglian.service;

import java.util.List;

import com.news.linglian.entity.Province;

public interface IProvinceService {
    public int update(Province province, Province keyProvince);
    public int updateOfId(Province province, String id);
    public int updateOfCode(Province province, String code);
    public int updateOfName(Province province, String name);
    public int updateOfIdAndCode(Province province, String id, String code);
    public int updateOfIdAndName(Province province, String id, String name);
    public int updateOfCodeAndName(Province province, String code, String name);
    public int remove(Province province);
    public int removeOfId(String id);
    public int removeOfCode(String code);
    public int removeOfName(String name);
    public int removeOfIdAndCode(String id, String code);
    public int removeOfIdAndName(String id, String name);
    public int removeOfCodeAndName(String code, String name);
    public int insert(Province province);
    public int insertOfId(String id);
    public int insertOfCode(String code);
    public int insertOfName(String name);
    public int insertOfIdAndCode(String id, String code);
    public int insertOfIdAndName(String id, String name);
    public int insertOfCodeAndName(String code, String name);
    public Province getProvince(Province province);
    public Province getProvinceOfId(String id);
    public Province getProvinceOfCode(String code);
    public Province getProvinceOfName(String name);
    public Province getProvinceOfIdAndCode(String id, String code);
    public Province getProvinceOfIdAndName(String id, String name);
    public Province getProvinceOfCodeAndName(String code, String name);
    public List<Province> getProvinces(Province province);
    public List<Province> getProvincesOfId(String id);
    public List<Province> getProvincesOfCode(String code);
    public List<Province> getProvincesOfName(String name);
    public List<Province> getProvincesOfIdAndCode(String id, String code);
    public List<Province> getProvincesOfIdAndName(String id, String name);
    public List<Province> getProvincesOfCodeAndName(String code, String name);
}
