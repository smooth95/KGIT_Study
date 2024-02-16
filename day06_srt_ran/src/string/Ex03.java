package string;

public class Ex03 {
	public static void main(String[] args) {
		String str = "test     ";
		System.out.println("str : " + str);
		System.out.println(str.equals("test"));
		
		String result = str.trim();
		System.out.println("result : " + result);
		System.out.println(result.equals("test"));
		
		String addr = "01245 노원구 동일로 1235";
		System.out.println(addr);
		String[] split = addr.split(" ");
		for (int i = 0; i < split.length; i ++) {
			System.out.println(i + "." + split[i]);
		}
		
		
		String phone = "010-1234-1234";
		String rep = phone.replace("-", "");
		System.out.println("rep : " + rep);
		

		phone = "1234";
		int a = Integer.parseInt(phone);
		System.out.println(a+1);
		String s = a + "";
		System.out.println(s + 100);
	}
}
