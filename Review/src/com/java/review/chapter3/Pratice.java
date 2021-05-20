package com.java.review.chapter3;

import java.util.Scanner;

public class Pratice {

	public static void main(String[] args) {
//		num1(); // 구현o
//		num2(); // 보류
//		num3(); // 구현o
		num4();
//		num5();
//		num6();
//		num7();
//		num8();
//		num9();
//		num10();
//		num11();
//		num12();

	}

	private static void num12() {
		// 반복문을 이용하여 369게임
		// 1~99까지 "박수 한번", "박수 두번"

	}

	private static void num11() {
		// 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원, 100원 50원, 10원, 1원이 각 몇 개로 변환되는지 출력
		// 예) 65370 -> 오만원권 1매, 만원권 1매, 천원권 5매, 100원 3개, 50원 1개, 10원 2개
		// 배열과 반복문 이용
		// int [] unit = {50000,10000,1000,500,100,50,10,1}; -> 환산할 돈의 종류
	}

	private static void num10() {
		// 명령행 인자 중에서 정수만을 골라 합을 구하라.

	}

	private static void num9() {
		// main() 메서드를 이용하여 인자에 정수를 입력받아 평균을 구하는 문제
		// int i=Integer.ParseInt("10"); -> 문자열을 정수로 변환할 때 사용

	}

	private static void num8() {
		// 4*4의 2차원 배열을 만들고 이곳에 1~10까지 범위의 정수를 8개만 랜덤하게 생성하여 임의의 위치에 삽입
		// 동일한 수가 나올 수도 있다.
		// 나머지 8개의 숫자는 모두 0이다.

	}

	private static void num7() {
		// 4*4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여 정수 16개를 배열에 저장하고 출력
		// int i=(int)Math.round(Math.random()*9+1);

	}

	private static void num6() {
		// 정수10개를 입력받아 배열에 저장하고 증가하는 순서로 정렬하고 이를 출력

	}

	private static void num5() {
		// 정수10개를 입력받아 배열에 저장하고 이 정수 중에서 3의 배수만 골라 출력하는 프로그램

	}

	private static void num4() {
		// 두 수를 입력받아 최대공약수를 출력하는 프로그램

	}

	private static void num3() {
		// 0보다 큰 정수를 입력받고 이 정수를 이진수로 출력하고 이진수에 들어가있는 1의 개수 출력
		Scanner in = new Scanner(System.in);
		System.out.print("0보다 큰 정수를 입력하시오> ");
		int num = in.nextInt();
		int cnt = 0;

		String str = Integer.toBinaryString(num);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1')
				cnt++;
		}
		System.out.println("2진수 변환 : " + str);
		System.out.println("1의 개수 : " + cnt);

	}

	private static void num2() {
		// 임의의 문자를 입력받고 그 문자보다 알파켓 순위가 낮은 모든 문자를 출력하는 프로그램
		Scanner in = new Scanner(System.in);
		System.out.print("알파벳 한 문자를 입력하시오>> ");
		String str = in.next();
		char ch = str.charAt(0);

		for (char i = 'a'; i < ch; i++) {
			for (char j = i; j <= ch; j++) {
				System.out.print(j);

			}
			System.out.println();
		}

	}

	private static void num1() {
		// 임의의 정수를 입력받고 *를 출력하는 프로그램
		Scanner in = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하시오>> ");
		int num = in.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
