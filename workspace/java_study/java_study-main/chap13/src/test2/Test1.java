package test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

/*
src/폴더 하위 폴더의 .java 파일 중 InputStream 관련 모든 소스 내용을  
InputStream예제.txt  파일 하나에 저장 하기 ->sequenceInputStream
InputStream 관련 모든 소스 : XXXInputStreamXXX.java
*/
public class Test1 {
	public static void main(String[] args) throws IOException {
		File f = new File("chap13/src/");
		String [] files = f.list();
		Vector<InputStream> v = new Vector<>();
		for(String file : files) {
			File f2 = new File(f, file);
			if(f2.isFile()) {
				if(f2.getName().contains("InputStream")) {
					v.add(new FileInputStream(f2));
				}
			}
		}
		SequenceInputStream s= new SequenceInputStream(v.elements());
		FileOutputStream fos = new FileOutputStream("InputStream예제.txt");
		int data= 0;
		byte buf[] = new byte[8096];
		while((data = s.read(buf)) != -1) {
			fos.write(buf, 0, data);
		}
	}
}
