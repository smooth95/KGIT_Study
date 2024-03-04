package test;

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
			InputStream in = sock.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			while(true) {
				System.out.println(dis.readUTF());
			}
		} catch (Exception e) {
			
		}
	}
}
