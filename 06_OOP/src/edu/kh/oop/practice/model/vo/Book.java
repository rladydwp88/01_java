package edu.kh.oop.practice.model.vo;

public class Book {
	
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public Book() {}
	
	public Book(String tile, int price, double discountRat, String autho) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [tile=" + title + ", price=" + price + ", discountRate=" + discountRate + ", author=" + author
				+ "]";
	}

	
	public String getTile() {
		return title;
	}

	public void setTile(String tile) {
		this.title = tile;
	}

	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}

