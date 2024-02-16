package string;

public class Ex02 {
	public static void main(String[] args) {
		String str = "test";
		System.out.println("length : " + str.length());
		System.out.println("charAt(0)" + str.charAt(0));
		System.out.println("charAt(1)" + str.charAt(1));
		System.out.println("charAt(2)" + str.charAt(2));
		System.out.println("charAt(3)" + str.charAt(3));
		System.out.println(str.charAt(0) == 't');
		System.out.println(str.charAt(0) != 't');
		System.out.println(str.equals("test"));
		
		String jumin = "951026";
		int i = 0;
		if (jumin.length() == 6) {
			for (i = 0; i < jumin.length(); i++) {
				if (jumin.charAt(i) < '0' || jumin.charAt(i) > '9') {
					System.out.println("숫자를 입력하세요");
					break;
				} 
				
			}
			if (i == jumin.length()) {
				System.out.println("뒷자리 주민번호를 입력하세요");
			}
		} else {
			System.out.println("길이가 잘못 됐음");
		}

	}
}
