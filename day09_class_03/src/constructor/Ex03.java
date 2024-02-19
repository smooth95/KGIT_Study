package constructor;

class TestClass03{
	private String name, addr;
	private int age;
	public TestClass03(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}



public class Ex03 {
	public static void main(String[] args) {
		TestClass03 tc = null; //= new TestClass03();
//		System.out.println(tc);
//		tc.setAddr("aaa");
		String name = "홍길동";
		String addr = "산골짜기";
		int age = 12;
		tc = new TestClass03(name, addr, age);
//		tc.setName(name);
//		tc.setAddr(addr);
//		tc.setAge(age);
		System.out.println(tc.getAddr()+tc.getName()+tc.getAge());
	}
}
