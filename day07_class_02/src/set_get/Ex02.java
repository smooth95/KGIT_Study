package set_get;

class Test02 {
	private int num, age; // 은닉화
	// 은닉화 + get + set -> 캡슐화??
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	*/
}


public class Ex02 {
	public static void main(String[] args) {
		Test02 tc = new Test02();
		tc.setAge(20);
		tc.setNum(100);
		System.out.println(tc.getAge());
		System.out.println(tc.getNum());
		
	}
}
