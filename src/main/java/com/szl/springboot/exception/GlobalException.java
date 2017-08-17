package com.szl.springboot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
/**
 * 全局异常处理
 * @author SongZhangLiang
 * @date 2017年8月17日 下午3:01:51
 */
@ControllerAdvice
public class GlobalException {
	
	
	public String error() {
		return "error";
	}

}
