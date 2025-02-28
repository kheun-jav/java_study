package test;
/*
(1)+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+(1+2+3+4+5+6)+
 (1+2+3+4+5+6+7)+(1+2+3+4+5+6+7+8)+(1+2+3+4+5+6+7+8+9)+
(1+2+3+4+5+6+7+8+9+10)=220 한줄로 출력하기
i: 1  1
i: 2  1 2
i: 3  1 2 3
...
i:10  1 2...10
*/
public class Test05_A {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				sum += j;
			}
		}
		System.out.println(sum);
        System.out.println("===================");
        sum=0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("(");
			for (int j = 1; j <= i; j++) {
				System.out.print(j + ((j == i) ? "" : "+"));
				sum += j;
			}
			System.out.print(")" + ((i == 10) ? "=" : "+"));
		}
		System.out.println(sum);

	}
}
