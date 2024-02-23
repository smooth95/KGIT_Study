package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String path = "d:/0.Guhyeon/eclipse-java/Test/";
		
		System.out.println("파일명 입력");
		String fileName = sc.next();
		
		File filePath = new File(path+fileName+".txt");
		
		if (filePath.exists()) {
			//파일 경로가 존재하는지 확인후 불린 값 반환
			System.out.println("이미 존재하는 파일입니다.");
		} else {
			FileOutputStream fos = new FileOutputStream(filePath);
			//파일이 없으면 만들고 파일이 있으면 덮어씌운다
			String msg;
			System.out.println("내용을 입력하세요");
			sc.nextLine();
			msg = sc.nextLine();
			//공백이후는 저장되지않음 공백도 포함하려면 nextLine사용
			fos.write(msg.getBytes());
			System.out.println("완료되었다.");			
		}
	}
}
