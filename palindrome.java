package com.akshay.training;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the word: ");
		String word=new Scanner(System.in).nextLine();
		new palindrome().palind(word);
		

	}

void palind(String word) {
	word=word.toLowerCase();
	int length=word.length();
	String check="";
	char ch;
	for(int i=0;i<length;i++) {
		ch=word.charAt(i);
		check=ch+check;
		
	}
	if(word.equals(check))
		System.out.println("It is Palindrome");
	else
		System.out.println("It is not");
	
}
}
