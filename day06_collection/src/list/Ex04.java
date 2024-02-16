package list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i ++ ) {
			System.out.println(i + 1 + ".번째 메뉴 등록");
			//String menu = sc.next();
			arr.add(sc.next());
		}
		System.out.println("=== 등록된 메뉴 ===");
		System.out.println(arr);
		System.out.println("----------------------------");
		System.out.println("수정할 메뉴 입력");
		String search = sc.next();
		System.out.println(arr.contains(search));
		System.out.println(arr.indexOf(search)); // -1또는 인덱스 넘버를 출력한다. -1은 없는 값을 입력했을때 출력됨.
		System.out.println("----------------------------");
		int index = arr.indexOf(search);
		if(index != -1) { // 해당 메뉴는 존재한다.
			System.out.println("수정할 이름 입력");
			String change = sc.next();
			System.out.println(arr.get(index)+"="+change);
			arr.set(index, change);
			System.out.println("수정 후 arr : " + arr);
		} else { //존재하지 않는 메뉴
			System.out.println("존재하지 않음");
		}
	}
}
