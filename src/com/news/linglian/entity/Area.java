package com.news.linglian.entity;

public class Area {
    private String id;
    private String code;
    private String name;
    private String citycode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    @Override
    public String toString() {
        return "Area [id=" + id + ", code=" + code + ", name=" + name + ", citycode=" + citycode + ", ]";
    }

}
