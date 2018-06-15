package com.love.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.love.entity.UserLetter;
import com.love.mapper.UserLetterMapper;
import com.love.service.UserLetterService;

@Service
public class UserLetterServiceImpl implements UserLetterService{

	@Autowired
	private UserLetterMapper userLetterMapper;
	
	@Override
	public void sendLetter(UserLetter userLetter) {
		userLetterMapper.sendLetter(userLetter);
	}

}
