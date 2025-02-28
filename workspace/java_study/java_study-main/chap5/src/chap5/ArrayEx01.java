package chap5;
/*
 * 배열의 선언과 초기화
 */
public class ArrayEx01 {
	public static void main(String[] args) {
		int arr[];  //배열의 선언. 참조변수의 선언
		arr = new int[5]; //배열의 생성. 배열 객체 생성
		/*
		 * new 예약어 기능
		 * 1. 객체 생성. int형 값을 저장할 수 있는 변수 5개를 할당
		 * 2. 기본값 초기화
		 *    숫자 : 0
		 *    boolean : false
		 *    그외 : null
		 */
		//배열값을 초기화. 인덱스 사용 
		arr[0] = 10;
		arr[1] = 20;
		//arr.length : 배열의 요소의 갯수 지정한 상수값. 
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
//		arr.length = 10; //상수값을 변경 불가
		//배열의 선언과 생성
		int[] arr2 = new int[3];
		//배열 초기화
		arr2[0] = 100;
		arr2[1] = 200;
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println("arr2 = arr 이후");
		arr2 = arr;
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		arr[3]=1000;
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		//개선된 for문 : foreach 구문
		//int a : int는 요소의 자료형을 의미
		//인덱스 사용 불가. 
		for(int a : arr) {
			System.out.println(a);
		}
		
	}
}
