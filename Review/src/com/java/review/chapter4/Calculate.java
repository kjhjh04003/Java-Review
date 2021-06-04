package com.java.review.chapter4;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오> ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		String str = sc.next();
		if (str.charAt(0) == '+') {
			Add add = new Add();
			add.setValue(n1, n2);
			System.out.println(add.calculate());
		} else if (str.charAt(0) == '-') {
			Sub sub = new Sub();
			sub.setValue(n1, n2);
			System.out.println(sub.calculate());
		} else if (str.charAt(0) == '*') {
			Mul mul = new Mul();
			mul.setValue(n1, n2);
			System.out.println(mul.calculate());
		} else if (str.charAt(0) == '/') {
			Div div = new Div();
			div.setValue(n1, n2);
			System.out.println(div.calculate());
		}

	}

}
