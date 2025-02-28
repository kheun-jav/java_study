package ex4_operator;

import java.util.function.IntBinaryOperator;

/*
 * Operator 인터페이스
 * 	- Function 인터페이스의 하위 인터페이스
 * 	- 매개변수, 리턴값 모두 존재.
 * 	- T applyXXXX(T)
 * 
 * 	-종류
 * 	  UnaryOperator<T> : T apply(T)     => Function 인터페이스의 하위 인터페이스
 * 	  BinaryOperator<T> : T apply(T,T) 	=> BiFunction 인터페이스의 하위 인터페이스
 *    DoubleUnaryOperator : double applyAsdouble(double)
 * 	  DoubleBinaryOperator :double applyAsdouble(double, double) 
 *    IntUnaryOperator : int applyAsInt(int)
 *    IntBinaryOperator : int applyAsInt(int, int)
 *    LongUnaryOperator : long applyAsLong(long)
 *    LongBinaryOperator : long applyAsLong(long, long)	
 */
public class OperatorEx1 {
	private static int score[] = {92, 95, 87, 100, 55};
	public static void main(String[] args) {
		int max = 0,min = 0;
		for(int i =0; i<score.length; i++) {
			if(score[i]>max) {
				max = score[i];
			} else {
				min = score[i];
			}
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
		System.out.println("최대값:"+maxOrMin((a,b) -> (a>b)?a:b));
		System.out.println("최소값:"+maxOrMin((a,b)-> (a<b)?a:b));


	}
	private static int maxOrMin(IntBinaryOperator op) {
		int result =score[0];
		for(int s : score) result = op.applyAsInt(s, result);
		return result;
	}
}
