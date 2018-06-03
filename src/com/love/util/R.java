package com.love.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据工具类
 * @Title: R.java
 * @Package com.love.util
 * @Description: TODO
 * @author Lance
 * @date 2018年5月23日 下午4:48:16
 * @version V1.0
 */
public class R extends HashMap<String, Object>{
	private static final long serialVersionUID = 1L;

	public R() {
		put("code", ErrorMessage.SUCCESS.getCode());
		put("msg", ErrorMessage.SUCCESS.getMsg());
	}
	
	public static R ok() {
		return new R();
	}
	
	public static R ok(String msg) {
		R r = new R();
		r.put("msg", msg);
		return r;
	}
	
	public static R ok(Map<String, Object> map) {
		R r = new R();
		r.putAll(map);
		return r;
	}
	
	public static R error(String code, String msg) {
		R r = new R();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}
}
