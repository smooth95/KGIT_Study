package day18_javaFx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MainClass02 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		FlowPane flowPane = new FlowPane();
		Label lb = new Label("라벨입니다.");
		Button btn01 = new Button("버튼01");
		Button btn02 = new Button();
		btn02.setText("버튼02");
		
		flowPane.getChildren().add(lb);
		flowPane.getChildren().add(btn01);
		flowPane.getChildren().add(btn02);
		
		Scene sc = new Scene(flowPane);
		arg0.setScene(sc);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
