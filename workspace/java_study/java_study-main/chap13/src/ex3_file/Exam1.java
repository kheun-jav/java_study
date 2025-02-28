package ex3_file;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter 클래스를 이용하여 FileOutputStreamEx1.java의 내용을 out2.txt 파일에 저장하기
 * 주요메서드
 * void write(int data): 1byte를 출력.
 * void write(char[] buf): buf의 내용을 출력
 * void write(char[] buf,int start, int len): buf의 start 인덱스 부터 len크기만큼 내용 출력
 * void write(String str) : str문자열의 내용을 출력
 */
public class Exam1 {
	public static void main(String[] args) throws IOException {
		System.out.println("out2.txt 파일에 내용이 저장됩니다.");
		//fw : out2.txt 파일에 내용을 저장할 수 있는 출력스트림
		FileWriter fw = new FileWriter("out2.txt");
		fw.write('1');fw.write('2');fw.write('3');
		fw.write('a');fw.write('b');fw.write('c');
		fw.write('가');fw.write('나');fw.write('다');
		//String.toCharArray() : 문자열을 char[]로 리턴
		char [] buf ="\nFileWriter 예제입니다.\n".toCharArray();
		fw.write(buf);  //buf의 내용을 파일로 출력
		fw.write(buf,5,6); //buf의 5번인덱스 부터 6개의 내용을 파일로 출력
		fw.write("\nFileWrite는 문자열 출력이 가능합니다.\n");
		fw.flush();	
	}
}
