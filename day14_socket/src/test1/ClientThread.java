package test1;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ClientThread extends Thread{
	private Socket sock;
	public ClientThread(Socket sock) {
		this.sock = sock;
		start();
		
	}
	@Override
	public void run() {
		try {
			while(true) {
				InputStream in = sock.getInputStream();
				DataInputStream dis = new DataInputStream(in);
				String msg = dis.readUTF();
				System.out.println("수신 메세지 : " + msg);				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
