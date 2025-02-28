package test;
/*
 * 다음의 결과가 나오도록 Student 클래스 구현하기
 * [결과]
      학번:1
      이름:홍길동
      국어:0
      영어:0
      수학:0
      총점:0
      평균:0.0
   =====================
      학번:2
      이름:김삿갓
      국어:80
      영어:90
      수학:70
      총점:240
      평균:80.0
   =====================
 */
class Student {
	int studno,kor,eng,math;
	String name;
	//new Student("홍길동", 1)
	Student(String name, int studno) {
//		this.name = name;
//		this.studno = studno;
		this(name,studno,0,0,0);
	}
	//new Student("김삿갓", 2, 80, 90, 70)
	Student(String n, int s,int k, int e, int m) {
		this.name = n; //이름
		studno = s; //학번
		kor = k;    //국어점수
		eng = e;    //영어점수
		math = m;   //수학점수
	}
	int getTotal() {
		return kor + eng+math;
	}
	float getAverage() {
		return getTotal()/3f;
	}
	void info() {
		System.out.println("학번:"+studno);
		System.out.println("이름:"+name);
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+getTotal());
		System.out.println("평균:"+getAverage());
		System.out.println("=====================");
	}
}

public class Test1_A {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1);
		s.info();
		Student s2 = new Student("김삿갓", 2, 80, 90, 70);
		s2.info();
	}
}
