package test;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client01 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		Socket sock = new Socket("127.0.0.1", 12345);
		
		new ClientThread(sock);
		
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		String msg = null;
		while (true) {
			System.out.print("전송할 데이터 입력 : ");
			msg = sc.next();
			dos.writeUTF(msg);
		}
	}
}
