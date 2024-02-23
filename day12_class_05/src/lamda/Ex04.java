package lamda;
interface Test04 {
	public void test();
}
class TestClass04{
	public void testClass(Test04 t) {
		System.out.println("기능 실행합니다.");
		t.test();
	}
}
public class Ex04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
		Test04 t04 = new Test04() {
			public void test() {
				System.out.println("test 실행됩니다.");
			}
		};
//		t.testClass(t04);

//		t.testClass(
//				new Test04() {
//					public void test() {
//						System.out.println("test 111실행됩니다.");
//					}
//				}
//				);
//		System.out.println("--------------");
		Test04 t01 = () -> {
			System.out.println("t1 실행");
		};
		t.testClass(t01);
		t.testClass( () -> {
			System.out.println("t111111 실행");
		} );
	}
}
