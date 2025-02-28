package test;

import java.util.Scanner;

/*
 * 화면에서 2~9까지의 숫자를 입력받아 입력된 수의 구구단을 출력하기
 * [결과]
 * 출력 구구단 : 3
 * 3*2=6
 * 3*9=9
 * ...
 * 3*9=27 
 */
public class Test10_A {
	public static void main(String[] args) {
		System.out.print("출력 구구단 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=2;i<=9;i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}
