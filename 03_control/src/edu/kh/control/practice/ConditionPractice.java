package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
		public void practice1() {
			
			System.out.print("숫자를 한 개 입력하세요 : ");
			int input = sc.nextInt();
			String result;
			
			if (input <= 0) {
				result = "양수만 입력해주세요.";
				
			} else if (input % 2 == 0) {
				result = "짝수 입니다.";
				
			} else {
				result = "홀수 입니다.";
			}
			
			System.out.println(result);
			
		}
		
		public void practice2() {
			
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학 : ");
			int math = sc.nextInt();
			
			int sum = kor + eng + math;
			double avg = sum / 3.0;
			
			if (kor >= 40 || eng >= 40 || math >= 40 || avg < 60) {
			System.out.println("불합격입니다.");
			
		}	else {
			System.out.println("합계 : " + sum);
			System.out.printf("평균 : %.1f\n", avg);
			System.out.println("축하합니다, 합격입니다!");
			
		}
			
			
			
		

	}

		public void practice3() {
			
			System.out.print("1~12 사이의 정수 입력 : ");
			int month = sc.nextInt();
			
			switch (month) {
			
			case 1 : case 3 : case 5 : case 8 : case 10 :  case 12 :
				System.out.println(month + "월은 31일까지 있습니다."); break;
				
			case 4 : case 6 : case 9 : case 11 :
				System.out.println(month + "월은 30일까지 있습니다."); break;
			
			case 2 :
			    System.out.println(month + "월은 28일까지 있습니다."); break;
			
			default : System.out.println(month + "월은 잘못 입력된 달입니다.");
			
			
			}
			
			
		}

		public void practice4() {
			
			System.out.print("키(m)를 입력해 주세요 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게(kg)를 입력해 주세요 : ");
			double weight = sc.nextDouble();
			
			double bmi = weight / (height * height);
			
			System.out.print("BMI 지수 : " + bmi);
			
			
			
			
			System.out.println();
				
			if (bmi < 18.5) {
				System.out.println("저체중");
				
			} else if (bmi >= 18.5 && bmi < 23) {
				System.out.println("정상체중");
				
			} else if (bmi >= 23 && bmi < 25) {
				System.out.println("과체중");
				
			} else if (bmi >= 25 && bmi < 30) {
			    System.out.println("비만");
				
			} else {
				System.out.println("고도 비만");
			}
		}
		
		public void practice5() {
			
			System.out.print("중간 고사 점수 : ");
			int score1 = sc.nextInt();
			
			System.out.print("기말 고사 점수 : ");
			int score2 = sc.nextInt();
			
			System.out.print("과제 점수 : ");
			int score3 = sc.nextInt();
			
			System.out.print("출석 횟수 : ");
			int num = sc.nextInt();
			
		System.out.println("============== 결과 ==============");
			
			System.out.println("");
			
			
		}
		
		
		
		
}
