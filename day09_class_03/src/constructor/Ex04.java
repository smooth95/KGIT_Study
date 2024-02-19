package constructor;

import java.util.ArrayList;

class TestClass04{
	public TestClass04(int num) {
		System.out.println("매개변수 받는 생성자");
	}
	public TestClass04() {
		System.out.println("기본생성자 실행");
	}
	public void test() {
		System.out.println("test 호출");
	}
	public void test(int num) {
		System.out.println(num + "Test 호출");
	}
}



public class Ex04 {
	public static void main(String[] args) {
		TestClass04 tc = new TestClass04();
		tc.test();
		tc.test(10);
		TestClass04 tb = new TestClass04(10);
		
		ArrayList arr = new ArrayList<>();
		String s = new String();
		String s1 = new String("값 전달");
	}
}
