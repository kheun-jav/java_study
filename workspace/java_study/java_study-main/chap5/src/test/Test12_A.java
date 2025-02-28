package test;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
5
15	14	13	12	11	
	10	9	8	7	
		6	5	4	
			3	2	
				1
 */
public class Test12_A {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= h; i++)
			sum += i;
//		System.out.println(sum);
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= h; j++) {
				if (i <= j)
					System.out.print(sum-- + "\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}

	}
}
