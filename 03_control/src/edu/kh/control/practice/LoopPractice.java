package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input >= 1) {
			
			for(int i =1; i <= input; i++) {
				System.out.println(i + " ");
			}
			
		} else {
			System.out.println("1 이상의 숫자를 입력하세요");
		}
		
		/*
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		
		if (1 > num) {
			System.out.print("1 이상의 숫자를 입력하세요");
		}
		*/
	}
	
	public void practice2() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input >= 1) {
			
			for(int i = input; i >= 1; i--) {
				System.out.println(i + " ");
			}
			
		} else {
			System.out.println("1 이상의 숫자를 입력하세요");
		}
		
		
		/*
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for (int i = num; i > 0; i--) {
			System.out.print(i + " ");
			
		}
		
		if (1 > num) {
			System.out.print("1 이상의 숫자를 입력하세요");
		}
		*/
	}
	
	public void practice3() {
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= input; i++) {
			sum += i;
			
			if(i == input) {
				
				System.out.print(i + " = " + sum);
				
			} else {
				
				System.out.print(i + " + ");
				
			}
			
		}
		
		/*
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
	
		int sum1 = 0;
		String result = "";
		
		for (int i = 1; i < num; i++ ) {
			
			result += i + " + ";
			sum1 += i;
			
		}
		
		int sum2 = sum1 + num;
		
		System.out.printf("%s" + num + " = %d", result, sum2);
		
		*/
	}

	public void practice4() {
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자만 입력");
			
		} else {
			
			int start = num1;
			int end = num2;
			
			if (num1 > num2) {
				
				start = num2;
				end = num1;
				
			}
			
			for(int i = start; i <= end; i++) {
				
				System.out.println(i + " ");
				
			}
			
		}
		
		/*
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		for (int i = 1; i >= num1 && i <= num2; i++) {
			
			System.out.println(i);
			// if (i <= num1 && i >= num2) {
		}
		*/
	}

	public void practice7() {
		
		// - 행(row)은 입력한 input 만큼
		// - 열(col)은 현재행 (row)만큼 반복
		
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <=input; row++) {
			
		}
				
				
		
	}
	
}
