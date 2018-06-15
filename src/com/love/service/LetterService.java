package com.love.service;

import java.util.Map;

import com.love.entity.Letter;

public interface LetterService {

	public Map<String, Object> findLetters();
	
	public Letter findLetterById(Integer letterId);
	
	public Letter getRecommend(Integer userId);
}
