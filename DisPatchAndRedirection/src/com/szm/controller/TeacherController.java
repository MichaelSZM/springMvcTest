package com.szm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.szm.dao.TeacherDao;
import com.szm.entity.Teacher;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
	
	@Resource(name = "teacherDaoMySqlImpl")
	private TeacherDao teacherDaoMySqlImpl;
	
	@RequestMapping("/tolist.do")
	public String toList(ModelMap modelMap){
		List<Teacher> list = teacherDaoMySqlImpl.findAll();
		modelMap.put("list",list);
		return "list";
		
	}
	
	
	@RequestMapping("/toAdd.do")
	public String toAdd(Teacher t){
		return "add";
	}
	
	@RequestMapping("/add.do")
	public String add(Teacher t){
		teacherDaoMySqlImpl.save(t);
		return "redirect:toList.do";
	}
	
	
	@RequestMapping("/delete.do")
	public String delete(int id){
		teacherDaoMySqlImpl.delete(id);
		return "redirect:toList.do";
	}
	
	@RequestMapping("/toUpdate.do")
	public String toUpdate(int id,ModelMap modelMap){
		Teacher t = teacherDaoMySqlImpl.findById(id);
		modelMap.put("t", t);
		return "update";
		
	}
	
	@RequestMapping("/update.do")
	public String update(Teacher t){
		teacherDaoMySqlImpl.update(t);
		return "redirect:toList.do";
	}

}
