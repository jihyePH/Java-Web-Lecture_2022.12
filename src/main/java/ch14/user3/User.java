package ch14.user3;

import java.time.LocalDate;

public class User {
	private String uid;
	private String pwd;
	private String uname;
	private String email;
	private LocalDate regDate;
	
	User(){}
	User(String uid, String uname, String email) {
		this.uid = uid;
		this.uname = uname;
		this.email = email;
	}
	User(String uid, String pwd, String uname, String email) {
		this.uid = uid;
		this.pwd = pwd;
		this.uname = uname;
		this.email = email;
	}
	User(String uid, String pwd, String uname, String email, LocalDate regDate) {
		this.uid = uid;
		this.pwd = pwd;
		this.uname = uname;
		this.email = email;
		this.regDate = regDate;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	
}
