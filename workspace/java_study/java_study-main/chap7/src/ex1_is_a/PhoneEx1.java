package ex1_is_a;
/*
 * 상속 예제
 * 1. 자손 클래스의 객체 생성은 부모 클래스의 객체부터 생성한다. 
 * 2. 클래스 간의 상속은 단일 상속만 가능하다.
 *    현재 클래스의 부모클래스는 한개만 가능하다.
 * 3. 모든 클래스의 부모클래스가 Object 클래스다.   
 */
public class PhoneEx1 extends Object {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power();
		sp.send();
		sp.receive();
		sp.setApp("카카오");
	}
}
