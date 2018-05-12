package com.artisan.web.model;

import java.io.Serializable;

/**
 * 
 * 
 * @ClassName: SysDict
 * 
 * @Description: SysDict实体类,如果使用缓存，请务必实现java.io.Serializable接口
 * 
 * @author: Mr.Yang
 * 
 * @date: 2018年5月11日 下午4:16:37
 */
public class SysDict implements Serializable {

	private static final long serialVersionUID = -2496324675593406906L;

	private Long id;
	private String code;
	private String name;
	private String value;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "SysDict [id=" + id + ", code=" + code + ", name=" + name + ", value=" + value + "]";
	}

}
