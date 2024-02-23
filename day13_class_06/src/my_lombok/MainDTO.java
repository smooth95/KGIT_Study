package my_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
//@ToString
@NoArgsConstructor // 기본 생성자 생성
@AllArgsConstructor // 모든 변수를 받아주는 생성자 생성
@Data // set,get,tostring,noargs 를 만들어주는 어노테이션
//allargs를 사용하려면 noargs도 추가해야한다.
////어노테이션
public class MainDTO {
	private String name;
	private int age;
}
