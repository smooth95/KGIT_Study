package member.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import member.service.MemberService;
import member.service.MemberServiceImql;

public class MemberController implements Initializable{
	@FXML public ComboBox<String> cmbAge;
	@FXML public TextField fxName, fxId;
	@FXML public PasswordField fxPwd, fxPwdChk;
	@FXML public CheckBox chkMusic, chkMovie, chkMung;
	@FXML public RadioButton rdoWoman;
	MemberService ms;
	Parent root;
	public void setRoot( Parent root ) {
		ms.setRoot(root);
		this.root = root;
	}

	public MemberController () {
		System.out.println("생성자 실행"+cmbAge);
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("초기화 실행----"+cmbAge);
		ms = new MemberServiceImql();
		String[] cmbTxt = {"20대 미만", "20대", "30대", "40대", "50대"};
		cmbAge.getItems().addAll(cmbTxt);
		//콤보박스에 보여지는 내용을 적용할 수 있다.
	}
	public void registerFunc() { // 회원가입을 클릭했을때 동작되는 메서드
		ms.registerFunc();
	}
	public void cancelFunc () {
		ms.cancelFunc();
	}
	
	

}
