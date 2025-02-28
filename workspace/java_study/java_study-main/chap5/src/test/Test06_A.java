package test;

import java.util.Scanner;

/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			
	8	7	6		
5	4	3	2	1	
 
높이
   3  : 1+3+5 = 9
   5  : 1+3+5+7+9 = 25   
*/
public class Test06_A {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int bottom = len * 2 - 1;
		int data = 0; //출력할 숫자의 시작 값
		for(int i=bottom;i>=1;i-=2) {
			data += i;
		}

		//*로 이등변삼각형 출력 알고리즘
		int m = bottom/2;
		for(int i=0;i < len;i++) {
			for(int j=0;j<bottom;j++) {
				if(j>=m-i && j<=m+i)
//					System.out.print(data--+"\t");
					//%4d : 출력서식문자.  %nd : n자리를 확보해서 10진 정수 출력 
					System.out.printf("%4d",data--);
				else
//					System.out.print("\t");
					//%4c : %nc : n자리만큼 문자출력
					//%4s : %ns : n자리를 확보해서 문자열 출력
					System.out.printf("%4c",' ');
			}
			System.out.println();
		}

	}
}
