package test2;

import java.util.Scanner;

/*
 * 배열의 크기를 홀수로 입력하세요 
 * 11

X         X
 X       X
  X     X 
   X   X  
    X X   
     X    
    X X   
   X   X  
  X     X 
 X       X
X         X
 
*/
public class Test5_B {
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
		//row값은 홀수값인경우만 
		char[][] arr = new char[row][row];
		  for(int i=0; i<arr.length;i++) {
		   for(int j=0;j<arr[i].length;j++) {
		    if(i+j==row-1) arr[i][j]='X';
		    else if(i==j) arr[i][j]='X';
		    else arr[i][j]=' ';
		    System.out.print(arr[i][j]);
		   }
		   System.out.println();
		  }
	}
}
