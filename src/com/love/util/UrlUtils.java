package com.love.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlUtils {

	/**
	 * 微信登录验证
	 * 
	 * @param code
	 * @return
	 */
	public static String wxLogin(String code) {
		String appid = "wx22e48525433a9d34";
		String secret = "3e159be57dfd6d755d53e31f2f8f9108";
		String path = "https://api.weixin.qq.com/sns/jscode2session?appid="
				+ appid + "&secret=" + secret + "&js_code=" + code
				+ "&grant_type=authorization_code";
		return requestInterface(path, "");
	}

	public static String requestInterface(String path, String data) {
		StringBuffer result = new StringBuffer();
		HttpURLConnection conn = null;
		InputStream is = null;
		BufferedReader br = null;
		try {
			URL url = new URL(path);
			conn = (HttpURLConnection) url.openConnection();
			// 设置通用属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 发送参数
			PrintWriter out = new PrintWriter(conn.getOutputStream());
			out.print(data);
			out.flush();
			// 获取结果
			is = conn.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			String str = "";
			while ((str = br.readLine()) != null) {
				result.append(str);
			}
			return result.toString();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (is != null) {
					is.close();
				}
				if (conn != null) {
					conn.disconnect();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result.toString();
	}
}
