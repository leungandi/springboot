package com.szl.springboot.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.szl.springboot.service.impl.UserServiceImpl;
import com.szl.springboot.util.BaseConfig;

/**
 * user controller
 * @author SongZhangLiang
 * @date 2017年4月25日 上午11:48:23
 */
@RestController
@RequestMapping(value = {"/user"})
public class UserController {
	protected static final Logger log = Logger.getLogger(UserController.class);
	
	@Autowired
	private BaseConfig baseConfig;
	@Autowired
	private UserServiceImpl userService;
	
	/**
	 * 根据用户ID查询用户
	 * @author SongZhangLiang
	 * @date 2017年8月16日 下午6:34:13
	 * @return
	 */
	@RequestMapping(value="queryUserById")
	public String queryUserById(){
		log.info("根据用户ID查询用户...");
		return userService.queryUserById(1).toString();
	}
	
	/**
	 * 读取系统配置参数
	 * @author SongZhangLiang
	 * @date 2017年8月16日 下午6:34:03
	 * @return
	 */
	@RequestMapping(value="querySystemConfig")
	public String querySystemConfig(){
		log.info("读取系统配置参数..."+baseConfig.toString());
		return "读取系统配置参数:"+baseConfig.toString();
	}
	
	
	
	
	
	
}
