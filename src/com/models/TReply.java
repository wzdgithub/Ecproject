package com.models;

public class TReply {
    private Integer id;

    private Integer replyId;

    private Integer replyedId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getReplyedId() {
        return replyedId;
    }

    public void setReplyedId(Integer replyedId) {
        this.replyedId = replyedId;
    }
}