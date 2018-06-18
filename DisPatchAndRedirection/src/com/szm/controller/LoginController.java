package com.szm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.szm.entity.Student;

@Controller
@RequestMapping("/student")
public class LoginController {

	
	
	/**************************传入值*********************************/
	
	@RequestMapping("/login.do")
	public String login(HttpServletRequest req){
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		System.out.println("id="+id+",name="+name);
		return "login";
	}
	
	@RequestMapping("/login1.do")
	public String login1(String id,@RequestParam("userName")String name){
		System.out.println("id="+id+",name="+name);
		return "login";
	}
	
	@RequestMapping("/login2.do")
	public String login2(Student s){
		System.out.println("id="+s.getId()+",name="+s.getName());
		return "login";
	}
	
	
	/*******************************传出值***************************************/
	
	//----1 使用ModelAndView 对象
	
	@RequestMapping("/login3.do")
	public ModelAndView login3(Student s){
		System.out.println("id="+s.getId()+",name="+s.getName());
		Map<String,Object> map = new HashMap();
		map.put("id", s.getId());
		map.put("name", s.getName());
		map.put("status", "sucess");
		return new ModelAndView("hello",map);
	}
	
	
	// -------2 使用ModelMap对象-------SpringMVC传出String值，一般用这种方式

	
	@RequestMapping("/login4.do")
	public String login4(Student s,ModelMap modelMap ){
		System.out.println("id="+s.getId()+",name="+s.getName());
		modelMap.put("id", s.getId());
		modelMap.put("name", s.getName());
		modelMap.put("status", "sucess");
		return "hello";
	}
	

	// ----ModelAttribute
	
	@RequestMapping("/login5.do")
	public String login5(@ModelAttribute Student s){
		System.out.println("id="+s.getId()+",name="+s.getName());
		return "hello";
	}
	
	
	// -------使用HttpServletRequest方式传值 
	
	@RequestMapping("/login6.do")
	public String login6(Student s,HttpServletRequest req){
		System.out.println("id="+s.getId()+",name="+s.getName());
		req.setAttribute("id", s.getId());
		req.setAttribute("name",s.getName());
		return "hello";
	}
	
	
	// -------使用HttpSession方式传值 
	
	@RequestMapping("/login7.do")
	public String login7(Student s,HttpSession sesssion){
		System.out.println("id="+s.getId()+",name="+s.getName());
		sesssion.setAttribute("id", s.getId());
		sesssion.setAttribute("name",s.getName());
		return "hello";
	}
	
	
}
