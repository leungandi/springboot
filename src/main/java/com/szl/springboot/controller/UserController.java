package com.szl.springboot.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.szl.springboot.entity.User;
import com.szl.springboot.service.impl.UserService;

/**
 * user controller
 * @author SongZhangLiang
 * @date 2017年4月25日 上午11:48:23
 */
@Controller
@RequestMapping(value ="user")
public class UserController {
	
	protected static final Logger log = Logger.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="queryUserById")
	@ResponseBody
	public String queryUserById(){
		log.info("log info...");
		return userService.queryUserById(1).toString();
	}
}
