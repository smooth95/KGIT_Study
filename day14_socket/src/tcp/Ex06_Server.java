package tcp;

import java.net.ServerSocket;
import java.net.Socket;

public class Ex06_Server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		while(true) {
			System.out.println("접속을 기다립니다.");
			Socket s = server.accept();
			System.out.println(s.getInetAddress() + "님 접속");
			
			new Ex06_ServerThread( s );
			// 클라이언트가 연결되어 server.accept 값이 s에 할당되면 thread가 실행된다.
			
		}
	}
}
