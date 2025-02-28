package ex2_method;

/* Rectangle 함수 구현하기
 * area() 메서드
 *  리턴타입 : int
 * length() 메서드
 *  리턴타입 : int
 * isSquare() 메서드
 *  리턴타입 : boolean
 */
class Rectangle {
	int width,height,serialNo;
	static int cnt;
	int area() {
		return width * height;
	}
	int length() {
		return (width+height) * 2;
	}
	boolean isSquare() {
		return width == height;
	}
	public String toString() {
		return serialNo+"번사각형("+width+","+height+") 생성된 사각형 갯수:"+cnt+
				"=>면적:"+area()+",둘레:"+length()+","+
				((isSquare())?"정사각형":"직사각형");
	}
}
public class Exam1 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(); //width=0,height=0
		r1.width = 30;
		r1.height = 20;
		r1.serialNo = ++Rectangle.cnt;
		System.out.println(r1); //1번사각형(30,20) 생성된 사각형 갯수:1=>면적:600,둘레:100,직사각형
	}
}
