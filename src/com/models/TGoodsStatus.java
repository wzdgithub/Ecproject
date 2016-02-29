package com.models;

public class TGoodsStatus {
    private Integer id;

    private String sellStatus;

    private Integer goodsCapacity;

    private Integer goodsCount;

    private Integer goodsId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSellStatus() {
        return sellStatus;
    }

    public void setSellStatus(String sellStatus) {
        this.sellStatus = sellStatus == null ? null : sellStatus.trim();
    }

    public Integer getGoodsCapacity() {
        return goodsCapacity;
    }

    public void setGoodsCapacity(Integer goodsCapacity) {
        this.goodsCapacity = goodsCapacity;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}