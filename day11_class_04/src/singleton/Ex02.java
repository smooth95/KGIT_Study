package singleton;
class Test02{
	int num;
	static int cnt;
	public Test02() {
		cnt++;
		System.out.println(cnt + "객체 생성");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Test02 t1 = new Test02();
		Test02 t2 = t1;//new Test01();
		Test02 t3 = t2;//new Test01();
		//하나의 객체 공간을 만들어서 사용함.
		t1.num = 100;
		t2.num = 200;
		t3.num = 300;
		
		System.out.println(t1 + " : " + t1.num);
		System.out.println(t2 + " : " + t2.num);
		System.out.println(t3 + " : " + t3.num);
	}
}
