package com.java.review.chapter3;

// for문을 이용하여 1~100까지 짝수의 합 출력
// continue
public class ContinueExample {

	public static void main(String[] args) {
		int sum = 0; // 짝수의 합
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) // 홀수인 경우
				continue; // 라인 9의 i++로 돌아가서 다음 반복으로 진행
			else // 짝수인 경우
				sum = sum + i;
		}
		System.out.println("1부터 100까지 짝수의 합은 " + sum);

	}

}
