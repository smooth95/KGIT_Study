package variable;
class Test06 {
	public static int su;
	public static int num;
	
	public void test() {
		su = 1234;
	}
	
	public static void test2() {
		num = 1234;
	}
}
public class Ex06 {
	static int num;
	public static void main(String[] args) {
		test1();
		num = 123;
		// static을 사용해야 메인에서 사용할 수 있다.
	}
	public static void test1() {
		num = 123;
		System.out.println(num);
	}
}
