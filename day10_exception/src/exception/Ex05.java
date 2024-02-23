package exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;

		System.out.println("수 입력 : ");
		x = sc.nextInt();
		
		try {
			int result = 10/x;
			System.out.println("결과 : result " + result);
			return;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
			System.out.println("finally 실행");
		} // finally 코드는 무조껀 실행되는 코드
		System.out.println("다음 문장들 실행");
		
	}
}
