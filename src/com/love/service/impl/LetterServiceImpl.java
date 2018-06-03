package com.love.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.love.entity.Letter;
import com.love.mapper.LetterMapper;
import com.love.service.LetterService;
import com.love.util.Constant;
import com.love.util.StrUtils;

@Service
public class LetterServiceImpl implements LetterService {

	@Autowired
	private LetterMapper letterMapper;

	@Override
	public Map<String, Object> findLetters() {
		Map<String, Object> map = new HashMap<>();
		List<Letter> friendLetters = letterMapper.findLetters(Constant.letter_type_friend, Constant.PAGE_SIZE);
		List<Letter> familyLetters = letterMapper.findLetters(Constant.letter_type_family, Constant.PAGE_SIZE);
		List<Letter> loveLetters = letterMapper.findLetters(Constant.letter_type_love, Constant.PAGE_SIZE);
		
		friendLetters = getShowLetters(friendLetters);
		familyLetters = getShowLetters(familyLetters);
		loveLetters = getShowLetters(loveLetters);
		
		map.put("friendLetters", friendLetters);
		map.put("familyLetters", familyLetters);
		map.put("loveLetters", loveLetters);
		return map;
	}

	/**
	 * 获取处理后的书信列表
	 * @param letters
	 * @return
	 */
	public List<Letter> getShowLetters(List<Letter> letters) {
		for (Letter letter : letters) {
			String content = letter.getContent();
			if(content.length() > 140) {
				String newContent = content.substring(0, 123) + "...";
				letter.setContent(newContent);
			}
			int index = StrUtils.countInnerStr(content, "\r\n", 8);
			if(index > 0) {
				String newContent = content.substring(0, index) + "...";
				letter.setContent(newContent);
			}
			
		}
		return letters;
	}

	@Override
	public Letter findLetterById(Integer letterId) {
		return letterMapper.findLetterById(letterId);
	}
}
