package com.java.review.chapter3;

import java.util.Scanner;

// while문과 break문을 사용하여 -1이 입력될 때까지 입력된 숫자의 개수 출력
public class BreakExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0; // 입력받은 숫자 갯수

		while (true) { // 키보드에서 정수 입력받음. -1이 입력되면 반복 종료
			if (in.nextInt() == -1)
				break;
			num++;
		}
		System.out.println("입력된 숫자 개수는 " + num);

	}

}
