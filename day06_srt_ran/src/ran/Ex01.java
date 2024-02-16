package ran;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(Math.random());
		}
		System.out.println("--------------------------");
		for (int i = 0; i < 5; i++) {
			double dou = Math.random()*3;
			int a = (int)Math.random()*3;
			System.out.println( (int)dou );
			System.out.println(a);
		}
		
		
		System.out.println("-=---------------------------");
		Random rd = new Random();
		
		for (int i = 0; i < 5; i ++ ) {
			int b = rd.nextInt(3);
			System.out.println(b);	
		}
	}
}
