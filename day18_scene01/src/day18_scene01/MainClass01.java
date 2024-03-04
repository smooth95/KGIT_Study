package day18_scene01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import quiz.services.QuizService;
import quiz.services.QuizServiceImpl;

public class MainClass01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		
		System.out.println(getClass().getResource("testfx.fxml"));
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("testfx.fxml"));
		
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		
		arg0.setScene(scene);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
		
	}
}
