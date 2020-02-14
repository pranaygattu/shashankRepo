package DAO;

public class RegistrationDto {

	Integer cnum;
	String cname;
	String gender;
	String city;
	String hobbies;
	
	
	
	
	
	public RegistrationDto(Integer cnum, String cname, String gender, String city, String hobbies) {
		super();
		this.cnum = cnum;
		this.cname = cname;
		this.gender = gender;
		this.city = city;
		this.hobbies = hobbies;
	}
	public Integer getCnum() {
		return cnum;
	}
	public void setCnum(Integer cnum) {
		this.cnum = cnum;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	
	
	
}
