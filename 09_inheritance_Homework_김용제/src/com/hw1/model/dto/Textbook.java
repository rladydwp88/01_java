package com.hw1.model.dto;

public class Textbook extends Book {
	private String subject;
	
	public Textbook() {}

	public Textbook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void displayInfo() {
		System.out.printf("[전문 서적] 제목 : %s / 저자 : %s / 장르 : %s", super.getTitle(), super.getAuthor(), subject);
	}
}
