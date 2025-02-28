package ex12_scanner;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		String str = "100 and 200 and animal and lion and tiger";
		Scanner scan = new Scanner(str);
		scan.useDelimiter("\\s*and\\s*"); // and 문자열을 분리 읽기
		while(true) {
			try {
		      String token = scan.next();
			  System.out.println(token);
			} catch (NoSuchElementException e) {
				//NoSuchElementException : Scanner 객체가 읽을 수 있는 데이터가 없는 경우 예외 발생
				break;
			}
		}
	}
}
