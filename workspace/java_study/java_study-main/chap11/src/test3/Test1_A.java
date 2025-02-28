package test3;
/*
 * 
년도와 월를 입력하세요
2025 02

	   2025년2월
   일  월  화   수  목  금   토
                           1
   2   3   4   5   6   7   8
   9  10  11  12  13  14  15
  16  17  18  19  20  21  22
  23  24  25  26  27  28
 */

import java.util.Calendar;
import java.util.Scanner;

public class Test1_A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 월를 입력하세요");
		int year = scan.nextInt();
		int mon = scan.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(year,mon-1,1); //입력한 년월의 첫째날 설정
		int firstWeek = cal.get(Calendar.DAY_OF_WEEK); //첫번째 날의 요일
		//입력한년월의 마지막일자
		int lastday = cal.getActualMaximum(Calendar.DATE); 
		System.out.println("\t"+year + "년 " + mon + "월");
		System.out.printf("%3c %3c %3c%3c %3c%3c %3c",'일','월','화','수','목','금','토');
		System.out.println();
		//1부터 lastday 까지 반복
		for(int i=1,day=1;day<=lastday;i++) {
			//공백출력 : 첫째날의 요일 이전 부분
			if(i < firstWeek) System.out.printf("%4s"," ");
			else System.out.printf("%4d",day++);
			if(i%7==0)System.out.println();
		}

	}
}
