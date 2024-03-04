package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

class DB_con {
	private Connection con;
	// 연결할때 쓰는 변수
	
	private PreparedStatement ps;
	// 데이터베이스에 명령어 전달하는 변수
	
	private ResultSet rs;
	// 받아온 결과를 저장하는 변수
	
	public DB_con() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 이 명령어를 추가해야 자바에서 오라클 관련 명령어를 사용할 수 있다.
			System.out.println("오라클 기능 사용가능(드라이브 로드)");
			// db주소 및 로그인시 사용할 id, pw를 con에 적용해야한다.
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "c##java";
			String pwd = "1234";
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("db 연결 성공 : " + con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList select() {
		String sql = "select * from member_test";
		ArrayList<MemberDTO> arr = new ArrayList<>();
		try {
			ps = con.prepareStatement(sql);
			// 연결된 객채를 토대로 명령어를 전달할 수 있다.
			rs = ps.executeQuery();
			//명령어를 실행하고 값을 저장한다. (쿼리 실행)
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setId( rs.getString("id"));
				dto.setPwd( rs.getString("pwd"));
				dto.setName( rs.getString("name"));
				dto.setAge (rs.getInt("age"));
				
				arr.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arr;
	}
	public MemberDTO selectOne( String userId ) {
		String sql = "select * from member_test where id = '"+ userId+"'";
		ArrayList<MemberDTO> arr = new ArrayList<>();
		MemberDTO dto = null;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next() ) {
				dto = new MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setPwd(rs.getString("pwd"));
				dto.setAge(rs.getInt("age"));
			}
			
			arr.add(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	public int delete(String delId) {
		String sql = "delete from member_test where id = ?";
		int result = 0;
		// ? 는 나중에 값을 채워 넣는다는 의미 
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, delId);
			// 처음 숫자는 자리수 sql에 ?가 여러개 있을경우... 처음값은 1
			result = ps.executeUpdate();
			//int로 값을 받음
			//0개 처리되었다... 1개 처리되었다 처럼 처리가 안되면 0 처리가되면 1이상이 뜬다.
			//쿼리는 select할때만 사용하고 그외에는 update를 사용한다.(값을 받기 쉬움)
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int insert(MemberDTO dto) {
		String sql = "insert into member_test(id, pwd, name, age) values(?,?,?,?)";
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPwd());
			ps.setString(3, dto.getName());
			ps.setInt(4, dto.getAge());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}





public class MainClass {
	public static void main(String[] args) {
		DB_con db = new DB_con();
		
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1. 모든 목록 보기");
			System.out.println("2. 특정 사용자 보기");
			System.out.println("3. 데이터 추가");
			System.out.println("4. 데이터 삭제");
			System.out.print(">>>>");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("모든 사용자 정보 출력");
				ArrayList<MemberDTO> arr = db.select();
				System.out.println("--main--");
				for (MemberDTO dto : arr) {
					System.out.println("id : " + dto.getId());
					System.out.println("pwd : " + dto.getPwd());
					System.out.println("name : " + dto.getName());
					System.out.println("age : " + dto.getAge());
					System.out.println("------------");
				}
				break;
			case 2:
				System.out.println("검색 ID 입력");
				String userId = sc.next();
				MemberDTO dto = db.selectOne( userId );
				System.out.println("dto : " + dto);
				if (dto == null) {
					System.out.println("존재하지 않는 사용자");
				} else {
					System.out.println("id : " + dto.getId());
					System.out.println("pwd : " + dto.getPwd());
					System.out.println("name : " + dto.getName());
					System.out.println("age : " + dto.getAge());
				}
				
				break;
			case 3:
				MemberDTO d = new MemberDTO();
				while(true) {
					System.out.println("가입할 id 입력");
					d.setId(sc.next());
					MemberDTO dd = db.selectOne(d.getId());
					if (dd == null) {
						break;
					} 
					System.out.println("존재하는 id.. 다시 입력");
				}
				System.out.println("가입할 pwd 입력");
				d.setPwd(sc.next());
				System.out.println("가입할 name 입력");
				d.setName(sc.next());
				System.out.println("가입할 age 입력");
				d.setAge(sc.nextInt());
				int res = db.insert(d);
				if (res == 1) {
					System.out.println("ID 추가 성공");
				} else {
					System.out.println("이미 존재하는 ID");
				}
				
				
				break;
			case 4:
				System.out.println("삭제 ID 입력");
				String delId = sc.next();
				int re = db.delete(delId);
				if (re == 1) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				break;
			default:
				break;
			}
			
		}
		
		
	}
}
