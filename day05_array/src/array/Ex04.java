package array;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr = {100,200,300};
		double[] dos = {1.11, 2.22, 3.33};
		String[] str = {"안녕", "하세요"};
		
		
		//배열에 있는 값들을 출력할 수 있다.
		for (int num : arr) {
			System.out.println(num);
		}
		for (double num : dos) {
			System.out.println(num);
		}
		for (String aaa : str) {
			System.out.println(aaa);
		}
	}
}
