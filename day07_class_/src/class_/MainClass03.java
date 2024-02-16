package class_;

public class MainClass03 {
	public static void main(String[] args) {
		// 2. 클래스 호출
		TestClass03 tc = new TestClass03();
		System.out.println("main 시작");
		// 3. 호출된 클래스의 test 메서드 실행
		tc.test();
		System.out.println("main 종료");
	}
}
