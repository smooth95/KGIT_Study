package member.main;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.url.URLService;
import member.controller.MemberController;

public class MemberMain {
	// root 값을 매개변수로 받는 경우는 창을 새로띄우지 않고 기존 창에서 새로운 내용을 띄운다.
	// root 값을 받지 않는경우 새 창을 띄운다.
	public void viewFx() {
		Stage memberStage = new Stage();
		Parent root = null;
		try {
			URL url = new URL(URLService.fxPath + "member/fxml/member.fxml");
			FXMLLoader loader = new FXMLLoader( url );
			root = loader.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		memberStage.setScene(scene);
		memberStage.show();
	}
	public void viewFx(Parent root) {
		Stage memberStage = (Stage)root.getScene().getWindow();
		try {
			URL url = new URL(URLService.fxPath + "member/fxml/member.fxml");
			FXMLLoader loader = new FXMLLoader( url );
			System.out.println("로드 전 실행");
			root = loader.load();
			System.out.println("로드 후 실행");
			
			MemberController ctrl = loader.getController();
			ctrl.setRoot( root );
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		memberStage.setScene(scene);
		memberStage.show();
	}
}
