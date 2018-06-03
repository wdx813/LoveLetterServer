package com.love.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrUtils {

	/**
	 * 子字符串patternStr在字符串str中第num次出现时的下标
	 * @param str
	 * @param patternStr
	 * @param num
	 * @return
	 */
	public static int countInnerStr(final String str, final String patternStr, int num) {
		int count = 0;
		final Pattern r = Pattern.compile(patternStr);
		final Matcher m = r.matcher(str);
		while (m.find()) {
			count++;
			if(num == count) return m.start();
		}
		return 0;
	}
}
