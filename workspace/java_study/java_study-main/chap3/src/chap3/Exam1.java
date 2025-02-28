package chap3;

import java.util.Scanner;

/*
 * 화면(키보드)에서 초를 입력받아 몇시간,몇분 몇초인지 출력하기
 * 1. Scanner 객체 생성 
 * 2. sec 변수에 입력받은 초를 저장
 * 3. 시,분,초로 변경
 *    시 : sec/3600 
 *    분 : (sec%3600)/60
 *    초 : sec%60
 * [결과]
 * 3662=1시간1분2초   
 */
public class Exam1 {
	public static void main(String[] args) {
		//1.Scanner 객체 생성
		System.out.println("초를 입력하세요");
		Scanner scan = new Scanner(System.in);
	    // 2. sec 변수에 입력받은 초를 저장
		int sec = scan.nextInt();
		System.out.print(sec + "=");
		int h = sec/3600;
		int m = (sec%3600)/60;
		int s = sec % 60;
		System.out.println(h+"시간"+m+"분"+s+"초");
		System.out.println((sec/3600)+"시간"+((sec%3600)/60)+"분"+(sec % 60)+"초");
	}
}
