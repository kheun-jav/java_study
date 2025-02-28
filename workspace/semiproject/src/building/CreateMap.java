package building;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

class Event implements Serializable{
	String eventname;
	String content;
	String feventdate;
	String leventdate;
	
	public Event(String name, String content, String feventdate, String leventdate) {
		this.eventname = name;
		this.content = content;
		this.feventdate = feventdate;
		this.leventdate = leventdate;
	}
	public String toString() {
		return "[제목]: " + eventname + "\n" + "[기간]: " + feventdate + "~" 
	            + leventdate + "\n[상세]: " + content + "\n";		
	}
}
public class CreateMap {
	static List<Event> list = new ArrayList<>();
	static Map<String, List<Event>> manager = new HashMap<>();
	static String userid;
	static int event_cnt = 0;
	static int e_cnt[] = new int[31];
public static void main(String[] args) throws IOException, ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.print("사용자 아이디를 입력하세요 >>");
		userid = scan.next();
		manager.put(userid, null);
		int menu;
		while(true) {
			try {
				System.out.println("메뉴번호를 선택하시오(1:종료, 2:달력조회, 3:이벤트추가, 4:이벤트조회, 5:이벤트변경, 6:이벤트삭제");
				menu = scan.nextInt();
				if(menu == 1) {
					System.out.println("달력조회 프로그램을 종료합니다.");
					break;
				}
				switch(menu) {
				case 2 : findcal(); break;
				case 3 : addEvent(); break;
				case 4 : findEvent(); break;
				case 5 : changeEvent(); break;
				case 6 : deleteEvent(); break;
				default : System.out.println("잘못된 입력입니다. 1,2,3,4,5,6 숫자만 가능합니다.");
				}
			} catch (InputMismatchException e) {
				System.out.println("1,2,3,4,5,6 숫자만 가능합니다.");
				scan.next();
			}
		}
		
	}

	private static void deleteEvent() {
		
	}

	private static void changeEvent() {
		
	}

	private static void findEvent() {
		Scanner scan = new Scanner(System.in);
		System.out.print("조회할 일자 입력 (yyyy/MM/dd): ");
        String searchDate = scan.nextLine();

        List<Event> userDate = manager.get(userid);
        List<Event> result = new ArrayList<>(); // 일치하는 일자의 evnet 리스트
       
        for(Event event : userDate) {
        	// startsWith() : 시작문자 , 2025/02/26 10:00:00
        	if(event.feventdate.startsWith(searchDate)) {
        		result.add(event);
        	}
        }  
        if(result.isEmpty()) {
        	System.out.println("등록된 이벤트가 없습니다.");
        } else {
        	result.sort(Comparator.comparing(e -> e.feventdate));
        	for(Event event : result ) {
        		System.out.println(event);
        	}
		}
    }

	private static void addEvent() { //이벤트 추가
		Scanner scan  = new Scanner(System.in);
		System.out.print("이벤트 제목을 입력하세요>>");
		String eventname = scan.nextLine();
		System.out.print("이벤트 시작 시각을 입력하시오 (yyyy/MM/dd hh:mm:ss)>>");
		String start = scan.nextLine();
		System.out.print("이벤트 종료 시각을 입력하시오 (yyyy/MM/dd hh:mm:ss)>>");
		String end = scan.nextLine();
		System.out.print("이벤트 세부사항을 입력하시오>>");
		String details = scan.next();
		Event event =new Event(eventname, details, start, end);
		System.out.println("이벤트가 저장되었습니다.");
		list.add(event);
		manager.put(userid,list);
		System.out.println(manager.get(userid).get(list.size() - 1));
		String sday = manager.get(userid).get(list.size()-1).feventdate;
		
		e_cnt[event_cnt]++;
		event_cnt++; // 이벤트 발생 횟수를 표기하기 위한 숫자
		
	}

	private static void findcal() throws IOException, ParseException {
		int y=0 , m=0 , d =0;
		Scanner scan = new Scanner(System.in);
		System.out.print("년도를 입력하세요 =>");
		int year = scan.nextInt();
		System.out.print("월을 입력하세요 =>");
		int mon = scan.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(year,mon-1,1);
		int firstWeek = cal.get(Calendar.DAY_OF_WEEK);
		int lastday = cal.getActualMaximum(Calendar.DATE);
		if(event_cnt>0) {
			String sday = manager.get(userid).get(event_cnt-1).feventdate;
			Date startday = null;
			SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			startday = sf.parse(sday);
			cal.setTime(startday); // 이벤트 날짜를 Cal 형으로 변환
			y = cal.get(Calendar.YEAR);
			m = cal.get(Calendar.MONTH);
			d = cal.get(Calendar.DATE);
		}
		FileOutputStream fos = new FileOutputStream(userid+".txt"); //userid.txt 스트림 오픈
		PrintStream ps = new PrintStream(fos); // 프린트 스트림 오픈
	    System.out.printf("\n\t\t%4d년 %2d월\n", year, mon);
	    System.out.printf("%-6s %-6s %-6s %-6s %-6s %-6s %-6s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
	    // 날짜 출력
	    for (int i = 1, day = 1; day <= lastday; i++) {
	        if (i < firstWeek) {
	            System.out.printf("%-7s", "");
	        } else {
	            if (y == year && m == mon-1 && d == day) {
	                System.out.printf("%d(%d)%-2s", day++,e_cnt,""); // 일정 있는 날짜
	            } else {
	                System.out.printf("%-7d", day++); // 일반 날짜
	            }
	        }
	        if (i % 7 == 0) System.out.println(); // 한 줄(일주일) 출력 후 줄바꿈
	    }
	    System.out.println();
	}
	
}
