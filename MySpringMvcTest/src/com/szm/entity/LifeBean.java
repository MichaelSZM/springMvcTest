package com.szm.entity;

import java.io.Serializable;

public class LifeBean implements Serializable{

	public LifeBean(){
		System.out.println("我被创建了");
	}
	
	public void init(){
		System.out.println("我被初始化了");
	}
	
	
	public void execute(){
		System.out.println("我被执行了");
	}
	
	
	public void destroy(){
		System.out.println("我被销毁了");
	}
	
}
