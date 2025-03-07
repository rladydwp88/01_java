package com.toyFactory.model.service;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {
	Scanner sc = new Scanner(System.in);
	
	public void diplayMenu() {
		
		Set<Toy> materials = new HashSet<>();
		
		
		int menuNum = 0;
		
		do {
			System.out.println("<<플레이타임 공장>>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			
			System.out.println("선택 : ");
		}
		while(menuNum != 0);
		
		try {
			menuNum = sc.nextInt();
		} catch {
			if(menuNum )
		}
	}
}
