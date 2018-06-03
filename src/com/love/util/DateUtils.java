package com.love.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	/** 日期格式：yyyy-MM-dd HH:mm:ss.SSS */
	public static final String YMD_HMSSS = "yyyy-MM-dd HH:mm:ss.SSS";
	/** 日期格式：yyyyMMddHHmmssSSS */
	public static final String YMDHMSSS = "yyyyMMddHHmmssSSS";
	/** 日期格式：yyyy-MM-dd HH:mm:ss */
	public static final String YMD_HMS = "yyyy-MM-dd HH:mm:ss";
	/** 日期格式：yyyy-MM-dd HH:mm */
	public static final String YMD_HM = "yyyy-MM-dd HH:mm";
	/** 日期格式：yyyyMMddHHmmss */
	public static final String YMDHMS = "yyyyMMddHHmmss";
	/** 日期格式：yyyy-MM-dd */
	public static final String YMD = "yyyy-MM-dd";
	/** 时间格式：HH:mm:ss */
	public static final String HMS = "HH:mm:ss";
	
	/**
	 * 默认的日期格式 .
	 */
	public static final String DEFAULT_REGEX = "yyyy-MM-dd";
	public static final String DEFAULT_REGEX_YYYYMMDD = "yyyyMMdd";
	public static final String DEFAULT_REGEX_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
	
	public static String format(Date date) {
        return format(date, DEFAULT_REGEX);
    }

    public static String format(Date date, String pattern) {
        if(date != null){
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            return df.format(date);
        }
        return null;
    }
}
