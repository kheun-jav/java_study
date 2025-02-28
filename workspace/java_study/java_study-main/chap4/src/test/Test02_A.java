package test;

import java.util.Scanner;

/*
1.  화면에서 한개의 문자를 입력받아
     대문자인 경우는 소문자로, 
     소문자인 경우는 대문자로 
     숫자인 경우는 20을 더한 값을   출력하기
     그외의 문자는 기타 문자 를 출력하세요 
     
     소문자 = 대문자 + 32
     대문자 = 소문자 - 32
     
     '0'  : 48 => 20
     '1' : 49 => 21
     ('1'-'0')+20 = 21
     ('5'-'0')+20 = 25
*/
public class Test02_A {
	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);	
		if(ch >= 'A' && ch <= 'Z') {
			 System.out.println((char)(ch+32));
		} else if (ch >= 'a' && ch <= 'z') {
			 System.out.println((char)(ch-32));
		} else if (ch >= '0' && ch <= '9') {
			 System.out.println(ch + 20); // '0' 코드값 + 20 값 출력
			 System.out.println((ch-'0') + 20);  //(ch-'0') : 숫자데이터 변경
		} else {
			System.out.println("기타문자 입니다.");
		}

	}
}
