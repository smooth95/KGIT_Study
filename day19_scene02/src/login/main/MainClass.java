package login.main;

import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.controller.Controller;
import login.url.URLService;

public class MainClass extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		URL url = new URL(URLService.fxPath + "login/fxml/Login.fxml");
		FXMLLoader loader = new FXMLLoader(url);
		Parent root = loader.load();
		
		Controller ctrl = loader.getController();
		ctrl.setRoot(root);
		
		Scene scene = new Scene(root);
		
		arg0.setScene(scene);
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);
		
	}
}
