package com.java.review.chapter4;

import java.util.Scanner;

public class sit_Reserve {
	static String[] s_sit = new String[10];
	static String[] a_sit = new String[10];
	static String[] b_sit = new String[10];

	public static void reserve() {

		String name;
		int s_num;
		// 모든 좌석 "---"로 초기화
		for (int i = 0; i < 10; i++) {
			s_sit[i] = "---";
			a_sit[i] = "---";
			b_sit[i] = "---";
		}
		System.out.print("좌석 구분 S(1), A(2), B(3)> ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 1) {
			for (int i = 0; i < s_sit.length; i++) {
				System.out.print("s>> " + s_sit[i] + " ");
			}
			System.out.println();
			System.out.print("이름>> ");
			name = sc.next();
			System.out.print("번호>> ");
			s_num = sc.nextInt();
			s_sit[s_num] = name;
		} else if (n == 2) {
			for (int i = 0; i < s_sit.length; i++) {
				System.out.print(a_sit[i] + " ");
			}
			System.out.println();
			System.out.print("이름>> ");
			name = sc.next();
			System.out.print("번호>> ");
			s_num = sc.nextInt();
			a_sit[s_num] = name;
		} else if (n == 3) {
			for (int i = 0; i < s_sit.length; i++) {
				System.out.print(b_sit[i] + " ");
			}
			System.out.println();
			System.out.print("이름>> ");
			name = sc.next();
			System.out.print("번호>> ");
			s_num = sc.nextInt();
			b_sit[s_num] = name;
		} else
			System.out.println("다시 입력해주세요");

	}

}
