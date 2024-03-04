package quiz;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import quiz.services.QuizService;
import quiz.services.QuizServiceImpl;

public class Quiz01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("test.fxml"));
		
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		
		Controller ctrler = loader.getController();
		ctrler.setRoot(root);
		
		arg0.setScene(scene);
		arg0.show();
		
		
		
	}
	public static void main(String[] args) {
		QuizService qs = new QuizServiceImpl();
		launch(args);
	}
}
