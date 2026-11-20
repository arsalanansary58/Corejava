package com.rays.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateParse {
	public static void main(String[] args) throws ParseException {

		String dob = "6-12-2006";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		Date d = sdf.parse(dob);

		System.out.println(d);

		sdf = new SimpleDateFormat("EEE,MMM d, yyyy");
		String s = sdf.format(d);
		System.out.println(s);

   }
 }
