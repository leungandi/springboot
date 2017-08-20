package com.szl.springboot.exception;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
/**
 * 全局异常处理
 * @author SongZhangLiang
 * @date 2017年8月17日 下午3:01:51
 */
@ControllerAdvice
public class GlobalException {
	private Logger logger =  Logger.getLogger(this.getClass());
	
	@ExceptionHandler(Exception.class)
	public ModelAndView error(Exception e) {
		logger.error("有错误出现,请及时解决",e);
		ModelAndView mv = new ModelAndView();
		mv.addObject("error", e.getMessage());
		mv.setViewName("error500");
		return mv;
	}

}
