package com.artisan.web.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.artisan.web.model.SysDict;

/**
 * 
 * 
 * @ClassName: DictMapper
 * 
 * @Description: ����Sys_Dict�Ľӿ�
 * 
 * @author: Mr.Yang
 * 
 * @date: 2018��5��11�� ����4:24:14
 */

public interface DictMapper {
	/**
	 * 
	 * 
	 * @Title: selectByPrimaryKey
	 * 
	 * @Description: ����������ѯ
	 * 
	 * @param id
	 * @return
	 * 
	 * @return: SysDict
	 */
	SysDict selectByPrimaryKey(Long id);

	/**
	 * ������ѯ
	 *
	 * @param sysDict
	 * @return
	 */
	List<SysDict> selectBySysDict(SysDict sysDict, RowBounds rowBounds);

	/**
	 * ����
	 *
	 * @param sysDict
	 * @return
	 */
	int insert(SysDict sysDict);

	/**
	 * ������������
	 *
	 * @param sysDict
	 * @return
	 */
	int updateById(SysDict sysDict);

	/**
	 * ��������ɾ��
	 *
	 * @param id
	 * @return
	 */
	int deleteById(Long id);
}
