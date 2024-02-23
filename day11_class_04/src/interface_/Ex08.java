package interface_;

import java.util.ArrayList;
import java.util.List;

interface Testint1 {
	public int num1 = 0;
	public static final int num2 = 1000;
	public final int num3 = 1000;
	
	//기본적으로 static final 로 생성이 된다.
	//임의로 기입해도 된다.
}
public class Ex08 {
	public final int num = 1000;
	public static void main(String[] args) {
		System.out.println(Testint1.num1);
//		Testint.num1 = 12345;
		//interface 에서 만드는 모둔 함수는 static final로 생성
		List<String> arr = new ArrayList<>();
		
	}
}
