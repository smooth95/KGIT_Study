package day18_javaFx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Quiz01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		FlowPane fp = new FlowPane();
		for (int i = 1; i<=10; i++) {
			Button btn = new Button("버튼"+i);
			fp.setVgap(10);
			//행간 거리 두기
			fp.setHgap(10);
			//열간 거리 두기
			fp.getChildren().add(btn);
		}
		Scene scene = new Scene(fp);
		arg0.setScene(scene);
		arg0.setTitle("FlowPanaEx");
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
