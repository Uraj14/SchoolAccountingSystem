package report;
import java.io.*;
import java.lang.*;


public class write {
	public static void tofile(Student s,String filename) 
	{
	try {
		
		FileWriter filewriter = new FileWriter("D://sem4/Project/DueReport.txt");
		PrintWriter printwriter = new PrintWriter(filewriter);
		printwriter.println("The Student Fee Report System");
		printwriter.print("Name :");
	    printwriter.println(s.getname());
		printwriter.print("Roll No  :");
	    printwriter.println(s.getroll());
		printwriter.print("Email :");
		printwriter.println(s.getemail());
		printwriter.print("Course :");
		printwriter.println(s.getcourse());
		printwriter.print("Total Fee :");
		printwriter.println(s.getfee());
		printwriter.print("Fee Paid :");
		printwriter.println(s.getpaid());
		printwriter.print("Fee Due :");
		printwriter.println(s.getdue());
		printwriter.print("Address :");
		printwriter.println(s.getadd());
		printwriter.print("City :");
		printwriter.println(s.getcity());
		printwriter.print("State :");
		printwriter.println(s.getstate());
		printwriter.print("Country :");
		printwriter.println(s.getcount());
		printwriter.print("Contact No :");
		printwriter.println(s.getcon());
		printwriter.println();
		printwriter.print("Thank You!!");
		
		
		printwriter.close();
	}
	catch(Exception e) {System.out.println(e);
	}

}
}
