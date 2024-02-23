package collection.service;

import java.util.ArrayList;
import java.util.Scanner;

import collection.DAO.MemberDAO;
import collection.dto.MemberDTO;

public class MemberServiceImpl implements MemberService{
	MemberDAO dao;
	public MemberServiceImpl() {
		dao = new MemberDAO();
	}
	public void register() {
		System.out.println("회원 가입 기능입니다.");
		MemberDTO dto = new MemberDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		dto.setName(sc.next());
		System.out.println("주소 입력");
		dto.setAddr(sc.next());
		System.out.println("암호 입력");
		dto.setPw(sc.next());
		dao.register(dto);
		
	}
	public void delete() {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("삭제할 이름 입력");
		name = sc.next();
		MemberDTO m = dao.search(name);
		if (m == null) {
			System.out.println(name + " 사용자는 없습니다.");
		} else {
			dao.delete(m);
			System.out.println("삭제되었습니다.");
		}
	}

	public void memberViews() {
		System.out.println("멤버 목록 확인 기능입니다.");
		ArrayList<MemberDTO> arr = dao.getData();
		for (MemberDTO m : arr) {
			System.out.println("이름 : " + m.getName());
			System.out.println("주소 : " + m.getAddr());
			System.out.println("암호 : " + m.getPw());
			System.out.println("----------------");
		}
		
	}
	public void display() {
		Scanner sc =new Scanner(System.in);
		int num;
		while( true ) {
			System.out.println("1. 저장");
			System.out.println("2. 목록확인");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("5. 종료");
			System.out.println("6. 정보 변경");
			System.out.print(">>>");
			num = sc.nextInt();
			switch(num) {
			case 1 : 
				register();
				break;
			case 2 : 
				memberViews();
				break;
			case 3:
				search();
				break;
			case 4 :
				delete();
				break;
			case 5:
				return;
			case 6:
				change();
				break;
			}
		}
	}
	public void search() {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("검색할 이름 입력");
		name = sc.next();
		MemberDTO m = dao.search(name);
		if (m == null) {
			System.out.println(name + " 사용자는 없습니다.");
		} else {
			System.out.println("이름 : " + m.getName());
			System.out.println("이름 : " + m.getAddr());
			System.out.println("이름 : " + m.getPw());
		}
	}
	
	public void loginDisplay() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 로그인");
			System.out.println("2. 로그인 상태 확인");
			System.out.println("3. 로그아웃");
			System.out.println("4. 종료");
			System.out.println(">>>");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				login();
				break;
			case 2:
				loginCheck();
				break;
			case 3:
				logout();
				break;
			case 4:
				return;
				
			}
		}
	}
	
	public void login() {
		MemberDTO dto = new MemberDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = sc.next();
		dto = dao.search(name);
		if (dto == null) {
			System.out.println("존재하지 않는 이름입니다.");
		} else {
			System.out.println("암호 입력");
			String pw = sc.next();
			if (!pw.equals(dto.getPw())) {
				System.out.println("암호가 맞지 않습니다.");
			} else {
				System.out.println("정상 로그인 되었습니다.");
				dto.setLogses(1);
				System.out.println(dto.getLogses());
			}
		}
	}
	public void loginCheck() {
		MemberDTO dto = new MemberDTO();
		System.out.println(dto.getLogses());
		if (dto.getLogses() == 1) {
			System.out.println("로그인 상태입니다.");
		} else {
			System.out.println("로그인 상태가 아닙니다.");
		}
	}
	public void logout() {
		MemberDTO dto = new MemberDTO();
		if (dto.getLogses() == 1) {
			System.out.println("로그아웃합니다.");
			dto.setLogses(0);
		} else {
			System.out.println("로그인이 필요합니다.");
		}
	}
	public void change() {
		MemberDTO dto = new MemberDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("변경 원하는 이름 입력");
		String name = sc.next();
		dto = dao.search(name);
		if (dto == null) {
			System.out.println("회원 정보가 없습니다.");
		} else {
			System.out.println("변경할 이름 입력");
			String name1 = sc.next();
			dto.setName(name1);
			System.out.println("변경할 주소 입력");
			dto.setAddr(sc.next());
			System.out.println("변경할 암호 입력");
			dto.setPw(sc.next());
			dao.change(dto, name);
		}
	}
}
