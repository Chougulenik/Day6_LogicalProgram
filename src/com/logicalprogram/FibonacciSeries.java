package com.logicalprogram;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter the limit Fibonacci Series");
		Scanner input = new Scanner(System.in);
		int range = input.nextInt();
		int num1 = 0; int num2 = 1; int num;
		System.out.println(num1+" \n"+num2);
		
		for (int i = 2; i <= range; i++) { // loop starts from 2 because 0 and 1 are already initialized
			num = num1 + num2;
			System.out.print(num + "\n");
			num1 = num2;
			num2 = num;
		}	
		
		
		
	}

}
