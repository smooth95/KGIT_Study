package set_get;

import java.time.LocalDate;
import java.time.MonthDay;

public class QuizMain02 {
	public static void main(String[] args) {
		int k = 100, e = 90, m = 80;
		
		QuizTest02 t = new QuizTest02();
		
		t.setKor(k);
		t.setEng(e);
		t.setMath(m);
		
		t.setSum(t.getKor()+t.getEng()+t.getMath());
		t.setAvg(t.getSum()/3);
		
		System.out.println("국어 : "+t.getKor()
						+"\n영어 : "+t.getEng()
						+"\n수학 : "+t.getMath()
						+"\n합계 : "+t.getSum()
						+"\n평균 : "+t.getAvg());
		
		LocalDate now = LocalDate.now();
		System.out.println();
		
	}
}
