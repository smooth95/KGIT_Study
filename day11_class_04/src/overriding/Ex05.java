package overriding;
class Test05 {
	public void test() {
		
	}
}
class TestClass05 extends Test05{
	public void test() {
		
	}
}
public class Ex05 {
	public static void main(String[] args) {
		Test05 t = new Test05();
		System.out.println(t.getClass());
		System.out.println(t.toString());
		System.out.println(t);
	}
}
