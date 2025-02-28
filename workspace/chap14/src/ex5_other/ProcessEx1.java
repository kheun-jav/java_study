package ex5_other;

import java.io.IOException;

/*
 * 멀티 프로세스 예제
 * Process : OS상에서 실행되는 프로그램.
 * Runtime.getRuntime() : OS로부터 프로세스를 실행 권한 얻기
 */
public class ProcessEx1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		Process p1 = new Runtime.getRuntime().exec("mspaint.exe");
		Process p2 = new Runtime.getRuntime().exec("notepad.exe");
		p1.waitFor();
		p2.destroy();
		}

}
