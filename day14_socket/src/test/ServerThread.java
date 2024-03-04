package test;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread{
	public static ArrayList<Socket> arr;
	static {
		arr = new ArrayList<>();
	}
	private Socket sock;
	public ServerThread (Socket sock) {
		this.sock = sock;
		arr.add(sock);
		start();
	}
	@Override
	public void run() {
		try {
			InputStream in = sock.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			while (true) {
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
