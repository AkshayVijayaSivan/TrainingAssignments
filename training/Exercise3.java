package com.akshay.training;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Exercise3 {
	
//	Exercise 3: Create a method to accept date and print the duration in days,
//	months and years with regards to current system date
	
	
	
public static void main(String[] args) throws ParseException {
		System.out.println("Enter the date in DD/MM/YYYY format:");
		String date=new Scanner(System.in).nextLine();
		Date date1= new SimpleDateFormat("dd/MM/yyyy").parse(date);
		Date date2 = new Date();
		long time_difference = date2.getTime() - date1.getTime();
		long days_difference = ((time_difference / (1000*60*60*24)) % 365)%30;
		long month_difference=((time_difference / (1000*60*60*24)) % 365)/30;
		long years_difference = (time_difference / (1000l*60*60*24*365));
		System.out.println("\nThe days difference is "+ days_difference +" \nThe Months Difference is "
				+ ""+month_difference+" \nThe years difference is "+ years_difference);
	}

}
