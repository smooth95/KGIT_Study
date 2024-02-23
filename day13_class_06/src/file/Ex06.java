package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		String path = "d:/0.Guhyeon/eclipse-java/Test/test.txt";
		FileOutputStream fos = new FileOutputStream(path, true);
		fos.write ("das".getBytes());
		fos.close();
		fos = new FileOutputStream(path, true);
		fos.write("a".getBytes());
		fos.close();
		
		FileInputStream fis = new FileInputStream(path);
		int re = fis.read();
		System.out.println((char)re);
		
		while(true) {
			re = fis.read();
			if (re < 0) {
				System.out.println("내용이 없습니다.");
				break;
			} 
			System.out.print((char)re);
		}
		fis.close();
	}
}
