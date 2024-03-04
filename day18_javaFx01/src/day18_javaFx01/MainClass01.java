package day18_javaFx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		Label lb = new Label();
		lb.setFont(new Font(30));
		// 글자 크기 조정
		lb.setText("안녕하세요");
		
		Scene scene = new Scene(lb, 200, 300); // 가로와 세로 크기 
		arg0.setScene(scene);
		
		arg0.setTitle("제목을 설정합니다.");
		// 표시되는 창의 제목
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
	
}
