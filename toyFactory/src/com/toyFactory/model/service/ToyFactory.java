package com.toyFactory.model.service;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {
	
	private Scanner sc = new Scanner(System.in);
	
	private Set<Toy> toyList = new HashSet<>();
	
	public ToyFactory() {
		toyList.add(new Toy("마이롱레그", 8, 36000, "분홍색", "19950805", ""));
		toyList.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", ""));
		toyList.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", ""));
		toyList.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", ""));
		toyList.add(new Toy("파피", 12, 57000, "빨간색", "19931225", ""));
	}
}
