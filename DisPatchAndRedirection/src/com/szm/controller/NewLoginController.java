package com.szm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.szm.dao.StudentDao;
import com.szm.entity.Student;

@Controller
@RequestMapping("/student")
public class NewLoginController {

	@Resource
	private StudentDao stuDao;
	
	@RequestMapping("/loginNew.do")
	public String login(String name,String password,HttpSession session){
		Student stu = stuDao.login(name, password);
		if(null != stu){
			session.setAttribute("name", stu.getName());
			return "redirect:hello";
		}
		return "error";
		
	}
	
	
	public String list(ModelMap modelMap){
		List<Student> list = stuDao.list();
		modelMap.addAttribute("list", list);
		return "list";
		
	}
	
	
}
