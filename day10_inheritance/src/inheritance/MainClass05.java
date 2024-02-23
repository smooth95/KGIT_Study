package inheritance;

class Calc05 {
	public void display() {
		System.out.println("나는 계산기 입니다.");
	}
}
class Computer05 extends Calc05{
	/*
	Calc05 calc;
	public Computer05() {
		calc = new Calc05();
	}
	*/
	public void print() {
		System.out.println("컴퓨터로 동작합니다.");
//		calc.display();
		display();
	}
}
public class MainClass05 {
	public static void main(String[] args) {
		Computer05 com = new Computer05();
		com.print();
	}
}
