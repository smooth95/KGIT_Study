package inheritance.login;

import java.util.Scanner;

public class LoginService01 extends TimeClass{
	private LoginDTO01 ld = new LoginDTO01();
	private Scanner sc = new Scanner(System.in);
	public void display() {
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 탈퇴");
			System.out.println(">>>>");
			int num = sc.nextInt();
			if (num == 1) {
				login();
			} else if (num == 2) {
				join();
			} else if (num == 3) {
				delete();
			} else {
				System.out.println("잘못된 번호 입력...");
			}
		}
	}
	
	public void login() {
		if (ld.getId() == null) {
			System.out.println("회원가입 먼저 하세요!!!");
		} else {
			System.out.print("ID 입력 : ");
			String id = sc.next();
			System.out.print("PW 입력 : ");
			String pw = sc.next();
			if (id.equals(ld.getId()) && pw.equals(ld.getPwd())) {
				System.out.println("인증 통과!!!");
				System.out.println("로그인 시간은 " + super.StartTime() + "입니다.");
			} else if (id.equals(ld.getId()) && !pw.equals(ld.getPwd())) {
				System.out.println("비밀번호가 틀렸습니다.");
			} else if (!id.equals(ld.getId()) && pw.equals(ld.getPwd())){
				System.out.println("존재하지 않는 ID 입니다.");
			} 
			
		}
	}
	
	public void join() {
		if (ld.getId() == null) {
			System.out.print("ID 입력 : ");
			ld.setId(sc.next());
			System.out.print("PW 입력 : ");
			ld.setPwd(sc.next());
		} else if (ld.getId() != null) {
			System.out.println("사용자 존재합니다. 탈퇴 후 진행하세요!!");
		}
		
	}
	
	public void delete() {
		if (ld.getId() == null) {
			System.out.println("회원가입 먼저 진행하세요");
		} else if (ld.getId() != null) {
			System.out.println("회원정보를 삭제합니다.");
			ld.setId(null);
			ld.setPwd(null);
			System.out.println("탈퇴 시간은 " + super.EndTime() + "입니다.");
			System.out.println("로그인 시간은 " + super.UseTime() + "입니다.");
		}
	}
}
