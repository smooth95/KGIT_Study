package interface_;
class A지상군05 implements TestInt05{
	public void attack() {
		attack1();
		System.out.println("지상군 공격");
	}
	public void attack1() {
		System.out.println("지상군이 총을 쏨");
	}
	public void defense() {
		System.out.println("지상군 방어");
	}
}
public class Ex05 {
	public static void main(String[] args) {
		TestInt05 a = new A지상군05();
		a.attack();
		a.defense();
	}
}
