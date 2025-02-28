package chap5;

import java.util.Scanner;

/*
 * Exam07 예제와 같은 기능의 프로그램을 작성하는데
 * 행의 크기를 입력받아서 처리하기
 */
public class Exam08 {
	public static void main(String[] args) {
		System.out.print("배열의 행의 길이 입력 : " );
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int[][] arr = new int[row][];
		for(int i =0 ; i<arr.length ;i++)
			arr[i] = new int[i+1];
		int num = 0;
		for(int j=arr.length-1; j>=0;j--) {
			for(int i = j; i< arr.length;i++) {
				arr[i][j] = ++num;
			}
		}
		for(int[] ar : arr) {
			for(int a : ar) {
				System.out.printf("%5d",a);
			}
		    System.out.println();
		}
  }
}
