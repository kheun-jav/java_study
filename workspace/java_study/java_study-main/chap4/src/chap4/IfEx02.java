package chap4;

import java.util.Scanner;

/*
 * if else 조건문
 * if(조건식) {
 *    조건식이 참인 경우 실행되는 문장들
 * } else {
 *    조건식이 거짓인 경우 실행되는 문장들
 * }
 * 
 * if / else if / else
 * if(조건식1) {
 *    조건식1이 참인 경우 실행되는 문장들
 * } else if(조건식2){
 *    조건식1은 거짓이고, 조건식2가 참인 경우 실행되는 문장들
 * } else if(조건식3){
 *    조건식1,조건식2 은 거짓이고, 조건식3가 참인 경우 실행되는 문장들
 *   ..... 
 * } else {
 *   모든 조건식의 결과가 거짓인 경우 실행되는 문장들
 * }
 */
public class IfEx02 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		if(score >= 60) {
			System.out.println("합격을 축하합니다.");
		} else {
			System.out.println("불합격 입니다.");
		}
		if(score >= 90) {
			System.out.println("A학점");
		    System.out.println("잘했습니다.");
		}
		else if (score >= 80)
			System.out.println("B학점");
		else if (score >= 70)
			System.out.println("C학점");
		else if (score >= 60) 
			System.out.println("D학점");
		else
			System.out.println("F학점");
			
		
	}
}
