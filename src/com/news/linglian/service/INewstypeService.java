package com.news.linglian.service;

import java.util.List;

import com.news.linglian.entity.Newstype;

public interface INewstypeService {
    public int update(Newstype newstype, Newstype keyNewstype);
    public int updateOfNewsTypeId(Newstype newstype, String newsTypeId);
    public int updateOfName(Newstype newstype, String name);
    public int updateOfBody(Newstype newstype, String body);
    public int updateOfNewsTypeIdAndName(Newstype newstype, String newsTypeId, String name);
    public int updateOfNewsTypeIdAndBody(Newstype newstype, String newsTypeId, String body);
    public int updateOfNameAndBody(Newstype newstype, String name, String body);
    public int remove(Newstype newstype);
    public int removeOfNewsTypeId(String newsTypeId);
    public int removeOfName(String name);
    public int removeOfBody(String body);
    public int removeOfNewsTypeIdAndName(String newsTypeId, String name);
    public int removeOfNewsTypeIdAndBody(String newsTypeId, String body);
    public int removeOfNameAndBody(String name, String body);
    public int insert(Newstype newstype);
    public int insertOfNewsTypeId(String newsTypeId);
    public int insertOfName(String name);
    public int insertOfBody(String body);
    public int insertOfNewsTypeIdAndName(String newsTypeId, String name);
    public int insertOfNewsTypeIdAndBody(String newsTypeId, String body);
    public int insertOfNameAndBody(String name, String body);
    public Newstype getNewstype(Newstype newstype);
    public Newstype getNewstypeOfNewsTypeId(String newsTypeId);
    public Newstype getNewstypeOfName(String name);
    public Newstype getNewstypeOfBody(String body);
    public Newstype getNewstypeOfNewsTypeIdAndName(String newsTypeId, String name);
    public Newstype getNewstypeOfNewsTypeIdAndBody(String newsTypeId, String body);
    public Newstype getNewstypeOfNameAndBody(String name, String body);
    public List<Newstype> getNewstypes(Newstype newstype);
    public List<Newstype> getNewstypesOfNewsTypeId(String newsTypeId);
    public List<Newstype> getNewstypesOfName(String name);
    public List<Newstype> getNewstypesOfBody(String body);
    public List<Newstype> getNewstypesOfNewsTypeIdAndName(String newsTypeId, String name);
    public List<Newstype> getNewstypesOfNewsTypeIdAndBody(String newsTypeId, String body);
    public List<Newstype> getNewstypesOfNameAndBody(String name, String body);
}
