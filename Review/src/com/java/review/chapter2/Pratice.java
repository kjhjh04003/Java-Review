package com.java.review.chapter2;

import java.util.Scanner;

public class Pratice {

	public static void main(String[] args) {
//		num1(); // 구현o
//		num2(); // 구현o
//		num3(); // 구현o
//		num4(); // 보류
//		num5(); // 구현o
//		num6(); // 구현o
//		num7(); // 구현o
		num8(); // 구현o

	}

	private static void num8() {
		// (50,50)과 (100,100)의 두 점으로 이루어진 직사각형이 있다고 가정
		// 점 x1,y1과 점 x2,y2를 입력받아 해당 직사각형과 기존 직사각형이 충돌하는지 판별
		Scanner in= new Scanner(System.in);
		System.out.print("점 x1,y1과 x2,y2를 입력해주세요> ");
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();

		if ((x1 >= 50 && x2 <= 100 || x1 <= 100 && x2 >= 50) && (y1 >= 50 && y2 <= 100 || y1 <= 100 && y2 >= 50))
			System.out.println("사각형이 겹칩니다.");
		else
			System.out.println("사각형이 겹치지 않습니다.");

	}

	private static void num7() {
		// (50,50)과 (100,100)의 두 점으로 이루어진 직사각형이 있다고 가정
		// 점 x,y를 입력받아 두 점이 직사각형 안에 있는지 판별
		Scanner in = new Scanner(System.in);
		System.out.print("점 x,y를 입력해주세요> ");
		int x = in.nextInt();
		int y = in.nextInt();

		if (x > 50 && x < 100 && y > 50 && y < 100)
			System.out.printf("점 %d,%d는 직사각형 안에 있습니다.", x, y);
		else
			System.out.printf("점 %d,%d는 직사각형 안에 없습니다.", x, y);

	}

	private static void num6() {
		// 연도를 입력받아 윤년인지 평년인지 판별하는 프로그램
		// 연도를 4로 나누어떨어지면 우선 윤년이라고 하고
		// 그 중에서 100으로 나누어떨어지는 해는 평년
		// 다만 400으로 나누어떨어지는 해는 다시 윤년
		Scanner in = new Scanner(System.in);
		System.out.print("년도를 입력해주세요> ");
		int year = in.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			System.out.println("윤년입니다.");
		else
			System.out.println("평년입니다.");

	}

	private static void num5() {
		// 정수를 3개 이벽받고 이 3개의 수로 삼각형을 만들 수 있는지 판별
		// 삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야한다.
		Scanner in = new Scanner(System.in);
		System.out.print("3개의 정수를 입력해주세요> ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();

		if ((num1 + num2) < num3 || (num1 + num3) < num2 || (num2 + num3) < num1)
			System.out.println("삼각형을 만들 수 없습니다.");
		else
			System.out.println("삼각형을 만들 수 있습니다.");

	}

	private static void num4() {
		// TODO Auto-generated method stub

	}

	private static void num3() {
		// 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원, 100원 50원, 10원, 1원이 각 몇 개로 변환되는지 출력
		// 예) 65370 -> 오만원권 1매, 만원권 1매, 천원권 5매, 100원 3개, 50원 1개, 10원 2개
		Scanner in = new Scanner(System.in);
		int 오만원 = 0, 만원 = 0, 천원 = 0, 오백원 = 0, 백원 = 0, 오십원 = 0, 십원 = 0, 일원 = 0;
		int temp = 0;

		System.out.print("돈의 액수> ");
		int num = in.nextInt();

		오만원 = num / 50000; // 오만원 갯수
		if (오만원 != 0)
			System.out.print("오만원" + 오만원 + "매 ");
		temp = num % 50000; // 만원 갯수를 구하기 위한 것
		만원 = temp / 10000; // 만원 갯수
		if (만원 != 0)
			System.out.print("만원" + 만원 + "매 ");
		temp = temp % 10000; // 천원 갯수를 구하기 위한 것
		천원 = temp / 1000; // 천원 갯수
		if (천원 != 0)
			System.out.print("천원" + 천원 + "매 ");
		temp = temp % 1000; // 오백원 갯수를 구하기 위한 것
		오백원 = temp / 500; // 500원 갯수
		if (오백원 != 0)
			System.out.print("500원" + 오백원 + "개 ");
		temp = temp % 500; // 100원 갯수를 구하기 위한 것
		백원 = temp / 100; // 100원 갯수
		if (백원 != 0)
			System.out.print("100원" + 백원 + "개 ");
		temp = temp % 100; // 50원 갯수를 구하기 위한 것
		오십원 = temp / 50; // 50원 갯수
		if (오십원 != 0)
			System.out.print("50원" + 오십원 + "개 ");
		temp = temp % 50; // 10원 갯수를 구하기 위한 것
		십원 = temp / 10; // 10원 갯수
		if (십원 != 0)
			System.out.print("10원" + 십원 + "개 ");
		일원 = temp % 10; // 1원 갯수
		if (일원 != 0)
			System.out.print("1원" + 일원 + "개 ");

	}

	private static void num2() {
		// 주민번호를 입력받아 '-'으로 분리하여 주민번호 앞자리만 출력
		// 구분 문자를 설정할 때에는 Scanner의 useDelimiter()메소드 이용
		Scanner in = new Scanner(System.in).useDelimiter("\\s|-");
		System.out.print("주민등록번호를 입력해주세요> ");
		String jumin = in.next();
		System.out.println(jumin);

	}

	private static void num1() {
		// 영문자 한 자를 입력받아 소문자이면 대문자로, 대문자이면 소문자로 변환
		// 영문자가 아닌 입력이 들어오면 "영문자가 아닙니다" 출력
		Scanner in = new Scanner(System.in);
		System.out.print("영문자 하나를 입력해주세요> ");
		String ch = in.next();

		if (ch.charAt(0) >= 'a' && ch.charAt(0) <= 'z')
			System.out.println(ch.toUpperCase());
		else if (ch.charAt(0) >= 'A' && ch.charAt(0) <= 'Z')
			System.out.println(ch.toLowerCase());
		else
			System.out.println("영문자가 아닙니다.");

	}

}
