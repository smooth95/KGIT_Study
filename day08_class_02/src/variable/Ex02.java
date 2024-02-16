package variable;
class Test02 {
	public int num; // 클래스 변수
	public void test1() {
		num = 100;
		System.out.println("Test1 : " + num);
	}
	public void test2() {
		System.out.println("test2 : " + num);
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.test2();
	}
}
