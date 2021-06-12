package com.cg.trg.pl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {
	private static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		Date today=new Date();
		//returns date adding given time in milliseconds from EPOCH
		//EPOCH: java base time line, January 1 1970 00:00:00 GMT
		Date someDate=new Date(789798999998L);
		System.out.println(today);
		System.out.println(someDate);		
		System.out.println(today.getTime());
		
		try {
			//convert String object to java.util.Date
			System.out.println("Enter birthdate(dd/MM/yyyy)");
			String bdate= scanner.nextLine();
			DateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
			Date birthdate= dateFormat.parse(bdate);
			System.out.println(birthdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			//convert Date to String
			Date myDate=new Date();
			DateFormat dateFormat= new SimpleDateFormat("dd-MMM-yyyy");
			String myFormattedDate= dateFormat.format(myDate);
			System.out.println(myFormattedDate);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
