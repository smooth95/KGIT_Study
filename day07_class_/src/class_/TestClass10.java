package class_;

import java.util.ArrayList;
import java.util.HashMap;

public class TestClass10 {
	public int[] test01() {
		int n1 = 100, n2 = 200;
		int arr[] = {n1, n2};
		return arr;
	}
	
	public HashMap<String, String> test02(ArrayList<String> arr, int num, String str) {
		System.out.println(arr.get(0));
		System.out.println(num);
		System.out.println(str);
		System.out.println("무언가 연산이 이루어 집니다.");
		HashMap<String, String> map = new HashMap<>();
		map.put("키1", "연산된 값1");
		map.put("키2", "연산된 값2");
		map.put("키3", "연산된 값3");
		return map;
	}
}
