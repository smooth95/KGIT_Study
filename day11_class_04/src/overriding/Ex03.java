package overriding;
final class Test03 {
	public void test() {
		System.out.println("test03의 test 기능");
	}
	
}
class TestClass03 {
	Test03 t = new Test03();
	//부모클래스가 final일 경우 자식클래스를 둘 수 없다.
	public void test() {
		t.test();
		System.out.println("class03 의 test 기능");
	}
}
public class Ex03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.test();
	}
}
