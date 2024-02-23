package singleton;
class Test03{
	private static Test03 t;
	int num;
	private Test03() {
		System.out.println("생성자 실행");
	}
	public static Test03 getInstance() {
		System.out.println("객체생성 메소드 연동");
		System.out.println("t : " + t);
		if(t == null) {
			t = new Test03();			
		}
		return t;
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Test03 t1 = Test03.getInstance();
		Test03 t2 = Test03.getInstance();
		Test03 t3 = Test03.getInstance();
		t1.num = 100; t2.num = 2000;
		
		System.out.println(t1  +":" +t1.num);
		System.out.println(t2 +":" + t2.num);
		System.out.println(t3 +":" +t3.num);
	}
}
