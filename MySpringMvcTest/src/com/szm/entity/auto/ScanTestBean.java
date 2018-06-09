package com.szm.entity.auto;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 注解，类，可以被配置，并自动扫描
 * @author 123
 *
 */

@Component("stb")
@Scope("prototype")
public class ScanTestBean implements Serializable{

	@Value("23")
	private String id;
	@Value("szm")
	private String name;
	
	@Autowired
	private Dog dog;
	
	public ScanTestBean() {
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
	
	
	
	
	
	@Override
	public String toString() {
		return "ScanTestBean [id=" + id + ", name=" + name + ", dog=" + dog
				+ "]";
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	@PostConstruct
	public void init(){
		
	}
	
	@PreDestroy
	public void destory(){
		
	}
	
}
