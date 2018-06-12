package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class UTCDateExample {

	public static void main(String[] args) {
		
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));   // This line converts the given date into UTC time zone
		java.util.Date dateObj;
		try {
			dateObj = sdf.parse("2018-05-11T23:35:00");
			String aRevisedDate = new SimpleDateFormat("MM/dd/yyyy KK:mm:ss a").format(dateObj);
			System.out.println(aRevisedDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
}
