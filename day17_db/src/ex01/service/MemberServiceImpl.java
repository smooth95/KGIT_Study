package ex01.service;

import java.util.ArrayList;
import java.util.Scanner;

import ex01.dao.MemberDAO;
import ex01.dto.MemberDTO;

public class MemberServiceImpl implements MemberService {
	private MemberDAO dao;

	public MemberServiceImpl() {
		dao = new MemberDAO();
	}

	@Override
	public void memberView() {
		System.out.println("회원 보기 기능");
		ArrayList<MemberDTO> members = dao.getMembers();
		if (members.size() == 0) {
			System.out.println("등록된 정보가 없습니다.");
		} else {
			for (int i = 0; i < members.size(); i++) {
				MemberDTO m = members.get(i);
				System.out.println("id : " + m.getId());
				System.out.println("Pwd : " + m.getPwd());
				System.out.println("Name : " + m.getName());
				System.out.println("Age : " + m.getAge());
				System.out.println("---------------");
			}
		}
	}

	@Override
	public void modify() {
		System.out.println("수정 기능");
		Scanner sc = new Scanner(System.in);
		String id, pwd, name;
		int age;
		while (true) {
			System.out.println("수정할 ID 입력");
			id = sc.next();
			MemberDTO m = dao.memberChk(id);
			if (m != null) {
				break;
			}
			System.out.println("존재하지 않는 ID입니다.");
		}
		System.out.println("수정할 pwd");
		pwd = sc.next();
		System.out.println("수정할 name");
		name = sc.next();
		System.out.println("수정할 age");
		age = sc.nextInt();
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		;
		dto.setPwd(pwd);
		dto.setName(name);
		dto.setAge(age);
		int result = dao.modify(dto);
		if (result == 1) {
			System.out.println("수정되었습니다.");
		} else {
			System.out.println("수정 실패!!!");
		}
	}

	public void memberJoin() {
		Scanner sc = new Scanner(System.in);
		String id, pwd, name;
		MemberDTO dto = new MemberDTO();
		int age;
		while (true) {
			System.out.println("가입할 id 입력");
			id = sc.next();
			dto = dao.memberChk(id);
			if (dto == null) {
				break;
			}
			System.out.println("존재하는 아이디입니다.");
		}

		System.out.println("pw 입력");
		pwd = sc.next();
		System.out.println("name 입력");
		name = sc.next();
		System.out.println("age 입력");
		age = sc.nextInt();
		int result = dao.memberJoin(id, pwd, name, age);
		if (result == 1) {
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}

	}

	public void memberDelete() {
		System.out.println("삭제할 id 입력");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		MemberDTO dto = dao.memberChk(id);
		int result = 0;
		if (dto != null) {
			result = dao.memberDelete(id);
			if (result == 1) {
				System.out.println("삭제 완료");
			} else {
				System.out.println("삭제 실패");
			}
		} else {
			System.out.println("존재하지 않는사용자");
		}
	}

}
















