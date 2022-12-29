package com.bridgelabz.Basics;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check its Prime Factors");
		int number = sc.nextInt();
		sc.close();

		System.out.println("Prime Factors of number is: ");
		int num = number;
		for (int i=2; i<num; i++) {
			while (num % i == 0) {
				System.out.println(i);
				num /= i;
			}
		}
		if(num > 2)
			System.out.println(num);
	}
}
