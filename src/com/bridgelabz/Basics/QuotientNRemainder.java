package com.bridgelabz.Basics;

import java.util.Scanner;

public class QuotientNRemainder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();

		System.out.println("Enter the Divider for the Number");
		int divider = sc.nextInt();

		int quotient = number/divider;
		int remainder = number%divider;

		System.out.println("The quotient is : " +quotient);
		System.out.println("The remainder is : " +remainder);

	}
}
