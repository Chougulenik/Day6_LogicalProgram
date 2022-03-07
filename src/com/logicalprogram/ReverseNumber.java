package com.logicalprogram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter a numbers : ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int reverse = 0;  
		while(number != 0) {  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  

	}

}
