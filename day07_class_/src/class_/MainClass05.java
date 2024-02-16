package class_;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("수 입력 : ");
		num = sc.nextInt();
		
		TestClass05 tc = new TestClass05();
		//1. 괄호안에 내용은 값을 전달하는 내용
		tc.sumFunc(num);
	}
}
