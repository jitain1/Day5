package com.bridgelabz.Functional;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Mention the Number of Row do you want in Array");
		int m = sc.nextInt();
		System.out.println("Mention the Number of column do you want in Array");
		int n = sc.nextInt();

		int arr[][] = new int [m][n];

		System.out.println("Enter the data of the Array : ");
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}

		}
		System.out.println("The Array is : ");
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				System.out.println("arr["+ i +"][" + j + "] = " +arr[i][j]);
			}

		}
	}

}
