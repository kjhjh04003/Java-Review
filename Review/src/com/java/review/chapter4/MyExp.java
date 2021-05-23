package com.java.review.chapter4;

// 지수를 표현하는 MyExp 클래스
// 두 개의 정수형 멤버 필드 base와 exp를 가진다.
// 2의 3승의 경우, base는 2이며 exp는 3이다.
// base와 exp는 양의 정수만 가질 수 있다.
// 정수값을 리턴하는 getValue()라는 메서드를 제공한다.
// getValue()는 base와 exp값으로부터 지수를 계산하여 지수 값으로 리턴한다.
public class MyExp {

	// 필드 생성
	int base;
	int exp;

	// base와 exp 값으로부터 지수를 계산하여 지수 값을 리턴
	public int getValue() {
		int result = 1;
		for (int i = 0; i < exp; i++) { // base를 exp 만큼 반복하여 곱하기
			result = result * base;
		}
		return result;
	}

	public static void main(String[] args) {
		MyExp number1 = new MyExp();
		number1.base = 2;
		number1.exp = 3;
		MyExp number2 = new MyExp();
		number2.base = 3;
		number2.exp = 3;

		System.out.println("2의 3승 = " + number1.getValue());
		System.out.println("3의 3승 = " + number2.getValue());

	}

}
