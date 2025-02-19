package edu.kh.oop.abstraction.Run;

import edu.kh.oop.abstraction.model.service.AbstractionService;

public class adstractionRun {

	public static void main(String[] args) {
		
		//서비스 클래스 객체 생성
		AbstractionService as = new AbstractionService();
		
		//위에서 만든 객체에서 ex1() 메서드 호출
		// as.ex1();
		as.ex2();

	}

}
