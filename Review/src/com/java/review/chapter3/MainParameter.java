package com.java.review.chapter3;

// 여러 개의 실수를 main() 메소드 인자로 전달받아 평균값 구하는 프로그램
public class MainParameter {

	public static void main(String[] args) {
		double sum = 0.0;

		for (int i = 0; i < args.length; i++) // 인자 개수만큼 반복
			sum += Double.parseDouble(args[i]); // 문자열을 실수로 변화하여 합산

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / args.length);

	}

}
