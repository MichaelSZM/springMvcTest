package com.szm.entity;

import java.io.Serializable;

public class Teacher implements Serializable{

	private String name;
	private String subject;
	private Book book;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + ", book="
				+ book + "]";
	}
	
	
	
	
}
