package com.akshay.training;

import java.util.Scanner;
import java.util.StringTokenizer;

class exercise1 {
	
	//Exercise 1: Write a Java program that reads a line of integers and then displays
	//each integer and the sum of all integers. (Use StringTokenizer class)?

	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter the Numbers : ");
		Scanner scanner = new Scanner(System.in);
		String number=scanner.nextLine(),token;
		StringTokenizer st = new StringTokenizer(number);
		System.out.println("The entered numbers are ");
		while(st.hasMoreTokens()) {
			token=st.nextToken();
			System.out.print(token+" ");
			int num=Integer.parseInt(token);
			sum+=num;
		}
		System.out.println("\nThe sum of the numbers is "+ sum);
		scanner.close();		

	}

}
