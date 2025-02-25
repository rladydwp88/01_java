package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone {
	private boolean hasPhysicalKeyboard;
	
	public BasicPhone() {}

	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}

	public boolean isHasPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}

	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	public void checkKeyboard() {
		Phone p = new Phone();
		
		p.setBrand("Nokia");
		p.setModel("3310");
		p.setYear(2000);
		p.setPrice(100000);
		
		p.printInfo();
		
		if (this.hasPhysicalKeyboard != true) {
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
		} else {
			System.out.println("이 휴대폰은 물리적 키보드가 없습니다.");
		}
	}
}
