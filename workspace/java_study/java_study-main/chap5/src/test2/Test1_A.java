package test2;
/*
  Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
  int num = Integer.parseInt(args[0]);
  [결과]
  10의 약수 : 1,2,5,10,
 */
public class Test1_A {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Command 라인에 파라미터를 입력하세요");
			return;
		}
		for (String a : args) { 
			//Integer.parseInt(a) : a문자열 객체를 int 정수형으로 변경해주는 함수  
			int num = Integer.parseInt(a); //10
			System.out.print(num + "의 약수 :");
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) //약수값
					System.out.print(i + ",");
			}
			System.out.println();
		}
	}
}
