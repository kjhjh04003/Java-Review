package com.java.review.chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class Pratice {

	public static void main(String[] args) {
//		num1(); // 구현o
//		num2(); // 보류
//		num3(); // 구현o
//		num4(); // 구현o
//		num5(); // 구현o
//		num6(); // 구현o
//		num7(); // 구현o
//		num8();
		// num9();
		// main() 메서드를 이용하여 인자에 정수를 입력받아 평균을 구하는 문제
		// int i=Integer.ParseInt("10"); -> 문자열을 정수로 변환할 때 사용
//		double sum = 0;
//		for (int i = 0; i < args.length; i++)
//			sum += Double.parseDouble(args[i]);
//		System.out.println("합 : " + sum);
//		System.out.println("평균 : " + sum / args.length);

		// num10(); // 보류
		// 명령행 인자 중에서 정수만을 골라 합을 구하라.
//		num11(); // 구현o
		num12(); // 구현o

	}

	private static void num12() {
		// 반복문을 이용하여 369게임
		// 1~99까지 "박수 한번", "박수 두번"
		for (int i = 1; i < 100; i++) {
			System.out.print(i + ">> ");
			String str = Integer.toString(i);
			if (str.contains("33") || str.contains("66") || str.contains("99")) {
				System.out.print("짝짝");
				System.out.println();
			} else if (str.contains("3") || str.contains("6") || str.contains("9")) {
				System.out.print("짝");
				System.out.println();
			} else {
				System.out.println();
			}

		}

	}

	private static void num11() {
		// 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원, 100원 50원, 10원, 1원이 각 몇 개로 변환되는지 출력
		// 예) 65370 -> 오만원권 1매, 만원권 1매, 천원권 5매, 100원 3개, 50원 1개, 10원 2개
		// 배열과 반복문 이용
		// int [] unit = {50000,10000,1000,500,100,50,10,1}; -> 환산할 돈의 종류

		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 }; // 환산할 돈
		Scanner in = new Scanner(System.in);

		int money = in.nextInt();
		for (int i = 0; i < unit.length; i++) {
			System.out.printf("%d원 %d개%n", unit[i], money / unit[i]);
			money = money - (money / unit[i]) * unit[i];
		}

	}

	private static void num8() {
		// 4*4의 2차원 배열을 만들고 이곳에 1~10까지 범위의 정수를 8개만 랜덤하게 생성하여 임의의 위치에 삽입
		// 동일한 수가 나올 수도 있다.
		// 나머지 8개의 숫자는 모두 0이다.
		int intArray[][] = new int[4][4];
		int count = 0; // 8개만 랜덤하게 만들기 위한 증가값
		int n1 = 0, n2 = 0; // 4*4 배열에 맞는 행과 열을 랜덤하게 갖기 위한 변수

		while (count < 8) {
			n1 = (int) Math.round(Math.random() * 3); // 행을 랜덤하게
			n2 = (int) Math.round(Math.random() * 3); // 열을 랜덤하게
			if (intArray[n1][n2] == 0) { // 랜덤하게 지정된 배열의 값이 0이라면
				intArray[n1][n2] = (int) Math.round(Math.random() * 9 + 1); // 1~10까지의 정수 중 랜덤한 값을 배열에 저장
				count++; // 8개까지만 저장하기 위한 카운트 증가
			}
//			System.out.println(count);

		}
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length; j++) {
				System.out.print(intArray[i][j] + " ");

			}
			System.out.println();
		}

	}

	private static void num7() {
		// 4*4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여 정수 16개를 배열에 저장하고 출력
		// int i=(int)Math.round(Math.random()*9+1);
		int intArray[][] = new int[4][4];

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				int r = (int) Math.round(Math.random() * 9 + 1);
				intArray[i][j] = r;
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void num6() {
		// 정수10개를 입력받아 배열에 저장하고 증가하는 순서로 정렬하고 이를 출력
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[10];
		int temp = 0;
		for (int i = 0; i < intArray.length; i++) // 배열의 길이만큼 반복
			intArray[i] = in.nextInt(); // 10개의 정수를 입력받아 배열에 저장한다.

		for (int i = 0; i < intArray.length; i++) { // 배열의 길이만큼 반복
			for (int j = i; j < intArray.length; j++) { // 배열의 길이만큼 반복
				if (intArray[i] > intArray[j]) { // 배열의 값과, 그 다음 값을 비교하여 크다면
					temp = intArray[i]; // temp 변수에 큰값을 저장
					intArray[i] = intArray[j]; // 작은값을 비교대상의 첫번째 인덱스에 저장
					intArray[j] = temp; // temp 변수 값을 비교대상의 두번쨰 인덱스에 저장
				}
			}
			System.out.print(intArray[i] + " ");
		}
		System.out.println();

	}

	private static void num5() {
		// 정수10개를 입력받아 배열에 저장하고 이 정수 중에서 3의 배수만 골라 출력하는 프로그램
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[10];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = in.nextInt();

			if (intArray[i] % 3 == 0)
				System.out.print(intArray[i] + " ");
		}

	}

	private static void num4() {
		// 두 수를 입력받아 최대공약수를 출력하는 프로그램
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int min = 0;

		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % 1 == 0)
				min = i;
		}
		System.out.println("최대 공약수 : " + min);

	}

	private static void num3() {
		// 0보다 큰 정수를 입력받고 이 정수를 이진수로 출력하고 이진수에 들어가있는 1의 개수 출력
		Scanner in = new Scanner(System.in);
		System.out.print("0보다 큰 정수를 입력하시오> ");
		int num = in.nextInt();
		int cnt = 0;

		String str = Integer.toBinaryString(num); // 10진수 num을 2진수로 변환하여 str에 저장
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') // str의 길이만큼 돌면서 문자 하나씩 확인하여 1이면
				cnt++; // 갯수를 증가시킨다.
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
