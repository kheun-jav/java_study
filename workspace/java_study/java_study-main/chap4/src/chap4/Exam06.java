package chap4;

import java.util.Scanner;
/*
 * 화면에서 숫자형태의 문자열을 입력받아서 각 자리수의 합을 구하기
 * [결과]
 * 숫자 입력 : 123
 * 자리수합 : 6
 */
public class Exam06 {
	public static void main(String[] args) {
		System.out.print("숫자입력 : ");
		Scanner scan = new Scanner(System.in);
		String snum = scan.next();
		int sum = 0;
		for(int i=0;i < snum.length();i++) {
			sum += snum.charAt(i) - '0';
		}
		System.out.println(snum + " 숫자의 자리수 합:" + sum);
	}
}
