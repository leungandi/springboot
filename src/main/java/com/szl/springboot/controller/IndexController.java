package com.szl.springboot.controller;

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
	
	@RequestMapping(value="")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}

}
