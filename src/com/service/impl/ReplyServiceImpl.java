package com.service.impl;

import com.mapper.TReplyMapper;
import com.service.ReplyService;

public class ReplyServiceImpl implements ReplyService{
    private TReplyMapper replyMapper;

    public TReplyMapper getReplyMapper() {
        return replyMapper;
    }

    public void setReplyMapper(TReplyMapper replyMapper) {
        this.replyMapper = replyMapper;
    }
}
