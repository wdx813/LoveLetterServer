package com.love.entity;

import java.io.Serializable;

/**
 * @Title: Letter.java
 * @Package com.love.entity
 * @Description: 书信的实体类
 * @author Lance
 * @date 2018年5月25日 下午4:08:05
 * @version V1.0
 */
public class Letter implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String content;
	private String selected;
	private int type;

	public Letter() {
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSelected() {
		return selected;
	}

	public void setSelected(String selected) {
		this.selected = selected;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
