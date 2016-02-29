package com.models;

import java.util.Date;

public class TAdvertisement {
    private Integer id;

    private String advContent;

    private Double advCost;

    private String advBiddingState;

    private Date advActiveTime;

    private String advState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdvContent() {
        return advContent;
    }

    public void setAdvContent(String advContent) {
        this.advContent = advContent == null ? null : advContent.trim();
    }

    public Double getAdvCost() {
        return advCost;
    }

    public void setAdvCost(Double advCost) {
        this.advCost = advCost;
    }

    public String getAdvBiddingState() {
        return advBiddingState;
    }

    public void setAdvBiddingState(String advBiddingState) {
        this.advBiddingState = advBiddingState == null ? null : advBiddingState.trim();
    }

    public Date getAdvActiveTime() {
        return advActiveTime;
    }

    public void setAdvActiveTime(Date advActiveTime) {
        this.advActiveTime = advActiveTime;
    }

    public String getAdvState() {
        return advState;
    }

    public void setAdvState(String advState) {
        this.advState = advState == null ? null : advState.trim();
    }
}