package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1 () {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		String result = " ";
		
		if ( input > 1 ) {
			for (int i = 1; i <= input; i++) {
				System.out.print(i + result);
			}
			
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
	}
	
	public void practice2() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		String result = " ";
		
		if (input >= 1) {
			for (int i = input; i >= 1; i--) {
				System.out.print(i + result);
			}
			
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		
	}
	
	public void practice3() {
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= input; i++) {
			
			sum += i;
			
			if (i < input) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = " + sum);
			}
			
		}
		
	}
	
	public void practice4() {

		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();

		if (input1 < 1 || input2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {

			int start = input1;
			int end = input2;

			if (input1 > input2) {
				start = input2;
				end = input1;
			}

			for (int i = start; i <= end; i++) {
				System.out.print(i + " ");
			}

		}

		/*
		for (int i = 1; i >= input1 || i <= input2; i++) {
			
			if (input1 > input2) {
				
			} else {
				System.out.println(i);
			}
			
		}
		*/
	}
	
	public void practice5() {
		
		/*
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		System.out.println("===== " + input + "단" + " ====");
		
		for (int i = 1; i <= 9; i++) {
			
			sum = input * i;
			
			System.out.println(input + " * " + i + " = " + sum);
			
			
		}
		*/
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		System.out.println("===== " + input + "단 ====");
		
		for (int i = 1; i <= 9; i++) {
			
			System.out.printf("%d x %d = %d\n", input, i, input * i );
			
		}
		
	}
	
	public void practice6() {
		
	}
	
}
