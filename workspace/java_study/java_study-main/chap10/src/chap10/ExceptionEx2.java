package chap10;
/* 정상 : 12346
 * 3/0 : 예외발생 => 1256
 * 
 * catch블럭 : try블럭 내부에서 예외발생시에 실행되는 영역
 * 
 * 다중 catch
 * - 한개의 try블럭에 여러개의 catch 블럭 존재
 *   => try블럭에서 발생되는 예외가 여러 종류인 경우 예외별 예외처리가 가능 
 *   => 상위 예외클래스(Exception)은 catch들 중 하단에 배치해야 함(순서 중요).
 *   
 * 예외 클래스 계층
 * Throwable - Error
 *           - Exception(예외클래스의 최상단) - RuntimeException => 예외처리 생략 가능
 *                                        - 그외 Exception    => 예외처리 생략 불가
 *                 
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
//		System.out.println(1/0); //ArithmeticException 예외 발생
		try {
			String str = null;
			System.out.println(str.trim());  //NulPointerException 예외 발생
			//NumberFormatException 예외 발생시 "숫자만 입력하세요" 출력하기
			System.out.println(Integer.parseInt("abc")); //NumberFormatException 예외 발생
			System.out.println(args[0]); //ArrayIndexOutOfBoundsException 예외 발생
			System.out.print(1);
			System.out.print(2);
			System.out.print(3/0); //ArithmeticException 예외 발생
			System.out.print(4);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터를 입력하세요");
		} catch (ArithmeticException e) { //예외발생시에만 실행되는 영역
			System.out.print(5);
		} catch(NumberFormatException e) {
			System.out.println("숫자만 입력하세요");
		} catch (Exception e) {
			System.out.println("프로그램 오류 입니다. 전산부로 연락하세요");
		}
		System.out.println(6);
	}
}
