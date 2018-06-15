package com.love.service;

import com.love.entity.User;

public interface UserService {

	public User getUserByOpenId(String openId);
	public void saveUser(User user);
}
