package list;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
			ArrayList<String> arr = new ArrayList<>();
			System.out.println("저장 전 size : " + arr.size());
			arr.add("111");
			arr.add("222");
			arr.add("333");
			arr.add("444");
			System.out.println("저장 후 size : " + arr.size());
			
			for (int i = 0; i < arr.size(); i ++) {
				String s = arr.get(i);
				System.out.println(i + "." + s);
			}
			
			System.out.println("------------------------------");
			
			for (String st : arr) {
				System.out.println(st);
			}
	}
}
