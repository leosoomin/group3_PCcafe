module group3_PCcafe {
	exports login.register;
	exports login.findPw;
	exports login.nonMember;
	exports main;
	exports foods.main;
	exports login.findId;
	exports login.memberLogin;
	exports login;

	requires java.sql;
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
}