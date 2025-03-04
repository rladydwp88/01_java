package com.puppy.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.puppy.model.dto.Puppy;

public class PuppyService {
	private Scanner sc = new Scanner(System.in);
	
	private List<Puppy> puppyList = new ArrayList<>();
	
	public PuppyService() { // 기본적으로 넣어줄 세팅값
		puppyList.add(new Puppy("뭉이","골든리트리버", 0.7, 200000, 'M', 'Y', 'N', "대형견"));
		puppyList.add(new Puppy("진솔", "진돗개", 0.3, 250000, 'F', 'N', 'N', "대형견"));
		puppyList.add(new Puppy("똘이", "시바", 0.5, 300000, 'M', 'Y', 'N', "중형견"));
		puppyList.add(new Puppy("양갱", "포메리안", 1.2, 150000, 'F', 'Y', 'Y', "소형견"));
	}
	
	/**
	 * 메뉴 출력용 메서드
	 */
	public void displayMenu() {
		int inputNum = 0;
		
		do {
			System.out.println("\n=====강아지 분양샵=====");
			
			System.out.println("1. 강아지 등록하기");
			System.out.println("2. 강아지 조회하기");
			System.out.println("3. 수정 및 삭제");
			System.out.println("4. 크기별 검색");
			System.out.println("5. 프로그램 종료");
			
			System.out.print("메뉴 번호를 입력해주세요 : ");
			inputNum = sc.nextInt();
			sc.nextLine();
			
			try {
				switch(inputNum) {
				case 1 : System.out.println(addPuppy()); break;
				case 2 : showPuppy(); break;
				case 3 : editPuppty(); break;
				case 4 : searchSize(); break;
				case 5 : System.out.println("프로그램을 종료합니다."); break;
				default	: System.out.println("잘못 입력하셨습니다. 등록 된 메뉴 번호만 입력해주세요.");
				}
			} catch (InputMismatchException e) { // 숫자가 아닌 다른 문자를 입력할 경우
				System.out.println("입력 방식이 유효하지 않습니다. 다시 입력해주세요.");
			}
		}
		
		while(inputNum != 0);
	
	}
	
	/**
	 * 분양할 강아지 정보 등록 메서드
	 */
	public String addPuppy() {
		System.out.println("\n=====강아지 등록=====");
		
		System.out.print("1. 강아지 이름 : ");
		String puppyName = sc.next();
		
		System.out.print("2. 견종 : ");
		String breed = sc.next();
		
		System.out.print("3. 나이 : ");
		double age = sc.nextDouble();
		
		System.out.print("4. 분양가 : ");
		int price = sc.nextInt();
		
		System.out.print("5. 성별(M/F) : ");
		char gender = sc.next().toUpperCase().charAt(0);
		
		System.out.print("6. 접종 유무(Y/N) : ");
		char vaccination = sc.next().toUpperCase().charAt(0);
		
		System.out.print("7. 중성화 유무(Y/N) : ");
		char neutering = sc.next().toUpperCase().charAt(0);
		
		System.out.print("8. 크기 분류(소형견/중형견/대형견) : ");
		String size = sc.next();
		
		// 입력한 값을 한번에 받아서 생성할 변수 생성
		Puppy info = new Puppy(puppyName, breed, age, price, gender, vaccination, neutering, size);
		
		puppyList.add(info); // 입력한 값으로 새로운 배열 추가
		
		return "등록 되었습니다.\n";
	}

	/**
	 * 등록 된 강아지 조회 메서드
	 */
	public void showPuppy() {
		System.out.println("\n=====강아지 조회=====");
		if(puppyList.isEmpty()) {
			System.out.println("등록 된 강아지가 없습니다.");
		} else {
			for(Puppy list : puppyList) {
				System.out.println(list);
			}
		}
	}
	
