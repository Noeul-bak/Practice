package com.javane.practice;

public class Prac04 {

	public static void main(String[] args) {

		for (int f = 1; f <= 10; f++) {
			for (int ver = f; ver <= 10 + f; ver++) {
				System.out.print(ver + "\t");
			}
			System.out.println();
		}
	}
}
