package chap3;
/*
 * 대입연산자 : =,+=,-=,*=....
 * a = 10 : a 변수에 10을 저장. 대입연산자
 * a == 10 : a 변수의 값이 10 인지 판단. 조건문. true, false 값 리턴. 등가연산자
 * 
 * left value(lvalue) = right value(rvalue)
 * lvalue는 반드시 변수 여야함. 
 * rvalue는 변수,상수,수식 모두 가능
 * a+b(수식) = 10(상수); (x)
 * 10(상수) = a(변수); (x)
 * a(변수) = 10(상수); (0)
 * a(변수) = 10+ 20(수식); (0)
 * a(변수) = b(변수); (0)
 */
public class OpEx8 {
	public static void main(String[] args) {
		int num = 100;
		System.out.println(num);
		num += 10;  //num = num + 10
		System.out.println(num);
		num -= 10;  //num = num - 10
		System.out.println(num);
		num *= 5;   //num = num * 5
		System.out.println(num);
		num /= 10;  //num = num / 10
		System.out.println(num);
		num %= 3;  //num = num % 3
		System.out.println(num);
		num += 2+3; //num = num + (2 + 3)
		System.out.println(num);
	}
}
