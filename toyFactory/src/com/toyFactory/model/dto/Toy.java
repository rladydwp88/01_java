package com.toyFactory.model.dto;

public class Toy {
	private String toyName;
	private int userAge;
	private int price;
	private String color;
	private String made;
	private String addmaterial;
	
	public Toy() {}

	public Toy(String toyName, int userAge, int price, String color, String made, String addmaterial) {
		super();
		this.toyName = toyName;
		this.userAge = userAge;
		this.price = price;
		this.color = color;
		this.made = made;
		this.addmaterial = addmaterial;
	}

	public String getToyName() {
		return toyName;
	}

	public void setToyName(String toyName) {
		this.toyName = toyName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
	}

	public String getAddmaterial() {
		return addmaterial;
	}

	public void setAddmaterial(String addmaterial) {
		this.addmaterial = addmaterial;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