	/**
	 * 강아지 선택 후 편집 메서드
	 */
	public String editPuppty() {
		System.out.println("\n=====등록된 강아지 수정 및 삭제=====");
		// 등록 된 강아지 검색하기
		System.out.print("수정 및 삭제하실 강아지 이름 : ");
		String search = sc.nextLine();
		
		// 등록된 정보리스트를 검색 후 일치 할 경우 수정과 삭제 중 어떤 작업을 진행할지 정수로 입력받기
		int editNum = 0;
		boolean flag = true;
		
		for(Puppy list : puppyList){
			if(search.equals(list.getPuppyName())) { // 강아지 이름이 일치하는 경우
				System.out.println(list);
				flag = false;
				
				// 수정을 선택한 경우 어떤 정보를 수정할지 선택 수정 정보 입력받기
				System.out.println("1. 수정하기");
				System.out.println("2. 삭제하기");
				
				System.out.print("원하시는 작업을 입력해주세요 : ");
				int iNum = sc.nextInt();
				
				if(iNum == 1) {
					System.out.println("1. 강아지 이름");
					System.out.println("2. 견종");
					System.out.println("3. 나이");
					System.out.println("4. 분양가");
					System.out.println("5. 성별");
					System.out.println("6. 접종 유무");
					System.out.println("7. 중성화 유무");
					System.out.println("8. 크기");
					System.out.println("0. 수정 종료");
					
					System.out.print("어떤 정보를 수정하시겠습니까? : ");
					editNum = sc.nextInt();
					
					switch(editNum) {
					case 1 :
						System.out.println("\n=====강아지 이름 수정=====");
						System.out.print("수정할 이름을 입력해주세요 : ");
						String name = sc.next();
						list.setPuppyName(name);
						break;
					case 2 :
						System.out.println("\n=====강아지 견종 수정=====");
						System.out.print("수정할 견종을 입력해주세요 : ");
						String breed = sc.next();
						list.setBreed(breed);
						break;
					case 3 :
						System.out.println("\n=====강아지 나이 수정=====");
						System.out.print("수정할 나이를 입력해주세요 : ");
						double age = sc.nextDouble();
						list.setAge(age);
						break;
					case 4 :
						System.out.println("\n=====강아지 분양가 수정=====");
						System.out.print("수정할 분양가를 입력해주세요 : ");
						int price = sc.nextInt();
						list.setPrice(price);
						break;
					case 5 :
						System.out.println("\n=====강아지 성별 수정=====");
						System.out.print("수정할 성별을 입력해주세요 : ");
						char gender = sc.next().toUpperCase().charAt(0);
						list.setGender(gender);
						break;
					case 6 :
						System.out.println("\n=====강아지 접종 유무 수정=====");
						System.out.print("수정할 접종 유무를 입력해주세요 : ");
						char vaccination = sc.next().toUpperCase().charAt(0);
						list.setVaccination(vaccination);
						break;
					case 7 :
						System.out.println("\n=====강아지 중성화 유무 수정=====");
						System.out.print("수정할 중성화 유무를 입력해주세요 : ");
						char neutering = sc.next().toUpperCase().charAt(0);
						list.setNeutering(neutering);
						break;
					case 8 :
						System.out.println("\n=====강아지 크기 수정=====");
						System.out.print("수정할 크기를 입력해주세요 : ");
						String size = sc.next();
						list.setSize(size);
						break;
					case 0 : System.out.println("수정을 종료합니다.");
					default : System.out.println("메뉴 번호만 입력해주세요.");
					}
				} else if(iNum == 2) { // 삭제를 선택한 경우
					System.out.println("정말 삭제 하시겠습니까?(Y/N) : ");
					char input = sc.next().toUpperCase().charAt(0);
					
					if(input == 'Y') {
						int index = puppyList.indexOf(list);
						puppyList.remove(index);
					} else {
						return "삭제를 진행하지 않습니다";
					}
				}
			}
			
			if(flag) {
				System.out.println("등록 된 이름이 없습니다.");
			}
		}
		return "수정완료";
	}
	
	public void searchSize() {
		System.out.println("\n=====크기별 검색=====");
		
		System.out.print("검색할 크기 입력 : ");
		String inputSize = sc.next();
		
		boolean flag = true;
		
		// 향상된 for문
		for(Puppy list : puppyList) {
			if(inputSize.equals(list.getSize())) { 
				System.out.println(list); 
				
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("검색 결과가 없습니다.");
		}
	}
}

