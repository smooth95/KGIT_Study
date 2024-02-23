package exception;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("수 입력");
			num = sc.nextInt();
//			System.out.println("결과 : " + (100/num));
			try {
				System.out.println("결과 : " + (100/num));
			} catch (Exception e) {
				System.err.println(e);
			}
				
		}
	}
}
