package exception;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				int x, y, result = 0;
		System.out.println("수 입력");
		x = input.nextInt();
		y = input.nextInt();
		try {
			System.out.println("try 실행");
			result = x / y;
			System.out.println("정상동작");
			System.out.println("정상동작");
		} catch(ArithmeticException e) {
			System.out.println("문제 발생");
			System.out.println("0으로 나눌 수 없음");
		}
		System.out.println("결과 : " + result);
		//try catch 를 사용했을 경우 에러가 발생되는 코드를 catch안에 넣고 
		//try문이 잘못되어서 catch의 에러가 발생했을때 catch안의 내용을 실행한다.
	}
}
