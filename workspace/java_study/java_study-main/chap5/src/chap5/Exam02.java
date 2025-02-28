package chap5;

import java.util.Scanner;

/*
 * 10진수 입력받아서 8진수로 변경하기
 */
public class Exam02 {
	public static void main(String[] args) {
		int[] octal = new int[10];
		System.out.println("8진수로 변환할 10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num;
		int index = 0;
		while(divnum > 0) {
			octal[index++] = divnum%8;
			divnum /=8;
		}
		System.out.print(num + "의 8진수 : ");
		for(int i=index-1;i>=0;i--) 
			System.out.print(octal[i]);
		System.out.println();
		System.out.println(Integer.toOctalString(num));
	}
}
