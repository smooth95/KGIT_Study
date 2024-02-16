package variable;

class Test01{
	public int test1() {
		int num = 100; // 지역변수
		System.out.println("test1 : " + num);
		return num;
	}
	public void test2(int num) {
		System.out.println("test2 : " + num);
		//test1에서 만든 지역변수를 test2에서 사용할 수 없다.
	}
	
}
public class Ex01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		int n = t.test1();
		t.test2(n);
		String name = "홍길동";
		if (true) {
			//String n = "1111";
			name = "김개똥"; 
		}
		//System.out.println(n);
		//if 문 안에서 선언된 지역변수는 그 안에서만 사용이 가능하다. (if문의 지역변수)
		//작은 범위에서 만든변수는 큰범위에서 사용할 수 없다.
		System.out.println( name );
		//큰 범위에서 만든변수는 작은범위에서 사용할 수 있다. (main의 지역변수)
	}
}
