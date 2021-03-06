package com.news.linglian.dao;

import java.util.List;

import com.news.linglian.entity.Area;

public interface IAreaDao {
    public int update(Area area, Area keyArea);
    public int updateOfId(Area area, String id);
    public int updateOfCode(Area area, String code);
    public int updateOfName(Area area, String name);
    public int updateOfCitycode(Area area, String citycode);
    public int updateOfIdAndCode(Area area, String id, String code);
    public int updateOfIdAndName(Area area, String id, String name);
    public int updateOfIdAndCitycode(Area area, String id, String citycode);
    public int updateOfCodeAndName(Area area, String code, String name);
    public int updateOfCodeAndCitycode(Area area, String code, String citycode);
    public int updateOfNameAndCitycode(Area area, String name, String citycode);
    public int remove(Area area);
    public int removeOfId(String id);
    public int removeOfCode(String code);
    public int removeOfName(String name);
    public int removeOfCitycode(String citycode);
    public int removeOfIdAndCode(String id, String code);
    public int removeOfIdAndName(String id, String name);
    public int removeOfIdAndCitycode(String id, String citycode);
    public int removeOfCodeAndName(String code, String name);
    public int removeOfCodeAndCitycode(String code, String citycode);
    public int removeOfNameAndCitycode(String name, String citycode);
    public int insert(Area area);
    public int insertOfId(String id);
    public int insertOfCode(String code);
    public int insertOfName(String name);
    public int insertOfCitycode(String citycode);
    public int insertOfIdAndCode(String id, String code);
    public int insertOfIdAndName(String id, String name);
    public int insertOfIdAndCitycode(String id, String citycode);
    public int insertOfCodeAndName(String code, String name);
    public int insertOfCodeAndCitycode(String code, String citycode);
    public int insertOfNameAndCitycode(String name, String citycode);
    public Area getArea(Area area);
    public Area getAreaOfId(String id);
    public Area getAreaOfCode(String code);
    public Area getAreaOfName(String name);
    public Area getAreaOfCitycode(String citycode);
    public Area getAreaOfIdAndCode(String id, String code);
    public Area getAreaOfIdAndName(String id, String name);
    public Area getAreaOfIdAndCitycode(String id, String citycode);
    public Area getAreaOfCodeAndName(String code, String name);
    public Area getAreaOfCodeAndCitycode(String code, String citycode);
    public Area getAreaOfNameAndCitycode(String name, String citycode);
    public List<Area> getAreas(Area area);
    public List<Area> getAreasOfId(String id);
    public List<Area> getAreasOfCode(String code);
    public List<Area> getAreasOfName(String name);
    public List<Area> getAreasOfCitycode(String citycode);
    public List<Area> getAreasOfIdAndCode(String id, String code);
    public List<Area> getAreasOfIdAndName(String id, String name);
    public List<Area> getAreasOfIdAndCitycode(String id, String citycode);
    public List<Area> getAreasOfCodeAndName(String code, String name);
    public List<Area> getAreasOfCodeAndCitycode(String code, String citycode);
    public List<Area> getAreasOfNameAndCitycode(String name, String citycode);
}
