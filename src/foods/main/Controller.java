package foods.main;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller implements Initializable {
	@FXML public Button Button1,Button2,Button3,Button4,Button5,
	Button6,Button7,Button8,Button9;
	@FXML public ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;
	@FXML public TextField TextField1,TextField2,TextField3,TextField4,TextField5,TextField6
	,TextField7;
	@FXML public TextArea TextArea1, TextArea2;
	@FXML public RadioButton RadioButton1,RadioButton2,RadioButton3,RadioButton4;
	
	Parent root;
	
	ArrayList<String> a1 = new ArrayList<>();
	ArrayList<String> a2 = new ArrayList<>();
	ArrayList<String> a3 = new ArrayList<>();
	ArrayList<String> a4 = new ArrayList<>();
	ArrayList<String> a5 = new ArrayList<>();
	ArrayList<String> a6 = new ArrayList<>();
	
	int pay = 0;   // 결제 금액
	int re_money = 0; 	//거스름돈 
	
	//ObservableList<String> listArr;
	
	ArrayList<String> order_list = new ArrayList<>();
	
	String path;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		path = Paths.get("").toAbsolutePath().toString();
		path += "/src/";
		
		//listArr = FXCollections.observableArrayList();
		
		a1.add("갈릭핫도그 콤보 5200원");
		a1.add("명란마요핫도그 콤보 5200원");
		a1.add("바베큐핫도그 콤보 5200원");
		a1.add("스리라차마요핫도그 콤보 5200원");
		a1.add("아메리칸칠리핫도그 콤보 5200원");
		a1.add("청양마요핫도그 콤보 5200원");
		
		a2.add("김치우동 5000원");
		a2.add("불계치 6000원");
		a2.add("불닭게티 7500원");
		a2.add("불닭볶음면 6000원");
		a2.add("앵그리너구리 4000원");
		a2.add("짜계치 6000원");
		
		a3.add("김치볶음밥 5500원");
		a3.add("낙지볶음밥 5500원");
		a3.add("대패삼겹볶음밥 5500원");
		a3.add("새우볶음밥 5500원");
		a3.add("소불고기볶음밥 5500원");
		a3.add("치킨카레볶음밥 5500원");
		
		a4.add("마라불고기버거 5500원");
		a4.add("떡갈비버거 5500원");
		a4.add("치킨버거 5500원");
		a4.add("불고기버거 탄산콤보 7000원");
		a4.add("새우버거 탄산콤보 7000원");
		a4.add("치킨버거 탄산콤보 7000원");
		
		a5.add("1리터 마운틴듀 디슬펜서 2700원");
		a5.add("1리터 청사과에이드 5000원");
		a5.add("1리터 패션후르츠 에이드 5000원");
		a5.add("딸기요거트스무디 5000원");
		a5.add("밀크쉐이크 5000원");
		a5.add("바나나쉐이크 5000원");
		
	}
	public void hotdogFunc() {
		Image imgh1 = new Image("file:/"+path+"hotdogs/images/갈릭핫도그 콤보.jpg");
		imageView1.setImage(imgh1);
		Image imgh2 = new Image("file:/"+path+"hotdogs/images/명란마요핫도그 콤보.jpg");
		imageView2.setImage(imgh2);
		Image imgh3 = new Image("file:/"+path+"hotdogs/images/바베큐핫도그 콤보.jpg");
		imageView3.setImage(imgh3);
		Image imgh4 = new Image("file:/"+path+"hotdogs/images/스리라차마요핫도그 콤보.jpg");
		imageView4.setImage(imgh4);
		Image imgh5 = new Image("file:/"+path+"hotdogs/images/아메리칸칠리핫도그 콤보.jpg");
		imageView5.setImage(imgh5);
		Image imgh6 = new Image("file:/"+path+"hotdogs/images/청양마요핫도그 콤보.jpg");
		imageView6.setImage(imgh6);
		
		TextField1.setText(a1.get(0));
		TextField2.setText(a1.get(1));
		TextField3.setText(a1.get(2));
		TextField4.setText(a1.get(3));
		TextField5.setText(a1.get(4));
		TextField6.setText(a1.get(5));
		
		
	}
	public void noodleFunc() {
		Image imgn1 = new Image("file:/"+path+"noodles/images/김치우동.jpg");
		imageView1.setImage(imgn1);
		Image imgn2 = new Image("file:/"+path+"noodles/images/불계치.jpg");
		imageView2.setImage(imgn2);
		Image imgn3 = new Image("file:/"+path+"noodles/images/불닭게티.jpg");
		imageView3.setImage(imgn3);
		Image imgn4 = new Image("file:/"+path+"noodles/images/불닭볶음면.jpg");
		imageView4.setImage(imgn4);
		Image imgn5 = new Image("file:/"+path+"noodles/images/앵그리너구리.jpg");
		imageView5.setImage(imgn5);
		Image imgn6 = new Image("file:/"+path+"noodles/images/짜계치.jpg");
		imageView6.setImage(imgn6);
		
		TextField1.setText(a2.get(0));
		TextField2.setText(a2.get(1));
		TextField3.setText(a2.get(2));
		TextField4.setText(a2.get(3));
		TextField5.setText(a2.get(4));
		TextField6.setText(a2.get(5));
	}
	public void riceFunc() {
		Image imgr1 = new Image("file:/"+path+"rice/images/1.김치볶음밥.Jpg");
		imageView1.setImage(imgr1);
		Image imgr2 = new Image("file:/"+path+"rice/images/2 낙지볶음밥.jpg");
		imageView2.setImage(imgr2);
		Image imgr3 = new Image("file:/"+path+"rice/images/3.대패삼겹볶음밥.jpg");
		imageView3.setImage(imgr3);
		Image imgr4 = new Image("file:/"+path+"rice/images/4.새우볶음밥.jpg");
		imageView4.setImage(imgr4);
		Image imgr5 = new Image("file:/"+path+"rice/images/5.소불고기볶음밥.jpg");
		imageView5.setImage(imgr5);
		Image imgr6 = new Image("file:/"+path+"rice/images/6.치킨카레볶음밥.jpg");
		imageView6.setImage(imgr6);
		
		TextField1.setText(a3.get(0));
		TextField2.setText(a3.get(1));
		TextField3.setText(a3.get(2));
		TextField4.setText(a3.get(3));
		TextField5.setText(a3.get(4));
		TextField6.setText(a3.get(5));
	}
	public void burgerFunc() {
		Image imgb1 = new Image("file:/"+path+"burgers/images/마라불고기버거.jpg");
		imageView1.setImage(imgb1);
		Image imgb2 = new Image("file:/"+path+"burgers/images/한품-떡갈비버거.jpg");
		imageView2.setImage(imgb2);
		Image imgb3 = new Image("file:/"+path+"burgers/images/한품-치킨버거.jpg");
		imageView3.setImage(imgb3);
		Image imgb4 = new Image("file:/"+path+"burgers/images/불고기버거 탄산콤보.png");
		imageView4.setImage(imgb4);
		Image imgb5 = new Image("file:/"+path+"burgers/images/새우버거 탄산콤보.png");
		imageView5.setImage(imgb5);
		Image imgb6 = new Image("file:/"+path+"burgers/images/치킨버거 탄산콤보.png");
		imageView6.setImage(imgb6);
		
		TextField1.setText(a4.get(0));
		TextField2.setText(a4.get(1));
		TextField3.setText(a4.get(2));
		TextField4.setText(a4.get(3));
		TextField5.setText(a4.get(4));
		TextField6.setText(a4.get(5));
		
	}
	public void cafeFunc() {
		Image imgc1 = new Image("file:/"+path+"cafas/images/1리터 마운틴듀 디스펜서.jpg");
		imageView1.setImage(imgc1);
		Image imgc2 = new Image("file:/"+path+"cafas/images/1리터 청사과에이드.jpg");
		imageView2.setImage(imgc2);
		Image imgc3 = new Image("file:/"+path+"cafas/images/1리터 패션후르츠 에이드.png");
		imageView3.setImage(imgc3);
		Image imgc4 = new Image("file:/"+path+"cafas/images/딸기요거트스무디.jpg");
		imageView4.setImage(imgc4);
		Image imgc5 = new Image("file:/"+path+"cafas/images/밀크쉐이크.jpg");
		imageView5.setImage(imgc5);
		Image imgc6 = new Image("file:/"+path+"cafas/images/바나나쉐이크.jpg");
		imageView6.setImage(imgc6);
		
		TextField1.setText(a5.get(0));
		TextField2.setText(a5.get(1));
		TextField3.setText(a5.get(2));
		TextField4.setText(a5.get(3));
		TextField5.setText(a5.get(4));
		TextField6.setText(a5.get(5));
	}
	
	public void click() {	}
	
	public void click1() {
		System.out.println(1);
		if(TextField1.getText().equals(a1.get(0))) {
			order_list.add(a1.get(0));
			pay += 5200;
		}	
		if(TextField1.getText().equals(a2.get(0))) {
			order_list.add(a2.get(0));
			pay += 5000;
		}
		if(TextField1.getText().equals(a3.get(0))) {
			order_list.add(a3.get(0));
			pay += 5500;
		}	
		if(TextField1.getText().equals(a4.get(0))) {
			order_list.add(a4.get(0));
			pay += 5500;
		}	
		if(TextField1.getText().equals(a5.get(0))) {
			order_list.add(a5.get(0));
			pay += 2700;
		}
		String s1 ="";
		for(int i = 0; i < order_list.size(); i++) {
			s1 += order_list.get(i) + "\n";
		}
		TextArea1.setText(s1);
		TextField7.setText("결제 금액 : " + pay);
		
	}
	public void click2() {
		if(TextField2.getText().equals(a1.get(1))) {
			order_list.add(a1.get(1));
			pay += 5200;
		}	
		if(TextField2.getText().equals(a2.get(1))) {
			order_list.add(a2.get(1));
			pay += 6000;
		}
		if(TextField2.getText().equals(a3.get(1))) {
			order_list.add(a3.get(1));
			pay += 5500;
		}	
		if(TextField2.getText().equals(a4.get(1))) {
			order_list.add(a4.get(1));
			pay += 5500;
		}	
		if(TextField2.getText().equals(a5.get(1))) {
			order_list.add(a5.get(1));
			pay += 5000;
		}
		String s1 = "";
		for(int i = 0; i < order_list.size(); i++) {
			s1 += order_list.get(i) + "\n";
		}
		TextArea1.setText(s1);
		TextField7.setText("결제 금액 : " + pay);
	}
	public void click3() {
		if(TextField3.getText().equals(a1.get(2))) {
			order_list.add(a1.get(2));
			pay +=5200;
		}	
		if(TextField3.getText().equals(a2.get(2))) {
			order_list.add(a2.get(3));
			pay += 7500;
		}
		if(TextField3.getText().equals(a3.get(2))) {
			order_list.add(a3.get(2));
			pay += 5500;
		}	
		if(TextField3.getText().equals(a4.get(2))) {
			order_list.add(a4.get(2));
			pay += 5500;
		}	
		if(TextField3.getText().equals(a5.get(2))) {
			order_list.add(a5.get(2));
			pay += 5000;
		}
		String s1 = "";
		for(int i = 0; i < order_list.size(); i++) {
			s1 += order_list.get(i) + "\n";
		}
		TextArea1.setText(s1);
		TextField7.setText("결제 금액 : " + pay);
	}
	public void click4() { 
		if(TextField4.getText().equals(a1.get(3))) {
			order_list.add(a1.get(3));
			pay += 5200;
		}	
		if(TextField4.getText().equals(a2.get(3))) {
			order_list.add(a2.get(3));
			pay += 6000;
		}
		if(TextField4.getText().equals(a3.get(3))) {
			order_list.add(a3.get(3));
			pay += 5500;
		}	
		if(TextField4.getText().equals(a4.get(3))) {
			order_list.add(a4.get(3));
			pay += 7000;
		}	
		if(TextField4.getText().equals(a5.get(3))) {
			order_list.add(a5.get(3));
			pay += 5000;
		}
		String s1 = "";
		for(int i = 0; i < order_list.size(); i++) {
			s1 += order_list.get(i) + "\n";
		}
		TextArea1.setText(s1);
		TextField7.setText("결제 금액 : " + pay);
	}
	public void click5() {
		if(TextField5.getText().equals(a1.get(4))) {
			order_list.add(a1.get(4));
			pay += 5200;
		}	
		if(TextField5.getText().equals(a2.get(4))) {
			order_list.add(a2.get(4));
			pay += 4000;
		}
		if(TextField5.getText().equals(a3.get(4))) {
			order_list.add(a3.get(4));
			pay += 5500;
		}	
		if(TextField5.getText().equals(a4.get(4))) {
			order_list.add(a4.get(4));
			pay += 7000;
		}	
		if(TextField5.getText().equals(a5.get(4))) {
			order_list.add(a5.get(4));
			pay += 5000;
		}
		String s1 = "";
		for(int i = 0; i < order_list.size(); i++) {
			s1 += order_list.get(i) + "\n";
		}
		TextArea1.setText(s1);
		TextField7.setText("결제 금액 : " + pay);
	}
	public void click6() {
		if(TextField6.getText().equals(a1.get(5))) {
			order_list.add(a1.get(5));
			pay += 5200;
		}	
		if(TextField6.getText().equals(a2.get(5))) {
			order_list.add(a2.get(5));
			pay += 6000;
		}
		if(TextField6.getText().equals(a3.get(5))) {
			order_list.add(a3.get(5));
			pay += 5500;
		}	
		if(TextField6.getText().equals(a4.get(5))) {
			order_list.add(a4.get(5));
			pay += 7000;
		}	
		if(TextField6.getText().equals(a5.get(5))) {
			order_list.add(a5.get(5));
			pay += 5000;
		}
		String s1 = "";
		for(int i = 0; i < order_list.size(); i++) {
			s1 += order_list.get(i) + "\n";
		}
		TextArea1.setText(s1);
		TextField7.setText("결제 금액 : " + pay);
	}
	//---------------------------------------------------
	public void listFunc() {
		String a = TextArea1.getText();
		String b = TextField7.getText();
		OrderMain order = new OrderMain();
		order.viewFx(root, a, b);	
	}
	String s2 = "";
	public void moneyFunc() {
		s2 = "결제 방식 : 현금" + "\n" ;
		TextArea2.setText(s2);
	}
	
	String s3 = "";
	public void cardFunc() {
		s3 = "결제 방식 : 카드" + "\n";
		TextArea2.setText(s3);
	}					
	
	
	public void money1Func() {
		re_money = 50000 - pay;
		if(re_money < 0) {
			TextArea2.setText(s2 + "결제금액이 부족합니다.");
		}
		else {
			TextArea2.setText(s2 + "거스름돈 : " + re_money);
		}
	}
	public void money2Func() {
		re_money = 10000 - pay;
		if(re_money < 0) {
			TextArea2.setText(s2 + "결제금액이 부족합니다.");
		}
		else {
			TextArea2.setText(s2 + "거스름돈 : " + re_money);
		}
	}
	public void money3Func() {
		re_money = 5000 - pay;
		if(re_money < 0) {
			TextArea2.setText(s2 + "결제금액이 부족합니다.");
		}
		else {
			TextArea2.setText(s2 + "거스름돈 : " + re_money);
		}
	}
	public void money4Func() {
		TextArea2.setText(s2);
	}
	public void payFunc() {
		String msg = TextArea2.getText();
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("결제창입니다.");
		alert.setHeaderText("결제");
		alert.setContentText(msg + "\n" + "결제가 완료되었습니다.");
		alert.show();
		
	}
	
}
