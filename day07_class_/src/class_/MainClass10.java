package class_;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass10 {
	public static void main(String[] args) {
		TestClass10 tc = new TestClass10();
		int [] a = tc.test01();
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("111");
		arr.add("222");
		
		HashMap<String, String> map = new HashMap<>();
		map = tc.test02(arr , 100 , "문자열");
		System.out.println(map);
	}
}
