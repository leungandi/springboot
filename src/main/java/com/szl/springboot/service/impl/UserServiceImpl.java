package com.szl.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szl.springboot.entity.User;
import com.szl.springboot.mapper.UserMapper;
import com.szl.springboot.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User queryUserById(int id) {
		return userMapper.queryUserById(id);
	}

}
