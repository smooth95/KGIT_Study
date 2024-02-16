

package class_;

public class TestClass06 {
		public int sumFunc(int n) {
			int sum = 0;
			for (int i = 1; i <= n; i++ ) {
				sum +=i;
			}
			//1. 값을 반환할때는 void값이 들어갈 수 없다.
			//반환값을 int 형태로 변경해주어야한다.
			return sum;
		}
		
		public int test(int n, String s) {
			return 100;
		}
		
		
}
