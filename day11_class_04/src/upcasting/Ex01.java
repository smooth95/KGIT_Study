package upcasting;

class A01{
	public void test() {
		System.out.println("aaaaaa");
	}
}
class B01 extends A01{
	public void test() {
		System.out.println("bbbbbb");
	}
}
class C01 extends A01{
	public void test() {
		System.out.println("cccccc");
	}
}


public class Ex01 {
	public static void main(String[] args) {
//		int n = (int)1.11;
		// casting
		A01 a;
		a = new B01();
		a.test();
		a = new C01();
		a.test();
		
//		B01 b;
//		C01 c;
//		b = new B01();
//		b.test();
//		c = new C01();
//		c.test();
		//기본적인 클래스 사용 형태
		
	}
}
