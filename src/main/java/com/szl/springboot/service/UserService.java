package com.szl.springboot.service;

import java.util.List;

import com.szl.springboot.entity.User;

public interface UserService {
	
	public User queryUserById(int id);

	public List<User> queryUser();

	public int delUser(int parseInt);

	public int insertUser(User user);

}
