package com.szl.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.szl.springboot.entity.User;
import com.szl.springboot.service.UserService;
import com.szl.springboot.util.JsonUtil;

/**
 * 使用mybatis进行数据库操作-查询用户
 * 
 * 1.POM中引入MyBatis-Spring-Boot-Starter依赖
 * 2.依赖将会提供如下：
 * 2.1自动检测现有的DataSource
 * 2.2将创建并注册SqlSessionFactory的实例，该实例使用SqlSessionFactoryBean将该DataSource作为输入进行传递
 * 2.3将创建并注册从SqlSessionFactory中获取的SqlSessionTemplate的实例。
 * 2.4自动扫描您的mappers，将它们链接到SqlSessionTemplate并将其注册到Spring上下文，以便将它们注入到您的bean中。
 * 总结一下就是说，使用了该Starter之后，只需要定义一个DataSource即可（application.properties中可配置），它会自动创建使用该DataSource的SqlSessionFactoryBean以及SqlSessionTemplate。会自动扫描你的Mappers，连接到SqlSessionTemplate，并注册到Spring上下文中。
 *
 * @author SongZhangLiang
 * @date 2017年4月25日 上午11:48:23
 */
@RestController
@RequestMapping(value ="user",produces="application/json; charset=UTF-8")
public class UserController {
	
	protected static final Logger log = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="queryUser/{pageIndex}/{pageSize}")
	public String queryUser(@PathVariable(name="pageIndex",required=false) int pageIndex,@PathVariable(name="pageSize",required=false) int pageSize){
		log.info("模拟查询用户...");
		Map<String, Object> params = new HashMap<>();
		params.put("pageIndex", pageIndex);
		params.put("pageSize", pageSize);
		List<User> user = userService.queryUser(params);
		if (null == user) {
			return "用户不存在";
		}
		return JsonUtil.object2Json(new PageInfo<>(user));
	}
	
	@RequestMapping(value="insertUser")
	public String insertUser(@RequestParam(value="name",required=true)String name,@RequestParam(value="email",required=true)String email) {
		if (StringUtils.isEmpty(name) || StringUtils.isEmpty(email)) {
			return "参数错误";
		}
		userService.insertUser(new User(name,email));
		return "ok";
	}
	
	@RequestMapping(value="delUser")
	public String delUser(@RequestParam(value="id",required=true)String id) {
		userService.delUser(Integer.parseInt(id));
		return "ok";
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
