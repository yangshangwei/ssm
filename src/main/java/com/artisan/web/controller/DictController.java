package com.artisan.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.artisan.web.model.SysDict;
import com.artisan.web.service.DictService;

/**
 * 
 * 
 * @ClassName: DictController
 * 
 * @Description: @Controller��ע��Dict���Ʋ�
 * 
 * @author: Mr.Yang
 * 
 * @date: 2018��5��11�� ����5:40:19
 */

@Controller
@RequestMapping("/dicts")
public class DictController {
	@Autowired
	private DictService dictService;

	/**
	 * ��ʾ�ֵ������б�
	 * 
	 * @param sysDict
	 * @param offset
	 * @param limit
	 * @return
	 */
	@RequestMapping
	public ModelAndView dicts(SysDict sysDict, Integer offset, Integer limit) {
		ModelAndView mv = new ModelAndView("dicts");
		List<SysDict> dicts = dictService.findBySysDict(sysDict, offset, limit);
		mv.addObject("dicts", dicts);
		return mv;
	}

	/**
	 * �������޸��ֵ���Ϣҳ�棬ʹ�� get ��ת��ҳ��
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public ModelAndView add(Long id) {
		ModelAndView mv = new ModelAndView("dict_add");
		SysDict sysDict;
		if (id == null) {
			// ��� id �����ڣ������������ݣ�����һ���ն��󼴿�
			sysDict = new SysDict();
		} else {
			// ��� id ���ڣ������޸����ݣ���ԭ�е����ݲ�ѯ����
			sysDict = dictService.findById(id);
		}
		mv.addObject("model", sysDict);
		return mv;
	}

	/**
	 * �������޸��ֵ���Ϣ��ͨ���� post �ύ����
	 * 
	 * @param sysDict
	 * @return
	 */
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView save(SysDict sysDict) {
		ModelAndView mv = new ModelAndView();
		try {
			dictService.saveOrUpdate(sysDict);
			mv.setViewName("redirect:/dicts");
		} catch (Exception e) {
			mv.setViewName("dict_add");
			mv.addObject("msg", e.getMessage());
			mv.addObject("model", sysDict);
		}
		return mv;
	}

	/**
	 * ͨ�� id ɾ���ֵ���Ϣ
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "delete", method = RequestMethod.POST)
	@ResponseBody
	public ModelMap delete(@RequestParam Long id) {
		ModelMap modelMap = new ModelMap();
		try {
			boolean success = dictService.deleteById(id);
			modelMap.put("success", success);
		} catch (Exception e) {
			modelMap.put("success", false);
			modelMap.put("msg", e.getMessage());
		}
		return modelMap;
	}
}
