package class_;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		
		TestClass02 tc = new TestClass02();
		
		int num;
		
		num = tc.inputTest();
		
		if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		num = tc.inputTest();

		if (num % 3 == 0) {
			System.out.println("3의 배수");
		} else {
			System.out.println("3의 배수 아님");
		}
		
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		System.out.println("수 입력 : ");
//		num = sc.nextInt();
//		if (num % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
//		System.out.println("수 입력 : ");
//		num = sc.nextInt();
//		if (num % 3 == 0) {
//			System.out.println("3의 배수");
//		} else {
//			System.out.println("3의 배수 아님");
//		}
	}
}
