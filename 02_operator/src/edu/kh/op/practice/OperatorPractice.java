package edu.kh.op.practice;

import java.util.Scanner;

// 기능 제공용 클래스
public class OperatorPractice {
	
	public void practice1(){
		/*
		메소드 명 : public void practice1(){}
		모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
        1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.

		[실행화면]
		인원 수 : 29
		사탕 개수 : 100
		1인당 사탕 개수 : 3
		남는 사탕 개수 : 13	
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt(); 
		
		System.out.print("사탕 개수 : ");
		int input2 = sc.nextInt(); 
		
		System.out.print("1인당 사탕 개수 : " + (input2 / input1));
		
		System.out.println();
		
		System.out.print("남는 사탕 개수 : " + (input2 - input1 * (input2 / input1)) );
		
	}
	
	public void practice2(){
	/*
	 * 메소드 명 : public void practice2(){}
	키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.

	ex.
	이름 : 홍길동
	학년(정수만) : 3
	반(정수만) : 4
	번호(정수만) : 15
	성별(남학생/여학생) : 남학생
	성적(소수점 아래 둘째 자리까지) : 85.75
	3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String input1 = sc.nextLine(); 
		
		System.out.print("학년 : ");
		int intNum1 = sc.nextInt(); 
		
		System.out.print("반 : ");
		int intNum2 = sc.nextInt(); 
		
		System.out.print("번호 : ");
		int intNum3 = sc.nextInt(); 
		
		sc.nextLine();
		
		System.out.print("성별 : ");
		String input2 = sc.nextLine(); 
		
		System.out.print("성적 : ");
		double dNum = sc.nextDouble(); 
		
		System.out.printf( "%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", intNum1, intNum2, intNum3, input1, input2, dNum );
	
	}
	
	public void practice3(){
	/*
	메소드 명 : public void practice3(){}
	국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
	세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.

	[실행화면]
	국어 : 60
	영어 : 80
	수학 : 40
	합계 : 180
	평균 : 60.0
	*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int input1 = sc.nextInt();
				
		System.out.print("영어 : ");
		int input2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int input3 = sc.nextInt();
		
		System.out.print("합계 : ");
		System.out.println( input1 + input2 + input3 );
		
		System.out.print("평균 : ");
		System.out.println( (input1 + input2 + input3) / 3.0);
	}
}
