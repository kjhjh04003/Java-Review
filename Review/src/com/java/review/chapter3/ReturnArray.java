package com.java.review.chapter3;

// 배열을 생성하고 각 원소 값을 출력하는 프로그램
// 배열을 생성하여 각 원소의 인덱스 값으로 초기화하여 리턴하는 메소드 이용
public class ReturnArray {
	static int[] makeArray() { // 정수형 배열을 리턴하는 메서드
		int temp[]=new int[4]; // 배열 생성
		for(int i=0; i<temp.length; i++)
			temp[i]=i; // 배열의 각 원소에 인덱스로 초기화
		return temp; // 배열 리턴
	}
	
	public static void main(String[] args) {
		int intArray[]; // 배열 레퍼런스 변수 선언
		intArray=makeArray(); // 메소드를 호출하고 메소드가 리턴한 배열을 전달받는다.
		for(int i=0; i<intArray.length; i++)
			System.out.println(intArray[i]); // 배열의 모든 원소를 출력한다.

	}

}
