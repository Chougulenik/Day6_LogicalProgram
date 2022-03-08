package com.logicalprogram;

import java.util.Scanner;

public class PrimeNumber {

	static long isPerfect(long num) {  
		long sum = 0;                                 //variable stores the sum  
		for(int i=1; i <= num/2; i++) {  
			if(num % i == 0)  
			{  
				//calculates the sum of factors  
				sum = sum + i;  
			}   
		}   
		return sum;   
	} 
	public static void main(String args[]) {  
		long number, perfectNumber;  
		Scanner input = new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		number = input.nextLong();  
		//calling the function  
		perfectNumber = isPerfect(number);  
		//compares sum with the number  2
		if(perfectNumber == number)  
			System.out.println(number+" is a perfect number");  
		else  
			System.out.println(number+" is not a perfect number");   
		
	}

}
