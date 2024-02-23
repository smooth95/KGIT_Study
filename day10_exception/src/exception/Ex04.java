package exception;

import java.util.ArrayList;

public class Ex04 {
	public static void main(String[] args) {
		try {
			int n1 = 10, n2 = 1;
			System.out.println(n1 / n2);
			
			ArrayList<String> ar = new ArrayList<String>();
			ar.add("111");
			ar.add("222");
			ar.add("333");
			for (int i = 0; i <= ar.size(); i++) { // 0에서 3까지 총 4번 반복됨
					System.out.println(ar.get(i)); // 4번째 반복에서 에러가 발생
			}
			System.out.println("다음 문장들 실행");
		} catch(Exception e) {
//			System.out.println("sdf");
			e.printStackTrace();
		}
	}
}
