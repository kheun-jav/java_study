package chap2;
/*
다음결과가 나오도록 Exam2 프로그램 수정하기
[결과]
f=1.5
l=27000000000
result=true 
 */
public class Exam2 {
	public static void main(String[] args) {
	       float f = 3f / 2; // int 연산(/ 나누기) flat => 결과 float
		   long l= 3000L * 3000 * 3000;//27000000000
		   float f2 = 0.1f;
		   double d = 0.1f;
		   boolean result = d==f2;
		   System.out.println("f="+f);
		   System.out.println("l="+l);
		   System.out.printf("%.20f\n",f2);
		   System.out.printf("%.20f\n",d);
		   System.out.println("result="+result);
	}
}
