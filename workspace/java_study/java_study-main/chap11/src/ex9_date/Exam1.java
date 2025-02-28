package ex9_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 년도와 월을 입력받아서 월의 마지막 일자와 마지막일의 요일 출력하기
 */
public class Exam1 {
	public static void main(String[] args) {
		System.out.println("년도와 월을 입력하세요");
		Scanner scan =new Scanner(System.in);
		int year = scan.nextInt();
		int mon = scan.nextInt();
		String dateStr = year+"-"+(mon+1) + "-01"; //다음달1일
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date day = null;
		try {
			day = sf1.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		day.setTime(day.getTime() - (1000*60*60*24));
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd E요일");
		System.out.println(sf2.format(day));
		
	}
}
