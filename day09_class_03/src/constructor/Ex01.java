package constructor;

class TestClass01{
	public TestClass01() {
		System.out.println("생성자 실행");
		//new TestClass01() {} 로 객체를 호출할때 생성자메서드가 생성된다.
		//따로 만들어주지 않아도 기본적으로 생성된다.
	}
	public void test() {
		System.out.println("test 호출");
	}
}


public class Ex01 {
	public static void main(String[] args) {
		TestClass01 tc = new TestClass01();
		tc.test();
	}
}
