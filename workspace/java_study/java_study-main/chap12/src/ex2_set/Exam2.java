package ex2_set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * Lotto 번호 생성하기
 * 1. 1 ~ 45사이의 임의의 값 중복되지 않는 6개 선택.
 * 2. 정렬하여 출력하기
 * 
 * TreeSet을 이용하기  
 */
public class Exam2 {
	public static void main(String[] args) {
		Set<Integer> lotto = new TreeSet<>();
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		while(lotto.size() < 6) {
			lotto.add(rand.nextInt(45)+ 1);
		}
		System.out.println(lotto);
	}
}
