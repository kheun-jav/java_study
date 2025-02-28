package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
1. 반복문을 이용하여 
  파일명을 입력받아서 해당 파일이 존재하면 해당파일명.bak 파일 복사하기
  파일명에 exit 가 입력되면, 프로그램 종료.
  해당 파일이 없으면 해당 파일이 없습니다. 메세지 출력

[결과]
파일명을 입력하세요(종료:exit)
aaa.txt
aaa.txt=>aaa.bak 복사완료
파일명을 입력하세요(종료:exit)
bbb.txt  
복사할 파일이 없습니다.
파일명을 입력하세요(종료:exit)
exit
*/

public class Test3_A {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("파일명을 입력하세요(종료:exit)");
			String filename = scan.next();
			if(filename.equals("exit")) break;
			int lastdot = filename.lastIndexOf(".");
			String bakfile=null;
			if (lastdot  < 0) //확장자가 없는 이름의 파일인 경우
				 bakfile =filename + ".bak";
			else bakfile =filename.substring(0,lastdot)+".bak";
			
			FileInputStream fis = null;
			FileOutputStream fos = null;
			try {
				fis = new FileInputStream(filename); //원본파일
				fos = new FileOutputStream(bakfile); //복사본 파일
				byte[] buf = new byte[8096]; //8K
				int len = 0;
				while((len=fis.read(buf)) != -1) {
					fos.write(buf,0,len);
				}
				System.out.println(filename +"=>" + bakfile + " 복사완료");
			} catch (FileNotFoundException e) { //원본파일이 없는 경우
				System.out.println(filename + ": 복사할 파일이 없습니다.");
			} catch (Exception e) {
				e.printStackTrace();
			} finally { //정상, 예외발생 모두 실행되는 영역
				if(fos != null) fos.flush();
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			}
	}

	}
}
