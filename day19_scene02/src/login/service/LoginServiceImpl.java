package login.service;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import login.common.CommonService;
import login.dao.LoginDAO;
import login.dto.LoginDTO;
import member.main.MemberMain;

public class LoginServiceImpl implements LoginService{
	private LoginDAO dao;
	public LoginServiceImpl() {
		dao = new LoginDAO();
	}
	@Override
	public void loginFunc(TextField fxId, TextField fxPwd) {
		System.out.println("--- 서비스 로그인 확인 ---");

		System.out.println("id : " + fxId.getText());
		System.out.println("pw : " + fxPwd.getText());
		//LoginDTO dto = LoginDAO.db.get(fxId.getText());
		
		LoginDTO dto = dao.getUser(fxId.getText());
		
		System.out.println("dto : " + dto);
		//존재하는 사용자일 경우 dto값은 객체의 메모리 주소를 출력함.
		//존재하지 않는 사용자일 경우 dto값은 null값을 가짐
		String msg = null;
		
		Alert alert = new Alert(AlertType.INFORMATION);
		//출력 내용을 새로운 창을 띄워서 표시
		
		if (dto != null) {
			if (dto.getPwd().equals(fxPwd.getText())){
				msg = dto.getName()+"님 인증 성공";
			} else {
				msg = "비밀번호가 틀렸습니다..";
			}
		} else {
			msg = "존재하지 않는 아이디입니다.";
		}
		
//		alert.setContentText(msg);
//		alert.show();
		//새로운 창을 띄우고 msg텍스트를 출력한다.
		CommonService.myAlert(msg);
		System.out.println(msg);
	}

	@Override
	public void cancleFunc(Parent root) {
		System.out.println("--- 서비스 창 닫기 ---");
		CommonService.cancelFunc(root);
	}

	@Override
	public void registerFunc() {
		System.out.println("--- 서비스 회원가입 실행 ---");
		MemberMain member = new MemberMain();
		member.viewFx();
	}

	@Override
	public void registerFunc( Parent root ) {
		System.out.println("--- 서비스 회원가입 실행 ---");
		MemberMain member = new MemberMain();
		member.viewFx(root);
	}
	
}
