package com.love.mapper;

import com.love.entity.User;

public interface UserMapper {

	public User getUserByOpenId(String openId);
	public void saveUser(User user);
}
