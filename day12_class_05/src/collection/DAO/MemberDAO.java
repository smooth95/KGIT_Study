package collection.DAO;

import java.util.ArrayList;

import collection.dto.MemberDTO;

public class MemberDAO {
	public static ArrayList<MemberDTO> arr;
	static {
		arr = new ArrayList<>();
	}
	public void register(MemberDTO dto) {
		System.out.println("dao register 연동");
		arr.add(dto);
	}
	public ArrayList<MemberDTO> getData() {
		return arr;
	}
	
	public MemberDTO search(String name) {
		for(MemberDTO d : arr) {
			if (name.equals(d.getName())) {
				return d;
			}
		}
		return null;
	}
	public void delete(MemberDTO dto) {
		arr.remove(dto);
	}
	public void login(MemberDTO dto) {
		
	}
	public void change(MemberDTO dto, String name) {
		int i = 0;
		for(MemberDTO d : arr) {
			if (name.equals(d.getName())) {
				arr.set(i, dto);
				i++;
			}
		}
		
		
	}
}
