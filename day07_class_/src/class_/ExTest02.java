package class_;

import java.util.ArrayList;
import java.util.Scanner;

public class ExTest02 {
	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int num = sc.nextInt();
		return num;
	}
	
	public int calBigNum(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	public void pritBigNum(int num) {
		System.out.println("가장 큰 수는 : " + num + " 입니다.");
	}
	
	public void holJak(int num) {
		if (num % 2 == 0) {
			System.out.println("짝");
		} else {
			System.out.println("홀");
		}
	}
	
	public ArrayList<Integer> sambae(int num) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 1; i <= num; i++ ) {
			if (i % 3 == 0) {
				arr.add(i);
			}
		}
		return arr;
	}
	
	public void printsambae(int num, ArrayList<Integer> arr) {
		System.out.println("1부터 " + num + "까지 3의 배수");
		System.out.println(arr);
	}
	
}
