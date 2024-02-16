package class_;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int num, sum;
		num = sc.nextInt();
		
		TestClass06 tc = new TestClass06();
		sum = tc.sumFunc(num);
		
		//2. 
		System.out.println(sum);
		
		num = tc.test(10, "aaa");
		System.out.println("끝");
		
		
		ArrayList<String> arr = new ArrayList<>();
		boolean bool = arr.add("aaa");
		String s = arr.get(0);
		System.out.println(s);
		System.out.println(bool);
	}
}

