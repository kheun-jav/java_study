package chap4;

import java.util.Scanner;

/*
 * 1,2,3 중 한개의 임의의 값을 생성하여
 * 1:가위
 * 2:바위
 * 3:보자기
 * 출력하기
 * 
 * 
 * 시스템  사용자 
 *   가위   가위     비김
 *   가위   바위    시용자승리
 *   바위   가위    시스템승리
 */
public class Exam03 {
	public static void main(String[] args) {
		//시스템이 저장 한 값. 
		int crp = (int)(Math.random() * 3) + 1; //1~3사이의 임의 의 수
/*
		switch(crp) {
		case 1 : System.out.println("가위");break;
		case 2 : System.out.println("바위");break;
		case 3 : System.out.println("보자기");break;
		}
*/
		//화면 출력용 데이터를 저장할 변수 선언 
		// 가위,바위,보자기 문자열 저장 변수 
		String syscrp=null,usercrp=null;
		switch(crp) {
		case 1 : syscrp = "가위";break;
		case 2 : syscrp = "바위";break;
		case 3 : syscrp = "보자기";break;
		}	
		//시용자 입력 부분
		Scanner scan = new Scanner(System.in);
		System.out.println("1(가위),2(바위),3(보자기) 중 한개를 입력하세요");
		//1,2,3 중 한개의 숫자 저장. 
		//사용자가 입력한 값.
		int userin = scan.nextInt();
		switch(userin) { //화면출력용 데이터 저장
		case 1 : usercrp = "가위";break;
		case 2 : usercrp = "바위";break;
		case 3 : usercrp = "보자기";break;
		}
		//\t : tab 출력
		System.out.println("시스템\t사용자");
		System.out.print(syscrp + "\t" + usercrp + "\t");
		if(userin == crp) System.out.println("비김");
		switch(crp) {
		case 1 : if (userin == 2) System.out.println("사용자승리"); 
		         if (userin == 3) System.out.println("시스템승리");
		        break;
		case 2 : if (userin == 3) System.out.println("사용자승리"); 
                 if (userin == 1) System.out.println("시스템승리");
                 break;
		case 3 : if (userin == 1) System.out.println("사용자승리"); 
                 if (userin == 2) System.out.println("시스템승리");
                 break;
		}		
	}
}

