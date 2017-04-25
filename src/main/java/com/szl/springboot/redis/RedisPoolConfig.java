package com.szl.springboot.redis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedisPool;
/**
 * redisPoolConfig
 * 使用注解配置redis pool
 * @author SongZhangLiang
 * @date 2017年4月25日 上午11:45:35
 */
@Configuration
public class RedisPoolConfig {
	
	@Bean(name="jedisPoolConfig")
	public JedisPoolConfig jedisPoolConfig(@Value("${spring.redis.pool.max-total}")int maxTotal,  
            @Value("${spring.redis.pool.max-idle}")int maxIdle,  
            @Value("${spring.redis.pool.max-wait}")int maxWaitMillis){
		JedisPoolConfig config =  new JedisPoolConfig();
		config.setMaxTotal(maxTotal);
		config.setMaxIdle(maxIdle);
		config.setMaxWaitMillis(maxWaitMillis);
		return config;
	}
	
	@Bean(name="shardedJedisPool")
	@Scope("singleton")
	public ShardedJedisPool shardedJedisPool(@Qualifier("jedisPoolConfig")JedisPoolConfig jedisPoolConfig, @Value("${spring.redis.host}")String host,   
            @Value("${spring.redis.port}")int port){
		List<JedisShardInfo> shards = new ArrayList<>();
		shards.add(new JedisShardInfo(host, port));
		return new ShardedJedisPool(jedisPoolConfig, shards);
	}
	

}
