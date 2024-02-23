package interface_;

class Test02 implements TestInt2{
	public void test1() {
		System.out.println("test1실행");
	}
	public void test2() {
		System.out.println("test2실행");
	}
}


public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.test1();
		t.test2();
		
	}
}
