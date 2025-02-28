package ex1_inputstream;

import java.io.IOException;
import java.io.InputStream;

/*
 * 입출력 스트림 : 데이터의 이동통로. 단방향      추상클래스
 *  입력스트림 : 바이트 => 바이트형 입력스트림 : InputStream
 *                                       1byte 단위로 읽기.
 *                                       동영상, 이미지, 텍스트 등을 읽기
 *            문자   => 문자형 입력스트림   : Reader
 *                                       2byte(1char) 단위로 읽기
 *                                       텍스트데이터 읽기
 *  출력스트림 : 바이트 => 바이트형 출력스트림 : OutputStream
 *                                       1byte 단위로 쓰기
 *                                       동영상, 이미지, 텍스트 등을 쓰기
 *            문자   => 문자형 출력스트림   : Writer
 *                                       2byte(1char) 단위로 쓰기
 *                                       텍스트데이터 쓰기
 * InputStreamReader : 바이트형 입력스트림 -> 문자형입력스트림 변경. Reader 하위 클래스                                      
 * OutputStreamWriter : 바이트형 출력스트림 -> 문자형출력스트림 변경. Writer 하위 클래스                                      
 *            
 * 자바에서 제공되는 표준 입출력 스트림
 *   표준입력스트림 : InputStream System.in => 키보드에서 입력           
 *   표준출력스트림 : PrintStream System.out => 콘솔(화면)으로 출력
 *   표준오류스트림 : PrintStream System.err => 콘솔(화면)으로 출력. 빨강색 출력
 */
public class InputStreamEx1 {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;  //키보드 입력
		int data = 0;
		//in.read() : 1byte씩 읽기
		while((data=in.read()) != -1) //ctrl+z (EOF)
			System.out.print((char)data);
	}
}
