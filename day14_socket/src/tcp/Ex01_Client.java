package tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ex01_Client {
	public static void main(String[] args) throws IOException {
		//192.168.42.86 , 12345
		Socket sock = new Socket("192.168.42.86", 12345);
		//이 서버로의 통신
		System.out.println("클라이언트 실행!!!");
		
		OutputStream os = sock.getOutputStream();
		//연결통로에 스트림활성화
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력");
		int data = sc.nextInt();
		
		os.write(data);
		sc.close();
		os.close();
		sock.close();
		
	}
}
