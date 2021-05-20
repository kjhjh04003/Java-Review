package com.java.review.chapter3;

// 다차원 배열
// 한 회사의 지난 3년간 분기별 매출의 총액과 연평균 매출을 구하는 프로그램
public class SalesRevenue {

	public static void main(String[] args) {
		int intArray[][] = { { 90, 90, 110, 110 }, // 1차 연도 매출
				{ 120, 110, 100, 110 }, // 2차 연도 매출
				{ 120, 140, 130, 150 } }; // 3차 연도 매출

		double sum = 0;
		for (int i = 0; i < intArray.length; i++) // 연도에 대한 반복
			for (int j = 0; j < intArray[i].length; j++) // 분기에 대한 반복
				sum += intArray[i][j]; // 분기별 매출의 합

		System.out.println("지난 3년간 매출 총액은 " + sum + "이며 연평균 매출은 " + sum / intArray.length + "입니다.");

	}

}
