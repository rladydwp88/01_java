package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print( "숫자를 한 개 입력하세요 : " );
		int iNum = sc.nextInt();
		
		String result;
		
		if (iNum <= 0) {
			result = "양수만 입력해주세요.";
			
		} else if (iNum % 2 == 0) {
			result = "짝수입니다.";
			
		} else {
			result = "홀수입니다.";
		}
		
		System.out.println(result);
		
		
	}

	public void practice2() {
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		if (kor >= 40 && math >=  40 && eng >=  40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
			
		} else {
			System.out.println("불합격입니다.");
		}

		
	}

	public void practice3() {
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch (month) {
		
		case 1, 3, 5, 7, 8, 10, 12 :
			System.out.println(month + "월은 31일 까지 있습니다."); break;
		
		case 4, 6, 9, 11 :
			System.out.println(month + "월은 30일 까지 있습니다."); break;
		
		case 2 :
			System.out.println(month + "월은 28일 까지 있습니다."); break;
		
		default :
			System.out.println(month + "월은 잘못 입력된 값입니다."); break;
		
		
		}
		
	}



}
