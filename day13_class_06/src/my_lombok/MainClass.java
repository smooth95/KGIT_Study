package my_lombok;

public class MainClass {
	public static void main(String[] args) {
		MainDTO d = new MainDTO();
		d.setAge(23);
		d.setName("홍길동");
		System.out.println(d.getAge());
		System.out.println(d.getName());
		System.out.println(d);
		MainDTO d1 = new MainDTO("ghd", 23);
		System.out.println(d1);
	}
}
