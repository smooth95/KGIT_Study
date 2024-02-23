package inheritance;
class Test06{
	public void test() {
		System.out.println("부모 test 메소드");
	}
}
class TestClass06  extends Test06{
	public void test() {
		System.out.println("자식 test 메소드");
	}
	public void display() {
		test();
		super.test();
		//부모클래스를 의미하는 super
		this.test();
		//자기 자신을 의미
	}
}
public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 tc = new TestClass06();
		tc.display();
		//부모와 자식에 같은 메서드가 있을때 자식 메서드를 실행한다.
	}
}
