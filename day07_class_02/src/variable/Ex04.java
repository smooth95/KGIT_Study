package variable;
class Test04{
	public int num; // 인스턴스 변수
	public static String msg = "연습";
	//static을 사용하면 다른 클래스에서 Test04. 하고 불러올 수 있다.(다른 페이지에서 사용할때도)
	//제일 먼저 만들어지는 변수
	// static => 인스턴스 -> 지역변수
	//static변수는 제일 오래 저장된다.
}
public class Ex04 {
	public static void main(String[] args) {
		Test04 t = new Test04() ;
		t.num = 100; // 인스턴스 변수 사용
		Test04.msg = "111";
		System.out.println(Test04.msg);
	}
}
