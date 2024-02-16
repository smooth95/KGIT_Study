package class_;

import java.util.Scanner;

public class TestClass04 {
	public void sumFunction() {
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		System.out.println("수 입력 : ");
		num = sc.nextInt();
		for (int i = 0; i <= num; i++ ) {
			sum +=i;
		}
		System.out.println(sum);
	}
}
