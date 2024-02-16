package variable;

import java.util.Scanner;

public class TestClass {
	String name = "";
	int scoreKor = 0;
	int scoreEng = 0;
	int scoreMat = 0;
	int sum = 0;
	int avg = 0;
	char grade = ' ';
	
	public void inputName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("국어 점수 입력 : ");
		scoreKor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		scoreEng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		scoreMat = sc.nextInt();
	}
	
	public void calNum() {
		sum = scoreKor + scoreEng + scoreMat;
		avg = sum/3;
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			
			grade = 'B';
		} else {
			grade = 'C';
		}
	}
	
	public void printScore() {
		System.out.println("이름 : " + name + "\n"
				+ "국어점수 : " + scoreKor + "\n"
				+ "영어점수 : " + scoreEng + "\n"
				+ "수학점수 : " + scoreMat + "\n"
				+ "전체점수 : " + sum + "\n"
				+ "평균점수 : " + avg + "\n"
				+ "점수등급 : " + grade);
	}
}
