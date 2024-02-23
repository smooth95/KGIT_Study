package file;

import java.io.File;

public class Ex03 {
	public static void main(String[] args) {
		String sPath = "d:/test/";
		File fPath = new File("d:/0.Guhyeon/eclipse-java/abcd");
		fPath.mkdir();
		fPath.delete();
		
		fPath = new File("d:/0.Guhyeon/eclipse-java");
		String[] str = fPath.list();
		System.out.println(str.length);
		for (String ss : str) {
			System.out.println("폴더명 : " +ss);
		}
		
		System.out.println(fPath.exists());
		//현재 폴더의 위치가 존재하는지
	}
}
