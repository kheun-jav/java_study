package chap3;
/*
 * 관계연산자(비교연산자) : ==,!= >, < ..... => 결과가 boolean
 * 
 * 논리연산자 : &&(AND), ||(OR) => boolean && boolean => boolean
 *        AND                OR
 *    T && T : T        T || T : T
 *    T && F : F        T || F : T
 *    F && T : F        F || T : T
 *    F && F : F        F || F : F
 *    
 *    && : 앞쪽의 결과가 F인 경우는 전체 결과는 F. 뒤쪽 부분 실행 안함
 *    || : 앞쪽의 결과가 T인 경우는 전체 결과는 T. 뒤쪽 부분 실행 안함
 *    
 *    ^(XOR) : 배타적 OR. 
 *    T ^ T : F
 *    T ^ F : T
 *    F ^ T : T
 *    F ^ F : F
 */
public class OpEx4 {
	public static void main(String[] args) {
		int x=1,y=1;
		System.out.println("1 == 1 :" + (x==y)); //true
		System.out.println("1 != 1 :" + (x!=y));
		System.out.println("1 < 1 :" + (x<y));
		System.out.println("1 > 1 :" + (x>y));
		System.out.println("1 <= 1 :" + (x<=y));
		System.out.println("1 >= 1 :" + (x>=y));
		//논리연산자
		System.out.println("x==2 && y==1 :" + (x==1 && y==2)); //false
		System.out.println("x==1 || y==2 :" + (x==1 || y==2)); //true
		System.out.println("x==1 ^ y==1 :" + (x==1 ^ y==1)); //true
	}
}
