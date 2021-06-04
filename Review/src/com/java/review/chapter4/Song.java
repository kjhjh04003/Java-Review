package com.java.review.chapter4;

public class Song {

	String title; // 노래제목을 나타냄
	String artist; // 가수
	String album; // 앨범 제목
	String composer; // 작곡가
	int year; // 발매 연도
	int track; // 트랙 번호

	// 기본 생성자
	public Song() {

	}

	// 모든 필드를 초기화하는 생성자
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	// 노래 정보를 화면에 출력하는 메서드
	public void show() {
		System.out.println("노래 제목 : " + title);
		System.out.println("가수 : " + artist);
		System.out.println("앨범 제목: " + album);
		System.out.println("작곡가: " + composer);
		System.out.println("발매 연도: " + year);
		System.out.println("트랙 번호: " + track);
	}

	public static void main(String args[]) {
		Song ABBA = new Song("Dancing Queen", "ABBA", "ABBA Gold", "Benny Andersson", 2008, 1);
		ABBA.show();
		

	}

}
