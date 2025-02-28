package chap4;

import java.util.Scanner;

/*
 * 숫자를 입력 받아서
 * 1. 양수,음수,영 출력
 * 2. 짝수,홀수 출력하기
 * if 조건문으로 구현하기
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("숫자를 입려하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num >0) 
			System.out.println("양수입니다.");
		else if (num < 0)
			System.out.println("음수입니다.");
//		else if (num == 0)
		else
			System.out.println("영입니다.");
		//조건연산자
		System.out.println((num>0?"양수":num<0?"음수":"영")+"입니다.");
		
		if(num % 2 == 0) 
			System.out.println("짝수입니다.");
		else 
			System.out.println("홀수입니다.");
		//조건연산자
		System.out.println((num%2==0?"짝수":"홀수")+"입니다.");		
	}
}
