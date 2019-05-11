package com.springboot.first.service.impl;

import com.springboot.first.domain.User;
import com.springboot.first.mapper.UserMapper;
import com.springboot.first.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jianyuan.wei@hand-china.com
 * on 2019/5/11 16:56.
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;
    /**
     * 查询用户列表信息
     *
     * @return 用户列表
     */
    @Override
    public List<User> queryUser() {
        return userMapper.queryUser();
    }
}
