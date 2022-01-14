package com.akshay.training;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		Exercise11 exe = new Exercise11();
		System.out.println("Enter the number");
		int number=new Scanner(System.in).nextInt();
		boolean result=exe.checkNumber(number);
		if(result)
			System.out.println("The number is an increasing number");
		else
			System.out.println("The number is not an increasing number");

	}
	
	boolean checkNumber(int number) {
		boolean flag=true;
		int check=number%10,secondCheck;
				while(number>0) {
					number=number/10;
					secondCheck=number%10;
					if(secondCheck>check)
						flag=false;
					check=secondCheck;
				}
		return flag;		
	}

}
