package inheritance;
class A {
	public void a() {
		System.out.println("a 메소드 실행");
	}
}
class B extends A{
	public void b() {
		System.out.println("b 메소드 실행");
	}
}
class C extends B{
	public void c() {
		System.out.println("c 메소드 실행");
	}
}
class TestClass11 extends C {
	
}
public class MainClass11 {
	public static void main(String[] args) {
		C c = new C();
		c.a();
		c.b();
		c.c();
	}
}
