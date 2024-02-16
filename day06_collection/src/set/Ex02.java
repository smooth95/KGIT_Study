package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		ArrayList<Integer> arr = new ArrayList<>();
		for (; arr.size() < 6 ; ) {
			int num = rd.nextInt(45)+1;
			if (arr.contains(num) == false) {
				arr.add(num);
			}
		}
		System.out.println(arr);
		
		
		
		HashSet<Integer> set = new HashSet<>();
		for (; set.size() < 6 ; ) {
			int num = rd.nextInt(6) + 1;
			set.add(num);
		}
		System.out.println(set);
	}
}
