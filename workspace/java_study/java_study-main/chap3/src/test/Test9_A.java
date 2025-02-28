package test;

import java.util.Scanner;

/*
키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
  정수 : nextInt()
  실수 : nextDouble()
  String : next()
[결과]
이름 : 김명신
학년(숫자만) : 3
반(숫자만) : 15
번호(숫자만) : 1
성별(M/F) : F
성적(소수점 아래 둘째 자리까지) : 95.75
3학년 15반 1번 김명신 여학생의 성적은 95.75이다.

String 타입의 비교는 equals()메서드를 사용함
 성별 == "M" (X)
 성별.equals("M")
*/
public class Test9_A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("학년(숫자만) : ");
		int grade = scan.nextInt();
		System.out.print("반(숫자만) : ");
		int part = scan.nextInt();
		System.out.print("번호(숫자만) : ");
		int no = scan.nextInt();
		System.out.print("성별(M/F) : ");
		String gender = scan.next();
		System.out.print("성적(소숫점 아래 둘째 자리까지) : ");
		double score = scan.nextDouble();
		System.out.println(grade + "학년 " +part + "반 " + no+"번 " + name 
		  + ((gender.equals("M"))?" 남학생":" 여학생") + "의 성적은 " + score + "이다." );
		
		
	}
}
