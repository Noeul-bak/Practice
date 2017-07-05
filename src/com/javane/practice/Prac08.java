package com.javane.practice;

import java.util.Scanner;

public class Prac08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int put = 0;
		int draw = 0;
		int account = put - draw;

		while (true) {
			System.out.println("==============================");
			System.out.println("  1.예금 : 2.출금 : 3.잔고 : 4.종료");
			System.out.println("==============================");
			System.out.print("선택>");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.print("예금액>");
				put = sc.nextInt();
				account = put + account;
			} else if (num == 2) {
				System.out.print("출금액>");
				draw = sc.nextInt();
				account = account - draw;
			} else if (num == 3) {
				System.out.println("잔고액>" + account);
			} else if (num == 4) {
				System.out.print("프로그램 종료");
				break;
			} else {
				System.out.println("다시입력해주세요");
			}
		}
		sc.close();
	}
}
