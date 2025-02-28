package ex1_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
 * Name 클래스 구현하기
 * 기본 정렬방식은 한글이름으로 설정하기
 * 멤버변수 : kor, eng
 * 생성자 : 구동클래스에 맞도록 설정
 * 멤버메서드 : toString() 메서드를 구현하기
 * [결과]
 * [김:kim, 이:lee,...]
 * [김:kim, 박:park,...]
 */
class Name implements Comparable<Name>{
	String kor,eng;
	public Name(String kor, String eng) {
		this.kor = kor;
		this.eng = eng;
	}
	@Override
	public String toString() {
		return kor + ":" + eng;
	}
	@Override
	public int compareTo(Name n) {
		return n.kor.compareTo(kor);
	}
}

public class Exam2 {
	public static void main(String[] args) {
		List<Name> list = new ArrayList<>();
		list.add(new Name("김","kim"));
		list.add(new Name("이","lee"));
		list.add(new Name("박","park"));
		list.add(new Name("안","an"));
		list.add(new Name("최","choi"));
		System.out.println(list);
		Collections.sort(list); //한글 이름 순으로 정렬
		System.out.println(list);
		System.out.println("영문이름으로 정렬하기");
		Collections.sort(list,(n1,n2)->n1.eng.compareTo(n2.eng) ); //영문 이름 순으로 정렬
		System.out.println(list);
		
		System.out.println("한글이름으로 내림차순 정렬하기");
		Collections.sort(list,Comparator.reverseOrder()); //한글 이름 내림차순으로 정렬
		System.out.println(list);
		Collections.sort(list,(n1,n2)->n2.kor.compareTo(n1.kor) ); //한글 이름 내림차순으로 정렬
		System.out.println(list);
		
		System.out.println("영문이름으로 내림차순 정렬하기");
		Collections.sort(list,(n1,n2)->n2.eng.compareTo(n1.eng) ); //영문 이름 내림차순으로 정렬
		System.out.println(list);
		
	}
}





