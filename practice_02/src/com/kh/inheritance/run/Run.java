package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {
		
		SmartPhone sphone = new SmartPhone();
		sphone.setBrand("Samsung");
		sphone.setModel("Galaxy S20");
		sphone.setYear(2020);
		sphone.setPrice(1200000);
		sphone.setOperatingSystem("Android");
		sphone.setStorageCapacity(128);
		
		BasicPhone bphone = new BasicPhone();

	}

}
