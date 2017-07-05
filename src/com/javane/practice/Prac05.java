package com.javane.practice;

import java.util.Scanner;

public class Prac05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");

		int max=0;
				
		for(int num=1;num<6;num++) {
			
			System.out.print("숫자: ");
			int a=sc.nextInt();
			
			if(a>max) {
				max=a;
			}
		}
		System.out.println("최대값은"+max+"입니다.");
				
		sc.close();
	}
}

