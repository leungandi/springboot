package com.szl.springboot.service;

import java.util.List;

import com.szl.springboot.entity.User;

public interface JdbcTemplateService {
	
	
	public List<User> queryUser();
	
	public int insertUser(User user);
	
	public int delUser(int id);

}
