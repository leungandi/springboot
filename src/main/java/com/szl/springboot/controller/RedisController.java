package com.szl.springboot.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.szl.springboot.redis.RedisClientTemplate;

/**
 * redis controller
 * @author SongZhangLiang
 * @date 2017年4月25日 上午11:48:16
 */
@RestController
@RequestMapping(value="redis")
public class RedisController {
	
	/**
	 * 自己封装的redis模板,灵活性更强
	 */
	@Autowired
	private RedisClientTemplate redisClientTemplate;
	
	/**
	 * spring封装的redis模板
	 */
//	@Autowired
//	private StringRedisTemplate stringRedisTemplate;
//	@Resource(name = "stringRedisTemplate")
//	private ValueOperations<String, String> vo;
	
	@RequestMapping(value="set")
	public String setKey(){
		return redisClientTemplate.setKey("redis", "hello springBoot");
	}
	
//	@RequestMapping(value="set1")
//	public String setKey1(){
//		vo.set("redis1", "hello again");
//		return "ok";
//	}
	
	
	

}
