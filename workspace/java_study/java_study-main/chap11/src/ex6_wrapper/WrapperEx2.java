package ex6_wrapper;
/*
 * Character 클래스
 */
public class WrapperEx2 {
	public static void main(String[] args) {
		char[] arr = {'A','a','&','가','0'};
		for(char c : arr) {
			if (Character.isUpperCase(c)) //대문자?
				System.out.println(c + ":대문자");
			if (Character.isLowerCase(c)) //소문자?
				System.out.println(c + ":소문자");
			if (Character.isDigit(c))   //숫자?
				System.out.println(c + ":숫자");
			if (Character.isAlphabetic(c)) //한글 문자.
				System.out.println(c + ":문자");
			else
				System.out.println(c + ":문자 아님");
		}
		int 숫자 = 100;
		System.out.println(숫자);
	}
}
