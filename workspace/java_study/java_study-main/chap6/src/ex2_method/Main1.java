package ex2_method;

public class Main1 {
	public static void main(String[] args) {
		Adder a1 = new Adder();
		int i1 = a1.add1(10,20); //선언부에 맞도록 호출해야 함
		System.out.println(i1); //30
		long l1 = a1.add2(10,20); //선언부에 맞도록 호출해야 함
		System.out.println(l1); //30
		a1.add3(10,20); //리턴값이 없음
	}
}
