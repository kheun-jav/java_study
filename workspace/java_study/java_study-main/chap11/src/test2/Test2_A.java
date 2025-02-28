package test2;
/*
 * 문자열 1,234를 정수로 변경하여  * 10 한 값을 세자리마다 , 찍어 출력하기 
 * [결과]
 * 12,340
 */

public class Test2_A {
	public static void main(String[] args) {
		String str = "1,234";
		int num = Integer.parseInt(str.replace(",",""));
		System.out.println(num);
		System.out.println(String.format("%,d", num*10));
		System.out.printf("%,d\n", num*10);	

	}
}
