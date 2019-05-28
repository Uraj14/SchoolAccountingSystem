package report;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;


public class accountdb {
	
	public static Connection getcon() {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			
		}
		catch(Exception e) { System.out.println(e);
	
		}
		  return con;
	}
	
	public static boolean validate(String username,String password) {
		boolean status=false;
		try {
			Connection con= getcon();
			 PreparedStatement ps = con.prepareStatement("select * from accountant where aname=? and apass=?");
			 ps.setString(1,username);
			 ps.setString(2,password);
			 ResultSet rs= ps.executeQuery();
			 status=rs.next();
			 con.close();
			 
			 
		}
		catch(Exception e) {System.out.println(e);
	}
		return status;

     }
	
	public static int save(Accountant a)
	{
		int status=0;
		try {
			Connection con=getcon();
			PreparedStatement ps= con.prepareStatement("insert into accountant(aname,apass,aemail,acon) values(?,?,?,?)");
			ps.setString(1,a.getname());
			ps.setString(2,a.getpass());
			ps.setString(3,a.getemail());
			ps.setString(4,a.getcon());
			status=ps.executeUpdate();
			con.close();
			
			
		}
		catch(Exception e) { System.out.println(e);
	    }
		return status;
		
    }
	public static List<Accountant> view(){
		List<Accountant> list= new ArrayList<>();
		try {
			Connection con= getcon();
			PreparedStatement ps = con.prepareStatement("select * from accountant");
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
			   Accountant a = new Accountant();
			   a.setid(rs.getInt(1));
			   a.setname(rs.getString(2));
			   a.setpass(rs.getString(3));
			   a.setemail(rs.getString(4));
			   a.setcon(rs.getString(5));
			   list.add(a);
			}
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return list;
	}
}