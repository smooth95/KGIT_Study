package inheritance;
class Test07 {
	public Test07() {
		System.out.println("부모 생성자 실행");
	}
}
class TestClass07 extends Test07{
	public TestClass07() {
		System.out.println("자식 생성자 실행");
	}
}
public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 tc = new TestClass07();
		// 자식생성자를 호출하면 자식생성자의 기본 내용이 출력되는데
		// 상속받았을경우 부모 생성자부터 생성이 된다.
	}
}
