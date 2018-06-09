package com.szm.entity;

import java.io.Serializable;

/**
 * javaBean  需要遵循一定的规范
 * ① 要实现Serializable
 * ②无参构造函数
 * ③ get set 方法
 * @author 123
 *
 */
public class Student implements Serializable{

	private String name;
	private String age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
