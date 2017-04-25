package com.szl.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szl.springboot.entity.User;
import com.szl.springboot.mapper.UserMapper;
@Service
public class UserService implements com.szl.springboot.service.UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User queryUserById(int id) {
		return userMapper.queryUserById(id);
	}

}
