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
	private Integer receiver;
	private Integer sender;
	private String content;
	private String selected;
	private int type;
	private int isSystem;
	private String video;
	private String time;

	public Letter() {
	}
	
	public Letter(Integer id, Integer receiver, Integer sender, String content,
			String selected, int type, int isSystem, String video, String time) {
		this.id = id;
		this.receiver = receiver;
		this.sender = sender;
		this.content = content;
		this.selected = selected;
		this.type = type;
		this.isSystem = isSystem;
		this.video = video;
		this.time = time;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getReceiver() {
		return receiver;
	}

	public void setReceiver(Integer receiver) {
		this.receiver = receiver;
	}

	public Integer getSender() {
		return sender;
	}

	public void setSender(Integer sender) {
		this.sender = sender;
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

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public int getIsSystem() {
		return isSystem;
	}

	public void setIsSystem(int isSystem) {
		this.isSystem = isSystem;
	}

	@Override
	public String toString() {
		return "Letter [id=" + id + ", receiver=" + receiver + ", sender="
				+ sender + ", content=" + content + ", selected=" + selected
				+ ", type=" + type + ", isSystem=" + isSystem + ", video="
				+ video + ", time=" + time + "]";
	}

}
