package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class DateFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    String timeLong = "2013-02-27 06:06:30";
		    String timeShort = "16:06";
		    SimpleDateFormat formatLong = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
		    SimpleDateFormat formatShort = new SimpleDateFormat("HH:mm", Locale.US);
		    SimpleDateFormat formatShort1 = new SimpleDateFormat("hh:mm a");
		    System.out.println("out"+ formatShort.format(formatLong.parse(timeLong)));
		    System.out.println("out"+  formatShort1.format(formatShort.parse(timeShort)));
		} catch (ParseException e) {
		    e.printStackTrace();
		}
	}

}
