package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Ex06_ServerThread extends Thread{
	public static ArrayList<Socket> arr;
	static {
		arr = new ArrayList<>();
	}
	private Socket sock;
	public Ex06_ServerThread(Socket s) {
		//호출받은 기본 생성자가 실행된다.
		arr.add(s);
		// arrlist에 s값이 저장이된다.
		this.sock = s;
		// 인스턴스 변수 sock에 매개변수 s가 저장된다.(처음 값은 1)
		start();
		// thread가 실행이 되어서 run메서드가 실행된다.
	}
	@Override
	public void run() {
		try {
			InputStream in = sock.getInputStream();
			//스트림을 생성하고 1번 사용자에 대한 입력을 받을 준비를 한다.
//			InputStream in = arr.get(arr.size()-1).getInputStream();	
			DataInputStream dis = new DataInputStream(in);
			//데이타형식으로 받는다??
			while (true) {
				String msg = dis.readUTF();
				// 입력을 받은 데이타를 msg형식으로 저장한다.
				for (Socket ss : arr) {
					// arr에 있는 모든 사용자로 내보내기 위한 반복문
					OutputStream out = ss.getOutputStream();
					// 연결되어있는 socket의 모든 경로에 파일을 내보낼 준비를 한다.
					DataOutputStream dos = new DataOutputStream(out);
					// 객체를 만들어 내보낼 준비를 한다.?
					dos.writeUTF(msg);
					// msg를 전달한다.
				}
			}
		} catch (Exception e) {
			
		}
	}
	
	
}
