package test2;
/*
 * 문자열 1,234를 정수로 변경하여  * 10 한 값을 세자리마다 , 찍어 출력하기 
 * [결과]
 * 12,340
 */

import java.util.Scanner;

public class Test2_B {
	public static void main(String[] args) {
		System.out.println("세자리마다 ,를 출력하여 숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int num = Integer.parseInt(str.replace(",",""));
		System.out.println(num);
		System.out.println(String.format("%,d", num*10));
		System.out.printf("%,d\n", num*10);	

	}
}
