package inheritance;

class Test09 {
	public Test09(String s) {
		System.out.println(s + "부모 생성자");
	}
	public Test09() {
		System.out.println("기본 부모 생성자");
	}
}
class TestClass09 extends Test09{
	public TestClass09() {
		super("값 전달 : ");
		System.out.println("기본 자식 생성자");
	}
	public TestClass09(String s) {
		super(s);
		System.out.println(s + "자식 생성자");
		
	}
}
//기본생성자를 값을 받아서 실행하는 경우 값이 없는 기본생성자도 만들어주면 
//오류를 줄일 수 있다.

public class MainClass09 {
	public static void main(String[] args) {
		TestClass09 tc = new TestClass09();
		TestClass09 tc2 = new TestClass09("전달 : ");

	}
}
