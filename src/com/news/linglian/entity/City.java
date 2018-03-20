package com.news.linglian.entity;

public class City {
    private String id;
    private String code;
    private String name;
    private String provincecode;

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

    public String getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode;
    }

    @Override
    public String toString() {
        return "City [id=" + id + ", code=" + code + ", name=" + name + ", provincecode=" + provincecode + ", ]";
    }

}
