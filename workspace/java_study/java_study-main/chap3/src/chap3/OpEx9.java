package chap3;
/*
 * int 형보다 작은 자료형(byte,short,char) 형의 연산의 결과는 int 임
 *
 * 연산의 결과는 큰자료형을 따른다
 * int = int + int
 * float = float + int
 * long = long + int
 */
public class OpEx9 {
	public static void main(String[] args) {
		int x=10,y=20;
		int a;
		long b;
		float c;
		a = x + y;
		System.out.println("a=" + a); // 30
		b = x + y;
		System.out.println("b=" + b); // 30
		b = a + b; // long = int + long
		c = a + b; // long = int + long
		
		byte b1=10,b2=20,b3;
		b3 = (byte)(b1 + b2); // int = byte + byte
		
		char c1 = 'A';
		c1 += 1;
		System.out.println("c1="+c1);
		c1 = (char) (c1 + 1);
		System.out.println("c1="+c1);
		c1 = 'A';
		c1 += 32;
		char c2 = (char)('A' + 32);
		System.out.println("c1의 소문자:"+c1);
		System.out.println("c1의 소문자:"+c2);
		
	}
}
