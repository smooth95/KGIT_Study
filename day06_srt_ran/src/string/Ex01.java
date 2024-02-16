package string;

public class Ex01 {
	public static void main(String[] args) {
		String str;
		String str1 = new String();
		String str2 = "asdf";
		String str3 = new String("tesT");
		System.out.println("str3 : " + str3);
		String s1 = str3.toUpperCase();
		System.out.println(s1);
		String s2 = s1.toLowerCase();
		System.out.println(s2);
		
		str3 = "JaVa";
		//if (str3.equals("java")) {
		//파일 형식이나 대문자 소문자가 섞여있을 경우 equals 로 제대로 판별이 불가능
		//소문자 또는 대문자로 변환하여 비교해야한다.
		if (str3.toLowerCase().equals("java")) {
			System.out.println("수강 과목은 자바군요!");
		} else {
			System.out.println("다르다!!");
		}
	}
}
