package abstract_;
abstract class Test01 {
	public abstract void speed() ;
	//추상 메서드
	public void myBreak() {
		System.out.println("멈춤 기능");
	}
}
class TestClass01 extends Test01{
	public void speed() {
		System.out.println("2026");
	}
	//추상메서드가 있는 클래스를 상속받았을때는 추상메서드를 자식 메서드에서 구현해야한다.
	public void autoSystem() {
		System.out.println("자동 운전 모드");
	}
	public void autoSystem1() {
		System.out.println("자동 운전 모드");
	}
	public void autoSystem2() {
		System.out.println("자동 운전 모드");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		t.speed();t.myBreak();t.autoSystem();
	}
}
