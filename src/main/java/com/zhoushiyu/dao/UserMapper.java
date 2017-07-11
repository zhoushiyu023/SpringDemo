package com.zhoushiyu.dao;

import org.springframework.stereotype.Repository;

import com.zhoushiyu.domain.User;

/**
 * 
 * @author zhoushiyu
 *
 */

/*
 * 使用mybatis与spring整合后就不需要Mapper的实现类，只需要借口就好了
 */

public interface UserMapper {
    /**
     * 获取用户信息
     * @param userName
     * @param userPassword
     * @return
     */
    User getUserMsg(String userName, String userPassword);
    
    /**
     * 新增用户
     * @param user
     * @return
     */
    int addUser(User user);
    
    /**
     * 删除用户
     * @param user
     * @return
     */
    int deleteUser(User user);
    
}
