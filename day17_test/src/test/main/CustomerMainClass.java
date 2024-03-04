package test.main;

import java.util.Scanner;

import test.service.CustomerService;
import test.service.CustomerServiceImpl;

public interface CustomerMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerService cs = new CustomerServiceImpl();
		
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 회원 정보 확인");
			System.out.println("4. 회원 탈퇴");
			System.out.println("5. 로그아웃");
			System.out.print(">>>");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("로그인 기능 실행");
				cs.CustomerLogin();
				break;
			case 2:
				System.out.println("회원가입 기능 실행");
				cs.CustomerJoin();
				break;
			case 3:
				System.out.println("회원 정보 확인 기능 실행");
				cs.CustomerInfo();
				break;
			case 4:
				System.out.println("회원 탈퇴 기능 실행");
				cs.CustomerDelete();
				break;
			case 5:
				System.out.println("로그아웃 기능 실행");
				cs.CustomerLogout();
				break;
			
			}
		}
	}	
}
