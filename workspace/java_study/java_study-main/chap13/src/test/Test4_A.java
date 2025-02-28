package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * apple.gif 파일을 읽어서, apple2.gif 파일로 복사하기
 */
public class Test4_A {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/test/apple.gif");
		FileOutputStream fos = new FileOutputStream("src/test/apple2.gif");
		byte[] buf = new byte[1000];
		int len = 0;
		while((len = fis.read(buf)) != -1) {
			fos.write(buf,0,len);
		}
		System.out.println("apple.gif 파일 복사완료");
		
	}
}
