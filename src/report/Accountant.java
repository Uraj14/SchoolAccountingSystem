package report;

public class Accountant {

	 private int id;
	 private String name,pass,email,con;
	 
	 public Accountant() {}
	 public Accountant(String name,String pass,String email,String con)
	 {
		 super();
		 this.name=name;
		 this.pass=pass;
		 this.email=email;
		 this.con=con;
		 
	 }
	 public int getid() {
		 return id;
		 
	 }
	 public void setid(int id) {
		 this.id=id;
	 }
	 public String getname() {
		 return name;
	 }
	 public void setname(String name) {
		 this.name=name;
	 }
	 public String getpass() {
		 return pass;
	 }
	 public void setpass(String pass) {
		 this.pass=pass;
	 }
	 
	 public String getemail() {
		 return email;
	 }
	 
	 public void setemail(String email) {
		 this.email=email;
	 }
	 
	 public String getcon() {
		 return con;
	 }
	 
	 public void setcon(String con) {
		 this.con=con;
	 }
}
