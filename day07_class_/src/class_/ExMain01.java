package class_;

public class ExMain01 {
	public static void main(String[] args) {
		//1~100중 입력한 수의 배수를 찾아내자
		ExClass01 cl = new ExClass01();
		int num = cl.inputNum();
		cl.baesu(num);
		int sum = cl.numSum(num);
		System.out.println(sum);
		
	}
}
