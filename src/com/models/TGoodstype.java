package com.models;

public class TGoodstype {
    private Integer id;

    private Integer goodsId;

    private String goodsType1;

    private String goodsType2;

    private String goodsType3;

    private String goodsType4;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsType1() {
        return goodsType1;
    }

    public void setGoodsType1(String goodsType1) {
        this.goodsType1 = goodsType1 == null ? null : goodsType1.trim();
    }

    public String getGoodsType2() {
        return goodsType2;
    }

    public void setGoodsType2(String goodsType2) {
        this.goodsType2 = goodsType2 == null ? null : goodsType2.trim();
    }

    public String getGoodsType3() {
        return goodsType3;
    }

    public void setGoodsType3(String goodsType3) {
        this.goodsType3 = goodsType3 == null ? null : goodsType3.trim();
    }

    public String getGoodsType4() {
        return goodsType4;
    }

    public void setGoodsType4(String goodsType4) {
        this.goodsType4 = goodsType4 == null ? null : goodsType4.trim();
    }
}