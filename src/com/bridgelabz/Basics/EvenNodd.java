package com.bridgelabz.Basics;

import java.util.Scanner;

public class EvenNodd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		sc.close();

		if (number == 0) {
			System.out.println("Zero is Not Even Not Odd");

		} else {

			if( number % 2 == 0) {
				System.out.println("This is a Even Number");

			}else
				System.out.println("This is a Odd Number");

		}

	}
}
