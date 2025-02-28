package ex1_is_a;
/*
 * Student,Person 클래스 구현하기
 * 
 * Student 클래스 : Person 클래스의 하위 클래스 
 *  멤버 메서드 
 *    void study() : 공부한다를 화면에 출력함
 *    
 * Person 클래스 
 *   void eat() : 먹는다 를 화면에 출력함
 *   void sleep() : 잔다 를 화면에 출력함
 */
class Person {
	void eat() {
		System.out.println("먹는다");
	}
	void sleep() {
		System.out.println("잔다");
	}
}
class Student extends Person {
	void study() {
		System.out.println("공부한다");
	}
}
public class Exam1 {
	public static void main(String[] args) {
		Student st = new Student();
		st.eat();   //먹는다
		st.sleep(); //잔다
		st.study(); //공부한다
	}
}
