package test;

import java.util.Scanner;

/*
 *  농장에 강아지,병아리가 있음.
 *  강아지 병아리 전체 마리수 입력받고
 *  강아지 다리수와 병아리 다리수 전체를 입력받는다.
 *  [결과]
 *  강아지 병아리 마리수를 입력하세요
 *  20
 *  강아지 병아리 전체 다리수를 입력하세요
 *  30
 *  
 *  강아지 : xx마리
 *  병아리 : yy마리
 *  
 *  x+y = 전체마리수
 *  4x + 2y = 전체다리수
 *  [결과]
 *  강아지 병아리 마리수를 입력하세요
 *  10
 *  강아지 병아리 전체 다리수를 입력하세요
 *  10
 *   
 *  계산안됨 
 */
public class Test01_A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("강아지 병아리 마리수를 입력하세요");
		int cnt = scan.nextInt();
		System.out.println("강아지 병아리 전체 다리수를 입력하세요");
		int leg = scan.nextInt();
		boolean check = false;
		for (int x=0;x<=cnt;x++) {
			for(int y=0;y<=cnt;y++) {
				if((x+y==cnt) && ((4*x)+(2*y)==leg)) {
					System.out.println("강아지 : "+x +"마리");
					System.out.println("병아리 : "+y +"마리");
					check=true;
				}
			}
		}
		if(!check) { //check == false
			System.out.println("계산안됨");
		}		

	}
}
