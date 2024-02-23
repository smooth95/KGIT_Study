package member;

import java.util.Scanner;

public class Service {
	Scanner sc = new Scanner(System.in);
	DTO dto = new DTO();
	public void display() {
		System.out.println("학생 관리 시스템 실행");
		
		while(true) {
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 보기");
			System.out.println("3. 정보 수정");
			System.out.println("4. 회원 탈퇴");
			System.out.println(">>>");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				InputMember();
			} else if (menu == 2) {
				PrintMember();
			} else if (menu == 3) {
				ChangeMember();
			} else if (menu == 4) {
				DeleteMember();
			} else {
				System.out.println("1~4의 메뉴를 선택해주세요");
			} // else end
		} // while end
	} // member 메서드 end
	
	// InputMember start
	public void InputMember() {
		if (dto.getName() == null) {
			System.out.print("이름 입력 : ");
			dto.setName(sc.next());
			System.out.print("국어 점수 : ");
			dto.setKor(sc.nextInt());
			System.out.print("영어 점수 : ");
			dto.setEng(sc.nextInt());
			System.out.print("수학 점수 : ");
			dto.setMat(sc.nextInt());
			SumMember();
			GradeMember();
		} else {
			System.out.println("이미 학생 정보가 있습니다.");
		}
	} // InputMember end
	
	// PrintMember start
	public void PrintMember() {
		if (dto.getName() == null) {
			System.out.println("학생 정보를 등록해주세요");
		} else {
			System.out.println("학생 정보를 출력합니다.");
			System.out.println("이름 : " + dto.getName());
			System.out.println("국어 : " + dto.getKor());
			System.out.println("영어 : " + dto.getEng());
			System.out.println("수학 : " + dto.getMat());
			System.out.println("합계 : " + dto.getSum());
			System.out.println("등급 : " + dto.getGrade());
		}
	} // PrintMember end
	
	// ChangeMember start
	public void ChangeMember() {
		System.out.println("학생 정보를 수정합니다.");
		if (dto.getName() != null) {
			System.out.println("1. 이름 수정");
			System.out.println("2. 국어점수 수정");
			System.out.println("3. 영어점수 수정");
			System.out.println("4. 수학점수 수정");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("학생 이름 : ");
				dto.setName(sc.next());
			} else if (menu == 2) {
				System.out.println("국어 점수 : ");
				dto.setKor(sc.nextInt());
			} else if (menu == 3) {
				System.out.println("영어 점수 : ");
				dto.setEng(sc.nextInt());
			} else if (menu == 4) {
				System.out.println("수학 점수 : ");
				dto.setMat(sc.nextInt());
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		} else {
			System.out.println("학생 정보가 없습니다.");
			System.out.println("정보를 먼저 입력해주세요");
		}
	} // ChangeMember end
	
	// DeleteMember start
	public void DeleteMember() {
		if (dto.getName() != null) {
			System.out.println("학생 정보를 삭제합니다.");
			dto.setName(null);
			dto.setKor(0);
			dto.setEng(0);
			dto.setMat(0);
		}
	} // DeleteMember end

	//SumMember start
	public void SumMember() { 
		dto.setSum(dto.getKor() + dto.getEng() + dto.getMat());
	} // SumMember end
	
	//GradeMember start
	public void GradeMember() {
		if (dto.getSum()/3 >=90 ) {
			dto.setGrade('A');
		} else if (dto.getSum()/3 >=80 ) {
			dto.setGrade('B');
		} else {
			dto.setGrade('C');
		}
	} // GradeMember end
} // class end
