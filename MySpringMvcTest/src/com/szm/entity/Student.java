package com.szm.entity;

import java.io.Serializable;

/**
 * javaBean  ��Ҫ��ѭһ���Ĺ淶
 * �� Ҫʵ��Serializable
 * ���޲ι��캯��
 * �� get set ����
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
