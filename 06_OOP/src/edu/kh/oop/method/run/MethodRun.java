package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;
import edu.kh.oop.method.model.service.MethodExample;

public class MethodRun {

	public static void main(String[] args) {
		
		MethodExample methodEx = new MethodExample();
		// methodEx.method1();
		
		//<stack>의 이력이 쌓임 - LIFO : Last - Input - First - Out (후입선출)
 		
		// method2() 메서드 실행
		// method1() 메서드 실행
		// main 메서드 실행
		
		MemberService service = new MemberService();
		service.displayMenu();
		// CRUD - Create Read Update Delet

	}

}
