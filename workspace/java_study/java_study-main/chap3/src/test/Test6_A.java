package test;

import java.util.Scanner;

//  반지름을 입력받아 원의 둘레와 면적을 구하시오
public class Test6_A {
	public static void main(String[] args) {
		double pi = 3.141592;
		Scanner scan = new Scanner(System.in);
		System.out.print("반지름 :");
//		int r = scan.nextInt();  // int 형으로 입력
//		double r = scan.nextDouble(); // double 형으로 입력
		float r = scan.nextFloat();  // float 형으로 입력
		System.out.println("넓이 : " + r*r*pi);
		System.out.println("둘레 : " + 2*r*pi);		
	}
}
