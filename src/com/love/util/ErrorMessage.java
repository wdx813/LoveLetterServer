package com.love.util;
/**
 * 错误信息类
 * @Title: ErrorMessage.java
 * @Package com.love.util
 * @Description: TODO
 * @author Lance
 * @date 2018年5月23日 下午4:59:07
 * @version V1.0
 */
public enum ErrorMessage {
	
	SUCCESS("E0000", "操作成功"),
	LOGIN_ERROR("E0001", "登录失败"),
	JS_CODE("E0002", "JS_CODE是必需的"),
	USER_EXITED("E0003", "该用户已存在");
	
	private String code;
	private String msg;
	
	private ErrorMessage(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
