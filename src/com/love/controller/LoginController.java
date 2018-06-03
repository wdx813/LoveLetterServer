package com.love.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.love.util.ErrorMessage;
import com.love.util.R;
import com.love.util.UrlUtils;

@RestController
public class LoginController {

	@RequestMapping("/checkLogin")
	public R login(@RequestBody String code) {
		// 验证参数
		if(code == null || code == "") {
			return R.error(ErrorMessage.JS_CODE.getCode(), ErrorMessage.JS_CODE.getMsg());
		}
		String loginResult =  UrlUtils.wxLogin(code);
		if(loginResult == null || loginResult == "") {
			return R.error(ErrorMessage.LOGIN_ERROR.getCode(), ErrorMessage.LOGIN_ERROR.getMsg());
		}
		JSONObject json = (JSONObject) JSONObject.parse(loginResult);
		String openid = (String) json.get("openid");
		Map<String, Object> data = new HashMap<>();
		data.put("openid", openid);
		Map<String, Object> map = new HashMap<>();
		map.put("data", data);
		return R.ok(map);
	} 
}
