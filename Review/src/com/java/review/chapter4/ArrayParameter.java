package com.java.review.chapter4;

// 배열의 전달
// char 배열을 메소드의 인자로 전달하여 배열 속의 공백 문자를 ','로 대치하는 프로그램
public class ArrayParameter {
	static void replaceSpace(char a[]) { // 인자 a는 main()의 배열 c를 가리키게 된다.
		for (int i = 0; i < a.length; i++)
			if (a[i] == ' ')
				a[i] = ','; // 공백 문자를 ','로 변경
	}

	static void printCharArray(char a[]) { // 인자 a는 main()의 배열 c를 가리키게 된다.
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}

	public static void main(String[] args) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		printCharArray(c); // 원래 배열 원소 출력
		replaceSpace(c); // 공백 문자 바꾸기
		printCharArray(c); // 수정된 배열 원소 출력

	}

}
