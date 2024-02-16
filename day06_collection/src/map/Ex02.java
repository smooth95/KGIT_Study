package map;

import java.util.HashMap;

public class Ex02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("num", 123);
		map.put("age", 28);
		System.out.println("map : " + map);
		int num = map.get("age");
		System.out.println(num);
		
		System.out.println(map.containsKey("age"));
		// 키가 있는지 확인
		System.out.println(map.containsValue(2000));
		// 값이 있는지 확인
		
		map.put("age", 1234);
		System.out.println(map);
		// age에 새로운 데이터를 넣으려하면 값만 변경된다.
		map.remove("age");
		System.out.println(map);
		
	}
}
