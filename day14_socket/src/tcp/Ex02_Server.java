package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex02_Server {
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(10000);
		System.out.println("접속 대기 .....");
		Socket sock = server.accept();
		System.out.println(sock.getInetAddress());
		//현재 접속한 사용자 정보 표시
		
		InputStream in = sock.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		String readData = dis.readUTF();
		
		System.out.println("수신 데이터 : " + readData);
		
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("클라이언트로 전송할 데이터 입력");
		String sendData = sc.next();
		dos.writeUTF(sendData);
		
		dis.close();
		in.close();
		sock.close();
		server.close();
		
	}
}
