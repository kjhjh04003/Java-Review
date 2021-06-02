package com.java.review.chapter4;

// 생성자 생성 및 호출 예
public class Book {
	String title;
	String author;
	int ISBM;

	public Book(String title, String author, int ISBM) { // 생성자
		this.title = title;
		this.author = author;
		this.ISBM = ISBM;
	}

	public static void main(String[] args) {
		Book javaBook = new Book("Java JDK", "황기태", 3333); // 객체 생성, 생성자 호출
	}

}
