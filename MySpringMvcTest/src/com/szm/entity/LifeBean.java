package com.szm.entity;

import java.io.Serializable;

public class LifeBean implements Serializable{

	public LifeBean(){
		System.out.println("�ұ�������");
	}
	
	public void init(){
		System.out.println("�ұ���ʼ����");
	}
	
	
	public void execute(){
		System.out.println("�ұ�ִ����");
	}
	
	
	public void destroy(){
		System.out.println("�ұ�������");
	}
	
}
