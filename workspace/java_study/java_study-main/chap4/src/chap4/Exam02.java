package chap4;

import java.util.Scanner;

/*
 * 화면에서 한개의 문자를 입력받아 대문자,소문자,숫자,기타문자인지 출력하기
 * [결과]
 * 한개의 문자 입력 : A
 * 대문자
 * 
 * 대문자 조건 : 'A' <= x <= 'Z' 
 * 소문자 조건 : 'a' <= x <= 'z'
 * 숫자 조건   : '0' <= x <= '9'
 * 그외 기타문자
 *  
 * 문자열 입력 함수 : next()
 * 문자열에서 첫번째 문자 추출 : charAt(0)
 * 
 * 대문자인 경우 : 소문자로 변경
 * 소문자인 경우 : 대문자로 변경
 */
public class Exam02 {
	public static void main(String[] args) {
		System.out.print("한개의 문자 입력 : ");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0); //입력된 문자의 첫번째 문자
		if(ch >= 'A' && ch <='Z') {
			System.out.println("대문자");
			System.out.println("소문자:"+ (char)(ch+32));
			
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("소문자");
			System.out.println("대문자:"+ (char)(ch-32));
		}
		else if (ch >= '0' && ch <= '9')
			System.out.println("숫자");
		else
			System.out.println("기타문자");
		System.out.println("A:"+(int)'A');
		System.out.println("B:"+('A'+1));
		System.out.println("Z:"+(int)'Z');
		System.out.println("Z:"+('A'+25));
	}
}
