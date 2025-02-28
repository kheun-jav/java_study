package ex6_wrapper;
/*
 * switch 구문에서 조건값 사용할 수 있는 자료형 
 * byte,short,int,char,String
 * Byte, Short, Integer, Character
 */
public class WrapperEx3 {
	public static void main(String[] args) {
		Byte data = 0;
		switch(data) {
		case 0:
		default : System.out.println("switch 조건값 테스트");
		}
	}
}
/*
 * java.lang 패키지의 클래스
 *   Object : 모든 클래스의 부모 클래스
 *   String : 문자열. 정적인문자열. 변경불가 문자열 
 *   StringBuilder/StringBuffer : 동적문자열. equals 메서드를 오버라이딩안됨. 
 *                         보조문자열. 
 *   Math : 수치 계산을 위한 기능. 객체화불가, 상속불가. 모든멤버가 static
 *          Math.멤버명. 
 *   Wrapper 클래스 : Boolean, Byte,Short,Integer,Long,Character, Float, Double
 *          8개 클래스의 통칭. 기본자료형을 객체화하는 기능. 기본자료형과 형변환 가능       
*/
