package com.szm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/di")// ��Ӧһ��Ŀ¼
public class HelloController {

	@RequestMapping("/hello.do")// ����Ŀ¼
	public ModelAndView hello()  {
		// TODO Auto-generated method stub
		// ��Ӧjspҳ������
		return new ModelAndView("hello");
	}

}
