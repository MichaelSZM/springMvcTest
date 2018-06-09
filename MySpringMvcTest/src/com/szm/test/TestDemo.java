package com.szm.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.szm.entity.A;
import com.szm.entity.Book;
import com.szm.entity.Message;
import com.szm.entity.School;
import com.szm.entity.Student;
import com.szm.entity.Subject;
import com.szm.entity.Teacher;
import com.szm.entity.auto.ScanTestBean;

public class TestDemo {
	
	@Test
	public void test(){
		String str = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(str);
		/**
		 * 控制反转，将一个对象的创建和销毁交给spring容器管理
		 */
		Student stu = ac.getBean("student", Student.class);
		
		Book book = ac.getBean("book", Book.class);
		System.out.println(book.getName());
		
		Teacher teacher = ac.getBean("teacher", Teacher.class);
		System.out.println(teacher.toString());
		
		System.out.println(stu);
		
		School school = ac.getBean("school", School.class);
		System.out.println(school.toString());
		
		Message message = ac.getBean("message", Message.class);
		System.out.println(message.toString());
		
		Subject subjecct = ac.getBean("subject", Subject.class);
		System.out.println(subjecct.toString());
		
		A a = ac.getBean("aa", A.class);
		System.out.println(a.toString());
		
//		ScanTestBean sb = ac.getBean("scanTestBean", ScanTestBean.class);
		ScanTestBean sb = ac.getBean("stb", ScanTestBean.class);
		System.out.println(sb.toString());
		
		
	}

}
