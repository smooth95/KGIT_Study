package class_;

import java.util.Scanner;

public class ExClass01 {
	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요 : ");
		int num = sc.nextInt();
		return num;
	}
	public void baesu(int num) {
		for (int i = 1; i <= 100; i ++ ) {
			if (i % num == 0) {
				System.out.println(num + "의 배수는 " + i + " 입니다." );
			}
		}
		
	}
	
	public int numSum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++ ) {
			sum += i;
		}
		return sum;
	}
}
