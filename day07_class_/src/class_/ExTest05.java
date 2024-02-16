package class_;

import java.util.ArrayList;
import java.util.Scanner;

public class ExTest05 {
	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int num = sc.nextInt();
		return num;
	}
	
	public ArrayList<Integer> calNum(int num) {
		int count = 0;
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 1; i <= num; i ++ ) {
			for (int j = 2; j <= i; j++ ) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				arr.add(i);
			}
			count = 0;
		}
		return arr;
	}
	
	public void printnum(ArrayList<Integer> arr) {
		for (int i = 0; i < arr.size(); i++ ) {
			System.out.println(arr.get(i) + "는 소수");
		}
	}
}
