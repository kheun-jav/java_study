package ex2_supplier;

import java.util.function.BooleanSupplier;

public class Exam1 {

	public static void main(String[] args) {
		//BooleanSupplier를 이용하여 data배열의 합이 짝수인지 홀수인지 여부를 출력하기
		int data [] = {1, 2, 5, 78, 4, 6, 8, 12};
		BooleanSupplier s = () ->{
			int sum =0;
			for(int i : data) {
				sum +=i;
			}
			return sum%2==0;
		};
		if(s.getAsBoolean()) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

}
