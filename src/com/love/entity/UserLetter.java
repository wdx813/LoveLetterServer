package com.love.entity;

import java.io.Serializable;

/**
 * @Title: UserLetter.java
 * @Package com.love.entity
 * @Description: TODO
 * @author Lance
 * @date 2018年6月12日 上午10:35:59
 * @version V1.0
 */
public class UserLetter implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer userId;
	private String receiver;
	private String sender;
	private String content;
	private String selected;
	private String video;
	private int type;
	private String time;

	public UserLetter() {
	}

	public UserLetter(Integer id, Integer userId, String receiver,
			String sender, String content, String selected, String video,
			int type, String time) {
		this.id = id;
		this.userId = userId;
		this.receiver = receiver;
		this.sender = sender;
		this.content = content;
		this.selected = selected;
		this.video = video;
		this.type = type;
		this.time = time;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSelected() {
		return selected;
	}

	public void setSelected(String selected) {
		this.selected = selected;
	}

	@Override
	public String toString() {
		return "UserLetter [id=" + id + ", userId=" + userId + ", receiver="
				+ receiver + ", sender=" + sender + ", content=" + content
				+ ", selected=" + selected + ", video=" + video + ", type="
				+ type + ", time=" + time + "]";
	}

}
