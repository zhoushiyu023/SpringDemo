package com.zhoushiyu.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.zhoushiyu.dao.BookDao;
import com.zhoushiyu.domain.User;


@ContextConfiguration(locations = {"classpath*:zhoushiyu-context.xml","classpath*:spring-mybatis.xml"})//Æô¶¯SpringÈÝÆ÷
public class UserServiceTest extends AbstractJUnit4SpringContextTests {
	private UserService userService;
	//private User user;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
		
	}
	
	@Test
	public void getUserMsg() {
		System.out.println(userService.getUserMsg("zhoushiyu", "123456"));
		/*User user = new User();
		user.setUserName("zhoushiyu");
		if(userService.addUser(user)) {
			System.out.print(true);
		}*/
		
		//bookDao.add(); 
		//assert(bookDao==null);
	}
	
}
 