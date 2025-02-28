package test;

import java.util.Scanner;

/*
 삼각형의 높이를 입력받아서 *로 삼각형 출력하기
  [결과]
  삼각형의 높이
  3
  
   *
  ***
 *****  바닦의 * 갯수 => h * 2 - 1
*/
public class Test03_A {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();		
		int b = h*2-1; //바닥의 * 갯수
		int m = b/2;   //* 중간 인덱스. 
		for(int i=0;i<h;i++) {
		   for(int j=0;j<b;j++) {
			   if(j >= m-i && j<= m+i) 
				   System.out.print("*");
			   else
				   System.out.print(" ");
		   }
		   System.out.println();
		}
		
	}
}
