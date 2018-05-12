package com.artisan.web.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * 
 * @ClassName: IndexController
 * 
 * @Description: 用于验证集成Spring以及SpringMVC是否OK
 * 
 * @author: Mr.Yang
 * 
 * @date: 2018年5月1日 下午2:21:11
 */

@Controller
public class IndexController {

	@RequestMapping("/index")
	public ModelAndView testEnv() {
		ModelAndView mv = new ModelAndView();
		// 设置跳转页面
		mv.setViewName("index");
		// 传递参数
		mv.addObject("now", new Date());
		return mv;
	}
}
