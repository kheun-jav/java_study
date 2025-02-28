package test;

import java.util.Scanner;

/*
*  키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
* 
* [결과]
* 첫 번째 정수를 입력하세요 : 23
* 두 번째 정수를 입력하세요 : 7
* 더하기 결과 : 30
* 빼기 결과 : 16
* 곱하기 결과 : 161
* 나누기 몫 결과 : 3
*/
public class Test7_A {
	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("첫 번째 정수를 입력하세요 : ");
      int num1 = scan.nextInt();
      System.out.print("두 번째 정수를 입력하세요 : ");
      int num2 = scan.nextInt();
      System.out.println("더하기 결과 : " + (num1 + num2));
      System.out.println("빼기 결과 : " + (num1 - num2));
      System.out.println("곱하기 결과 : " + (num1 * num2));
      System.out.println("나누기 몫 결과 : " + (num1 / num2));
	}
}
