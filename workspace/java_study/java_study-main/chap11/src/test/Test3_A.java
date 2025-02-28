package test;
/*
 * 다음 결과가 나오도록 프로그램 수정하기
 * [결과]
 * basket
 * basketball
 * 
 * 
 * main : str = "base"
 *        basket 문자열 생성. => 화면출력
 *        str = "baseball"
et */

public class Test3_A {
	public static void main(String[] args) {
		String str = "base";
//		str = str.replace('e','k')+"et";
		System.out.println(str = str.replace('e','k')+"et");
		str += "ball"; 
		System.out.println(str);
	}
}
