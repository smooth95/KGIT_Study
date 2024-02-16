package class_;

public class ExMain02 {
	public static void main(String[] args) {
		ExTest02 cl = new ExTest02();
		int num1 = cl.inputNum();
		int num2 = cl.inputNum();
		
		int max = cl.calBigNum(num1, num2);
		
		cl.pritBigNum(max);
		
		
	}
}
