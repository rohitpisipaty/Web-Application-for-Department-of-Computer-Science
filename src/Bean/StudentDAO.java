package Bean;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;



import java.io.IOException;

import java.sql.*;

import java.util.*;
import Bean.*;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "StudentDAO", urlPatterns = { "/StudentDAO" })

public class StudentDAO { 

	Connection conn;
	
	 public void init()
	 {
		 try
		 {
			 // Register the driver.
			 DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
			 // Connect to the database.
			 conn = DriverManager.getConnection("jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g", "rpisipat", "stersu"); 

			 Statement myStmt = conn.createStatement();

			 ResultSet myRs = myStmt.executeQuery("select * from Student_642");

		 }	 
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }

	 }
	
	public void insertToDB(ArrayList<Object> args)
	{
		
			String str= "";
			str = args.toString();
			str = str.replace("]", "");
			str = str.replace("[", "");
			str = str.replace("null", "''");
			str = str.replace("''''", "' '");

			/*Prepare an SQL query and call it on the connection*/

			//Statement myStmt = conn.createStatement();
			System.out.println(str);
			StudentBean studentBean = new StudentBean();
			
			
			//String insertQuery = "insert into Student values ( "+ str +" )";
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException ex) {
				Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
			}
			try {
				conn = DriverManager.getConnection("jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g", "rpisipat", "stersu"); 
			String sql = "insert into Student_642 values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement persist_db = conn.prepareStatement(sql);
			
			persist_db.setString(1, (String)args.get(0));
			
			persist_db.setString(2, (String)args.get(1));
			persist_db.setString(3, (String)args.get(2));
			persist_db.setString(4, (String)args.get(3));
			persist_db.setString(5, (String)args.get(4));
			persist_db.setString(6, (String)args.get(5));
			persist_db.setString(7, (String)args.get(6));
			persist_db.setString(8, (String)args.get(7));
			persist_db.setString(9, (String)args.get(8));
			persist_db.setString(10, (String)args.get(9));
			persist_db.setString(11, (String)args.get(10));
			persist_db.setString(12, (String)args.get(11));
			persist_db.setString(13, (String)args.get(12));
			persist_db.setString(14, (String)args.get(13));
			persist_db.setString(15, (String)args.get(14));
			persist_db.setString(16, (String)args.get(15));
			

			persist_db.executeUpdate();
			persist_db.close();
			if (conn != null) {
				conn.close();
			}

			//String insertQuery = "insert into student1 values ("  ";
			//System.out.println(insertQuery);

			//myStmt.executeUpdate(insertQuery);
		}
		catch( Exception e){
			System.out.println("error here");
			e.printStackTrace();
		}
	}
	public ArrayList<String> extractFromDB()
	{
		ArrayList<String> aList = new ArrayList<String>();
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g", "rpisipat",
					"stersu");
			
			Statement myStmt = conn.createStatement();
			
			ResultSet myRs = myStmt.executeQuery("select StudentID from student_642 order by StudentID DESC");
			
			while(myRs.next())
			{
				aList.add(myRs.getString("StudentID"));
			}
		}
		catch( Exception e){
			e.printStackTrace();
		}
		return aList;
	}
	
	
	public Object returnStudentInfo(String str)
	{
		//ArrayList<Object> aList1 = new ArrayList<Object>();
		StudentBean studentBean=new StudentBean();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g", "rpisipat",
					"stersu");
			Statement stmt = con.createStatement();
			str = "'" + str + "'";
			//System.out.println(str);
			
			ResultSet result = stmt.executeQuery("select * from Student_642 where StudentID="+ str );
			
			while (result.next()) {
				studentBean.setName(result.getString("name"));
				//System.out.println("hi");
				//System.out.println(result.getString("streetaddress"));
				studentBean.setAddress(result.getString("streetaddress"));
				studentBean.setTel(result.getString("mobile"));
				studentBean.setZip(result.getString("zipcode"));
				studentBean.setCity(result.getString("city"));
				studentBean.setState(result.getString("state"));
				studentBean.setEmail(result.getString("email"));
				studentBean.setUrl(result.getString("URL"));
				studentBean.setDate(result.getString("dos"));
				studentBean.setMonth(result.getString("gradmonth"));
				studentBean.setInfo(result.getString("options"));
				studentBean.setInterest(result.getString("box"));
				studentBean.setDropdown(result.getString("recommend"));
				studentBean.setTextarea(result.getString("feedback"));
				studentBean.setRaffle(result.getString("numbers"));
				studentBean.setStuID(result.getString("StudentID"));
				
/*				aList1.add(studentBean.getAddress());
				aList1.add(studentBean.getTel());
				aList1.add(studentBean.getZip());
				aList1.add(studentBean.getCity());
				aList1.add(studentBean.getState());
				aList1.add(studentBean.getEmail());
				aList1.add(studentBean.getUrl());
				aList1.add(studentBean.getDate());
				aList1.add(studentBean.getMonth());
				aList1.add(studentBean.getInfo());
				aList1.add(studentBean.getInterest());
				aList1.add(studentBean.getDropdown());
				aList1.add(studentBean.getTextarea());
				aList1.add(studentBean.getRaffle());
				aList1.add(studentBean.getStuID());*/
				
				

			}
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println(studentBean.getName());
		return studentBean;
	}
}

	