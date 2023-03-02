package com.qcby.hongyanfriendcircle.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qcby.hongyanfriendcircle.entity.Comment;

/**
 * @ProjectName: ppq
 * @Package: com.bwfw.ppq.service.impl
 * @ClassName: LoginService
 * @Author: zxh
 * @Description: 登录Service
 * @Date: 2021/12/28 22:44
 * @Version: 1.0
 */
public interface CommentService extends IService<Comment> {
    boolean insertOne(Comment comment,Long id);
}
