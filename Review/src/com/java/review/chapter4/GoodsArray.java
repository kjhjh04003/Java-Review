package com.java.review.chapter4;

import java.util.Scanner;

// 상품을 입력받아 Goods 객체를 생성하고 이들을 Goods 객체 배열에 저장
// 상품 3개를 입력받아이들을 모두 화면에 출력
public class GoodsArray {
	public static void main(String[] args) {
		Goodss[] goodsArray; // 배열 선언
		goodsArray = new Goodss[3]; // Goods 객체 레퍼런스 배열 생성

		Scanner s = new Scanner(System.in);
		for (int i = 0; i < goodsArray.length; i++) {
			String name = s.next(); // 상품 이름
			int price = s.nextInt(); // 상품 가격
			int n = s.nextInt(); // 상품 재고
			int sold = s.nextInt(); // 팔린 수량
			goodsArray[i] = new Goodss(name, price, n, sold); // Goods 객체 생성
		}

		for (int i = 0; i < goodsArray.length; i++) {
			System.out.print(goodsArray[i].getName() + " "); // 상품 이름 출력
			System.out.print(goodsArray[i].getPrice() + " "); // 상품 가격 출력
			System.out.print(goodsArray[i].getNumberOfStock() + " "); // 상품 재고 출력
			System.out.println(goodsArray[i].getSold() + " "); // 팔린 수량 출력
		}

	}

}

class Goodss {
	// 필드 생성
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;

	// 생성자
	Goodss(String n, int p, int nStock, int s) {
		name = n;
		price = p;
		numberOfStock = nStock;
		sold = s;
	}

	String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}

	int getNumberOfStock() {
		return numberOfStock;
	}

	int getSold() {
		return sold;
	}
}
