package com.artisan.web.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artisan.web.mapper.DictMapper;
import com.artisan.web.model.SysDict;
import com.artisan.web.service.DictService;

/**
 * 
 * 
 * @ClassName: DictServiceImpl
 * 
 * @Description: @Service标注的Service层
 * 
 * @author: Mr.Yang
 * 
 * @date: 2018年5月11日 下午5:39:22
 */

@Service
public class DictServiceImpl implements DictService {

	@Autowired
	private DictMapper dictMapper;

	@Override
	public SysDict findById(Long id) {
		return dictMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysDict> findBySysDict(SysDict sysDict, Integer offset, Integer limit) {
		RowBounds rowBounds = RowBounds.DEFAULT;
		if (offset != null && limit != null) {
			rowBounds = new RowBounds(offset, limit);
		}
		return dictMapper.selectBySysDict(sysDict, rowBounds);
	}

	@Override
	public boolean saveOrUpdate(SysDict sysDict) {
		if (sysDict.getId() == null) {
			return dictMapper.insert(sysDict) == 1;
		} else {
			return dictMapper.updateById(sysDict) == 1;
		}
	}

	@Override
	public boolean deleteById(Long id) {
		if (id == null) {
			throw new NullPointerException("id");
		}
		return dictMapper.deleteById(id) == 1;
	}

}
