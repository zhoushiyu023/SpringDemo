package com.zhoushiyu.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhoushiyu.dao.BookDao;

public class Test {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("classpath*:zhoushiyu-context.xml");
		BookDao cal1 = factory.getBean("bookDao", BookDao.class); // ·½Ê½2
        System.out.println(cal1.add());
	}
}
