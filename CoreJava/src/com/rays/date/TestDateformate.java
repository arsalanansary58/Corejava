package com.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateformate {
	public static void main(String[] args) {
          
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(d);
		System.out.println(date);
		
	}
}
