package com.javane.practice;

import java.util.Scanner;

public class Prac07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("[숫자맞추기게임 시작]");
		int dec=(int)(Math.random()*100)+1;
		
		while(true) { 
			int num = sc.nextInt();
			if(num>dec) {
				System.out.println("더 높게");	
			} else if (num<dec){
				System.out.println("더 낮게");
			} else if (num==dec) {
				System.out.println("맞았습니다");
				System.out.println("게임을 종료하시겠습니까?(y/n) >>");
				String str=sc.next();
				if(str.equals("y")) {
					break;
				}
				dec=(int)(Math.random()*100)+1;
			}				
		}	
		
		System.out.println("[숫자맞추기게임 종료]");	
		sc.close();				
	}
}
