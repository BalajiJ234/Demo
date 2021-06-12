package com.cg.trg.pl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate today= LocalDate.now();
		System.out.println(today);//2021-05-07
		LocalTime presentTime= LocalTime.now();
		System.out.println(presentTime);
		LocalDateTime todayDateTime= LocalDateTime.now();
		System.out.println(todayDateTime);//2021-05-07T15:30:48.870691200
		
		LocalDate independanceDay= LocalDate.of(1947, Month.AUGUST, 15);
		System.out.println(independanceDay);
		
		Period period= independanceDay.until(today);
		System.out.println(period.getYears() +" years "+ period.getMonths()+ " months "+ period.getDays()+" days");
		
		
		//convert String object to LocalDate
		try {
			String joindate= "2019-10-16";
			DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate hiredate= LocalDate.parse(joindate,formatter);
			System.out.println(hiredate);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Formatted date...");
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(today.format(formatter));
		
	
	
	}

}
