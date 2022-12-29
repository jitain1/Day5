package com.bridgelabz.Functional;

import java.util.Scanner;

public class SumOfThreeInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of input : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int count = 0;
		int sum = 0;
		System.out.println("Enter Values");
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length ; i++) {
			for (int j = i + 1; j < arr.length ; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						count++;
						System.out.println(arr[i] + " + " + arr[j] + " + " + arr[k] + " = " + " 0 ");
					}
				}
			}
		}
		System.out.println("Total count= " + count);
	}
}

