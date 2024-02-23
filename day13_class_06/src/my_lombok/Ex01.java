package my_lombok;
class Ex01DTO {
	String name;
	int age;
	public Ex01DTO() {}
	public Ex01DTO(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ex01DTO=[name : "+name+"]";
	}
	
}
public class Ex01 {
	public static void main(String[] args) {
		Ex01DTO dto = new Ex01DTO("홍길동", 23);
		System.out.println(dto);
	}
}
