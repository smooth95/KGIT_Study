package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01_Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(12345);
		System.out.println("접속을 기다립니다.");
		Socket sock = server.accept();
		//클라이언트가 접속할때까지 대기
		System.out.println("클라이언트연결되었습니다.!!");
		
		InputStream is = sock.getInputStream();
		int readData = is.read();
		System.out.println("수신 데이터 : " + readData);
		is.close(); 
		sock.close();
		server.close();
	}
}
