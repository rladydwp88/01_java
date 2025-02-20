package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice1 {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int iNum = sc.nextInt();
		
		for(int i = 1; i <= iNum; i++) {
			System.out.print(i + " ");
		} if(iNum <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}
	
	public void practice2() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int iNum = sc.nextInt();
		
		for(int i = iNum; i >= 1; i--) {
			System.out.print(i + " ");
		} if(iNum <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}
	
	public void practice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		int iNum = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= iNum; i++) {
			sum += i;
			
			if(i < iNum) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = " + sum);
			}
		}
	}
	
	public void practice4() {
		System.out.print("첫 번째 숫자 : ");
		int iNum1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int iNum2 = sc.nextInt();
		
		if(iNum1 < 0 || iNum2 < 0) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			int start = iNum1;
			int end = iNum2;
			
			if(start > end) {
				iNum1 = end;
				iNum2 = start;
			}
			
			for(int i = start; i <= end; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice5() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("========" + num + " 단 ========");
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
	}
	
	public void practice6() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(0 > num || num > 10) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			for(int i = num; num <= 9; i++) {
				System.out.println("========" + num + " 단 ========");
				for(int j = 1; j < 10; j++) {
					System.out.println(i + "X" + j + "=" + (i*j));
				}
			}
		}
	}
}
