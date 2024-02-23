package inheritance;

import java.util.ArrayList;

class TestClass01{
	ArrayList ar;
	public TestClass01() {
		ar = new ArrayList<>();
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 tc = new TestClass01();
		tc.ar.add(111);
		tc.ar.add("asdfasdf");
		System.out.println(tc.ar.get(0));
		System.out.println(tc.ar.get(1));
		
		
	}
}
