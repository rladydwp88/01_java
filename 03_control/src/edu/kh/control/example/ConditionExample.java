package edu.kh.control.example;

import java.util.Scanner;

public class ConditionExample {
	
	Scanner sc = new Scanner(System.in);

	public void ex8() {
		// 놀이기구 탑승 제한 검사 프로그램
		// 조건 - 나이 : 12세 이상
		// - 키 : 140.0cm 이상
		// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
		// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
		// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
		// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
		// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
		// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
		// 나이 O , 키 O : "탑승 가능"

		// [실행화면]
		// 나이 입력 : 130
		// 나이를 잘못 입력 하셨습니다

		// 나이 입력 : 30
		// 키 입력 : 300
		// 키를 잘못 입력 하셨습니다

		// 나이 입력 : 20
		// 키 입력 : 110
		// 나이는 적절하나, 키가 적절치 않음

		// 나이 입력 : 10
		// 키 입력 : 150
		// 키는 적절하나, 나이가 적절치 않음

		// 나이 입력 : 10
		// 키 입력 : 110
		// 나이와 키 모두 적절치 않음

		// 나이 입력 : 15
		// 키 입력 : 160
		// 탑승 가능!!!
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result; // 결과 저장용 변수 선언
				
		if (age < 0 || age > 100) {
			result = "나이를 잘못 입력하셨습니다.";
			
		} else { // 나이를 0~100 범위로 잘 입력한 경우
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();
			
			if (height < 0 || height > 250);
			result = "키를 잘못 입력하셨습니다.";
			
			if(age < 12 && height >= 140.0);
	
		}
		
		
	
		
		

	}
	
	public void ex9() {
		//switch 문
		// 여러 case 중 하나를 선택하여 수행하는 조건문
		
		// 요일 번호 입력 ( 1 ~ 7 ) : 3
		// 수요일
		
		System.out.println("요일 번호 입력 : ");
		int day = sc.nextInt();
		
		switch(day) {
		case 1 : System.out.print("월요일"); break;
		case 2 : System.out.print("화요일"); break;
		case 3 : System.out.print("수요일"); break;
		case 4 : System.out.print("목요일"); break;
		case 5 : System.out.print("금요일"); break;
		case 6 : System.out.print("토요일"); break;
		case 7 : System.out.print("일요일"); break;
		default : System.out.print("잘못된 입력이다.");
			
		}
	
	}
	
	public void ex10() {
		
		// 점수 입력 (0~100) : 85
		// 학점 : B
		
		System.out.println("점수 입력 (0~100) : ");
		// 점수 범위 벗어난 건 생각 안함
		
		int score = sc.nextInt();
		
		switch(score / 10) { // 점수를 10으로 나눈 몫을 기준으로 학점 구분
		case 10:
		case 9: System.out.print("학점 : A"); break;
		case 8: System.out.print("학점 : B"); break;
		case 7: System.out.print("학점 : C"); break;
		case 6: System.out.print("학점 : D"); break;
		default: System.out.print("학점 : F");
		
		}
		
		
		
		
	}
	

}
