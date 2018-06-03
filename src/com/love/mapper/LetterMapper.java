package com.love.mapper;

import java.util.List;

import com.love.entity.Letter;

public interface LetterMapper {

	public List<Letter> findLetters(int letterType, int pageSize);
	public Letter findLetterById(Integer letterId);
}
