package com.love.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.love.entity.User;
import com.love.service.UserService;
import com.love.util.ErrorMessage;
import com.love.util.R;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/save")
	public R saveUser(@RequestBody User user) {
		System.out.println(user);
		User u = userService.getUserByOpenId(user.getOpenId());
		if(u == null) {
			userService.saveUser(user);
			Map<String, Object> data = new HashMap<>();
			data.put("userInfo", user);
			Map<String, Object> map = new HashMap<>();
			map.put("data", data);
			return R.ok(map);
		}
		return R.error(ErrorMessage.USER_EXITED.getCode(), ErrorMessage.USER_EXITED.getMsg());
	}
	
}
