package ex1_field;
/*
 * Car 클래스 예제를 위한 Main 클래스
 */
public class Main1 {
	public static void main(String[] args) {
		System.out.println("자동차의 크기:" + Car.width + "," + Car.height);
//		System.out.println("자동차의 색상 :" + Car.color);//color는 인스턴스변수이므로 객체화필요
		//car1,car2 : main 메서드에서 선언됨. 지역변수
		Car car1 = new Car();
		car1.color = "White";
		car1.num = 1234;
		//car1 참조변수의 값을 출력하면 내부의 car1.toString() 메서드를 호출함
		System.out.println(car1.toString());
		Car car2 = new Car();
		car2.color = "Black";
		car2.num = 3456;
		System.out.println(car2);
		car1.width = 80;
		car1.height = 50;
		System.out.println(car1);
		System.out.println(car2);
	}
}
