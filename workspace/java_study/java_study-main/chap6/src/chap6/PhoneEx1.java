package chap6;
/*
 * 클래스 예제
 * 파일의 이름 : PhoneEx1.java
 * 
 * 클래스 : 사용자 정의 자료형.
 *  속성 : 멤버변수. 필드
 *  기능 : 멤버메서드. 멤버함수
 */
class Phone {
	String color;  //색상. 멤버변수, 필드
	boolean power; //전원
	String no;     //번호
	//멤버메서드 . 기능
	void power() {  //전원켜기
		power = !power;
	}
	void send(String no) { //전화걸기 기능
		System.out.println(no + "로 전화거는 중");
	}
	void receive(String no) { //전화받기 기능
		System.out.println(no + "에서 전화받는 중");
	}
}
//구동클래스 : main메서드를 포함한 public 클래스
public class PhoneEx1 {
	public static void main(String[] args) {
		Phone p1 = new Phone(); //객체화. 인스턴스화 => 메모리 할당. 객체 생성
		/*
		 * new : 객체화 기능 
		 * 1. 힙영역에 메모리 할당 => 객체
		 * 2. 멤버필드를 기본값으로 초기화
		 * 3. 생성자 호출
		 */
		p1.color = "검정";
		p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color + ","+ p1.power + "," + p1.no);
		Phone p2 = new Phone(); //객체화. 인스턴스화 => 메모리 할당. 객체 생성
		p2.color = "파랑";
		p2.power = true;
		p2.no = "01087654321";
		System.out.println(p2.color + ","+ p2.power + "," + p2.no);
		p1.send(p2.no);
		p2.receive(p1.no);	
		p2 = p1;
		System.out.println(p1.color + ","+ p1.power + "," + p1.no);
		System.out.println(p2.color + ","+ p2.power + "," + p2.no);
		p1.color = "빨강";
		System.out.println(p1.color + ","+ p1.power + "," + p1.no);
		System.out.println(p2.color + ","+ p2.power + "," + p2.no);
	}
}
