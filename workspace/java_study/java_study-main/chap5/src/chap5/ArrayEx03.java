package chap5;

import java.util.Arrays;

/*
 * 로또 번호 생성
 * 1. 1 ~ 45까지의 값을 저장하는 배열생성
 * 2. 배열의 값을 섞기
 * 3. 정렬하기(sort)
 */
public class ArrayEx03 {
	public static void main(String[] args) {
		int[] balls = new int[45];
		int[] lotto = new int[6];
		//balls 배열의 값 초기화 : 1 ~ 45
		//1. 1 ~ 45까지의 값을 저장하는 배열생성
		for(int i=0;i<balls.length;i++) {
			balls[i] = i+1;
		}
		//2. 배열의 값을 섞기
		for(int i=0;i<1000;i++) {
			int f = (int)(Math.random() * 45);
			int t = (int)(Math.random() * 45);
			//swap 알고리즘 : 2개의 값을 바꾸기
			int tmp = balls[f];
			balls[f] = balls[t];
			balls[t] = tmp;
		}
		//Arrays.toString(balls) : 배열의 요소들을 출력해주는 함수 
		System.out.println(Arrays.toString(balls));
		//lotto번호 선택 : 0~ 5번 인덱스까지
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = balls[i];
		}
		System.out.println(Arrays.toString(lotto));
		// 3. 정렬하기(sort)
		for(int i=0;i<lotto.length;i++) { //i:3
			boolean sortable = true;
			for(int j=0;j<lotto.length-1-i;j++) {
				//4, 15, 25, 29, 36, 42    //true
				if(lotto[j] > lotto[j+1]) {
					int tmp = lotto[j]; 
					lotto[j] = lotto[j+1];
					lotto[j+1] = tmp;
					sortable =false;
				}
			}
			System.out.print(i+":");
			for(int a : lotto) System.out.print(a + ",");
			System.out.println();
			if(sortable) break;
		}
		System.out.print("최종 정렬 : ");
		for(int a : lotto) System.out.print(a + ",");
		System.out.println();
	}
}
