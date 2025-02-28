package test;
//예외 처리 필수 예외 객체
public class NumberInputException extends Exception {
	NumberInputException(String msg) {
		super(msg);
	}
}
