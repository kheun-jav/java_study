package test;

import java.util.Scanner;

/*
나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
성인(19세 초과)인지 출력하세요.
[결과]
나이 : 19
청소년
*/
public class Test10_A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = scan.nextInt();
		System.out.println((age>19)?"성인":(age > 13)?"청소년":"어린이");
	}
}
