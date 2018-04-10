package com.cjay.snipt.service.impl;

import com.cjay.snipt.dao.UserMapper;
import com.cjay.snipt.model.User;
import com.cjay.snipt.service.UserService;
import com.cjay.snipt.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/11.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
