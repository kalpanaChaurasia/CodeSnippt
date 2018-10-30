package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifference {
	public static void main(String[] args) {

		int i = 0, j = 0;
		System.out.println("i : " + i++);
		System.out.println("j : " + ++j);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");

		try {
			Date date1 = simpleDateFormat.parse("12/09/2018 00:00:00");
			Date date2 = simpleDateFormat.parse("12/09/2018 00:00:00");

			if(date1.after(date2)) {
				System.out.println("after : ");
			}else if(date1.before(date2)) {
				System.out.println("before : ");
			}else {
				System.out.println("else : ");
			}
			
			date2.setHours(24);
			System.out.println("date2 : "+date2.getTime());
			//printDifference(date1, date2);

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	// 1 minute = 60 seconds
	// 1 hour = 60 x 60 = 3600
	// 1 day = 3600 x 24 = 86400
	public static void printDifference(Date startDate, Date endDate) {
		// milliseconds
		long different = endDate.getTime() - startDate.getTime();

		System.out.println("startDate : " + startDate);
		System.out.println("endDate : " + endDate);
		System.out.println("different : " + different);

		long secondsInMilli = 1000;
		long minutesInMilli = secondsInMilli * 60;
		long hoursInMilli = minutesInMilli * 60;
		long daysInMilli = hoursInMilli * 24;

		System.out.println("daysInMilli : " + daysInMilli);

		long elapsedDays = different / daysInMilli;
		different = different % daysInMilli;

		long elapsedHours = different / hoursInMilli;
		different = different % hoursInMilli;

		long elapsedMinutes = different / minutesInMilli;
		different = different % minutesInMilli;

		long elapsedSeconds = different / secondsInMilli;

		System.out.printf("%d days, %d hours, %d minutes, %d seconds%n", elapsedDays, elapsedHours, elapsedMinutes,
				elapsedSeconds);
	}

}
