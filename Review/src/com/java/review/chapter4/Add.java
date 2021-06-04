package com.java.review.chapter4;

public class Add {
	int a;
	int b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate() {
		int result = a + b;
		return result;
	}
}
