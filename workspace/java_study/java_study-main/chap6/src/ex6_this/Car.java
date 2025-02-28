package ex6_this;

public class Car {
	String color;
	int number;
	int serialNo;
	static int sno;
	Car(String color,int number) {
		System.out.println("Car(String,int) 생성자");
		this.color = color;
		this.number = number;
		this.serialNo = ++sno;
	}
	Car() {
		//매개변수형이 String, int 다른 생성자 호출
		this("White",1111);
		System.out.println("Car() 생성자");
		/*
		color = "White";
		number = 1111;
		serialNo = ++sno;
		*/
	}
	Car(String color) {
		this(color,1111);
	}
	Car(int number) {
		this("White",number);
	}
	Car(Car c) {
		this(c.color,c.number);
	}
	public String toString() {
		return 
serialNo + "번 자동차:" + color + ","+number;
	}
}
