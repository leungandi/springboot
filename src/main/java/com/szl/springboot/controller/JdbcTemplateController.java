package com.szl.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.szl.springboot.entity.User;
import com.szl.springboot.service.JdbcTemplateService;

/**
 * 使用JdbcTemplate对数据库进行操作
 * Spring的JdbcTemplate是自动配置的
 * 你可以直接使用@Autowired来注入到你自己的bean中来使用
 * @author SongZhangLiang
 * @date 2017年8月18日 下午1:40:48
 */
@RestController
@RequestMapping(value="jdbcTemplate",produces="application/json; charset=UTF-8")
public class JdbcTemplateController {
	
	@Autowired
	private JdbcTemplateService jdbcTemplateService;
	
	
	@RequestMapping(value="queryUser")
	public String queryUser() {
		List<User> user = jdbcTemplateService.queryUser();
		if(user.isEmpty()) {
			return "数据库没有用户";
		}
		return user.toString();
	}
	
	@RequestMapping(value="insertUser")
	public String insertUser(@RequestParam(value="name",required=true)String name,@RequestParam(value="email",required=true)String email) {
		if (StringUtils.isEmpty(name) || StringUtils.isEmpty(email)) {
			return "参数错误";
		}
		jdbcTemplateService.insertUser(new User(name,email));
		return "ok";
	}
	
	@RequestMapping(value="delUser")
	public String delUser(@RequestParam(value="id",required=true)String id) {
		jdbcTemplateService.delUser(Integer.parseInt(id));
		return "ok";
	}
	
	
	

}
