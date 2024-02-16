package variable;

public class Ex03 {
	public String name;
	//메서드 등 여러곳에서 사용되는 변수는 클래스변수로 만들어두는 것이 좋다.
	//i 함수같은 일회성같은것들은 지역변수로 사용
	public void inputData() {
		String name = "홍길동";
		
	}
	public void printData() {
		System.out.println(name);
	}
}
