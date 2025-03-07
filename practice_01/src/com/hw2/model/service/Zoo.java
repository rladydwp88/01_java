package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {
	
	Scanner sc = new Scanner(System.in);
	
	private List<Animal> zoo = new ArrayList<>();
	
	public void addAnimal(Animal animal) {
		
	}
	
	public void showAnimals() {
		
	}
	
	public void displayMenu() {
		
		int inputNum = 0;
		
		System.out.println("******** KH 동물원 ********");
		System.out.println("원하는 작업을 선택하세요.");
		System.out.println("1. 동물들의 울음소리 듣기");
		System.out.println("2. 종료");
		
		System.out.println("선택 : ");
		inputNum = sc.nextInt();
	}
}
