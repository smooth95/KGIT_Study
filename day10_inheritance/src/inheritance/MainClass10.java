package inheritance;
class Test10 {
	protected int num = 1000;
	//private 와는 다르게 상속받은 클래스에서는 사용할 수 있다.
	//기본적으로 private처럼 외부에서의 접근을 막는다.
}
class TestClass10 extends Test10{
	public int num = 12345;
	public void test() {
		System.out.println("num : " + num);
		System.out.println("this.num : " + this.num);
		System.out.println("super.num : " + super.num);
	}
}
public class MainClass10 {
	public static void main(String[] args) {
		TestClass10 tc = new TestClass10();
		tc.test();
	}
}
