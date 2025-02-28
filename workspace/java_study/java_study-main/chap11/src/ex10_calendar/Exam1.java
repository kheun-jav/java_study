package ex10_calendar;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 년도와 월을 입력받아서 년월의 마지막 일자와 요일 출력하기
 * Calendar 객체 이용하기
 */
public class Exam1 {
	public static void main(String[] args) {
		System.out.println("년도와 월을 입력하세요");
		Scanner scan =new Scanner(System.in);
		int year = scan.nextInt();
		int mon = scan.nextInt();
		Calendar cal = Calendar.getInstance(); //현재일시
		cal.set(year, mon-1,1); //입력월의 1일
		int lastday = cal.getActualMaximum(Calendar.DATE); //마지막일자 
		cal.set(year, mon-1,lastday); //입력월의 마지막일자
		String week ="일월화수목금토";
		System.out.printf("날짜:%4d-%02d-%02d %c요일\n",
	     cal.get(Calendar.YEAR), (cal.get(Calendar.MONTH)+1),cal.get(Calendar.DATE),
	     week.charAt(cal.get(Calendar.DAY_OF_WEEK)-1));
		System.out.printf("날짜:%4d-%02d-%02d %c요일\n",
			     year, mon,lastday, week.charAt(cal.get(Calendar.DAY_OF_WEEK)-1));
	}
}
