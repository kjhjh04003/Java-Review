package com.java.review.chapter3;

import java.util.Scanner;

// while문을 이용하여 키보드에서 숫자를 입력받아 입력받은 수의 평균을 출력하는 프로그램
public class WhileSample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 0; // 입력된 수의 갯수
		double sum = 0; // 입력된 수의 합
		int i = 0;

		while ((i = in.nextInt()) != 0) { // 0이 입력되면 while문 벗어남
			sum = sum + i;
			n++;
		}
		System.out.println("입력된 수의 개수는 " + n + "개이며 평균은 " + sum / n + "입니다.");

	}

}
