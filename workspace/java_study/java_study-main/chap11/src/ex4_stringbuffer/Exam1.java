package ex4_stringbuffer;
/*
 * delchar(원본문자열,삭제대상문자열)
 *   => 원본문자열에서 삭제 대상 문자열을 제거하고 나머지만 출력
 */
public class Exam1 {
	public static void main(String[] args) {
		System.out.println(delchar("(1!2@3$4~5)","~!@#$%^&*()"));//12345
		System.out.println(delchar("(1!2@3$4~5)","12345")); //(!@$~)
		System.out.println(delchar2("(1!2@3$4~5)","~!@#$%^&*()"));//12345
		System.out.println(delchar2("(1!2@3$4~5)","12345")); //(!@$~)
	}
	
	private static StringBuilder delchar(String str1, String str2) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str1.length(); i++) {
//			if(str2.indexOf(str1.charAt(i)) < 0) {
			if(!str2.contains(str1.charAt(i)+"")) {
				sb.append(str1.charAt(i));
			}
		}
		return sb;
	}
	private static String delchar2(String str1, String str2) {
		String s = new String();
		for(int i=0;i<str1.length(); i++) {
//			if(str2.indexOf(str1.charAt(i)) < 0) {
			if(!str2.contains(str1.charAt(i)+"")) {
				s += str1.charAt(i);
			}
		}
		return s;
	}
}
