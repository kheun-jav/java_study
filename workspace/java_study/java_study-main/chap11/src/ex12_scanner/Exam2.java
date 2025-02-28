package ex12_scanner;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam2 {
	public static void main(String[] args) {
		String str = "100 and 200 and animal and lion and tiger";
		Scanner scan = new Scanner(str);
		scan.useDelimiter("\\s*and\\s*");
		int sum = 0,cnt=0;
		while(true) {
			try {
				String data = scan.next();
				Pattern p = Pattern.compile("\\d+");
				Matcher m = p.matcher(data);
				if(m.matches()) {
					int num = Integer.parseInt(data);
					sum += num;
					cnt++;
				}
				System.out.println(data);
			} catch (NoSuchElementException e) {
				break;
			}
		}
		System.out.println("숫자의 합:"+ sum+", 평균:"+ (double)sum/cnt);
	}

}
