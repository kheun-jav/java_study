package ex7_other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

/*
 * SequenceInputStream 
 *  - 여러개의 스트림을 하나의 스트림으로 합해주는 스트림
 */
public class SequenceStreamEx1 {
	public static void main(String[] args) throws IOException {
		File f = new File("src/ex7_other");
		String[] files = f.list();
		Vector<InputStream> v = new Vector<>();
		for(String file : files) {
			File f2 = new File(f,file);
			if(f2.isFile())
			   v.add(new FileInputStream(f2));
		}
		//Enumeration v.elements()  
		//s : [new FileInputStream("Exam1.java),new FileInputStream("FileEx1.java),..]
		//    모든 스트림을 한개의 스트림으로 연결
		SequenceInputStream s = new SequenceInputStream(v.elements());
		FileOutputStream fos = new FileOutputStream("File예제.txt");
		int data = 0;
		byte[] buf = new byte[8096];
		while((data=s.read(buf)) != -1) {
			fos.write(buf, 0, data); //File예제.txt에 내용을 출력
		}
		fos.flush();
		fos.close();
		s.close();
	}
}
