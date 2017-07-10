package com.zhoushiyu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhoushiyu.dao.UserDao;
import com.zhoushiyu.domain.User;

@Service
public class UserService {
	private UserDao userDao;
	
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
	}
}
