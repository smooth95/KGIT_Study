package list;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("안녕");
		arr.add("하세요");
		arr.add("반갑");
		arr.add("습니다.");
		System.out.println("arr : " + arr);
		
		String s = arr.get(1);
		System.out.println(s);
		
	}
}
