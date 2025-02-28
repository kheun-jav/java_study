package ex4_stringbuffer;
/*
 * StringBuffer 클래스의 주요 메서드
 * 
 * sb : abcDEFG 
 */
public class StrinfBufferEx2 {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
		StringBuffer sb = new StringBuffer();
		//객체의 마지막에 추가
		sb.append("abc").append(123).append('A').append(false); 
		System.out.println(sb); //abc123Afalse
		sb.delete(2, 4);  //2번인덱스부터 3번인덱스까지 문자 제거
		System.out.println(sb); //ab23Afalse
		sb.deleteCharAt(4);  //4번인덱스의 문자 제거
		System.out.println(sb); //ab23false
		sb.insert(5, "==");    //5번인덱스에 == 추가
		System.out.println(sb); //ab23f==alse
//		sb = new StringBuilder("ABCDEFG");  //새로운 객체 생성
		sb = new StringBuffer("ABCDEFG");  //새로운 객체 생성
		//0 ~ (3-1) 인덱스를 abc로 치환
		sb.replace(0,3,"abc");
		System.out.println(sb); //abcDEFG
		sb.reverse();  //문자열 역순배치
		System.out.println(sb); //GFEDcba		
	}
}
