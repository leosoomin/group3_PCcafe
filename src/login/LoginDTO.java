package login;

public class LoginDTO {
	private String Name, Phone, ID, PW, Time;
	public LoginDTO (String Name, String Phone, String ID, String PW, String Time) {
		this.Name = Name;
		this.Phone = Phone;
		this.ID = ID;
		this.PW = PW;
		this.Time = Time;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		PW = pW;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}


}
