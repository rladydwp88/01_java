package edu.kh.oop.abstraction.model.vo;

// model - 프로그램 로직과 관련 되어 있는 데이터를 저장하는 용도 + 비지니스 로직
// VO(Value Object) - 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지

/*
MVC 패턴 - 	Model : 데이터와 비지니스 로직을 처리하는 부분 (DB, 서비스, 객체)
			View : 사용자에게 보여지는 화면(UI - HTML, JSP, Thymeleaf, React
			Controller : 사용자의 요청을 받고, 모델과 뷰를 연결하는 역할 (응답)		
			
애플리케이션의 역할을 세가지로 분리하는 설계 패턴

*/

public class People { // 국민(사람) 클래스
	
	// 클래스란? 객체의 특성(속성과 기능)을 정의한 것
	// == 객체를 만들기 위한 설계도
	
	// 속성 == 값 == Date
	// 값을 저장하기 위한 변수 선언
	// -> 국민이라면 공통적으로 가지고 있는 속성만 작성(추상화)
	// 이름, 성별, 주민번호, 주소, 전화번호, 나이
	// 필드 == 필드 변수 == 멤버 변수
	
	// 캡슐화
	// - 데이터(속성)와 기능을 하나로 묶어서 관리하는 기법
	// - 데이터의 직접적인 접근을 제한하는 것이 원칙이다.
	// -> 직접 접근 못하기 때문에
	//    클래스 내부에 간접 접근 방법을 제공하는
	//    기능(메서드) 작성해둔다.
	// -> getter / setter
	
	/*데이터 직접 접근 제한 방법
	 * 
	 * public (공공의) -> private (사적인, 개인적인) 변경
	 * 
	 */
	
	// [접근제한자] 자료형 변수명;
	private String name;
	private char gender;
	private String pNo; // 12345-1234567
	private String adress;
	private String phone; // "010-1234-1234"
	private int age;
	// public double bitcoin; // 공통점이 아니므로 제거
	
	// 기능 == 행동/동작 == method(메서드)
	public void tax() {
		System.out.println("세금을 냅니다..");
	}
	
	public void vote() {
		System.out.println("투표를 합니다.. 꼭 하세요!");
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//메서드(기능) 형태인 getter/setter를 이용하면 본인이 원하는 기능을 추가 할 수 있음
	// age가 0보다 작을 때 예외 발생시키기
	// age가 0보다 클 때 속성에 전달 받은 값 세팅하기
	
	// if문 만들었을 때
	// throw new IllegalArgumentException ("음수는 안된다..") 메소드 값 넣으면
	// IllegalArgumentException
	// 메서드에 전달 된 인자가(매개변수) 유효하지 않을 때 발생하는 예외
	
	//
	
	// 캡슐화에서 사용할 간접 접근 기능 (getter/setter)
	// [접근제한자] 반환형 메서드명() {}
	
	// name 변수의 값을 호출한 쪽으로
	// 돌려 보내주는 간접 접근 기능 중 getter
	
	/*
	// void : 반환할 값이 없다 (반환형(자료형)이 없다)
	public String getName() {
		return name;
		// return : 반환, 되돌려주다
		// return; : 현재 메서드를 종료하고 호출한 쪽으로 되돌아감.
		// return 값/변수; : 현재 메서드를 종료하고 값/변수 가지고 호출한 쪽으로 되돌아감
	}

	// getter() : 반환형이 무조건 있음
	//            getter는 필드에 작성된 변수값을 호출한 쪽으로 되돌려주는 것.
	//            변수는 자료형이 있을 것.
	//            그 변수를 되돌려준다면 당연히 반환형도 존재할 것!
	
	// name 변수에 값을 세팅하는 간접 접근 기능 중 setter
						// 매개변수
	
	public void setName(String name) {
		
		// **this : 현재 객체
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	
	
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	*/
	
	// alt + shift + s 또는 상단 메뉴 Source
	// -> Generate getters and setters
	
	
	
}
