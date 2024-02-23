package com.care.test;

class Test001{
	void test001() {
		System.out.println("Test001 test001 메소드");
	}
}

public class TestClass {
	
	public void test() {
		System.out.println("test 메소드");
	}
	void test2() {
		System.out.println("test2 메소드");
	}
	//다른 패키지에서 사용하기위해서는 public 으로 메서드를 생성해야한다.
	// default의 경우 같은 패키지에서만 사용할 수 있다.
}
