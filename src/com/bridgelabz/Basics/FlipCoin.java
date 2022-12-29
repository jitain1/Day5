package com.bridgelabz.Basics;

public class FlipCoin {

	public static void main(String[] args) {

		double flip = Math.random()*2;

		if(flip < 0.5){
			System.out.println("HEAD");
		}else
			System.out.println("Tails");
	}
}
