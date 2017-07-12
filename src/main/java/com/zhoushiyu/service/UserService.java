package com.zhoushiyu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.zhoushiyu.dao.UserDao;
import com.zhoushiyu.dao.UserMapper;
import com.zhoushiyu.domain.User;

@Service
public class UserService {
	/*private UserDao userDao;
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public User getUserMsg(String userName) {
		User user = userDao.getUserMsg(userName);
		return user;
	}
	
	public boolean addUser(User user) {
		return userDao.addUser(user) > 0;
	}
	
	public boolean deleteUser(User user) {
		return userDao.delete(user) > 0;
	}*/
    
    
   /*
    *  π”√mybatis
    */
    @Autowired
    private UserMapper userMapper;
    
    public User getUserMsg(String userName) {
        User user = userMapper.getUserMsg(userName);
        if(user != null && user.getUserID() != -1) {
            return user;
        }
        return null;
    }
    
    public int addUser(String userName, String userPassword) {
        int userID;
        try {
            userID = userMapper.addUser(userName, userPassword); 
        } catch (DataIntegrityViolationException e) {
            userID = -1;
        }
        return userID;
    }
    
    public int deleteUser(User user) {
        int i = userMapper.deleteUser(user);
        return i;
    }
    
}
