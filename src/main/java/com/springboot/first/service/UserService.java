package com.springboot.first.service;

import com.springboot.first.domain.User;

import java.util.List;

/**
 * Created by jianyuan.wei@hand-china.com
 * on 2019/5/11 16:52.
 */
public interface UserService {

    /**
     * 查询用户列表信息
     * @return 用户列表
     */
    List<User>  queryUser();

}
