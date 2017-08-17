package com.szl.springboot.intercptror;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 自定义登录拦截器
 * @author SongZhangLiang
 * @date 2017年8月17日 下午3:57:21
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
	private static final Logger log = Logger.getLogger(LoginInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		log.info("进入自定义登录拦截器-preHandle方法");
		return super.preHandle(request, response, handler);
	}

}
