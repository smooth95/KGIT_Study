package gridPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainClass01 extends Application{
	
	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gp = new GridPane();
		Button btn = new Button("button");
		gp.setRowIndex(btn, 0); // 세로 0번째 배치
		GridPane.setColumnIndex(btn, 0); // 가로 0번째 배치
		
		Label lb = new Label("id 입력");
		Label lb1 = new Label("label01");
		GridPane.setConstraints(lb, 0, 2); // 가로, 세로
		GridPane.setConstraints(lb1, 1, 1); // 가로, 세로
		
		TextField tf = new TextField();
		GridPane.setConstraints(tf, 1, 2);
		
		
		gp.getChildren().addAll(btn, lb, lb1, tf);
		
		arg0.setScene(new Scene(gp));
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
