package com.java.review.chapter3;

import java.util.Scanner;

// 배열의 length필드를 이용하여 배열의 크기만큼 키보드에서 정수를 입력받고
// 평균을 구하는 프로그램
public class ArrayLength {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5]; // 배열의 선언과 생성
		double sum = 0;

		for (int i = 0; i < intArray.length; i++)
			intArray[i] = in.nextInt(); // 키보드에서 입력받은 정수 저장

		for (int i = 0; i < intArray.length; i++)
			sum += intArray[i]; // 배열에 저장된 정수 값 더하기

		System.out.println("배열 원소의 평균은 " + sum / intArray.length + "입니다.");

	}

}
