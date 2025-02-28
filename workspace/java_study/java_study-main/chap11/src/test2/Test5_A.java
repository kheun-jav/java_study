package test2;
/*
 * int getRand(f,t) : 함수 구현하기
 *   f ~ t 또는 t~ f 까지  범위에 숫자를 임의의 수로 리턴하는 함수
 *   f, t 값은 포함됨. 
 
[결과]
-2,1,0,-3,-2,1,-1,0,-2,0,0,1,0,-3,0,-1,-1,-2,-2,1,
3,3,0,0,-1,-1,0,3,2,3,0,-1,1,1,-1,3,0,0,1,-1,    
 */

import java.util.Random;

public class Test5_A {
	public static void main(String[] args) {
		for(int i=0;i<20;i++) {
			System.out.print(getRand(1,-3)+",");
		}
		System.out.println();
		for(int i=0;i<20;i++) {
			System.out.print(getRand(-1,3)+",");
		}
	}
	// 1 ~ 10사이의     1 <=  (Math.random() * 10) + 1 <= 10
	// 2 ~ 10사이의     2 <=  (Math.random() * 9) + 2 <= 10
	static int getRand(int f,int t) {
//		int min = Math.min(f,t);
		int min = (f<t)?f:t; 
//		int max = Math.max(f,t);
		int max = (f>t)?f:t; 
		int cha = max - min ; //범위. 
//		return (int)(Math.random() * (cha+1)) + min;
		Random r = new Random();
		return  r.nextInt(cha+1) + min;
		
	}
	
}
