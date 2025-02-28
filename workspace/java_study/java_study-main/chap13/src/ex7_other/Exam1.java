package ex7_other;

import java.io.File;

/*
 * c:/windows 폴더의 하위 폴더의 갯수와 파일의 갯수,파일의 총크기를 출력하기
 */
public class Exam1 {
	public static void main(String[] args) {
		File f1 = new File("c:/windows");
		int dcnt=0,fcnt=0;
		long size=0;
		String[] files = f1.list();
		for(String f : files) {
			File f2 = new File(f1,f);
			if(f2.isFile()) {
				fcnt++;
				size += f2.length();
			} else {
				dcnt++;
			}
		}
		System.out.println("폴더의 갯수:"+dcnt);
		System.out.println("파일의 갯수:"+fcnt);
//		System.out.println("전체 파일의 크기:" + size);
		System.out.printf("전체 파일의 크기:%,d",size);
	}
}
