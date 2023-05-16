package com.ojas.spring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Otrail1Application {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(Otrail1Application.class, args);

		LocalDate today = LocalDate.now();
		System.out.println(today.withDayOfMonth(1));
		System.out.println(today.withDayOfMonth(today.lengthOfMonth()));

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", java.util.Locale.ENGLISH);
		Date date = sdf.parse("12/06/2021");
		// specifies the pattern to print
		sdf.applyPattern("EEE, d MMM yyyy");
		String str = sdf.format(date);
		// prints day name with date
		System.out.println(str);
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd-MMMM-yyyy EEEE");
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
		String startOfMonth = format.format(cal.getTime());
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		String endOfMonth = format.format(cal.getTime());
		System.out.println(startOfMonth);
		System.out.println(endOfMonth);
		System.out.println();
	}

}
