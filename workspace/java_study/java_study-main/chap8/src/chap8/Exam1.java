package chap8;
/*
* 다음 결과가 나오도록  Dove, Monkey 클래스,Flyable 인터페이스 구현하기
* [결과]
* 비둘기은 벌레를 잡아먹는다
  비둘기은 날아 다닌다
  원숭이는 나무에서 열매을 따먹는다
*/
//Animal 클래스
abstract class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	abstract void eat(); //추상메서드 
}
class Dove extends Animal implements Flyable{
	Dove() {
		super("비둘기");
	}
	@Override
	void eat() {
		System.out.println(name + "는 벌레를 잡아먹는다");
	}
	@Override
	public void fly() {
		System.out.println(name + "는 날아다닌다");
	}
}
class Monkey extends Animal {
	Monkey() {
		super("원숭이");
	}
	@Override
	void eat() {
		System.out.println(name + "는 나무에서 열매를 따먹는다");
	}
}
interface Flyable{
	void fly();
//	default void fly() {}
}

public class Exam1 {
	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat();
		if(a instanceof Flyable) {
			Flyable f = (Flyable)a;
			f.fly();
		}
		a = new Monkey();
		a.eat();
		if(a instanceof Flyable) {
			Flyable f = (Flyable)a;
			f.fly();
		}
	}
}
