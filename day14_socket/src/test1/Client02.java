package test1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		Socket sock = new Socket("127.0.0.1", 12345);
		
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		new ClientThread(sock);
		
		String msg = null;
		while(true) {
			System.out.println("전송할 데이터 입력");
			msg = sc.next();
			dos.writeUTF(msg);
			
		}
	}
}
