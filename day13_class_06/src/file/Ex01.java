package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		File path = new File("D:\\0.Guhyeon\\eclipse-java\\Test\\test.txt");
		//파일의 경로를 지정
		FileOutputStream fos = new FileOutputStream(path);
		// 파일을 내보내기 위한 stream
		fos.write(97);
		fos.write('a');
		fos.write("test".getBytes());
		//문자열로 받으려면 get.bytes형식으로 변환하여 출력한다.
		
		
		
	}
}
