package login.controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import login.service.LoginService;
import login.service.LoginServiceImpl;

public class Controller implements Initializable{
	@FXML public TextField fxId;
	@FXML public TextField fxPwd;
	Parent root;
	LoginService ls;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ls = new LoginServiceImpl();
		System.out.println("초기화 메서드");
	}
	public void loginFunc() {
		ls.loginFunc(fxId, fxPwd);
	}
	public void cancleFunc() {
		ls.cancleFunc(root);
		
	}
	public void registerFunc() {
		System.out.println("회원가입 버튼 클릭");
//		ls.registerFunc();
		ls.registerFunc(root);
	}
	public void setImageView() {
//		File file = new File(path + "/" + imageArr.get(index));
//		System.out.println(file.toURI().toString());
//		
//		Image img = new Image(file.toURI().toString());
//		imageView.setImage(img);
	}
}
