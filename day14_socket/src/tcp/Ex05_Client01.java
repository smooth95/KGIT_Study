package tcp;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ex05_Client01 {
	public static void main(String[] args) throws Exception {
		Socket sock = new Socket("127.0.0.1", 12345);
		
		Scanner sc = new Scanner(System.in);
		String data;
		
		while(true) {
			System.out.println("전송 데이터 입력");
			data = sc.next();
			
			OutputStream out = sock.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF(data);
		}
	}
}
