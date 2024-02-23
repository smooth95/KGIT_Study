package inheritance.login;

import java.text.SimpleDateFormat;

public class TimeClass {
	SimpleDateFormat si = new SimpleDateFormat("YYYY년 MM월 dd일 hh시 mm분 ss초");
	long st;
	long et;
	public String StartTime () {
		st = System.currentTimeMillis();
		String time = si.format(st);
		return time;
		
	}
	public String EndTime () {
		et = System.currentTimeMillis();
		String time = si.format(et);
		return time;
	}
	public String UseTime() {
		long useTime = (et - st) / 1000;
		long year = useTime/(60*60*24*365);
		long month = useTime/(60*60*24);
		long hour = useTime/(60*60);
		long minute = useTime/60;
		long second = useTime%60;
		String ut = year + "년 " + month + "달 " + hour + "시 " + minute + "분 " + second + "초";
		return ut;
	}
}
