package com.java.review.chapter3;

// for문을 이용하여 1부터 10까지 덧셈을 표시
public class ForSample {

	public static void main(String[] args) {
		int i, j;

		for (j = 0, i = 1; i <= 10; i++) {
			j = j + 1;
			System.out.print(i);
			if (i == 10) { // 10이면 +대신 =을 출력하고 덧셈 결과 출력
				System.out.print(" = ");
				System.out.print(j);
			} else // 1~9까지는 +출력
				System.out.print(" +");
		}

	}

}
