package com.szm.entity;

import java.io.Serializable;

public class School implements Serializable{

	private String name;
	private Student student;
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", student=" + student + "]";
	}
	
	
	
}
