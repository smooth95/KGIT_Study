package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Process {
	DTO dto = new DTO();
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("인증 프로그램입니다.");

		while(true) {
			try {
				System.out.println("주민번호 입력(앞 6자리)");
				int idNumber = sc.nextInt();
				int length = (int)(Math.log10(dto.getIdNumber())+1);
				if (length != 6) {
					System.out.println("6자를 입력해주세요");
					continue;
				}
				
				dto.setIdNumber(sc.nextInt());
				calcIdNumber();

				if (dto.getYear() >=90) {
					System.out.println("가입 불가");
				} else {
					System.out.println("가입 가능");
				}
				
			} catch(Exception e) {
				System.err.println("숫자를 입력하세요!");
				sc.nextLine();
			}
		}



	}
	public void calcIdNumber() {
		dto.setYear(dto.getIdNumber() / 10000);
	}
}
