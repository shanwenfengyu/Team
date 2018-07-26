package com.lanou.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lanou.dao.UserMapper;

public class MyBatisTest {
	
	@Test
	public void test01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		UserMapper mapper = (UserMapper)ac.getBean("userMapper");
		System.out.println(mapper.selectAll());
	}
}
