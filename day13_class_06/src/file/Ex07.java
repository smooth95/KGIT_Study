package file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex07 {
	public static void main(String[] args) throws Exception {
		String path = "d:/0.Guhyeon/eclipse-java/Test/test.txt";
		FileOutputStream fos = new FileOutputStream(path);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		for(char ch = '0' ; ch <= '9'; ch++) {
			Thread.sleep(500);
			//fos.write(ch);
			bos.write(ch);
		}
		bos.flush();
		bos.write('a');
		bos.close();
		bos.write('a');
		bos.close();
		
		fos.close();
	}
}
