package upcasting;
class Parents{
	public void familyName() {
		System.out.println("이");
	}
	public void name() {
		familyName();
		System.out.println("순신");
	}
}
class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println("국주");
	}
}
class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("기광");
	}
}
public class Ex02 {
	public static void main(String[] args) {
//		Parents par = new Parents();
//		par.name();
//		Daughter d = new Daughter();
//		d.name();
//		Son s = new Son();
//		s.name();
		
		Parents par;
//		Daughter d;
//		Son s;
		
		//업캐스팅 방법
		//1 => 아빠이름, 2=> 딸, 3=> 아들
		int num = 2;
		if (num == 1) {
			par = new Parents();
			par.name();
		} else if (num == 2) {
			par = new Daughter();
			par.name();
		} else {
			par = new Son();
			par.name();
		}
		
	}
}
