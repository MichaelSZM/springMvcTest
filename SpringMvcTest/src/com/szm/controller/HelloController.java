package com.szm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	
	/**
	 * ModelAndView 返回我们请求的视图和数据
	 * 
	 */
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		//login 对应jsp的名字
		return new ModelAndView("login");
	}
	
	

}
