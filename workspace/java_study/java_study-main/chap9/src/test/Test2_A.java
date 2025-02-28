package test;
/*
 * Outer1클래스의 내부 클래스 Inner1, Inner2 의 멤버변수 iv의 값 출력 하기
 */
class Outer1 {
	class Inner1 {
		int iv = 100;
	}
  static class Inner2 {
		int iv = 200;
	}
}
public class Test2_A {
	public static void main(String[] args) {
		System.out.println(new Outer1().new Inner1().iv);
		System.out.println(new Outer1.Inner2().iv);
	}
}
