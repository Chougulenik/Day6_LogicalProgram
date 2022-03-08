package com.logicalprogram;

import java.util.Scanner;

public class CouponNumbers {

	public static void main(String[] args) {
		int dist = 1, count = 0;

		System.out.print("Enter the Total no of coupons Num : ");

		Scanner input = new Scanner(System.in);

		int number = input.nextInt();
		int[] colt = new int[number];

		while (dist <= number) {
			int value = (int) (Math.random() * number);

			count++;

			System.out.println("Generated value " + (value + 1));
			if (colt[value] != value + 1) {
				dist++;
				colt[value] = value + 1;
			}
		}

		System.out.println("Total no of trials to get " + number + " diffrent coupon number are " + count);
		System.out.println(" ");
		System.out.println("Array : ");

		for (int i = 0; i < number; i++) {

			System.out.println(i + " elements in the array is " + colt[i]);
		}	

	}

}
