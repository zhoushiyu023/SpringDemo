package com.zhoushiyu.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.zhoushiyu.domain.User;

/**
 * 
 * @author zhoushiyu
 *
 */

/*
 * ʹ��mybatis��spring���Ϻ�Ͳ���ҪMapper��ʵ���ֻ࣬��Ҫ��ھͺ���
 */

public interface UserMapper {
    /**
     * ��ȡ�û���Ϣ
     * @param userName
     * @param userPassword
     * @return
     */
    User getUserMsg(@Param("userName") String userName);
    
    /**
     * �����û�
     * @param user
     * @return
     */
    int addUser(@Param("userName") String userName, @Param("userPassword")String userPassword);
    
    /**
     * ɾ���û�
     * @param user
     * @return
     */
    int deleteUser(@Param("user") User user);
    
}
