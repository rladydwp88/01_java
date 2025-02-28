package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {
	
	Scanner sc = new Scanner(System.in);
	
	private List<Animal> animals = new ArrayList<>();
	
	public Zoo() {}
	
	public void addAnimal() {
		
	}
	
	public void showAnimals() {
		
	}
	
	public void displayMenu() {
		
		System.out.println("****** KH 동물원 ******");
		
		System.out.print("원하는 작업을 선택하세요 : ");
		int input = sc.nextInt();
		
		
	}
}
