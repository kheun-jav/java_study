package ex5_constructor;
/*
 * EastCard 클래스 구현하기
 * 멤버변수
 *    int number
 *    boolean isKwang
 *    
 * 멤버메서드
 *    toString()   
 *    
 */
class EastCard {
	int number;
	boolean isKwang;
	EastCard(int n,boolean b) {
		number = n;
		isKwang = b;
	}
	EastCard(){
		number = 1;
		isKwang = true; 
	}
	public String toString() {
		return number+(isKwang?"K":"");
	}
}
public class Exam2 {
	public static void main(String[] args) {
		EastCard c1 = new EastCard(3,false);
		EastCard c2 = new EastCard();
		System.out.println(c1); //3
		System.out.println(c2); //1K
		
	}
}
