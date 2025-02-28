package test2;

import java.util.Scanner;
/*
 [결과]
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>1
학생수>5
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>2
scores[0]>100
scores[1]>50
scores[2]>80
scores[3]>75
scores[4]>95
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>3
scores[0]:100
scores[1]:50
scores[2]:80
scores[3]:75
scores[4]:95
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>4
최고 점수:100
평균 점수:80.0
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>5
프로그램 종료
 */
public class Test4_A {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null; //참조변수 선언. 배열생성 안함
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("--------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------");
			System.out.print("선택>");
			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				System.out.print("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum]; //배열 객체 생성
			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "]>");
					int score = scanner.nextInt();
					scores[i] = score;
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]:" + scores[i]);
				}
			} else if (selectNo == 4) {
				int sum = 0;
				int max = 0;
				double avg = 0;
				for (int i = 0; i < studentNum; i++) {
					sum += scores[i];
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				avg = (double)sum / studentNum;
				System.out.println("최고 점수:" + max);
				System.out.println("평균 점수:" + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}