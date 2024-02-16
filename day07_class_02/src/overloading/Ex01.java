package overloading;

import java.util.ArrayList;

//public 가 붙지 않으면 다른파일에서 로드할 수 없다.
class TestClass01{ 
	public void sumFunc() {
		System.out.println("매개변수 없는 sumFunc");
	}
	public void sumFunc(int num) {
		System.out.println("n을 가지고 연산합니다.");
	}
	public void sumFunc(int num1, int num2) {
		System.out.println("num1과 num2 의 합은 " + (num1 + num2));
	}
	public void sumFunc(String str1, String str2) {
		System.out.println("num1과 num2 을 더하면 " + str1 + str2);
	}
}
public class Ex01 {
	public static void main(String[] args) {
		TestClass01 tc = new TestClass01() ;
		tc.sumFunc();
		tc.sumFunc(10);
		tc.sumFunc(10,20);
		tc.sumFunc("안녕", "하세요");
	}
}
