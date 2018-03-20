package com.news.linglian.daoImpl;

import java.util.List;

import com.news.linglian.entity.Area;

import com.news.linglian.dao.IAreaDao;
import db.DBMan;

public class IAreaDaoImpl implements IAreaDao {
    public int update(Area area, Area keyArea) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(area, keyArea, "area");
    }
    public int updateOfId(Area area, String id) {
        Area kArea = new Area();
        kArea.setId(id);
        return update(area, kArea);
    }
    public int updateOfCode(Area area, String code) {
        Area kArea = new Area();
        kArea.setCode(code);
        return update(area, kArea);
    }
    public int updateOfName(Area area, String name) {
        Area kArea = new Area();
        kArea.setName(name);
        return update(area, kArea);
    }
    public int updateOfCitycode(Area area, String citycode) {
        Area kArea = new Area();
        kArea.setCitycode(citycode);
        return update(area, kArea);
    }
    public int updateOfIdAndCode(Area area, String id, String code) {
        Area kArea = new Area();
        kArea.setId(id);
        kArea.setCode(code);
        return update(area, kArea);
    }
    public int updateOfIdAndName(Area area, String id, String name) {
        Area kArea = new Area();
        kArea.setId(id);
        kArea.setName(name);
        return update(area, kArea);
    }
    public int updateOfIdAndCitycode(Area area, String id, String citycode) {
        Area kArea = new Area();
        kArea.setId(id);
        kArea.setCitycode(citycode);
        return update(area, kArea);
    }
    public int updateOfCodeAndName(Area area, String code, String name) {
        Area kArea = new Area();
        kArea.setCode(code);
        kArea.setName(name);
        return update(area, kArea);
    }
    public int updateOfCodeAndCitycode(Area area, String code, String citycode) {
        Area kArea = new Area();
        kArea.setCode(code);
        kArea.setCitycode(citycode);
        return update(area, kArea);
    }
    public int updateOfNameAndCitycode(Area area, String name, String citycode) {
        Area kArea = new Area();
        kArea.setName(name);
        kArea.setCitycode(citycode);
        return update(area, kArea);
    }
    public int remove(Area area) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(area, "area");
    }
    public int removeOfId(String id) {
        Area area = new Area();
        area.setId(id);
        return remove(area);
    }
    public int removeOfCode(String code) {
        Area area = new Area();
        area.setCode(code);
        return remove(area);
    }
    public int removeOfName(String name) {
        Area area = new Area();
        area.setName(name);
        return remove(area);
    }
    public int removeOfCitycode(String citycode) {
        Area area = new Area();
        area.setCitycode(citycode);
        return remove(area);
    }
    public int removeOfIdAndCode(String id, String code) {
        Area area = new Area();
        area.setId(id);
        area.setCode(code);
        return remove(area);
    }
    public int removeOfIdAndName(String id, String name) {
        Area area = new Area();
        area.setId(id);
        area.setName(name);
        return remove(area);
    }
    public int removeOfIdAndCitycode(String id, String citycode) {
        Area area = new Area();
        area.setId(id);
        area.setCitycode(citycode);
        return remove(area);
    }
    public int removeOfCodeAndName(String code, String name) {
        Area area = new Area();
        area.setCode(code);
        area.setName(name);
        return remove(area);
    }
    public int removeOfCodeAndCitycode(String code, String citycode) {
        Area area = new Area();
        area.setCode(code);
        area.setCitycode(citycode);
        return remove(area);
    }
    public int removeOfNameAndCitycode(String name, String citycode) {
        Area area = new Area();
        area.setName(name);
        area.setCitycode(citycode);
        return remove(area);
    }
    public int insert(Area area) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(area, "area");
    }
    public int insertOfId(String id) {
        Area area = new Area();
        area.setId(id);
        return insert(area);
    }
    public int insertOfCode(String code) {
        Area area = new Area();
        area.setCode(code);
        return insert(area);
    }
    public int insertOfName(String name) {
        Area area = new Area();
        area.setName(name);
        return insert(area);
    }
    public int insertOfCitycode(String citycode) {
        Area area = new Area();
        area.setCitycode(citycode);
        return insert(area);
    }
    public int insertOfIdAndCode(String id, String code) {
        Area area = new Area();
        area.setId(id);
        area.setCode(code);
        return insert(area);
    }
    public int insertOfIdAndName(String id, String name) {
        Area area = new Area();
        area.setId(id);
        area.setName(name);
        return insert(area);
    }
    public int insertOfIdAndCitycode(String id, String citycode) {
        Area area = new Area();
        area.setId(id);
        area.setCitycode(citycode);
        return insert(area);
    }
    public int insertOfCodeAndName(String code, String name) {
        Area area = new Area();
        area.setCode(code);
        area.setName(name);
        return insert(area);
    }
    public int insertOfCodeAndCitycode(String code, String citycode) {
        Area area = new Area();
        area.setCode(code);
        area.setCitycode(citycode);
        return insert(area);
    }
    public int insertOfNameAndCitycode(String name, String citycode) {
        Area area = new Area();
        area.setName(name);
        area.setCitycode(citycode);
        return insert(area);
    }
    public Area getArea(Area area) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(area, "area");
    }
    public Area getAreaOfId(String id) {
        Area area = new Area();
        area.setId(id);
        return getArea(area);
    }
    public Area getAreaOfCode(String code) {
        Area area = new Area();
        area.setCode(code);
        return getArea(area);
    }
    public Area getAreaOfName(String name) {
        Area area = new Area();
        area.setName(name);
        return getArea(area);
    }
    public Area getAreaOfCitycode(String citycode) {
        Area area = new Area();
        area.setCitycode(citycode);
        return getArea(area);
    }
    public Area getAreaOfIdAndCode(String id, String code) {
        Area area = new Area();
        area.setId(id);
        area.setCode(code);
        return getArea(area);
    }
    public Area getAreaOfIdAndName(String id, String name) {
        Area area = new Area();
        area.setId(id);
        area.setName(name);
        return getArea(area);
    }
    public Area getAreaOfIdAndCitycode(String id, String citycode) {
        Area area = new Area();
        area.setId(id);
        area.setCitycode(citycode);
        return getArea(area);
    }
    public Area getAreaOfCodeAndName(String code, String name) {
        Area area = new Area();
        area.setCode(code);
        area.setName(name);
        return getArea(area);
    }
    public Area getAreaOfCodeAndCitycode(String code, String citycode) {
        Area area = new Area();
        area.setCode(code);
        area.setCitycode(citycode);
        return getArea(area);
    }
    public Area getAreaOfNameAndCitycode(String name, String citycode) {
        Area area = new Area();
        area.setName(name);
        area.setCitycode(citycode);
        return getArea(area);
    }
    public List<Area> getAreas(Area area) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(area, "area");
    }
    public List<Area> getAreasOfId(String id) {
        Area area = new Area();
        area.setId(id);
        return getAreas(area);
    }
    public List<Area> getAreasOfCode(String code) {
        Area area = new Area();
        area.setCode(code);
        return getAreas(area);
    }
    public List<Area> getAreasOfName(String name) {
        Area area = new Area();
        area.setName(name);
        return getAreas(area);
    }
    public List<Area> getAreasOfCitycode(String citycode) {
        Area area = new Area();
        area.setCitycode(citycode);
        return getAreas(area);
    }
    public List<Area> getAreasOfIdAndCode(String id, String code) {
        Area area = new Area();
        area.setId(id);
        area.setCode(code);
        return getAreas(area);
    }
    public List<Area> getAreasOfIdAndName(String id, String name) {
        Area area = new Area();
        area.setId(id);
        area.setName(name);
        return getAreas(area);
    }
    public List<Area> getAreasOfIdAndCitycode(String id, String citycode) {
        Area area = new Area();
        area.setId(id);
        area.setCitycode(citycode);
        return getAreas(area);
    }
    public List<Area> getAreasOfCodeAndName(String code, String name) {
        Area area = new Area();
        area.setCode(code);
        area.setName(name);
        return getAreas(area);
    }
    public List<Area> getAreasOfCodeAndCitycode(String code, String citycode) {
        Area area = new Area();
        area.setCode(code);
        area.setCitycode(citycode);
        return getAreas(area);
    }
    public List<Area> getAreasOfNameAndCitycode(String name, String citycode) {
        Area area = new Area();
        area.setName(name);
        area.setCitycode(citycode);
        return getAreas(area);
    }
}
