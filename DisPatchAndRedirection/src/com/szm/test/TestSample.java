package com.szm.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.szm.dao.TeacherDao;
import com.szm.dao.TeacherDaoMySqlImpl;
import com.szm.entity.Teacher;

public class TestSample {

	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		TeacherDao teacherDao = ac.getBean("teacherDaoMySqlImpl", TeacherDaoMySqlImpl.class);
		teacherDao.save(new Teacher(4,"szm","szm"));
	}
	
}
