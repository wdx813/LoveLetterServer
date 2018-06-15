package com.love.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.love.entity.User;
import com.love.mapper.UserMapper;
import com.love.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserByOpenId(String openId) {
		User user = userMapper.getUserByOpenId(openId);
		return user != null ? user : null;
	}

	@Override
	public void saveUser(User user) {
		userMapper.saveUser(user);
	}

}
