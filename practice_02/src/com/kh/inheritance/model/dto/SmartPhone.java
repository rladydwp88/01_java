package com.kh.inheritance.model.dto;

public class SmartPhone extends Phone {
	private String operatingSystem;
	private int storageCapacity;
	
	public SmartPhone() {}

	public SmartPhone(String operatingSystem, int storageCapacity) {
		super();
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
		System.out.println("Operating System : " + operatingSystem);
		System.out.println("Storage Capacity : " + storageCapacity + "GB");
	}
}
