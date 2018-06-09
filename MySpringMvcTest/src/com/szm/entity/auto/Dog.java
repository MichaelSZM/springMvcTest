package com.szm.entity.auto;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Dog implements Serializable{
	
	@Value("È®¿Æ")
	private String kind;
	@Value("°¢»Æ")
	private String name;
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Dog [kind=" + kind + ", name=" + name + "]";
	}
	
	

}
