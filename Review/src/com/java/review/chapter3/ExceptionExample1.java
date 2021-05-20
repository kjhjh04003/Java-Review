package com.java.review.chapter3;

import java.util.Scanner;

// 정수를 0으로 나누는 프로그램
public class ExceptionExample1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;

		System.out.print("나뉨수를 입력하시오:"); // a/b에서 a에 해당하는 수 입력
		dividend = in.nextInt();
		System.out.println("나눗수를 입력하시오:"); // a/b에서 b에 해당하는 수 입력
		divisor = in.nextInt();
		System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");
		// divisor을 0으로 입력하면 ArithmeticException: / by zero 에러 발생
		// 정수를 0으로 나눌 수 없기 때문
	}

}
