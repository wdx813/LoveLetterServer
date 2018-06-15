package com.love.entity;

import java.io.Serializable;

/**
 * 
 * @Title: User.java
 * @Package com.love.entity
 * @Description: 用户实体类
 * @author Lance
 * @date 2018年6月11日 下午1:50:55
 * @version V1.0
 */
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String openId;
	private String nickname;
	private Integer gender;
	private String avatar;
	
	public User() {
	}
	
	public User(Integer id, String openId, String nickname, Integer gender,
			String avatar) {
		this.id = id;
		this.openId = openId;
		this.nickname = nickname;
		this.gender = gender;
		this.avatar = avatar;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", openId=" + openId + ", nickname="
				+ nickname + ", gender=" + gender + ", avatar=" + avatar + "]";
	}
	
	
}
