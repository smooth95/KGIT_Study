package overriding;

import java.util.ArrayList;

class Test02 extends ArrayList<String>{
	public String get(int i) {
		System.out.println(super.get(i));
		return super.get(i);
	}
}
public class Ex02 {
	public static void main(String[] args) {
		
		Test02 t = new Test02();
		t.add("asdf");
		t.add("111");
		t.add("222");
		t.get(0);
	}
}
