package chap3;
/*
 * 단항연산자 : 
 *    부호 연산자 : +,-
 *      + : 현재부호의 유지. 
 *      - : 현재부호를 변경. 음수=> 양수, 양수=>음수
 *    논리부정 : !(not)
 *      true => false
 *      false => true  
 */
public class OpEx2 {
	public static void main(String[] args) {
		//부호 연산자
		int x = -10;
		System.out.println("x=" + +x);
		System.out.println("x=" + -x);
		x = 10;
		System.out.println("x=" + +x);
		System.out.println("x=" + -x);
		//논리 부정 연산자
		System.out.println("true=" + !false);
		System.out.println("false=" + !true);
		System.out.println("5 != 4 =" + (5 != 4));
		System.out.println("!(5 == 4) =" + !(5 == 4));
	}
}
