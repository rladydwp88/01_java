package edu.kh.array.ex;

import java.util.Scanner;

public class Ex {
		
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		// 5명의 키(cm)를 입력받고 평균 구하기

		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 163.7
		// ..
		// 5번 키 입력 : 167.2
		
		// 평균 : 177.02cm
		
		double[] height = new double[3];
		double sum = 0;
		
		for (int i = 0; i < height.length; i++) {
			
			System.out.print((i+1) + "번 키 입력 : ");
			height[i] = sc.nextDouble();
			
			sum += height[i];
		
		}
		
		System.out.printf("\n평균 : %.2fcm", sum / height.length);
		
	}
	
	public void ex2() {
		
		// 입력 받은 인원 수 만큼의 점수를 입력받아 배열에 저장
		// 입력이 완료되면 점수 합계, 평균, 최고점, 최저점 출력
		
		// ex)
		// 입력 받을 인원 수 : 4
		// 1번 점수 입력 : 100
		// 2번 점수 입력 : 80
		// 3번 점수 입력 : 50
		// 4번 점수 입력 : 60
		
		// 합계 : 290
		// 평균 : 72.5
		// 최고점 : 100
		// 최저점 : 50
		
		System.out.print("입력 받을 인원 수 : ");
		int input = sc.nextInt();
		
		int[] score = new int[input];
		
		for(int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "번 점수 입력 : "); 
			score[i] = sc.nextInt();
		}
		
	}
	
}
