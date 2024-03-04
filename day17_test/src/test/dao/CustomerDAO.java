package test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.dto.CustomerDTO;


public class CustomerDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	public CustomerDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "c##java";
			String pwd = "1234";
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println(con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int CustomerCheckID(CustomerDTO dto) {
		String sql = "select * from customer where id=?";
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean CustomerCheckPW(CustomerDTO dto) {
		String sql = "select * from customer where id=?";
		int result = 0;
		boolean bool = false;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			rs = ps.executeQuery();
			rs.next();
			bool = rs.getString("pwd").equals(dto.getPwd());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bool;
	}
	
	public boolean CustomerLogin(CustomerDTO dto) {
		String sql = "select * from customer where id=?";
		boolean bool = false;
		try {
			ps = con.prepareStatement(sql);
			System.out.println(dto.getId());
			ps.setString(1, dto.getId());
			rs = ps.executeQuery();
			rs.next();
			bool = rs.getString("pwd").equals(dto.getPwd());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bool;
	}
	
	public int CustomerJoin (CustomerDTO dto) {
		String sql = "insert into customer values (?,?,?,0,'d',sysdate)";
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPwd());
			ps.setString(3, dto.getName());
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public CustomerDTO CustomerInfo(CustomerDTO dto) {
		String sql = "select * from customer where id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			rs = ps.executeQuery();
			rs.next();
			dto.setPwd(rs.getString("pwd"));
			dto.setName(rs.getString("name"));
			dto.setUserMoney(rs.getInt("usermoney"));
			dto.setGrade(rs.getString("grade"));
			dto.setJointime(rs.getDate("jointime"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dto;
	}
}






















