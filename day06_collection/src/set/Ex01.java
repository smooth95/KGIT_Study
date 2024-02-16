package set;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("라면");
		set.add("만두");
		set.add("김밥");
		set.add("라면");
		ArrayList<String>arr = new ArrayList<>();
		arr.add("라면");
		arr.add("만두");
		arr.add("김밥");
		arr.add("순대");
		System.out.println(set);
		System.out.println(arr);
		
	}
}
