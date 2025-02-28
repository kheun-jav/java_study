package ex1_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 화면에서 정수를 입력받아 입력받은 숫자의 합계,평균,중간값 출력하기
 * 999 숫자가 입력된 경우 입력 종료
 * 
 * 합계: 전체 숫자의 합
 * 평균: 합계/숫자갯수
 * 중간값 : 정렬하여, 갯수가 홀수 : 가운데 인덱스 값
 *                 갯수가 짝수 : 가운데 2개의 평균 인덱스 값
 */
public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요(종료:999)");
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		while(true) {
			int num = scan.nextInt();
			if(num == 999) break;
			list.add(num); 
			sum += num;
		}
		System.out.println(list + "=> 합계:" + sum);
		System.out.println(list + "=> 평균:" + (double)sum/list.size());
		//중간값
		Collections.sort(list);
		int m = list.size()/2;  // 5 / 2 = 2, 6/2 = 3
		if(list.size() % 2 == 0) {
			System.out.println(list + "=> 중간값:" + (list.get(m-1)+list.get(m))/2.0);
		} else {
			System.out.println(list + "=> 중간값:" + list.get(m));
		}
	}
}
