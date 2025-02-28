package ex5_stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack : LIFO(Last in First Out)
 *  Stack 클래스 : Vector 클래스의 하위 클래스. List 객체
 *  주요 메서드
 *    push(Object o) : 객체를 Stack에 추가
 *    Object pop()   : 객체를 Statck에서 꺼냄. 객체 제거
 *    Object peek()  : Statck에서 객체를 조회
 *    
 * Queue : FIFO(First In First Out)
 *         인터페이스. LinkedList 가 구현 클래스임. List 객체
 * 주요 메서드
 *   offer(Object o) : 객체를 Queue에 추가
 *   Object poll()   : 객체를 Queue에서 꺼냄. 객체 제거
 *   Object peek()   : Queue에서 객체를 조회           
 */
public class StackQueueEx1 {
	public static void main(String[] args) {
		String[] cars = {"소나타","그랜저","SM5","K9"};
		Stack<String> stack = new Stack<>();
		Queue<String>queue = new LinkedList<>();
		for(String s : cars) {
			stack.push(s);
			queue.offer(s);
		}
		System.out.println("스택에 저장된 객체의 갯수:"+stack.size());
		System.out.println("큐에 저장된 객체의 갯수:"+queue.size());
		System.out.println(stack);
		System.out.println(queue);
		System.out.println(stack.peek());
		System.out.println(queue.peek());
		System.out.println("스택에 저장된 객체의 갯수:"+stack.size());
		System.out.println("큐에 저장된 객체의 갯수:"+queue.size());
		System.out.println(stack.pop());
		System.out.println(queue.poll());
		System.out.println("스택에 저장된 객체의 갯수:"+stack.size());
		System.out.println("큐에 저장된 객체의 갯수:"+queue.size());
		System.out.println(stack);
		System.out.println(queue);
	}
}
