package class_;

import java.util.ArrayList;

public class ExMain04 {
	public static void main(String[] args) {
		ExTest02 cl = new ExTest02();
		
		int num = cl.inputNum();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr = cl.sambae(num);
		
		cl.printsambae(num, arr);
	}
}
