package ex3_function;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class Exam1 {
	private static Student list[] = {
			new Student("홍길동", 90, 80, "경영"),
			new Student("김삿갓", 95, 70, "컴공"),
			new Student("이몽룡", 85, 75, "통계")
	};
	public static void main(String[] args) {
		System.out.print("학생들의 영어 점수 합계:");
		printTot(s->s.getEng());
		System.out.print("학생들의 수학 점수 합계:");
		printTot(s->s.getMath());
		System.out.println("학생들의 영어 점수 합계:"+getTot(s -> s.getEng()));
		System.out.println("학생들의 수학 점수 합계:"+getTot(s -> s.getMath()));
		System.out.println("학생들의 영어 점수 합계:"+getAvg(s -> s.getEng()));
		System.out.println("학생들의 수학 점수 합계:"+getAvg(s -> s.getMath()));
	}
	private static Double getAvg(ToDoubleFunction<Student> f) {
		double sum = 0;
		for(Student s : list) {
			sum += f.applyAsDouble(s);
		}
		return  sum / list.length;
	}
	private static int getTot(ToIntFunction<Student> f) {
		int sum = 0;
		for(Student s : list) {
			sum += f.applyAsInt(s);
		}
		return sum;
	}
	public static void printTot(ToIntFunction<Student> f) {
		int sum = 0;
		for(Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}
	
}
