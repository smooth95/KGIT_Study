package quiz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class QuizDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	public QuizDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "c##java";
			String pwd = "1234";
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("접속 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
