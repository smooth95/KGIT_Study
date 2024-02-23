package inheritance;

import java.util.ArrayList;

class TestClass03 extends ArrayList<String>{

	@Override
	public String get(int index) {
		System.out.println("데이터를 가져오는 기능");
		return super.get(index);
	}

	@Override
	public boolean add(String e) {
		System.out.println("데이터를 추가했습니다.");
		return super.add(e);
	}
	
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 tc = new TestClass03();
		tc.add("aaa");
		System.out.println(tc.get(0));
	}
}
