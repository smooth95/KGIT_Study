package class_;

public class TestClass05 {
	//2. 전달받을 값이 어떤것인지 확인하여 변수타입을 맞춰 선언
	// 입력받은 int num 은 sumFunc 내부에서 사용할 수 있다.
	public void sumFunc(int num) {
		//Scanner sc = new Scanner(System.in);
		int sum = 0;
		//System.out.println("수 입력 : ");
		//num = sc.nextInt();
		for (int i = 0; i <= num; i++ ) {
			sum +=i;
		}
		System.out.println(sum);
	}
}
