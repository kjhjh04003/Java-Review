package com.java.review.chapter3;

import java.util.Random;
import java.util.Scanner;

// 숨겨진 카드의 수를 맞추는 게임 만들기
// 0~99까지의 임의의 수를 가진 카드를 한 장 숨기고 이 카드의 수를 맞추는 게임이다.
// 숨겨진 카드의 수보다 작은 수를 입력하면 "더 높게"출력, 큰 수를 입력하면 "더 낮게" 출력
// 맞출 경우 게임을 다시 진행할 건지 y/n을 묻고 n인 경우 게임 종료
public class OpenChallenge {

	// 보류
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		int temp = 0;
		int i = 1;
		String ck = null;
		Random r = new Random(); // 처음 숨길 카드를 선택하기 위한 랜덤 함수
		while (true) {
			int k = r.nextInt(100); // 0~99까지의 임의의 정수 새엉
			System.out.println("수를 결정하였습니다 맞추어 보세요");
			System.out.println("0 - 99");
			System.out.println(k);
			System.out.print(i + ">> ");
			num = in.nextInt();
			i++;

			if (k < num) {
				System.out.println("더 낮게");
				System.out.println(temp + " - " + num);
				System.out.print(i + ">> ");
				num = in.nextInt();
				i++;
			} else if (k > num) {
				System.out.print("더 높게");
				System.out.println(num + " - " + temp);
				System.out.print(i + ">> ");
				num = in.nextInt();
				i++;
			} else {
				System.out.println("맞았습니다.");
				System.out.println("다시 하시겠습니까?(y/n) >> ");
				ck = in.next();
				if (ck.equals("n"))
					System.exit(0);
			}
		}

	}

}
