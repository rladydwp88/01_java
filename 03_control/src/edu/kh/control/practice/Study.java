package edu.kh.control.practice;

import java.util.Scanner;

public class Study {
	
	Scanner sc = new Scanner(System.in);
	
	public void operatorPractice1() {
		System.out.print("인원 수 : ");
		int iNum1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int iNum2 = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 : %d\n", iNum2 / iNum1);
		System.out.printf("남는 사탕 개수 : %d\n" , iNum2 % iNum1);
	}
	
	public void operatorPractice2() {
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년 : ");
		int num1 = sc.nextInt();
		
		System.out.print("반 : ");
		int num2 = sc.nextInt();
		
		System.out.print("번호 : ");
		int num3 = sc.nextInt();
		
		System.out.print("성별(남학색/여학생) : ");
		String gen = sc.next();
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", num1, num2, num3, name, gen, score);
	}
	
	public void operatorPractice3() {
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		int sum = kor+math+eng;
		double avg = sum/3.0;
		
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.1f", avg);
	}
	
	public void conditionPractice1() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		String result;
		
		if(input <= 0) {
			result = "양수만 입력해주세요";
			
		} else if( input % 2 == 0 ) {
			result = "짝수입니다";
			
		} else {
			result = "홀수입니다";
		}
		
		System.out.println(result);	
	}
	
	public void conditionPractice2() {
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor+math+eng;
		double avg = sum/3.0;
		
		if(kor < 40 || math < 40 || eng < 40 || avg < 60) { 
			System.out.println("불합격입니다.");
		} else { 
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.printf("평균 %.1f\n", avg);
			System.out.println("축하합니다. 합격입니다!");
		}
	}
	
	public void conditionPractice3() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();

		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 4, 6, 9, 11:
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일까지 있습니다.");
			break;
		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
	}
	
	public void conditionPractice4() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height*height);
		String result;
		
		System.out.println("BMI 지수 : " + bmi);

		if(bmi < 18.5){
			result = "저체중";
		} else if(18.5 <= bmi && bmi < 23) {
			result = "정상체중";
		} else if(23 <= bmi && bmi < 25) {
			result = "과체중";
		} else if(25 <= bmi && bmi < 30) {
			result = "비만";
		} else {
			result = "고도 비만";
		}
		System.out.println(result);
	}

}
