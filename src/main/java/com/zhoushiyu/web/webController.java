package com.zhoushiyu.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhoushiyu.domain.User;
import com.zhoushiyu.service.UserService;
@Controller
public class webController {
	private UserService userService;
	@Autowired
	public void setUserService(UserService userservice) {
		this.userService = userservice;
	}
	@RequestMapping(value = "/user.html")
	public String userPage() {
		return "userPage";
	}
	@RequestMapping(value = "/userMsg.html")
	public ModelAndView getUserMsg(HttpServletRequest request, String userName) {
		User user = userService.getUserMsg(userName);
		if(user.getUserID() <= 0) {
			return new ModelAndView("userPage","error","无此用户");
		} else {
			request.getSession().setAttribute("user", user);
			return new ModelAndView("userPage");
		}
		
		
	}
}
