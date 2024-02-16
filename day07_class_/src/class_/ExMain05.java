package class_;

import java.util.ArrayList;

public class ExMain05 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		ExTest05 cl = new ExTest05();
		
		int num = cl.inputNum();
		
		arr = cl.calNum(num);
		
		cl.printnum(arr);
	}
}
