package com.artisan.web.service;

import java.util.List;

import com.artisan.web.model.SysDict;

/**
 * 
 * 
 * @ClassName: DictService
 * 
 * @Description: Service层
 * 
 * @author: Mr.Yang
 * 
 * @date: 2018年5月11日 下午5:37:22
 */
public interface DictService {

	SysDict findById(Long id);

	List<SysDict> findBySysDict(SysDict sysDict, Integer offset, Integer limit);

	boolean saveOrUpdate(SysDict sysDict);

	boolean deleteById(Long id);
}
