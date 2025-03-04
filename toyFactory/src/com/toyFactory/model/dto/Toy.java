package com.toyFactory.model.dto;

import java.util.Objects;

public class Toy {
	private String toyName;
	private int age;
	private int price;
	private String color;
	private String date;
	private String material;
	
	public Toy() {}

	public Toy(String toyName, int age, int price, String color, String date, String material) {
		super();
		this.toyName = toyName;
		this.age = age;
		this.price = price;
		this.color = color;
		this.date = date;
		this.material = material;
	}

	public String getToyName() {
		return toyName;
	}

	public void setToyName(String toyName) {
		this.toyName = toyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "Toy [toyName=" + toyName + ", age=" + age + ", price=" + price + ", color=" + color + ", date=" + date
				+ ", material=" + material + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, color, date, material, price, toyName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return Objects.equals(age, other.age) && Objects.equals(color, other.color) && Objects.equals(date, other.date)
				&& Objects.equals(material, other.material) && price == other.price
				&& Objects.equals(toyName, other.toyName);
	}

}
