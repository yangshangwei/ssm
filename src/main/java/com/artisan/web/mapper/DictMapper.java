package com.artisan.web.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.artisan.web.model.SysDict;

/**
 * 
 * 
 * @ClassName: DictMapper
 * 
 * @Description: 操作Sys_Dict的接口
 * 
 * @author: Mr.Yang
 * 
 * @date: 2018年5月11日 下午4:24:14
 */

public interface DictMapper {
	/**
	 * 
	 * 
	 * @Title: selectByPrimaryKey
	 * 
	 * @Description: 根据主键查询
	 * 
	 * @param id
	 * @return
	 * 
	 * @return: SysDict
	 */
	SysDict selectByPrimaryKey(Long id);

	/**
	 * 条件查询
	 *
	 * @param sysDict
	 * @return
	 */
	List<SysDict> selectBySysDict(SysDict sysDict, RowBounds rowBounds);

	/**
	 * 新增
	 *
	 * @param sysDict
	 * @return
	 */
	int insert(SysDict sysDict);

	/**
	 * 根据主键更新
	 *
	 * @param sysDict
	 * @return
	 */
	int updateById(SysDict sysDict);

	/**
	 * 根据主键删除
	 *
	 * @param id
	 * @return
	 */
	int deleteById(Long id);
}
