package class_;

public class TestClass09 {
	public void test01() {
		for (int i = 0; i < 5; i ++ ) {
			System.out.println(i);
			if (i == 3) 
				//break; // break는 for문만 빠져나온다.
				return ; // 메서드를 종료하면서 빠져나온다 
			//따라서 호출했을때 test1 종료는 출력되지 않는다.
		}
		System.out.println("test1 종료");
	}
	
	public int test02() {
		int n = 10;
		if (n > 100 )
			return 100;
		else 
			return 0;
		// if문에서 반환이 되지 않을수도 있기때문에
		// if문 밖에서 또는 else로 return(반환) 값을 넣어주어야한다.
	}
	
	public String test03() {
		
		int num = 100;
		if (num > 10) {
			return "문자열";
		} /*else {
			// return 0; 메서드가 문자열로 생성이 되었으면
			// 반환값도 문자열로 반환이 되어야한다.
		}*/
		return "aaa";
		
	} // test03 end
	
	public String test04() {
		return /*"aaaa", "bbbb",*/ "cccc"; 
		// return 값은 하나만 반환할 수 있다.
	}
	
} // class end
