package test;
/*
구동 클래스 DaoTest 클래스의 main()메서드 에서 dbWork()메서드를 호출할때 
OracleDao와 MySqlDao객체를 매개값으로 주고 호출합니다.

dbWork()메서드는 두 객체를 모두 매개값으로 받기 위해 DataAccessObject타입의 매개변수를 가지고 있습니다.
다음 결과가 나오도록 DataAccessObject 인터페이스와 OracleDao클래스, MySqlDao 클래스를 구현하세요

[결과]
Oracle DB에서 검색
Oracle DB에 삽입
Oracle DB에 수정
Oracle DB에서 삭제
Mysql DB에서 검색
Mysql DB에 삽입
Mysql DB에 수정
Mysql DB에서 삭제

DB 처리시 : CRUD : Create, Read, Update, Delete
*/
interface DataAccessObject {
	void select(); //R : 데이터 조회
	void insert(); //C : 데이터 추가
	void update(); //U : 데이터 수정
	void delete(); //D : 데이터 삭제
}
class OracleDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}
	@Override
	public void insert() {
		System.out.println("Oracle DB에서 삽입");
	}
	@Override
	public void update() {
		System.out.println("Oracle DB에서 수정");
	}
	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}
}
class MySqlDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");
	}
	@Override
	public void insert() {
		System.out.println("MySql DB에서 삽입");
	}
	@Override
	public void update() {
		System.out.println("MySql DB에서 수정");
	}
	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
	}
}
public class Test4_A {
	private static void dbWork(DataAccessObject dao) {
		 dao.select();
		 dao.insert();
		 dao.update();
		 dao.delete();
	}
	public static void main(String[] args) {
		 dbWork(new OracleDao());
		 dbWork(new MySqlDao());
	}
}
