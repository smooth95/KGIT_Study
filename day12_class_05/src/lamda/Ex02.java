package lamda;
interface Test02{
	public void test();
//	public void test1();
}
public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02() {

			@Override
			public void test() {
				System.out.println("test실행");
			}

//			@Override
//			public void test1() {
//				// TODO Auto-generated method stub
//				
//			}
			
		};
		t.test();
		System.out.println("---------람다-----------");
		Test02 t02 = () -> System.out.println("test실행222");
		//괄호 안은 interface의 test메서드의 내용으로 들어간다.
		t02.test();
		
	}
}
