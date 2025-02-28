package chap3;

import java.util.Scanner;

/*
 * 화면에서 3자리 정수를 입력받아서 100자리 미만을 버리고 출력하기
 * [결과]
 * 세자리정수를 입력하세요
 * 321
 * 300
 */
public class Exam2 {
	public static void main(String[] args) {
		System.out.println("세자리정수를 입력하세요");
		//1. Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		//2. 입력받은 데이터를 저장 변수 선언
		int num = scan.nextInt();
		System.out.println((num/100)*100);
		System.out.println(num - (num%100));
	}
}
