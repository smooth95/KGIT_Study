package file;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		int num;
		while(true) {
			try {
				System.out.println("수 입력");
				num = sc.nextInt();
				System.out.println("입력 값 : " +num );
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("수 입력하세요");
			}
		}
		
		
		
		
		
//		System.out.println("1. 문자열 입력");
//		s1 = sc.next();
//		System.out.println("2. 문자열 입력");
//		sc.nextLine();
//		s2 = sc.nextLine();
//		System.out.println("s1 : "+ s1);
//		System.out.println("s2 : "+ s2);
		
	}
}
