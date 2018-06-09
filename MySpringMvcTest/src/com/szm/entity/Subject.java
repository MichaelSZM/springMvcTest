package com.szm.entity;

import java.io.Serializable;
import java.util.List;

public class Subject implements Serializable{
	
	private List<String> subjects;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Subject [subjects=" + subjects + "]";
	}
	
	

}
