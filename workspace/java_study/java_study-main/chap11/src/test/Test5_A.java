package test;
/*
 * indexOf(문자열,찾는 문자열)
 *    문자열에서 찾는 문자열의 위치 값을 출력하는 함수 구현하기
 */
public class Test5_A {
	public static void main(String[] args) {
		indexOf("12345AB12AB45AB", "12");  //12:0,7
		indexOf("12345AB12AB45AB", "AB");  //AB:5,9,13
		indexOf("12345", "AB");            //AB : 없음
	}
	private static void indexOf(String s1, String s2) {
		int cnt=0;
		int index = 0;
		System.out.print(s2 + ":");
		while(true) {
			index = s1.indexOf(s2,index);
			if(index < 0) break;
			System.out.print(index + ",");
			cnt++;
			index++;
		}
		if(cnt == 0) System.out.print("없음");
		System.out.println();
	}
}
