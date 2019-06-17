package com.sc.hehang;

import java.util.List;

public class AreaModel {
    /*
    * 数据层级 省级 为0级 精确到委员会 4
    * */
    private  Integer stage;
    /*
    * 行政区划编码
    * */
    private  String code;
    /*
     * 父级行政区划编码
     * */
    private  String parentcode;
    /*
     * 行政区划名称
     * */
    private  String name;
    /*
     * 行政区划孩子
     * */
    private List<AreaModel> children;

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentcode() {
        return parentcode;
    }

    public void setParentcode(String parentcode) {
        this.parentcode = parentcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AreaModel> getChildren() {
        return children;
    }

    public void setChildren(List<AreaModel> children) {
        this.children = children;
    }
}
