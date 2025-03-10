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
	
	public void practice4() {
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / ( height * height );
		System.out.println("BMI 지수 : " + bmi);
		
		String result;
		
		if ( bmi < 18.5 ) {
			result = "저체중";
			
		} else if (bmi < 23) {
			result = "정상체중";
			
		} else if ( bmi < 25 ) {
			result = "과체중";
			
		} else if (bmi < 30) {
			result = "비만";
			
		} else {
			result = "고도 비만";
		
		}
		
		System.out.println(result);
		
	}
	
	public void practice5() {
		
		System.out.print("중간 고사 점수 : ");
		double midNum = sc.nextDouble();
		
		System.out.print("기말 고사 점수 : ");
		double finalNum = sc.nextDouble();
		
		System.out.print("과제 점수 : ");
		double reportNum = sc.nextDouble();
		
		System.out.print("출석 횟수 : ");
		double attendNum = sc.nextInt();
		
		midNum *= 0.2;
		finalNum *= 0.3;
		reportNum *= 0.3;
		
		System.out.print("========== 결과 ==========");
		
		if (attendNum < 20 * 0.7) {
			System.out.printf("출석 횟수 부족 (%d/20)", attendNum);
		}
		
		
		
		/*
		System.out.printf("중간 고사 점수(20) : %.1f", midNum * 0.2);
		System.out.printf("기말 고사 점수(30) : %.1f", finalNum * 0.3);
		System.out.printf("과제 점수(20) : %.1f", reportNum * 0.3);
		System.out.printf("출석 점수(20) : %.1f", attendNum * 0.2);
		System.out.println("총점 : ");
		
		String result;
		
		*/
		
		
		
	}



}
