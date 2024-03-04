package test;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		
		while(true) {
			System.out.println("응답 대기중");
			Socket sock = server.accept();		
			System.out.println(sock.getInetAddress() + "님 접속");
			
			new ServerThread(sock);
		}
		
		
	}
}
