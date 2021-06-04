package com.java.review.chapter4;

import java.util.Scanner;

public class Reserve {

	public static void main(String[] args) {

		while (true) {
			System.out.print("예약(1), 조회(2), 취소(3), 끝내기(4) >> ");

			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num == 1) {
				sit_Reserve.reserve();
			} else if (num == 2) {
				check.check();
			} else if (num == 3) {
				cancle.cancle();
			} else if (num == 4) {
				exit.exit();
			} else
				System.out.println("다시 입력해주세요");
		}

	}

}
