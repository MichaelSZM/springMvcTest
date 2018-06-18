package com.szm.entity;

import java.io.Serializable;

public class Student implements Serializable{

	private String id;
	private String name;
	private String passWord;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", passWord="
				+ passWord + "]";
	}
	
	
	
	
	
}
