package com.springboot.first.mapper;

import com.springboot.first.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jianyuan.wei@hand-china.com
 * on 2019/5/11 16:52.
 */
@Mapper
@Repository
public interface UserMapper {

    /**
     * 查询用户信息列表
     * @return 用户信息列表
     */
    List<User> queryUser();
}
