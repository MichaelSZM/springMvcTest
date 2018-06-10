package com.szm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/di")// 对应一级目录
public class HelloController {

	@RequestMapping("/hello.do")// 二级目录
	public ModelAndView hello()  {
		// TODO Auto-generated method stub
		// 对应jsp页面名字
		return new ModelAndView("hello");
	}

}
