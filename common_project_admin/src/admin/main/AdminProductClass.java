package admin.main;

import java.net.URL;
import java.nio.file.Paths;

import admin.controller.ProductAddController;
import admin.controller.ProductAdminController;
import admin.controller.ProductChangeController;
import admin.dto.AdminDTO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdminProductClass extends Application{
	Parent root;
	@Override
	public void start(Stage arg0) throws Exception {
		URL url = new URL("file:/" + Paths.get("").toAbsolutePath().toString()+ "/bin/admin/fxml/adminProductManage.fxml");
		FXMLLoader loader = new FXMLLoader(url);
		Parent root = loader.load();
		
		ProductAdminController ctrl = loader.getController();
		ctrl.setRoot(root);
		
		Scene scene = new Scene(root);
		
		arg0.setScene(scene);
		arg0.show();
	}
	
	public void productViewFx(Parent root) {
		Stage listStage = (Stage)root.getScene().getWindow();
		try {
			URL url = new URL("file:/" + Paths.get("").toAbsolutePath().toString()+ "/bin/admin/fxml/adminProductManage.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			ProductAdminController ctrl = loader.getController();
			ctrl.setRoot(root);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		listStage.setScene(scene);
		listStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void productChangeView(AdminDTO dto) {
		Stage Stage = new Stage();
		Parent root = null;
		try {
			URL url = new URL("file:/" + Paths.get("").toAbsolutePath().toString()+ "/bin/admin/fxml/productChange.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			ProductChangeController ctrl = loader.getController();
			System.out.println("setroot 완료");
			ctrl.setRoot(root, dto);
			ctrl.setInit();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		Stage.setScene(scene);
		Stage.show();
		
		
	}
	
	public void productAddView() {
		System.out.println("productaddview 실행");
		Stage stage = new Stage();
		Parent root = null;
		try {
			System.out.println("fxml 로드진행");
			URL url = new URL("file:/" + Paths.get("").toAbsolutePath().toString() + "/bin/admin/fxml/productAdd.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			ProductAddController ctrl = loader.getController();
			ctrl.setRoot(root);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("로드후 스테이지에 추가");
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}
