package com.service.impl;

import com.mapper.TCommentMapper;
import com.service.CommentService;

public class CommentServiceImpl implements CommentService{
    private TCommentMapper commentMapper;

    public TCommentMapper getCommentMapper() {
        return commentMapper;
    }

    public void setCommentMapper(TCommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }
}
