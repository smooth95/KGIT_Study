package inheritance;

class Test08 {
	public Test08 (String s) {
		System.out.println(s + "부모 생성자 실행!!");
	}
}
class TestClass08 extends Test08 {
	public TestClass08() {
		super("값 전달");
		//생성자 첫번째 줄에 작성해야한다.
		System.out.println("자식 생성자 실행!!!");
	}
}
public class MainClass08 {
	public static void main(String[] args) {
		TestClass08 tc = new TestClass08();
	}
}
