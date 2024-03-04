package test1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread{
	private Socket sock;
	private static ArrayList<Socket> arr = new ArrayList<>();
	public ServerThread(Socket sock) {
		this.sock = sock;
		arr.add(sock);
		start();
	}
	@Override
	public void run() {
		try {
			while(true) {
				InputStream in = sock.getInputStream();
				DataInputStream dis = new DataInputStream(in);
				String msg = dis.readUTF();
				for (Socket s : arr) {
					OutputStream out = s.getOutputStream();
					DataOutputStream dos = new DataOutputStream(out);
					dos.writeUTF(msg);
					
				}
			}
		} catch (Exception e) {
			
		}
		
	}
}
