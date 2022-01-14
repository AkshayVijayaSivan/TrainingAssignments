package com.akshay.training;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		System.out.println("Enter the number which have to be sorted:");
		int number=new Scanner(System.in).nextInt();
		String temp=Integer.toString(number);
		int []sort = new int[temp.length()];
		for(int i=0;i<temp.length();i++)
			sort[i]=temp.charAt(i)-'0';
		Exercise7 srt = new Exercise7();
		int []result=srt.getSorted(sort);
		System.out.print("\nThe sorted array is :");
		for(int res:result) {
			System.out.print(res+" ");
		}

	}
int[] getSorted(int []sort) {
	int len=sort.length;
	String []number=new String[len];
	for(int i=0;i<len;i++) {
		number[len-1-i]=String.valueOf(sort[i]);
	}
	System.out.println("The Reversed array is");
	for(String str:number) {
		System.out.print(str+" ");
	}
	Arrays.sort(sort);
	return sort;
}
}
