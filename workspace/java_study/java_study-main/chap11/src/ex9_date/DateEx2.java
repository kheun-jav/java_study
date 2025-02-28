package ex9_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date 클래스의 날짜 설정하기
 */
public class DateEx2 {
	public static void main(String[] args) {
		Date now = new Date();  //현재일자시간
		//1970년 이후부터 현재까지의 시간을 밀리초 리턴
		System.out.println(now.getTime()); //현재시간의 밀리초 리턴
		System.out.println(System.currentTimeMillis()); //현재시간의 밀리초 리턴
		//2025-03-01의 요일과 밀리초 출력하기
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String sday = "2025-03-01";
		Date day = null;
		try {
			day =sf.parse(sday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sday + " " + new SimpleDateFormat("E요일").format(day));
		System.out.println("밀리초:" + day.getTime());
		//3일 후의 날짜와 요일 출력하기
		now.setTime(now.getTime() + (1000L*60*60*24*3));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(now));
	}
}
