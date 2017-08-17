package com.szl.springboot.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * 首页
 * @author SongZhangLiang
 * @date 2017年8月17日 下午3:08:13
 */
@Controller
public class IndexController {
	
	private static Logger log = Logger.getLogger(IndexController.class);
	
	@RequestMapping(value="")
	public ModelAndView index() {
		log.info("加载首页");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
//	@RequestMapping(value="index")
//	public String index() {
//		log.info("加载首页");
//		return "index";
//	}

}
