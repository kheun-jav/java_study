package ex11_Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규 표현식 : 문자의 형식을 지정
 */
public class RegularEx1 {
	public static void main(String[] args) {
		String[] data = {"bat","baby","bonus",
				         "c","cA","ca","c.","car","combat","count","cTT",
				         "data","disk"};
		//Pattern : 문서양식
		/*
		 * c[A-Za-z]? : c문자로 시작하고, 뒤에 영문자가 1개또는 0개인 문자
		 * 
		 * c : 문자 c
		 * [A-Za-z] : 대문자,소문자 문자한개
		 * ?  : 0 또는 1 개
		 * +  : 1개이상
		 * *  : 0개이상
		 */
		Pattern p = Pattern.compile("c[A-Za-z]*");
		for(String s : data) {
			Matcher m = p.matcher(s); //패턴 형식 맞는 문자열? 여부를 검증할 객체 
			if(m.matches())   //패턴검증. 패턴에 맞는 경우 : true 
				System.out.print(s+", ");
		}
		System.out.println();
		//기존의 메서드에서 정규식 이용하기
		String names = "홍길동 ,     김삿갓,이몽룡  ,                      성춘향 ,임꺽정";
		//\\s* : \s : 공백 한문자 
		// * : 0 개이상
		String[] arr = names.split("\\s*,\\s*");
		for(String s : arr) System.out.println(s);
	}
}
