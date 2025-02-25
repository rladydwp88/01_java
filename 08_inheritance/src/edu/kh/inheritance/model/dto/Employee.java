package edu.kh.inheritance.model.dto;

/*
 * 
 * Object
 * 	ㄴ Person
 * 		ㄴ Employee
 * 
 */

// final 클래스 : 상속불가(누군가의 부모가 될 수 없다.)
// -> 제공되는 클래스 그대로 사용해야 하는 경우
// ex) String 클래스
public /*final*/ class Employee extends Person {
	// 필드
	private String company; // 회사명
	
	public Employee() {}
	
	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);
		this.company = company;
	}

	// Person으로 부터 상속받은 메서드 중
	// move() 메서드를 Employee에 맞게 재정의(== 오버라이딩)
	
	// @Override 어노테이션 : 해당 메서드가 오버라이딩 되었음을
	// 컴파일러에게 알려주는 역할
	// -> 컴파일러에게 문법 체크를 하도록 알린다
	// -> 부모에게 해당 메서드가 있는지 체크
	// -> 이름, 매개변수 타입과 개수, 순서가 일치하는지 여부 검사
	
	@Override
	public void move() {
		// super 참조변수 : 상속관계에서 부모 객체를 가리키는 참조변수
		System.out.println("오버라이딩 된 move()");
		System.out.println("효율적으로 빨리 일하고 퇴근한다");
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	// Employee 객체 생성 ("김노동", 36, "한국", "KH정보교육원")
	// toString 이용한 출력시 : 김노동 / 36 / 한국 / KH정보교육원
	@Override
	public String toString() {
		return super.toString() + " / " + company;
	}
	
	/*
	 * final 메서드 -> 오버라이딩 불가
	 * - 메서드의 기능이 변하면 안되는 경우
	 */
	public final void onlyEmployee() {
		System.out.println("final 메서드입니다.");
	}
}
