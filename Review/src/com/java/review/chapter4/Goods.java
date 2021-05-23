package com.java.review.chapter4;

// 상품 하나를 표현하는 클래스 Goods
// String 타입의 name, int 타입의 price, numberOfStock, sold 등 네 개의 필드를 갖는다.
// main() 메서드를 작성하여 Goods 객체를 하나 생성하고, 이 객체에 대한 레퍼런스 변수명을 camera로 하라.
// camera의 상품 이름을 "Nikon", 값을 400000, 재고 개수를 30, 팔린 개수를 50으로 설정하고 화면에 출력
public class Goods {

	// 필드 생성
	String name;
	int price;
	int numberOfStock;
	int sold;

	public static void main(String[] args) {
		Goods camera = new Goods();

		camera.name = "Nikon";
		camera.price = 400000;
		camera.numberOfStock = 30;
		camera.sold = 50;

		System.out.println("상품 이름 : " + camera.name);
		System.out.println("값 : " + camera.price);
		System.out.println("재고 개수 : " + camera.numberOfStock);
		System.out.println("팔린 개수 : " + camera.sold);

	}

}
