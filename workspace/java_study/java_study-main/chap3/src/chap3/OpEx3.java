package chap3;
/*
 * 이항 연산자
 *   산술연산자 : +,-,*,/,%(나머지)
 */
public class OpEx3 {
	public static void main(String[] args) {
		int x=10,y=8;
		System.out.println("10+8="+(x+y));
		System.out.println("10-8="+(x-y));
		System.out.println("10*8="+(x*y));
		System.out.println("10/8="+(x/y)); //int형 연산의 결과는 int 
		System.out.println("10%8="+(x%y)); //나머지. 2
		//나누기
		System.out.println("10/8="+(x/y));
		System.out.println("-10/8="+(-x/y));
		System.out.println("10/-8="+(x/-y));
		System.out.println("-10/-8="+(-x/-y));
		//나머지 : 피젯수의 부호를 따른다
		System.out.println("10%8="+(x%y));
		System.out.println("-10%8="+(-x%y));
		System.out.println("10%-8="+(x%-y));
		System.out.println("-10%-8="+(-x%-y));
		
	}
}
