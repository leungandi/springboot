package com.szl.springboot.mapper;

import java.util.List;

import com.szl.springboot.entity.User;

public interface JdbcTemplateDao {

	public List<User> queryUser();
	
	public int delUser(int id);

	public int insertUser(User user);
}
