package set_get;

import java.util.Scanner;

class Ex03 {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void manAge() {
		this.age --;
	}
}
public class Quiz01 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		System.out.println("이름 입력 : ");
		name = sc.next();
		System.out.println("나이 입력 : ");
		age = sc.nextInt();
		
		Ex03 ex = new Ex03();
		
		ex.setAge(age);
		ex.setName(name);
		ex.manAge();
		System.out.println(ex.getName() + "님의 나이는 " + ex.getAge() + "살 입니다.");
		
	}
}
