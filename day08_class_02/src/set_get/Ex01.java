package set_get;
class Test01 {
	private int num = 12345;
	
	//setter
	public void test(int n ) {
		num = n;
	}
	
	//getter
	public int test2() {
		return num;
	}
	
}
public class Ex01 {
	public static void main(String[] args) {
		Test01 tc = new Test01();
		tc.test(100);
		System.out.println(tc.test2());
	}
}
