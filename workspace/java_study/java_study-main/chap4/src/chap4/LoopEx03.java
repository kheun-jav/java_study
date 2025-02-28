package chap4;

import java.util.Scanner;

/*
 * 화면에서 숫자를 999 값이 입력될때까지 여러개의 숫자를 입력받아 합계 구하기 
 */
public class LoopEx03 {
	public static void main(String[] args) {
		System.out.println("숫자를 여러개 입력하세요");
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while(true) {
			int num = scan.nextInt();
			if(num == 999) break; //반복 중지
			sum += num;
		}
		System.out.println("입력된 수의 합 : " + sum);
	}
}
