package com.szm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.szm.entity.Student;

@Component("studentDao")
public class StudentDao {
	
	@Resource(name = "ds")
	private DataSource dataSource;
	
	public Student login(String name,String password){
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			String sql = "select * from Student where name=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Student stu = new Student();
				stu.setId(rs.getString("id"));
				stu.setName(rs.getString("name"));
				stu.setPassWord(rs.getString("password"));
				if(password.equals(stu.getPassWord())){
					return stu;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
	}
	
	
	
	public List<Student> list(){
		Connection conn = null;
		List<Student> list = new ArrayList();
		try {
			conn = dataSource.getConnection();
			String sql = "select * from Student";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Student stu = new Student();
				stu.setId(rs.getString("id"));
				stu.setName(rs.getString("name"));
				stu.setPassWord(rs.getString("password"));
				list.add(stu);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
		
	}



	public DataSource getDataSource() {
		return dataSource;
	}



	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDao stuDao = ac.getBean("studentDao", StudentDao.class);
		System.out.println(stuDao.getDataSource());
	}
	
	

}
