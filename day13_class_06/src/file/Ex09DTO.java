package file;

import java.io.Serializable;

import lombok.Data;

@Data
public class Ex09DTO implements Serializable{
	//객체를 내보내려면 직열화를 해주어야한다.
	private String name, addr;
	
}
