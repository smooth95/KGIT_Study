package collection.dto;

public class MemberDTO {
	private String name, addr, pw;
	private static int logses;

	public int getLogses() {
		return logses;
	}

	public void setLogses(int logses) {
		this.logses = logses;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
