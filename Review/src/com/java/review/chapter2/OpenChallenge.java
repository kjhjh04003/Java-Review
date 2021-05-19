package com.java.review.chapter2;

import java.util.Scanner;

// 가위 바위 보 게임
// 철수 먼저 시작하고 철수와 영희 중 누가 이겼는지 승자를 판별하는 프로그램
public class OpenChallenge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수> ");
		String a = in.next();
		System.out.print("영희> ");
		String b = in.next();

		if (a.equals("가위")) {
			if (b.equals("바위"))
				System.out.println("영희가 이겼습니다.");
			else if (b.equals("보"))
				System.out.println("철수가 이겼습니다.");
		} else if (a.equals("바위")) {
			if (b.equals("보"))
				System.out.println("영희가 이겼습니다.");
			else if (b.equals("가위"))
				System.out.println("철수가 이겼습니다.");
		} else {
			if (b.equals("가위"))
				System.out.println("영희가 이겼습니다.");
			else if (b.equals("바위"))
				System.out.println("철수가 이겼습니다.");
		}

	}

}
