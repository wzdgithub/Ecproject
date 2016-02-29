package com.models;

public class TUsedGoods {
    private Integer id;

    private String usedGoodsName;

    private String usedGoodsInstruct;

    private Integer userId;

    private String checkState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsedGoodsName() {
        return usedGoodsName;
    }

    public void setUsedGoodsName(String usedGoodsName) {
        this.usedGoodsName = usedGoodsName == null ? null : usedGoodsName.trim();
    }

    public String getUsedGoodsInstruct() {
        return usedGoodsInstruct;
    }

    public void setUsedGoodsInstruct(String usedGoodsInstruct) {
        this.usedGoodsInstruct = usedGoodsInstruct == null ? null : usedGoodsInstruct.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState == null ? null : checkState.trim();
    }
}