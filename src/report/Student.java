package report;

public class Student {
	private int roll,fee,paid,due;
	private String name,pass,email,course,add,city,state,count,con;
	
	public Student() {}

	public Student(String name,String pass, String email, String course, int fee, int paid, int due, String address, String city,
			String state, String country, String contactno) {
		super();
		this.name = name;
		this.pass = pass;
		this.email = email;
		this.course = course;
		this.fee = fee;
		this.paid = paid;
		this.due = due;
		this.add = address;
		this.city = city;
		this.state = state;
		this.count = country;
		this.con = contactno;
	}

	public Student(int roll, String name,String pass, String email, String course, int fee, int paid, int due, String add,
			String city, String state, String count, String con) {
		super();
		
	    this.roll = roll;
	    this.pass=pass;
		this.name = name;
		this.email = email;
		this.course = course;
		this.fee = fee;
		this.paid = paid;
		this.due = due;
		this.add = add;
		this.city = city;
		this.state = state;
		this.count = count;
		this.con = con;
	}
	
	public int getroll() {
		return roll;
	}
	public void setroll(int roll) {
		this.roll = roll;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getpass() {
		return pass;
	}
	public void setpass(String pass) {
		this.pass = pass;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getcourse() {
		return course;
	}
	public void setcourse(String course) {
		this.course = course;
	}
	public int getfee() {
		return fee;
	}
	public void setfee(int fee) {
		this.fee = fee;
	}
	public int getpaid() {
		return paid;
	}
	public void setpaid(int paid) {
		this.paid = paid;
	}
	public int getdue() {
		return due;
	}
	public void setdue(int due) {
		this.due = due;
	}
	public String getadd() {
		return add;
	}
	public void setadd(String add) {
		this.add = add;
	}
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city = city;
	}
	public String getstate() {
		return state;
	}
	public void setstate(String state) {
		this.state = state;
	}
	public String getcount() {
		return count;
	}
	public void setcount(String count) {
		this.count = count;
	}
	public String getcon() {
		return con;
	}
	public void setcon(String con) {
		this.con = con;
	}
	

}
