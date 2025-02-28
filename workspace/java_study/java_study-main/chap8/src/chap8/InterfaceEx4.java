package chap8;
/*
 * 추상클래스와 인터페이스를 이름 없는 내부 객체로 생성하기
 */
interface Action {
	void action();
}
abstract class Abs {
	int num = 100;
	abstract void method();
}
public class InterfaceEx4 {
	public static void main(String[] args) {
		//내부객체
		Action a = new Action() {
			@Override
			public void action() {
				System.out.println("Action 인터페이스의 action 메서드");
			}
		};
		a.action();
		//Abs 클래스의 객체 생성하기
		//Abs 객체의 num 값 출력하기
		Abs abs = new Abs() {
			@Override
			void method() {
				System.out.println("Abs 클래스의 num = " + num);
			}
		};
		abs.method();
		//람다식 : 함수 객체
		a = ()->System.out.println("람다방식으로 Action 인터페이스 구현");
		a.action();
	}
}
