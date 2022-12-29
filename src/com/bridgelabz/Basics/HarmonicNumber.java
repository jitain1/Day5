package com.bridgelabz.Basics;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Which Harmonic Term Do you want to enter");
		int term = sc.nextInt();
		sc.close();

		double sum = 0;
		double i;

		for (i=1; i<=term; i++ ) {
			sum = sum + 1/i;
			System.out.println("sum = " + sum);
		}
		System.out.println("The value of Harmonic number of " + term + " position is " + sum);
	}

}
