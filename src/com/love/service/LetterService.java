package com.love.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.love.entity.Letter;

@Service("letterService")
public interface LetterService {

	public Map<String, Object> findLetters();
	
	public Letter findLetterById(Integer letterId);
}
