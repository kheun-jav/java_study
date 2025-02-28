package chap9;
/*
 * 내부 클래스에서 사용되는 this, super
 */
class ParentOuter {
	int iv = 0;
	int piv = 500;
}
class Outer3 extends ParentOuter {
	int iv = 10;
	int iv2 = 20;
	class InstanceInner {
		int iv = 100;
		void method() { //내부클래스의 멤버 메서드
			int iv=300;
			/*
			 * 내부클래스의 멤버메서드에서 변수 접근 우선순위
			 * 1. 지역변수
			 * 2. 내부클래스의 멤버 변수. this.멤버변수 접근 가능
			 * 3. 외부클래스의 멤버 변수. 외부클래스명.this.멤버변수 접근 가능 
			 * 4. 외부클래스의 부모클래스의 멤버 변수. 외부클래스명.super.멤버변수 접근 가능
			 */
			System.out.println("iv="+iv);
			System.out.println("iv2="+iv2);
			System.out.println("piv="+piv);
			//this 참조변수로는 외부클래스의 멤버에 접근 불가 
			System.out.println("this.iv="+this.iv);
			//외부클래스의 멤버 접근 : 외부클래스명.this.멤버명
			System.out.println("Outer3.this.iv="+Outer3.this.iv);
			//외부클래스의 상위 멤버 접근 : 외부클래스명.this.멤버명. 외부클래스의 멤버명이 한개인 경우
			System.out.println("Outer3.this.piv="+Outer3.this.piv);
			//외부클래스의 상위 멤버 iv 접근 : 외부클래스명.super.멤버명
			System.out.println("Outer3.super.iv="+Outer3.super.iv);
			System.out.println("Outer3.super.piv="+Outer3.super.piv);
			
			
		}
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		new Outer3().new InstanceInner().method();
	}
}
