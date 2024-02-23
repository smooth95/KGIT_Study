package time;

import java.text.SimpleDateFormat;

public class Test {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		SimpleDateFormat s = new SimpleDateFormat("hh시 mm분 ss초");
		System.out.println(s.format(time));
		
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				long cur = System.currentTimeMillis();
				System.out.println(s.format(cur));

			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - time);
		System.out.println((endTime-time)/60000 + "분" + (endTime-time) / 1000 + "초");
	}
}
