package test2;

import java.util.Scanner;

/*
 배열의 크기를 홀수로 입력하세요
 11

X□■□■□■□■□X
□X□■□■□■□X□
■□X□■□■□X□■
□■□X□■□X□■□
■□■□X□X□■□■
□■□■□X□■□■□
■□■□X□X□■□■
□■□X□■□X□■□
■□X□■□■□X□■
□X□■□■□■□X□
X□■□■□■□■□X

■ : ㅁ 한자
□ : ㅁ 한자
*/
public class Test6_B {
	public static void main(String[] args) {
		System.out.println("배열의 크기를 홀수로 입력하세요");
		Scanner scan = new Scanner(System.in);
		int row = 0;
		while(true) {
			row = scan.nextInt();
			if(row %2 == 0) {
				System.out.println("홀수로 입력하세요");
			} else 
				break;
		}
		char[][] arr = new char[row][row];
		  for(int i=0; i<arr.length;i++) {
		   for(int j=0;j<arr[i].length;j++) {
		    if(i+j==row-1) arr[i][j]='X';
		    else if(i==j) arr[i][j]='X';
		    else if (i%2 == j%2) arr[i][j]='■';
		    else arr[i][j]='□';
		    System.out.print(arr[i][j]);
		   }
		   System.out.println();
		  }
	}
}
