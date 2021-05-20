package com.java.review.chapter3;

// 비정방향 배열
// 비정방향 배열의 생성과 접근
public class IrregularArray {

	public static void main(String[] args) {
		int intArray[][] = new int[4][]; // 각 행의 레퍼런스 배열 생성
		intArray[0] = new int[3]; // 첫쨰 행의 3개 정수 배열 생성
		intArray[1] = new int[2]; // 둘째 행의 2개 정수 배열 생성
		intArray[2] = new int[3]; // 셋째 행의 3개 정수 배열 생성
		intArray[3] = new int[2]; // 넷째 행의 2개 정수 배여 생성

		for (int i = 0; i < intArray.length; i++) // 행에 대한 반복
			for (int j = 0; j < intArray[i].length; j++) // 열에 대한 반복
				intArray[i][j] = (i + 1) * 10 + j;

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++)
				System.out.print(intArray[i][j] + " ");
			System.out.println();
		}

	}

}
