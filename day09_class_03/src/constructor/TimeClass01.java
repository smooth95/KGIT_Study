package constructor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeClass01 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		SimpleDateFormat si = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		String s = si.format(time); 
		System.out.println(s);
		
		System.out.println("==================");
		
		Date dt = new Date();
		System.out.println(dt);
		System.out.println(si.format(dt));
	}
}
