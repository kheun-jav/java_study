package ex1_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
 * List 정렬하기
 *  - Collections.sort(List<Comparable>)
 *  - List 객체를 정렬하기 위해서는 요소 객체가 Comparable 인터페이스의 구현 객체 여야 함.
 *  
 * 정렬관련 인터페이스  
 * Comparable<T> 인터페이스는 Functional Interface임.
 *            클래스로 구현해서, 클래스의 기본 정렬방식 설정시 사용
 *   추상메서드 : int compareTo(T t)   
 *        결과 : 음수 : 현재객체 앞.
 *              양수 : 현재객체 뒤.
 * Comparator<T> 인터페이스는 Functional Interface임
 *            정렬 실행시 동적으로 정렬 방식을 설정할때 사용
 *   추상메서드 : int compare(T t1,T t2)   
 *        결과 : 음수 : 현재객체 t1 앞.
 *              양수 : 현재객체 t1 뒤.
 */
class Data implements Comparable<Data>{
	int value;
	Data (int value) {
		this.value = value;
	}
	public String toString() {
		return value+"";
	}
	@Override
	public int compareTo(Data d) {
		return value - d.value;
	}
}
class Data2 {
	int value;
	Data2(int value) {
		this.value = value;
	}
	public String toString() {
		return value+"";
	}
}
public class ListEx3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");list.add("c");list.add("d");
		list.add("b");list.add("f");
		System.out.println(list);
		Collections.sort(list); //정렬. 오름차순 정렬
		System.out.println(list);
		Collections.sort(list,Comparator.reverseOrder()); //내림차순 정렬
		System.out.println(list);
		List<Data> list2 = new ArrayList<>();
		list2.add(new Data(1));list2.add(new Data(3));list2.add(new Data(5));
		list2.add(new Data(2));list2.add(new Data(4));
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
		Collections.sort(list2,Comparator.reverseOrder());
		System.out.println(list2);
		List<Data2> list3 = new ArrayList<>();
		list3.add(new Data2(1));list3.add(new Data2(3));list3.add(new Data2(5));
		list3.add(new Data2(2));list3.add(new Data2(4));
		System.out.println(list3);
		Collections.sort(list3,new Comparator<Data2>() {
			@Override
			public int compare(Data2 o1, Data2 o2) {
				return o1.value - o2.value;
			}
		});
		//람다방식
		Collections.sort(list3,(d1,d2)->d1.value - d2.value);
		System.out.println(list3);
		
		Comparator<Data2> f = (d1,d2)->d1.value - d2.value;
		Collections.sort(list3,f);
		System.out.println(list3);
	}
}
