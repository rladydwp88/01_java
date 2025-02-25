package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {
	public static void main(String[] args) {
		
		SmartPhone sphone = new SmartPhone();
		
		sphone.setOperatingSystem("Android");
		sphone.setStorageCapacity(128);
		
		sphone.printInfo();
		System.out.println("Operating System : " + sphone.getOperatingSystem());
		System.out.println("Storage Capacity : " + sphone.getStorageCapacity() + "GB");
		
		System.out.println("=============================");
		
		BasicPhone bphone = new BasicPhone();
		bphone.checkKeyboard();
		bphone.isHasPhysicalKeyboard();
		
	}
}
