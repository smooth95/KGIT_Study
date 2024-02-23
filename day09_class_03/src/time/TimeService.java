package time;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeService {
	TimeDTO dto = new TimeDTO();
	public void display() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			SimpleDateFormat si = new SimpleDateFormat("hh시 mm분 ss초");

			System.out.println("1. 시작");
			System.out.println("2. 종료");
			int num = sc.nextInt();
			if (num == 1) {
//				long startTime = System.currentTimeMillis();
				dto.setStart(System.currentTimeMillis());
				si.format(dto.getStart());
				System.out.println("시간을 기록합니다.");
				
				System.out.println("시작 시간은 : " + si.format(dto.getStart()) + " 입니다.");
			} else if (num == 2) {
//				long endTime = System.currentTimeMillis();
				dto.setEnd(System.currentTimeMillis());
				si.format(dto.getEnd());
				System.out.println("시간을 기록합니다.");
				useTime();
				System.out.println("종료 시간은 : " + si.format(dto.getEnd()) + " 입니다.");
				System.out.println();
				System.out.println("사용 시간은 " + dto.getUseTime()/360000 + "시간 " + dto.getUseTime()/60000 + "분 " + dto.getUseTime()/1000 + "초 입니다.");
			}
		}
	}
	
	public void useTime(  ) {
		dto.setUseTime(dto.getEnd() - dto.getStart());
	}
}
