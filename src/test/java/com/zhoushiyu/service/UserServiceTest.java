package com.zhoushiyu.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.zhoushiyu.dao.BookDao;
import com.zhoushiyu.domain.User;


@ContextConfiguration("classpath*:zhoushiyu-context.xml")//Æô¶¯SpringÈÝÆ÷
public class UserServiceTest extends AbstractJUnit4SpringContextTests {
	private UserService userService;
	private User user;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
		
	}
	
	@Test
	public void getUserMsg() {
		
		User user = new User();
		user.setUserName("zhoushiyu");
		if(userService.addUser(user)) {
			System.out.print(true);
		}
		
		//bookDao.add(); 
		//assert(bookDao==null);
	}
	
}
 