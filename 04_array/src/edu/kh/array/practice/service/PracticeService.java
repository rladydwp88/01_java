package edu.kh.array.practice.service;

import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {

		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			
			System.out.print(arr[i] + " ");
			
			if(arr[i] % 2 != 0) {
				sum += arr[i];
			}
		}
		
		System.out.print("\n짝수 번째 인덱스 합 : " + sum);
		
	}
	
	public void practice2() {

		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = arr.length - 1; i >= 0; i--) {
			arr[i] = i+1;
			
			System.out.print(arr[i] + " ");
			
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.print("\n홀수 번째 인덱스 합 : " + sum);
		
	}

	public void practice3() {
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num]; 
		
		for(int i = 0; i < num; i++) {
			arr[i] = i;
			
			System.out.print((i+1) + " ");
		}
		
	}
	
	public void practice4() {
		
		/*
		int[] arr = new int[5];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
			
			if(arr[i] < 5) {
				System.out.printf("입력 %d : ", i);
				int input = sc.nextInt();
			} else {
				System.out.print("검색할 값 : ");
				int search = sc.nextInt();
				
				boolean flag = false;
				
				if(input == search) {
					System.out.println("인덱스 : " + i);
				}
			}
			
		}
		*/
		
		int[] arr = new int[5];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;	
			
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();
				
			}
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
	}
	
	public void practice5() {
		
		/*
		메소드 명 : public void practice5(){}
		문자열을 입력 받아 문자 하나하나를 배열에 넣고
		검색할 문자가 문자열에 몇 개 들어가 있는지
		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		
		[실행 화면]
		문자열 : application
		문자 : i
		application에 i가 존재하는 위치(인덱스) : 4 8
		i 개수 : 2
		*/
		
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = input.charAt(i);
		}
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		System.out.print(input + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		int count = 0;
				
		for(int i = 0; i < arr.length; i++ ) {
			
			if(arr[i] == ch) {
				System.out.print(i + " ");
				count ++ ;	
			}
		}
		
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
		
	}
		
}
