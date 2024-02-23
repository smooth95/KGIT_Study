package overriding;
class Test04{
	public void test() {
		System.out.println("부모 실행");
	}
}
class TestClass04 extends Test04{
	public void test() {
		System.out.println("자식 실행");
	}
}
public class Ex04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
	}
}
