package chap3;

import java.util.Scanner;

/*
 * 가로,세로값을 입력받아서 사각형의 넓이, 둘레,정사각형 여부를 출력하기
 * [결과]
 * 가로, 세로를 입력하세요
 * 10 20
 * 넓이:200 (w*h)
 * 둘레: 60 ((w+h) * 2)
 * 직사각형  w == h
 */
public class Exam4 {
	public static void main(String[] args) {
		System.out.println("가로,세로를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		System.out.println("넓이:" + (w*h));
		System.out.println("둘레:" + (w+h)*2);
		System.out.println((w==h)?"정사각형":"직사각형");
	}
}
