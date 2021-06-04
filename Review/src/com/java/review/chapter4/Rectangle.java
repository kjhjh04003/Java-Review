package com.java.review.chapter4;

public class Rectangle {
	int x1, y1, x2, y2;
	int area = 0;

	// 기본 생성자
	public Rectangle() {

	}

	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	// 넓이 리턴
	int square() {
		area = (x2 - x1) * (y2 - y1);
		return area;
	}

	void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	void show() {
		System.out.printf("x1:%d, y1:%d, x2:%d, y2:%d, area:%d%n", x1, y1, x2, y2, area);
	}

	boolean equals(Rectangle r) {
		boolean bool = false;
		if (r.x1 == x1 && r.y1 == y1 && r.x2 == x2 && r.y2 == y2) {
			bool = true;
		} else
			bool = false;
		return bool;
	}

	public static void main(String arts[]) {
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1, 1, 2, 3);

		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2, 2, -1, 4);
		r.show();
		System.out.println(r.square());
		if (r.equals(s)) {
			System.out.println("두 사각형이 같습니다.");
		}
	}

}
