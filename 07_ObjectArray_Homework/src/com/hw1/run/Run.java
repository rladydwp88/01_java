package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {
	
	public static void main(String[] args) {
		
//		3개의 생성자를 사용하여 3명의 사원 정보를
//		배열로 생성한 후 출력 해보고 값이 없는
//		필드에 각각 값을 입력해 넣어 출력
//		직원 각각의 보너스가 적용된 연봉을 계산하여
//		출력하고 총 직원 연봉의 평균을 구하여 출력
		
		// 객체 배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
		Employee[] empArr = new Employee[3];
		empArr[0] = new Employee();
		empArr[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실"); 
		empArr[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		for(int i = 0; i < empArr.length; i++) {
			System.out.println();
		}
		
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
		
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 연봉 = (급여+(급여*보너스포인트))*12
		
		// 3명의 직원에 연봉 평균을 구하여 출력

	}

}
