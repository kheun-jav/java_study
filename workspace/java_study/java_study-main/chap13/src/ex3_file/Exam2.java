package ex3_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 exit 값을 입력할때 까지 내용을 입력받아 data.txt 파일에 저장하기
 * [결과]
 * data.txt 파일에 저장할 내용을 입력하세요(종료:exit)
 * aaaa
 * bbbb
 * exit
 */
public class Exam2 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("data.txt");
		System.out.println("data.txt 파일에 저장할 내용을 입력하세요(종료:exit)");
		while(true) {
			String data = scan.nextLine();
			if(data.equals("exit")) break;
			fos.write((data+"\n").getBytes());
		}
		fos.close();
		FileWriter fw = new FileWriter("data2.txt");
		System.out.println("data2.txt 파일에 저장할 내용을 입력하세요(종료:exit)");
		while(true) {
			String data = scan.nextLine();
			if(data.equals("exit")) break;
			fw.write(data+"\n");
		}
		fw.close();
	}
}
