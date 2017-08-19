package com.szl.springboot.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
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

	@Override
	public List<User> queryUser(Map<String, Object> params) {
		String pageNum = String.valueOf(params.get("pageIndex"));
		String pageSize = String.valueOf(params.get("pageSize"));
		if (!StringUtils.isEmpty(pageNum) && !StringUtils.isEmpty(pageSize)){
			PageHelper.startPage(Integer.valueOf(pageNum),Integer.valueOf(pageSize));
		}
		return userMapper.queryUser();
		
	}

	@Override
	public int delUser(int id) {
		return userMapper.delUser(id);
	}

	@Override
	public int insertUser(User user) {
		return userMapper.insertUser(user);
	}

}
