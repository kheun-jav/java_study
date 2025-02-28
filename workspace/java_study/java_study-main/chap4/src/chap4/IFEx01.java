package chap4;
/*
 * if 조건문
 * 
 * if(조건식) {
 *    조건식의 결과 참인 경우 실행되는 문장 들
 * }
 * 
 * 실행 되는 문장이 한개인 경우 {}를 생략 할 수 있다.
 */
import java.util.Scanner;

public class IFEx01 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt(); //55
		if(score >= 60) { //조건식의 결과 거짓
			System.out.println("합격을 축하합니다.");
		}
		if(score >= 60)
		   System.out.println("합격을 축하합니다.");
		   System.out.println("자격증을 받아 가세요");
	}
}
