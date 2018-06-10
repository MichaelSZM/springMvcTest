package com.szm.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	
	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext();
	}
	

}
