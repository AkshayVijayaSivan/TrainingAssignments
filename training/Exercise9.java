package com.akshay.training;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {

		SUM element = new SUM();
		System.out.println("Enter the number:");
		int number=new Scanner(System.in).nextInt();
		int result = element.calculateSum(number);
		System.out.println("The sum is "+ result);
	}

}
class SUM{
	int calculateSum(int number) {
		int sum=0;
		for(int i=1;i<=number;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
			
		}
		return sum;
	}
}