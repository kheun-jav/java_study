package test;

import java.util.Scanner;

/*
 * 밑변과 높이를 입력받아 삼각형의 넓이를 출력하기. 소숫점을 표시
 * [결과]
 * 밑변의 길이
 * 10
 * 높이의 길이
 * 20
 * 
 * 넓이=15.0
 */
public class Test5_A {
	public static void main(String[] args) {
/*		
		Scanner scan = new Scanner(System.in);
		System.out.println("밑변의 길이 :");
		int bottom = scan.nextInt();
		System.out.println("높이의 길이 :");
		int height = scan.nextInt();
		System.out.println ("넓이 :"+(bottom * height) / 2.0);
*/		
		Scanner scan = new Scanner(System.in);
		System.out.println("밑변의 길이 :");
		//nextDouble() : 콘솔에 입력된 숫자를 double형으로 저장
		double bottom = scan.nextDouble();
		System.out.println("높이의 길이 :");
		double height = scan.nextDouble();
		System.out.println("넓이 :"+(bottom * height) / 2);
	}
}
