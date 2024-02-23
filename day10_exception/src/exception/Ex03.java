package exception;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("111");
		ar.add("222");
		ar.add("333");
		for (int i = 0; i <= ar.size(); i++) { // 0에서 3까지 총 4번 반복됨
			try {
				int n1 = 10, n2 = 0;
				System.out.println(n1 / n2);
				System.out.println(ar.get(i)); // 4번째 반복에서 에러가 발생
			} catch(Exception e) {
				System.out.println("sdf");
			} 
		}
		System.out.println("다음 문장들 실행");
		//어디서 문제가 발생되는지 모를때 main내부의 전체를 try로 묶어서도 사용할 수 있다.
	}
}
