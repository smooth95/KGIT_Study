package test.service;

import java.util.Scanner;

import test.dao.CustomerDAO;
import test.dto.CustomerDTO;

public class CustomerServiceImpl implements CustomerService{
	
	CustomerDAO dao = new CustomerDAO();
	CustomerDTO dto = new CustomerDTO();
	
	public void CustomerLogin() {
		Scanner sc = new Scanner(System.in);
		CustomerDTO dto = new CustomerDTO();
		String id, pwd;
		boolean bool;
		System.out.print("ID 입력 >");
		dto.setId(sc.next());
		int result = dao.CustomerCheckID(dto);
		if (result == 1) {
			System.out.print("PW 입력 > ");
			dto.setPwd(sc.next());
			bool = dao.CustomerLogin(dto);
			if (bool) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}			
		} else {
			System.out.println("회원가입부터 진행해주세요");
		}
	}
	
	public void CustomerJoin() {
		Scanner sc = new Scanner(System.in);
		CustomerDTO dto = new CustomerDTO();
		System.out.print("가입할 ID 입력 > ");
		dto.setId(sc.next());
		int result = dao.CustomerCheckID(dto);
		if (result == 0) {
			System.out.print("가입할 Password 입력 >");
			dto.setPwd(sc.next());
			System.out.print("가입할 Name 입력 >");
			dto.setName(sc.next());
			result = dao.CustomerJoin(dto);
			System.out.println("회원 가입 완료");
			
		} else {
			System.out.println("이미 사용중인 ID 입니다.");
		}
	}
	
	public void CustomerInfo() {
		Scanner sc = new Scanner(System.in);
		CustomerDTO dto = new CustomerDTO();
		boolean bool = false;
		System.out.print("조회할 ID 입력 >");
		dto.setId(sc.next());
		int result = dao.CustomerCheckID(dto);
		if (result == 1) {
			System.out.print("확인을 위해 비밀번호 입력 > ");
			dto.setPwd(sc.next());
			bool = dao.CustomerCheckPW(dto);
			if (bool) {
				System.out.println("확인되었습니다." + dto.getId() + "님의 정보를 출력합니다.");
				dao.CustomerInfo(dto);
				System.out.println("ID : " + dto.getId());
				System.out.println("Pwd : " + dto.getPwd());
				System.out.println("Name : " + dto.getName());
				System.out.println("UserMoney : " + dto.getUserMoney() + "원");
				System.out.println("Grade : " + dto.getGrade() + " Grade");
				System.out.println("JoinTIme : " + dto.getJointime());
				System.out.println("----------------------");
				
			} else {
				System.out.println("비밀번호가 다릅니다.");
			}
			
		} else {
			System.out.println("아이디를 확인바랍니다.");
		}
	}
	
	public void CustomerDelete() {
		
	}
	
	public void CustomerLogout() {
		
	}
	
}
