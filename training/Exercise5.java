package com.akshay.training;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Exercise5 sum = new Exercise5();
		System.out.println("Enter the number: ");
		int num=new Scanner(System.in).nextInt();
		sum.sum(num);

	}
void sum(int num) {
	int sum=0,mod;
	while(num>0) {
		mod=num%10;
		num=num/10;
		sum=sum+(mod*mod*mod);
	}
	System.out.println("The sum of the cubes of each number is "+sum);
}
}
