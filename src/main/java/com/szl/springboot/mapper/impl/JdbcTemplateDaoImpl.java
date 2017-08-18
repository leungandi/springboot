package com.szl.springboot.mapper.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.szl.springboot.entity.User;
import com.szl.springboot.mapper.JdbcTemplateDao;

@Repository
public class JdbcTemplateDaoImpl implements JdbcTemplateDao {
	
	/**
	 * 注入spring的JdbcTemplate
	 * 
	 * 更多JdbcTemplate的操作
	 * 可以参考官方:https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/jdbc/core/JdbcTemplate.html
	 * 可以参考博客:http://ddyc.vip/2017/05/31/%E7%BC%96%E7%A8%8B/spring/%E7%AC%AC%E4%BA%94%E7%AF%87%E4%B9%8BSpring%20JDBC/
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<User> queryUser() {
		return jdbcTemplate.query("select * from t_users",new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				return user;
			}
		});
	}

	@Override
	public int insertUser(User user) {
		return jdbcTemplate.update("insert into `t_users`(`name`,`email`) values (?,?)", user.getName(),user.getEmail());
	}

	@Override
	public int delUser(int id) {
		return jdbcTemplate.update("DELETE FROM t_users where id=?",id);
	}

}
