package com.zhoushiyu.dao;

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
    User getUserMsg(String userName, String userPassword);
    
    /**
     * �����û�
     * @param user
     * @return
     */
    int addUser(User user);
    
    /**
     * ɾ���û�
     * @param user
     * @return
     */
    int deleteUser(User user);
    
}
