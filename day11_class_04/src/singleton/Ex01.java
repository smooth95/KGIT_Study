package singleton;
class Test01{
	int num;
	static int cnt;
	public Test01() {
		cnt++;
		System.out.println(cnt + "객체 생성");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Test01 t1 = new Test01();
		Test01 t2 = new Test01();
		Test01 t3 = new Test01();
		
		t1.num = 100;
		t2.num = 200;
		t3.num = 300;
		
		System.out.println(t1 + " : " + t1.num);
		System.out.println(t2 + " : " + t2.num);
		System.out.println(t3 + " : " + t3.num);
	}
}
