package constructor;

import java.util.Date;

public class SleepClass01 {
	public static void main (String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println(i + " : " +new Date());
			try {
				Thread.sleep(500);
				// 500 = 0.5초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("시작");
		long start = System.currentTimeMillis();
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			
		}
		long end = System.currentTimeMillis();
		System.out.println("종료");
		System.out.println("사용 시간 : " +(end - start) / 1000);
		//사용시간을 확인할 수 있다.
	}
}
