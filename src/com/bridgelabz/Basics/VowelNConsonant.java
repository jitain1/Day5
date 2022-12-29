package com.bridgelabz.Basics;

import java.util.Scanner;

public class VowelNConsonant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Letter");
		char letter = sc.next().charAt(0);
		char ch = Character.toLowerCase(letter);

		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("This is a Vowel");
		}else
			System.out.println("This is a consonant");
	}
}
