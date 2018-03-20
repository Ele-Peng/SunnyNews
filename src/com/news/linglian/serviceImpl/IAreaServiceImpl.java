package com.news.linglian.serviceImpl;

import java.util.List;

import com.news.linglian.entity.Area;

import com.news.linglian.dao.IAreaDao;
import com.news.linglian.daoImpl.IAreaDaoImpl;
import com.news.linglian.service.IAreaService;

public class IAreaServiceImpl implements IAreaService {
	IAreaDao dao = null;

	public IAreaServiceImpl() {
		dao = new IAreaDaoImpl();
	}
    public int update(Area area, Area keyArea) {
        return dao.update(area, keyArea);
    }
    public int updateOfId(Area area, String id) {
        return dao.updateOfId(area, id);
    }
    public int updateOfCode(Area area, String code) {
        return dao.updateOfCode(area, code);
    }
    public int updateOfName(Area area, String name) {
        return dao.updateOfName(area, name);
    }
    public int updateOfCitycode(Area area, String citycode) {
        return dao.updateOfCitycode(area, citycode);
    }
    public int updateOfIdAndCode(Area area, String id, String code) {
        return dao.updateOfIdAndCode(area, id, code);
    }
    public int updateOfIdAndName(Area area, String id, String name) {
        return dao.updateOfIdAndName(area, id, name);
    }
    public int updateOfIdAndCitycode(Area area, String id, String citycode) {
        return dao.updateOfIdAndCitycode(area, id, citycode);
    }
    public int updateOfCodeAndName(Area area, String code, String name) {
        return dao.updateOfCodeAndName(area, code, name);
    }
    public int updateOfCodeAndCitycode(Area area, String code, String citycode) {
        return dao.updateOfCodeAndCitycode(area, code, citycode);
    }
    public int updateOfNameAndCitycode(Area area, String name, String citycode) {
        return dao.updateOfNameAndCitycode(area, name, citycode);
    }
    public int remove(Area area) {
        return dao.remove(area);
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
    public int removeOfCitycode(String citycode) {
        return dao.removeOfCitycode(citycode);
    }
    public int removeOfIdAndCode(String id, String code) {
        return dao.removeOfIdAndCode(id, code);
    }
    public int removeOfIdAndName(String id, String name) {
        return dao.removeOfIdAndName(id, name);
    }
    public int removeOfIdAndCitycode(String id, String citycode) {
        return dao.removeOfIdAndCitycode(id, citycode);
    }
    public int removeOfCodeAndName(String code, String name) {
        return dao.removeOfCodeAndName(code, name);
    }
    public int removeOfCodeAndCitycode(String code, String citycode) {
        return dao.removeOfCodeAndCitycode(code, citycode);
    }
    public int removeOfNameAndCitycode(String name, String citycode) {
        return dao.removeOfNameAndCitycode(name, citycode);
    }
    public int insert(Area area) {
        return dao.insert(area);
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
    public int insertOfCitycode(String citycode) {
        return dao.insertOfCitycode(citycode);
    }
    public int insertOfIdAndCode(String id, String code) {
        return dao.insertOfIdAndCode(id, code);
    }
    public int insertOfIdAndName(String id, String name) {
        return dao.insertOfIdAndName(id, name);
    }
    public int insertOfIdAndCitycode(String id, String citycode) {
        return dao.insertOfIdAndCitycode(id, citycode);
    }
    public int insertOfCodeAndName(String code, String name) {
        return dao.insertOfCodeAndName(code, name);
    }
    public int insertOfCodeAndCitycode(String code, String citycode) {
        return dao.insertOfCodeAndCitycode(code, citycode);
    }
    public int insertOfNameAndCitycode(String name, String citycode) {
        return dao.insertOfNameAndCitycode(name, citycode);
    }
    public Area getArea(Area area) {
        return dao.getArea(area);
    }
    public Area getAreaOfId(String id) {
        return dao.getAreaOfId(id);
    }
    public Area getAreaOfCode(String code) {
        return dao.getAreaOfCode(code);
    }
    public Area getAreaOfName(String name) {
        return dao.getAreaOfName(name);
    }
    public Area getAreaOfCitycode(String citycode) {
        return dao.getAreaOfCitycode(citycode);
    }
    public Area getAreaOfIdAndCode(String id, String code) {
        return dao.getAreaOfIdAndCode(id, code);
    }
    public Area getAreaOfIdAndName(String id, String name) {
        return dao.getAreaOfIdAndName(id, name);
    }
    public Area getAreaOfIdAndCitycode(String id, String citycode) {
        return dao.getAreaOfIdAndCitycode(id, citycode);
    }
    public Area getAreaOfCodeAndName(String code, String name) {
        return dao.getAreaOfCodeAndName(code, name);
    }
    public Area getAreaOfCodeAndCitycode(String code, String citycode) {
        return dao.getAreaOfCodeAndCitycode(code, citycode);
    }
    public Area getAreaOfNameAndCitycode(String name, String citycode) {
        return dao.getAreaOfNameAndCitycode(name, citycode);
    }
    public List<Area> getAreas(Area area) {
        return dao.getAreas(area);
    }
    public List<Area> getAreasOfId(String id) {
        return dao.getAreasOfId(id);
    }
    public List<Area> getAreasOfCode(String code) {
        return dao.getAreasOfCode(code);
    }
    public List<Area> getAreasOfName(String name) {
        return dao.getAreasOfName(name);
    }
    public List<Area> getAreasOfCitycode(String citycode) {
        return dao.getAreasOfCitycode(citycode);
    }
    public List<Area> getAreasOfIdAndCode(String id, String code) {
        return dao.getAreasOfIdAndCode(id, code);
    }
    public List<Area> getAreasOfIdAndName(String id, String name) {
        return dao.getAreasOfIdAndName(id, name);
    }
    public List<Area> getAreasOfIdAndCitycode(String id, String citycode) {
        return dao.getAreasOfIdAndCitycode(id, citycode);
    }
    public List<Area> getAreasOfCodeAndName(String code, String name) {
        return dao.getAreasOfCodeAndName(code, name);
    }
    public List<Area> getAreasOfCodeAndCitycode(String code, String citycode) {
        return dao.getAreasOfCodeAndCitycode(code, citycode);
    }
    public List<Area> getAreasOfNameAndCitycode(String name, String citycode) {
        return dao.getAreasOfNameAndCitycode(name, citycode);
    }
}
