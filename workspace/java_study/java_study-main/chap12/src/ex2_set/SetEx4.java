package ex2_set;

import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet에 객체 추가하기
 * Comparable 인터페이스를 구현하지 않는 객체를 추가할시 ClassCastException 예외 발생함
 * => Comparator 인터페이스의 객체를 TreeSet 객체 생성시 전달 필요
 */
class Data {
	int value;
	Data(int value) {
		this.value = value;
	}
}
public class SetEx4 {
	public static void main(String[] args) {
//		Set<Data> set = new TreeSet<>(); // add시 ClassCastException 예외 발생
		Set<Data> set = new TreeSet<>((d1,d2)->d1.value - d2.value);
		set.add(new Data(5)); 
		set.add(new Data(4));
		set.add(new Data(3));
		set.add(new Data(2));
		set.add(new Data(1));
		System.out.println(set);
	}
}
