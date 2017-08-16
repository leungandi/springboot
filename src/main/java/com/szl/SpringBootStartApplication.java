package com.szl;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
/**
 * 我们需要类似于web.xml的配置方式来启动spring上下文 
 * 在Application类的同级添加一个SpringBootStartApplication类
 * @author SongZhangLiang
 * @date 2017年8月16日 下午3:49:28
 */
public class SpringBootStartApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		//注意这里要指向原先用main方法执行的Application启动类
		return builder.sources(SpringbootApplication.class);
	}

}
