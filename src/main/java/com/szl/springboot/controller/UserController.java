package com.szl.springboot.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.szl.springboot.entity.User;
import com.szl.springboot.service.UserService;

/**
 * 模拟查询用户
 * @author SongZhangLiang
 * @date 2017年4月25日 上午11:48:23
 */
@RestController
@RequestMapping(value ="user",produces="application/json; charset=UTF-8")
public class UserController {
	
	protected static final Logger log = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="queryUser")
	public String queryUser(){
		log.info("模拟查询用户...");
		List<User> user = userService.queryUser();
		if (null == user) {
			return "用户不存在";
		}
		return user.toString();
	}
	
	@RequestMapping(value="queryUserById")
	public String queryUserById(){
		log.info("模拟查询用户...");
		User user = userService.queryUserById(1);
		if (null == user) {
			return "用户不存在";
		}
		return user.toString();
	}
}
