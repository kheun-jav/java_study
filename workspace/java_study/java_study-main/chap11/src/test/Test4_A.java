package test;
/*
 * 숫자 맞추기 게임
 * 시스템이 4자리의 서로 다른 수를 저장한 후 사용자가 저장된 수를 맞추는 게임
 *    자리수도 맞는 경우 : 스트라익
 *    자리수는 틀리지만 숫자가 존재하면 : 볼
 *  4스트라익이 되면 정답

 *  NumberInputException을 이용하여 다음의 예외 처리를 할것  
 *  4자리 수가 아닌 경우는 4자리 숫자를 입력하세요. 를 출력하고 다시 입력을 받기. 입력숫자에는 포함됨 
 *  중복된 숫자가 입력된 경우 중복된 숫자가 입력되었습니다. 를 출력하고 다시 입력을 받기. 입력숫자에는 포함됨
 *  InputMismetchException을 이용하여 예외처리
 *  만약 숫자 아닌 값이 입력되면 숫자만 가능합니다. 를 출력하고 다시 입력을 받기. 입력숫자에는 포함됨
 *    
 *  [결과]
서로다른 4자리 정수를 입력하세요
1234
1234:0스트라이크, 1볼
서로다른 4자리 정수를 입력하세요
5678
5678:2스트라이크, 0볼
서로다른 4자리 정수를 입력하세요
2679
2679정답입니다.
3번 만에 맞추셨습니다. 게임을 종료합니다.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test4_A {
	public static void main(String[] args) {
		char numarr[] = "0123456789".toCharArray();
		char answer[] = new char[4];
		// 1. 시스템의 수를 지정 (Random함수 사용) 중복 문제
		for (int i = 0; i <= 1000; i++) {
			int f = (int) (Math.random() * 10);
			int t = (int) (Math.random() * 10);
			char temp = numarr[f];
			numarr[f] = numarr[t];
			numarr[t] = temp;
		}
		for (int i = 0; i < 4; i++) {
			answer[i] = numarr[i];
		}
		//정답을 출력. 제외부분
		for (char a : answer) {
			System.out.print(a);
		}
		System.out.println();
		Scanner scan = new Scanner(System.in);
		char[] rcvNum = new char[4];
		int cnt = 0;  //입력 회수
		while (true) {
			System.out.println("서로다른 4자리 정수를 입력하세요");
			String num = null;
			try {
				num = scan.next(); //InputMismatchException 예외 발생 안함
				cnt++;
				numberCheck(num); //입력값 검증
                rcvNum = num.toCharArray();	//입력된 숫자값			
				int strike = 0;
				int ball = 0;
				//스트라익,볼 결정
				for (int i = 0; i < answer.length; i++) {
					for (int j = 0; j < rcvNum.length; j++) {
						if (answer[i] == rcvNum[j]) {
							if (i == j)
								strike++;
							else
								ball++;
							break;
						}
					}
				}
				if (strike == 4) {
					System.out.println(num + "정답입니다.");
					System.out.println(cnt + "번 만에 맞추셨습니다. 게임을 종료합니다.");
					break;
				} else {
					System.out.println
					(num + ":" + strike + "스트라이크, " + ball + "볼");
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자만 가능합니다");
			} catch (NumberInputException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static void numberCheck(String str) throws NumberInputException {
		if (str.length() != 4) 
			throw new NumberInputException("4자리 숫자를 입력하세요");
		try {
			int num = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			throw new InputMismatchException("숫자만 가능합니다");
		}		
		int[] cnt = new int[10];
		for(char c : str.toCharArray()) {
			cnt[c-'0']++;
			if (cnt[c-'0'] > 1)
				throw new NumberInputException("중복된 숫자가 입력되었습니다.");
		}
	}
}
