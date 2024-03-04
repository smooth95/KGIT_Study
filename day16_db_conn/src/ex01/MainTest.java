package ex01;

import java.sql.Connection;
import java.sql.DriverManager;

class Db_ConTest {
	private Connection con;
	public Db_ConTest() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 기능 사용 가능 (드라이버 연동)");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "c##java";
			String pwd = "1234";
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("db연결완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class MainTest {
	public static void main(String[] args) {
		Db_ConTest db = new Db_ConTest();
		
	}
}
