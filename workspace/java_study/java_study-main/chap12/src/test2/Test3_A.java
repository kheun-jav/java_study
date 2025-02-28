package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * MapEx2의 예제를 이용하기
 *
 * 조회를 입력했을 경우
 * 제목,저자,가격순으로 조회되도록 프로그램 수정하기
 *  
 * 검색을 입력했을 경우 
 * 제목,저장,가격으로 검색하도록 프로그램을 수정하기
 * 
 * [결과]
1.추가 2.삭제 3.조회 4.검색 0.종료
3
정렬 방식을 입력하세요 (1.제목 2.저자 3.가격)
1
(춘향전,미상,5000)
(홍길동전,허균,10000)

1.추가 2.삭제 3.조회 4.검색 0.종료
4
도서를 검색합니다.
검색 기준을 입력하세요 (1.제목 2.저자 3.가격)
1 
제목을 입력하세요
홍길동전
조회 정보 : (홍길동전,허균,10000) 입니다.
 */
class Book {
	String title;
	String author;
	int price;
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "(" + title + "," + author + "," + price + ")";
	}
}

public class Test3_A {
	static Map<String,Book> books = new HashMap<>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int menu;
			try {
			  System.out.println("================================");	
			  System.out.println("1.추가 2.삭제 3.조회 4.검색 0.종료");
			  System.out.println("================================");	
			  menu = scan.nextInt();
			  if(menu == 0) {
				  System.out.println("도서관리 프로그램을 종료합니다.");
				  break;
			  }
			  switch(menu) {
			  case 1 : addBook(); break;
			  case 2 : deleteBook(); break;
			  case 3 : printBook(); break;
			  case 4 : findBook(); break;
			  default : System.out.println("잘못된 입력입니다. 0,1,2,3,4 숫자만 가능합니다.");
			  }
			} catch (InputMismatchException e) {
				System.out.println("0,1,2,3,4 숫자만 가능합니다.");
				scan.next();
			}
		}
	}
	private static void findBook() {
		Scanner scan = new Scanner(System.in);
		System.out.println("검색 기준을 입력하세요 (1.제목 2.저자 3.가격)");
		int menu = scan.nextInt();
		boolean check = true;
		String title=null,author=null;
		int price=0;
		switch(menu) {
		case 1 : System.out.println("제목을 입력하세요"); title = scan.next(); break;
		case 2 : System.out.println("저자을 입력하세요"); author = scan.next(); break;
		case 3 : System.out.println("가격을 입력하세요"); price = scan.nextInt(); break;
		default : System.out.println("잘못된 입력입니다.");
                  return;
		}
		List<Book> list = new ArrayList<>(books.values());
		List<Book> findlist = new ArrayList<>();
		for(Book book : list) {
			switch(menu) {
			case 1 : if (book.title.equals(title)) findlist.add(book);break;
			case 2 : if (book.author.equals(author)) findlist.add(book);break;
			case 3 : if (book.price == price) findlist.add(book);break;
			}
		}
		if(findlist.isEmpty())  //List 객체에 요소가 없는 경우  
			System.out.println("검색하신 도서는 없습니다.");
		else {
			System.out.println("조회 도서정보:");
			for(Book b : findlist)
			   System.out.println(b);
		}
	}
	private static void printBook() {
		System.out.println("도서 목록을 조회합니다.");
		System.out.println("정렬방식을 입력하세요 (1.제목 2.저자 3.가격)");
		//books.values()
		List<Book> list = new ArrayList<>(books.values());
		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt(); //1,2,3 입력가능
		boolean check = true;
		switch (menu) {
		case 1 :Collections.sort(list,(b1,b2)->b1.title.compareTo(b2.title));break; 
		case 2 :Collections.sort(list,(b1,b2)->b1.author.compareTo(b2.author));break; 
		case 3 :Collections.sort(list,(b1,b2)->b1.price - b2.price);break;
		default : System.out.println("잘못된 입력입니다.");
		          check=false;
		}
		if(check) {
			for(Book book : list) {
				System.out.println(book);
			}
		}
	}
	
	/*
	 * 제목을 입력받아서 books 객체에 해당하는 도서를 제거하기
	 */
	private static void deleteBook() {
		System.out.println("도서를 삭제합니다.");
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 도서의 이름을 입력하세요");
		String title = scan.next();
		Book book = books.remove(title);
		if(book != null) {
			System.out.println(book + " 도서가 삭제되었습니다.");
		} else {
			System.out.println(title + " 도서가 없습니다.");
		}
	}
	/*
	 * 제목,저자,가격을 입력받아서 books에 저장하기
	 */
	private static void addBook() {
		System.out.println("도서 추가합니다.");
		Scanner scan = new Scanner(System.in);
		System.out.println("도서의 제목 저자 가격을 입력하세요 ");
		String title = scan.next();
		String author = scan.next();
		int price = scan.nextInt();
		Book book = new Book(title,author,price);
		books.put(title,book);
		System.out.println(book + "도서가 추가되었습니다.");
//		System.out.println(books);
	}
}
