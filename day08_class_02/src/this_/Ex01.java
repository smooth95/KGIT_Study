package this_;
class Test01 {
	public int num = 12345;
	public void test() {
		int num = 303030;
		System.out.println("this : " + this);
		System.out.println("this : " + this.num);
		System.out.println("this : " + num);
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Test01 tc = new Test01();
		System.out.println("main : " + tc);
		System.out.println("main : " + tc.num);
		tc.test();
	}
}
