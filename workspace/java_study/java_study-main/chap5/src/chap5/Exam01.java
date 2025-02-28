package chap5;

import java.util.Scanner;

/*
* 정수값 5개을 입력받아서 
 * 입력받은 수의 합계,평균,최대값,최소값,최대값인덱스값,최소값인덱스값 출력하기
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("정수형 값 5개를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int sum=0,maxidx=0,minidx=0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
			if(arr[maxidx] < arr[i])
				maxidx = i;
			if(arr[minidx] > arr[i])
				minidx = i;
		}
		System.out.println("합계:"+sum);
		System.out.println("평균:"+(double)sum/arr.length);
		System.out.println("최대값:"+arr[maxidx]);
		System.out.println("최소값:"+arr[minidx]);
		System.out.println("최대값인덱스:"+maxidx);
		System.out.println("최소값인덱스:"+minidx);
	}
}
