package com.szm.entity;

import java.io.Serializable;

public class A implements Serializable{
	
	private String user;

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "A [user=" + user + "]";
	}

	
	

}
