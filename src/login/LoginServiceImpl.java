package login;

import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import login.findId.FindIdMain;
import login.findPw.FindPwMain;
import login.memberLogin.MemberLoginMain;
import login.nonMember.NonMemberMain;
import login.register.RegisterMain;

public class LoginServiceImpl implements LoginService{
	private LoginDAO dao;
	public LoginServiceImpl() {
		dao = new LoginDAO();
	}

	public void LConfirmFunc(TextField LoginID, TextField LoginPW, Parent root) {
		System.out.println("서비스 로그인 시작");
		LoginDTO dto = dao.getUser(LoginID.getText());
		
		String msg = null;
		
		if(dto != null) {
			if(dto.getPW().equals(LoginPW.getText())) {
				System.out.println("인증성공");
				//msg = dto.getName()+"님 인증 성공";
				//MemName.setText(dto.getName());
				String mi, mn, tt;
				mi = dto.getID();
				mn = dto.getName();
				tt = dto.getTime();
				
				MemberLoginMain member = new MemberLoginMain();
				member.MemberLogin(root, mi, mn, tt);
				
			}else {
				msg = "비빌번호가 틀렸습니다.";
				Common.myAlert(msg);
				System.out.println(msg);
			}
		}else {
		msg = "존재하지 않는 아이디 입니다.";
		Common.myAlert(msg);
		System.out.println(msg);
		}
	}
	public void LFindIDFunc(Parent root) {
		System.out.println("아이디찾기 시작");
		FindIdMain fim = new FindIdMain();
		fim.FindID(root);

	}
	public void LFindPWFunc(Parent root) {
		System.out.println("비밀번호찾기 시작");
		FindPwMain fpm = new FindPwMain();
		fpm.FindPW(root);

	}
	public void LRegisterFunc(Parent root) {
		System.out.println("회원가입 시작");
		RegisterMain regi = new RegisterMain();
		regi.Register(root);
		

	}
	public void LChargeTimeFunc(Parent root) {
		System.out.println("시간충전 시작");

	}
	public void NonMemFunc(Parent root) {
		System.out.println("비회원 로그인 시작");
		NonMemberMain nmm = new NonMemberMain();
		nmm.NonMember(root);

	}

}

