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
 * @Description: ������֤����Spring�Լ�SpringMVC�Ƿ�OK
 * 
 * @author: Mr.Yang
 * 
 * @date: 2018��5��1�� ����2:21:11
 */

@Controller
public class IndexController {

	@RequestMapping("/index")
	public ModelAndView testEnv() {
		ModelAndView mv = new ModelAndView();
		// ������תҳ��
		mv.setViewName("index");
		// ���ݲ���
		mv.addObject("now", new Date());
		return mv;
	}
}
