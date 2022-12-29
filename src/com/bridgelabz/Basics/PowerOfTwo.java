package com.bridgelabz.Basics;

public class PowerOfTwo {

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);

		if (n < 0) {
			System.out.println("Please make sure the input value is more than 0");
		}
		else if(n > 31) {
			System.out.println("2^" + n + " = " + "is out of range of integer value");
			System.exit(0);
		}else {
			System.out.println("The power of 2 till n are :");
			for (int i=1; i<=n; i++) {
				int power = (int) Math.pow(2, i);
				System.out.println("2^" + i + " = " + power);
			}
		}
	}
}
