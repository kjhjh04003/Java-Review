package com.java.review.chapter3;

// do-while문을 이용하여 'a'부터 'z'까지 출력하는 프로그램
public class DowhileSample {

	public static void main(String[] args) {
		char a = 'a';

		do {
			System.out.print(a+" ");
			a = (char) (a + 1); // 1을 더하면 다음 문자에 해당하는 ASCII 값이 됨
		} while (a <= 'z');

	}

}
