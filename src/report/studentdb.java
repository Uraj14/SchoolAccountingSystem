package report;
import java.sql.*;
import java.util.*;




public class studentdb {
	public static Connection getcon()
	{
		Connection con=null;
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
		}
		catch(Exception e) {System.out.println(e);
	    }
		return con;
	}
	
	public static boolean validate(String name,String pass)
	{
		boolean status=false;
		try {
			Connection con=getcon();
			PreparedStatement ps= con.prepareStatement("select * from students where sname=? and spass=?");
			ps.setString(1,name);
			ps.setString(2,pass);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e) {System.out.println(e);
	}
		return status;
	}
	
	public static int save(Student s){
		int status=0;
		try{
			Connection con= getcon();
			PreparedStatement ps=con.prepareStatement("insert into students(sname,spass,semail,scourse,sfee,spaid,sdue,sadd,scity,sstate,scount,scon) values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,s.getname());
			ps.setString(2,s.getpass());
			ps.setString(3,s.getemail());
			ps.setString(4, s.getcourse());
			ps.setInt(5,s.getfee());
			ps.setInt(6,s.getpaid());
			ps.setInt(7,s.getdue());
			ps.setString(8,s.getadd());
			ps.setString(9,s.getcity());
			ps.setString(10,s.getstate());
			ps.setString(11,s.getcount());
			ps.setString(12,s.getcon());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	 }
	
	public static int update(Student s){
		int status=0;
		try{
			Connection con=getcon();
			PreparedStatement ps=con.prepareStatement("update students set sname=?,spass=?,semail=?,scourse=?,sfee=?,spaid=?,sdue=?,sadd=?,scity=?,sstate=?,scount=?,scon=? where sroll=?");
			ps.setString(1,s.getname());
			ps.setString(2,s.getpass());
			ps.setString(3,s.getemail());
			ps.setString(4, s.getcourse());
			ps.setInt(5,s.getfee());
			ps.setInt(6,s.getpaid());
			ps.setInt(7,s.getdue());
			ps.setString(8,s.getadd());
			ps.setString(9,s.getcity());
			ps.setString(10,s.getstate());
			ps.setString(11,s.getcount());
			ps.setString(12,s.getcon());
			ps.setInt(13,s.getroll());
			status=ps.executeUpdate();
			con.close();
			
		}
	     catch(Exception e){System.out.println(e);}
	    return status;
			
      }
	
	public static List<Student> view(){
		List<Student> list=new ArrayList<Student>();
		try{
			Connection con=getcon();
			PreparedStatement ps=con.prepareStatement("select * from students");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Student s=new Student();
				s.setroll(rs.getInt(1));
				s.setname(rs.getString(2));
				s.setpass(rs.getString(3));
				s.setemail(rs.getString(4));
				s.setcourse(rs.getString(5));
				s.setfee(rs.getInt(6));
				s.setpaid(rs.getInt(7));
				s.setdue(rs.getInt(8));
				s.setadd(rs.getString(9));
				s.setcity(rs.getString(10));
				s.setstate(rs.getString(11));
				s.setcount(rs.getString(12));
				s.setcon(rs.getString(13));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	
	public static Student getStudentByRollno(int roll){
		Student s=new Student();
		try{
			Connection con=getcon();
			PreparedStatement ps=con.prepareStatement("select * from students where sroll=?");
			ps.setInt(1,roll);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				s.setroll(rs.getInt(1));
				s.setname(rs.getString(2));
				s.setpass(rs.getString(3));
				s.setemail(rs.getString(4));
				s.setcourse(rs.getString(5));
				s.setfee(rs.getInt(6));
				s.setpaid(rs.getInt(7));
				s.setdue(rs.getInt(8));
				s.setadd(rs.getString(9));
				s.setcity(rs.getString(10));
				s.setstate(rs.getString(11));
				s.setcount(rs.getString(12));
				s.setcon(rs.getString(13));
				
			}
			con.close();
		
	         }catch(Exception e){System.out.println(e);}
	          return s;
				
			}
	
	public static int getroll(String name,String pass)
	{
		int roll=0;
		try {
			Connection con=getcon();
			PreparedStatement ps = con.prepareStatement("select sroll from students where sname=? and spass=?");
		    ps.setString(1,name);
		    ps.setString(2,pass);
		    ResultSet rs= ps.executeQuery();
		    roll=rs.getInt(1);
		    con.close();
		    
		}
		catch(Exception e) {System.out.println(e);
	}
		return roll;
	}


	
     	
	
}

