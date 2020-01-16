package model;

public class Member {
	private String id;
	private String pw;
	private String name;
	private String birth;
	private String email;
	private int age;
	private int sex;
	public Member(String id, String pw) {
		
		this.id = id;
		this.pw = pw;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Member(String infoid, String infopw, String infoname, String infoemail, String infobirth, int sex2) {
		// TODO Auto-generated constructor stub
		this.id = infoid;
		this.pw = infopw;
		this.name = infoname;
		this.birth = infobirth;
		this.email = infoemail;
		this.sex = sex2;
	}

	public Member(String id2) {
this.id = id2;
	}
	
	
}
