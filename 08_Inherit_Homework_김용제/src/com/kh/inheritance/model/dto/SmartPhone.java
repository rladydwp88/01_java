package com.kh.inheritance.model.dto;

public class SmartPhone extends Phone {
	private String operatingSystem;
	private int storageCapacity;
	
	public SmartPhone() {}
	
	public SmartPhone(String brand, String model, int year, int price, String operatingSystem, int storageCapacity) {
		super(brand, model, year, price);
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	
	@Override
	public void printInfo() {
		Phone p = new Phone();
		
		p.setBrand("Samsung");
		p.setModel("Galaxy S20");
		p.setYear(2020);
		p.setPrice(120000);
		
		System.out.println("Brand : " + p.getBrand());
		System.out.println("Model : " + p.getModel());
		System.out.println("Year : " + p.getYear());
		System.out.println("Price : " + p.getPrice() + "원");
	}
}
