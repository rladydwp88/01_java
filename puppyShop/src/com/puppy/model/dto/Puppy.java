package com.puppy.model.dto;

public class Puppy {
	private String puppyName; // 강아지 이름
	private String breed; // 견종
	private double age; // 나이(ex 1.2 == 1년 2개월)
	private int price; // 분양가
	private char gender; // 성별
	private char vaccination; // 접종 유무
	private char neutering; // 중성화 유무
	private String size; // 견종 크기 분류
	
	public Puppy() {
		// TODO Auto-generated constructor stub
	}

	public Puppy(String puppyName, String breed, double age, int price, char gender, char vaccination, char neutering,
			String size) {
		super();
		this.puppyName = puppyName;
		this.breed = breed;
		this.age = age;
		this.price = price;
		this.gender = gender;
		this.vaccination = vaccination;
		this.neutering = neutering;
		this.size = size;
	}

	public String getPuppyName() {
		return puppyName;
	}

	public void setPuppyName(String puppyName) {
		this.puppyName = puppyName;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public char getVaccination() {
		return vaccination;
	}

	public void setVaccination(char vaccination) {
		this.vaccination = vaccination;
	}

	public char getNeutering() {
		return neutering;
	}

	public void setNeutering(char neutering) {
		this.neutering = neutering;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "이름 : " + puppyName + " / 견종 : " + breed + " / 나이 :" + age + " / 분양가 : " + price + " / 성별 : "
				+ gender + " / 접종 유무 : " + vaccination + " / 중성화 유무 : " + neutering + " / 크기 분류 : " + size;
	}
	
}
