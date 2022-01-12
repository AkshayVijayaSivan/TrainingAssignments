package com.akshay.training;

import java.util.Scanner;

public class splitAltenative {
	public static void main(String[] args) {
		System.out.println("Enter the string to be broken : ");
		String stringToBeBroken = new Scanner(System.in).nextLine();
		System.out.println("Enter the character to be used as delimiter: ");
		String delimiter = new Scanner(System.in).nextLine();
		String[] myString= new splitAltenative().mysplit(stringToBeBroken,delimiter);
		for(String val:myString) {
			if(val!=null)
				System.out.println(val);}
		
	}
	
	public String [] mysplit(String stringToBeBroken, String delimiter){
		String[] myString=new String[10];
		char delim = delimiter.charAt(0);
		int index=stringToBeBroken.length(),i=0,start=0,ind=0;
		while(i<index) {
			if(stringToBeBroken.charAt(i)==delim) {
				myString[ind]=stringToBeBroken.substring(start, i);
				ind+=1;
				start=i+1;
			}
			i+=1;	
		}
		myString[ind]=stringToBeBroken.substring(start, i);
		
	return myString;}

}
