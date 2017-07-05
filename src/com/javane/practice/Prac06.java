package com.javane.practice;

import java.util.Scanner;

public class Prac06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int result=0;

		if (num % 2 != 0) {
			for (int a = 1; a <= num; a += 2) {
				result=result+a;
			}

		} else {
			for (int b = 0; b <= num; b += 2) {
				result+=b;
			}
		}
		System.out.println("결과값: "+result);

		sc.close();

	}
}
