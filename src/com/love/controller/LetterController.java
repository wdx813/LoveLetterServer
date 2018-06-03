package com.love.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.love.entity.Letter;
import com.love.service.LetterService;
import com.love.util.R;

@RestController
@RequestMapping("/letter")
public class LetterController {
	
	@Autowired
	private LetterService letterService;

	@RequestMapping("/findLetters")
	public R findLetters() {
		Map<String, Object> data = letterService.findLetters();
		Map<String, Object> map = new HashMap<>();
		map.put("data", data);
		return R.ok(map);
	}
	
	@RequestMapping("/{letterId}")
	public R findLetterById(@PathVariable("letterId") Integer letterId) {
		Letter letter = letterService.findLetterById(letterId);
		Map<String, Object> map = new HashMap<>();
		map.put("data", letter);
		return R.ok(map);
	}
}
