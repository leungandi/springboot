package com.szl.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.szl.spring_boot_starter_hello.service.HelloService;

/**
 * 测试一下自己定义的starter
 * 
 * 在application.properties中配置spring.hell.msg=""可以输出自定义的字符
 * 
 * 这就是简单的spring自动配置原理
 * 
 * @author SongZhangLiang
 * @date 2017年8月22日 下午3:24:00
 */
@RestController
@RequestMapping(value="autoconfig",produces="application/json; charset=UTF-8")
public class TestAutoConfigController {
	
	@Autowired
	private HelloService helloService;
	
	
	@RequestMapping("")
	public String testAutoConfig() {
		return helloService.SayHello();
	}
	
	

}
