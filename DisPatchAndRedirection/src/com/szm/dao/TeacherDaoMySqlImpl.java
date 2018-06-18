package com.szm.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.szm.entity.Teacher;
@Repository
public class TeacherDaoMySqlImpl implements TeacherDao{

	@Resource
	private JdbcTemplate  jdbcTemplate;
	
	public List<Teacher> findAll() {
		String sql = "select * from Teacher";
		return jdbcTemplate.query(sql, new TeacherRowMapper());
	}

	public Teacher findById(int id) {
		String sql = "select * from Teaccher where id=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{id}, new TeacherRowMapper());
	}

	public void save(Teacher t) {
		String sql = "insert into Teacher values(?,?,?)";
		Object[] param={t.getId(),t.getName(),t.getPassword()};
		jdbcTemplate.update(sql, param);
	}

	public void update(Teacher t) {
		String sql = "update Teacher set naem=?,password=?, where id=?";
		Object[] param={t.getName(),t.getPassword(),t.getId()};
		jdbcTemplate.update(sql, param);
		
	}

	public void delete(int id) {
		String sql = "delete form Teacher where id=?";
		jdbcTemplate.update(sql, id);
	}
	
	
	class TeacherRowMapper implements RowMapper<Teacher>{

		public Teacher mapRow(ResultSet resultSet, int arg1) throws SQLException {
			Teacher t = new Teacher();
			t.setId(resultSet.getInt("id"));
			t.setName(resultSet.getString("name"));
			t.setPassword(resultSet.getString("password"));
			return t;
		}
		
	}
	

}
