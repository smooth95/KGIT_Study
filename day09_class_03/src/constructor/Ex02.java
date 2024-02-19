package constructor;

class TestClass02{ 
	private String officeName;
	public TestClass02(String officeName) {
		System.out.println("생성자 실행");
		this.officeName = officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getOfficeName() {
		return this.officeName;
	}
}


public class Ex02 {
	public static void main(String[] args) {
		TestClass02 tc = new TestClass02( "Test" );
//		tc.setOfficeName("kg");
		System.out.println(tc.getOfficeName());
	}
}
