package chap4;
/*
 * 1~100까지 짝수의 합을 구하기.
 * for
 * while
 * do while
 */
public class Exam04 {
	public static void main(String[] args) {
		System.out.print("for 구문 : ");
		int i=0, sum = 0;
		for(i=2;i<=100;i+=2) {
			sum += i;
		}
		System.out.println(sum);
		System.out.print("while 구문 : ");
		i = 2;
		sum = 0;
		while(i<=100) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);
		System.out.print("do while 구문 : ");
		i = 2;
		sum = 0;
		do {
			sum += i;
			i+=2;
		}while(i<=100);
		System.out.println(sum);
	}
}
