package test;
/*
 * 구동클래스를 실행하였을때 다음의 결과가 나오도록
 * 관련 클래스를 구현하기
 [결과]  
DanceRobot은 춤을 춤니다.
SingRobot은 노래를 부릅니다.
DrawRobot은 그림을 그립니다.
 */
abstract class Robot2 {
	String name;
	Robot2(String name) {
		this.name = name;
	}
	abstract void action();
}
class DanceRobot2 extends Robot2 {
	DanceRobot2(){
		super("DanceRobot2");
	}
	@Override
	protected void action() {
		System.out.println(name + "은 춤을 춤니다.");
	}
}
class SingRobot2 extends  Robot2 {
	SingRobot2(){
		super("SingRobot2");
	}
	@Override
	void action() {
		System.out.println(name + "은 노래를 부릅니다.");
	}
}
class DrawRobot2 extends Robot2 {
	DrawRobot2(){
		super("DrawRobot2");
	}
	@Override
	public void action() {
		System.out.println(name + "은 그림을 그립니다.");
	}
}
public class Test3_B {
	public static void main(String[] args) {
		Robot2[] robot = new Robot2[3];
		robot[0] = new DanceRobot2();
		robot[1] = new SingRobot2();
		robot[2] = new DrawRobot2();
		for(Robot2 r : robot) {
			r.action(); 
		}
	}
}
