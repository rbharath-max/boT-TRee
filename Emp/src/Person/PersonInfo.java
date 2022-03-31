package Person;

public class PersonInfo {
	String fname;
	String lname;
	private String mobile;
	private String mailid;
	private String gender;
	private int age;
	
	
	public PersonInfo() {
		super();
	}

	public PersonInfo(String fname, String lname, String mobile, String mailid, String gender, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
		this.mailid = mailid;
		this.gender = gender;
		this.age = age;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

   public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonInfo [fname=" + fname + ", lname=" + lname + ", mobile=" + mobile + ", mailid=" + mailid
				+ ", gender=" + gender + ", age=" + age + "]";
	}

	public void show() {
		// TODO Auto-generated method stub
		
	}


}
