package ex5_constructor;
/*
 * Rectangle 클래스 구현
 * 멤버변수 : width, height
 * 생성자 : int, int 매개변수를 가진 생성자 구현
 * 멤버메서드
 *    int area()
 *    int length()
 *    String toString() : (width,height),면적:000,둘레:0000 
 */
class Rectangle {
	int width,height;
	Rectangle(int w,int h){
		width = w;
		height = h;
	}
	Rectangle(int w) {
		width = w;
		height = 1;
	}
	int area() {
		return width * height;
	}
	int length() {
		return (width + height) * 2;
	}
	public String toString() {
		return "(" + width + "," + height + "), 면적:"+area() + ",둘레:"+length();
	}
}
public class Exam1 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,10);
		System.out.println(r1); //(10,10), 면적:100,둘레:40
		Rectangle r2 = new Rectangle(10); 
		System.out.println(r2); //(10,1), 면적:10,둘레:22
	}
}
