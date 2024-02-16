package variable;

class Test07 {
	public static final String KOREA = "대한민국";
	public static int num;
	static {
		num = 12345;
	}
	public void test () {
		System.out.println("test 호출");
	}
}


public class Ex07 {
	public static void main(String[] args) {
//		final String KOREA = "대한민국";
//		KOREA = "미국";
		// final로 선언된 변수는 변경이 불가능하다.
		System.out.println(Test07.KOREA);
		System.out.println(Test07.num); // 클래스로 접근
		
		Test07 t = new Test07();
		System.out.println(t.KOREA); // 객체로 접근
		t.test();
	}
}
