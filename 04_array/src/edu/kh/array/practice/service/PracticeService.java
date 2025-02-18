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
		
		for(int i = arr.length-1; i >= 0; i--) {
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
		 int input = sc.nextInt();
		 
		 int[] arr = new int[input];
		 
		 for(int i = 0; i < input; i++) {
			 arr[i] = i;
			 System.out.print((i+1) + " ");
		 }
		 
	 }
	
	 public void practice4() {
		 
		 int[] arr = new int[5];
		 for(int i = 0; i < arr.length; i++) {
			 System.out.print("입력 " + i + " : ");
			 arr[i] = sc.nextInt();

		 }
		
		 System.out.print("검색할 값 :");
		 int search = sc.nextInt();
		 
		 boolean flag = false;
		 
		 for(int i = 0; i < arr.length; i++) {
			 if(arr[i] == search) {
				 System.out.println("인덱스 : " + i);
				 flag = true;				 
			 } 
			 
			 if(!flag){
				 System.out.println("일치하는 값이 존재하지 않습니다.");
				 break;
			 }
			 
		 }
		 
	 }
	 
	 public void practice5( ) {
		 
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
	 
	 public void practice6() {
		 
		 System.out.print("정수 : ");
		 int num = sc.nextInt();
		 
		 int[] arr = new int[num];
		 int sum = 0;
		 
		 for(int i = 0; i < arr.length; i++) {
			 
			 System.out.print("배열 " + i +"번째 인덱스에 넣을 값 : ");
			 int iNum = sc.nextInt();
			 arr[i] = iNum;
			 sum += arr[i];
		 }
		 
		 for(int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + " ");
		 }
		 
		 
		 System.out.println("\n총 합 : " + sum);
		 
	 }
	 
	 public void practice7() {
		 
		 System.out.print("주민등록번호(-포함) : ");
		 String num = sc.nextLine();
		 
		char[] arr = new char[num.length()];
		 
		 for(int i = 0; i < arr.length; i++) {
			 
			 if(i >=  8) {
				 arr[i] = '*';
			 } else
				 arr[i] = num.charAt(i);
			 
			 System.out.print(arr[i]);
		 }
		 
	 }
	 
}
