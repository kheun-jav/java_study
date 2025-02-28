package ex11_Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * data 문자열 중 점수를 찾아서 총점과 평균을 출력하기
 */
public class Exam1 {
	public static void main(String[] args) {
		String data = "번호:1,이름:홍길동,국어:100,영어:70,수학:85,과학:95";
		Pattern p = Pattern.compile("[ㄱ-힣]+");
		Matcher m = p.matcher(data);
		while(m.find()) System.out.println(m.group());
		System.out.println("========================");
		p = Pattern.compile("\\d{2,3}");
		m = p.matcher(data);
		int sum=0,cnt=0;
		while(m.find()) {
			System.out.println(m.group());
			cnt++;
			sum += Integer.parseInt(m.group());
		}
		System.out.println("총점:"+sum + ",평균:"+(double)sum/cnt);
		
		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println(i1+i2);
		
	    Short x=10;
	    switch(x) {
	     default:
	      System.out.println("Hello");
	    }
	}
}
