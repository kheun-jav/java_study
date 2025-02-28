package chap9;
/*
 * 내부클래스에서 외부 클래스의 private 멤버에 접근
 */
class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;	
	class InstanceInner {
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner {
//		static int scv = outeriv; //클래스 멤버에서 인스턴스멤버 직접호출불가.객체화필요
		static int scv = new Outer2().outeriv;
		static int scv2 = outercv;
		int siv2 = outercv;
	}
	/*
	 * 지역내부클래스에 사용되는 메서드의 지역변수는 상수화 되어야 한다.
	 * 지역변수의 변경이 없는 경우는 상수로 판단함.
	 * 지역변수의 변경은 안됨
	 */
	void method(int pv) {
		int lv = 100;
//		lv++;
		class LocalInner {
			int liv = outeriv;
			int liv2 = outercv;
			int liv3 = lv;
			void method(int num) {
				System.out.println("outeriv="+ ++outeriv);
				System.out.println("outercv="+ ++outercv);
				System.out.println("liv=" + ++liv);  //내부클래스의 멤버 변수
				System.out.println("liv2=" + ++liv2); //내부클래스의 멤버 변수
				System.out.println("num=" + ++num); //내부메서드 의 지역변수 100
				System.out.println("pv=" + pv); //외부메서드의 지역변수. 0
				System.out.println("lv=" + lv); //외부메서드의 지역변수. 100
			}
		}
		//LocalInner 클래스의 method(int num) 호출하기
		LocalInner li = new LocalInner();
		li.method(100);
	}
}
public class InnerEx2 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method(0);
		//InstanceInner,StaticInner 내부의 멤버 출력하기
		Outer2.InstanceInner ii = out.new InstanceInner();
		System.out.println("ii.iiv="+ii.iiv);
		System.out.println("ii.iiv2="+ii.iiv2);
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println("si.siv2=" + si.siv2);
		System.out.println("Outer2.StaticInner.scv=" + Outer2.StaticInner.scv);
		System.out.println("Outer2.StaticInner.scv2=" + Outer2.StaticInner.scv2);
//		System.out.println("out.outeriv=" + out.outeriv);  //private 멤버
//		System.out.println("Outer2.outeriv=" + Outer2.outercv); //private 멤버
	}
}
