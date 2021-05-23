package com.java.review.chapter4;

public class Person {

	// 필드 정의
	public String name;
	public int age;

	// 생성자
	public Person() {

	}

	// 생성자
	public Person(String s) {
		name = s;
	}

	// 메서드
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Person aPerson; // 객체에 대한 레퍼런스 변수 aPerson 선언
		aPerson = new Person("김미남"); // Person 객체 생성

		aPerson.age = 30;
		String s = aPerson.getName();

	}

}
