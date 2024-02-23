package upcasting;
class Test{
	
}
public class Ex03 {
	public static void main(String[] args) {
		Object num = 100;
		Object name = "홍길동";
		Object t = new Test();
		// object는 모든값의 부모 메서드
		System.out.println(num.getClass() );
		System.out.println(name.getClass());
		System.out.println(t);
		int a = 100 + (int)num;
		//다운캐스팅 (object로 값을 받았다가 다시 하위 형태로 바꾸는것)
		System.out.println(a);
	}
}
