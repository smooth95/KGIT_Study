package class_;

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 tc = new TestClass07();
		int num = tc.inputData();
//		System.out.println(num);
		int sum = tc.opData(num);
//		System.out.println(sum);
		tc.printData(num, sum);
		
		
	}
}
