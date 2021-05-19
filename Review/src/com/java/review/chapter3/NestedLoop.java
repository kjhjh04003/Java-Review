package com.java.review.chapter3;

// 2중 중첩된 for문을 이용하여 구구단을 출력하는 프로그램
public class NestedLoop {

	public static void main(String[] args) {
		int i, j;

		for (i = 1; i < 10; i++, System.out.println()) { // 단에 대한 반복
			for (j = 1; j < 10; j++, System.out.print('\t')) { // 각 단의 곱셈 반복
				System.out.print(i + "*" + j + "=" + i * j);
			}
		}

	}

}
