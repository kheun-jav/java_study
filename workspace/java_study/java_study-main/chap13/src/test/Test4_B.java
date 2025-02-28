package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * apple.gif 파일을 읽어서, apple2.gif 파일로 복사하기
 * FileReader, FileWriter를 이용하여 복사하기.
 * 텍스트가 아닌 파일은 반드시 FileInputStream,FileOutputStream 을 이용해야함.
 */
public class Test4_B {
	public static void main(String[] args) throws IOException {
		FileReader fis = new FileReader("src/test/apple.gif");
		FileWriter fos = new FileWriter("src/test/apple2.gif");
		char[] buf = new char[1000];
		int len = 0;
		while((len = fis.read(buf)) != -1) {
			fos.write(buf,0,len);
		}
		System.out.println("apple.gif 파일 복사완료");
		
	}
}
