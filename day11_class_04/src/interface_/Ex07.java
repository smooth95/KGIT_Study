package interface_;

public class Ex07 {
	public static void main(String[] args) {
		TestInt07 t1 = Singleton07.getInstance();
		TestInt07 t2 = Singleton07.getInstance();
		TestInt07 t3 = Singleton07.getInstance();
		TestInt07 t4 = Singleton07.getInstance();
		
//		TestInt07 t1 = new TestClass07_1();
//		TestInt07 t2 = new TestClass07_1();
//		TestInt07 t3 = new TestClass07_1();
//		TestInt07 t4 = new TestClass07_1();
	}
}
