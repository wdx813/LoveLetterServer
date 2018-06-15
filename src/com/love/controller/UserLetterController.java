package com.love.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.love.entity.UserLetter;
import com.love.service.UserLetterService;
import com.love.util.Constant;
import com.love.util.DateUtils;
import com.love.util.R;

@RestController
@RequestMapping("/userLetter")
public class UserLetterController {
	
	@Autowired
	private UserLetterService userLetterService;

	@RequestMapping("/recommend")
	public R getRecommendLetter(Integer userId) {
		return R.ok();
	}

	@RequestMapping("/save")
	public R saveLetter(MultipartFile file, HttpSession session, @ModelAttribute UserLetter userLetter) throws IOException {
		String fileName = UUID.randomUUID() + ".mp3";
		String path = session.getServletContext().getRealPath("/video");
		String newPath = path+"\\"+fileName;
		File newFile = new File(newPath);
		file.transferTo(newFile);
		
		String createTime = DateUtils.format(new Date());
		userLetter.setTime(createTime);
		userLetter.setType(Constant.SEND_LETTER);
		userLetter.setVideo(newPath);
		
		userLetterService.sendLetter(userLetter);
		Map<String, Object> map = new HashMap<>();
		map.put("userLetterId", userLetter.getId());
		return R.ok(map);
	}
}
