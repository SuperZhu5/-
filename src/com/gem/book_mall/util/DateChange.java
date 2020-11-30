package com.gem.book_mall.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateChange {
	public static String changeDate(Date date){
		//Date-->String 
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		return df.format(date);

	}
	
	public static Date changeToDate(String date){
		//String-->Date
		//当注册时 ，获取form中的信息 为String
		//String -->Date  构建UserDetail对象
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			return df.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
