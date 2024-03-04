package borderPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainClass01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		BorderPane bp = new BorderPane();
		Button btn = new Button("Top 버튼");
		btn.setPrefSize(200, 20);
		bp.setTop(btn);
		
		bp.setCenter(new Button("center 버튼"));
		bp.setBottom(new Button("bottom 버튼"));
		bp.setLeft(new Button("left 버튼"));
		bp.setRight(new Button("rignt 버튼"));
		
		arg0.setScene(new Scene(bp));
		
		arg0.setTitle("border Pane");
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
