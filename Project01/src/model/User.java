package model;

public class User {
	
	private int uid;
	private String fname;
	private String uname;
	private String email;
	private String mob;
	private String upass;
	private String cpass;
	private String gender;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int uid, String fname, String uname, String email, String mob, String upass, String cpass,
			String gender) {
		super();
		this.uid = uid;
		this.fname = fname;
		this.uname = uname;
		this.email = email;
		this.mob = mob;
		this.upass = upass;
		this.cpass = cpass;
		this.gender = gender;
	}
	

	public User(String fname, String uname, String email, String mob, String upass, String cpass,
			String gender) {
		super();
		this.fname = fname;
		this.uname = uname;
		this.email = email;
		this.mob = mob;
		this.upass = upass;
		this.cpass = cpass;
		this.gender = gender;
	}
	
	
	
	public User(int uid, String fname, String uname, String email, String mob, String upass, String gender) {
		super();
		this.uid = uid;
		this.fname = fname;
		this.uname = uname;
		this.email = email;
		this.mob = mob;
		this.upass = upass;
		this.gender = gender;
	}

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
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
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", fname=" + fname + ", uname=" + uname + ", email=" + email + ", mob=" + mob
				+ ", upass=" + upass + ", cpass=" + cpass + ", gender=" + gender + "]";
	}
	
	
	
}
