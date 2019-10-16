package Bean;
/*
 * Developed By Rohit Pisipaty (G01084064)
 */



import Bean.StudentDAO;

import Bean.DataProcessor;

import java.util.*;
import java.io.*;
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Bean.DataBean;
import Bean.StudentBean;


/**
 * Servlet implementation class FirstServlet
 */








import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
  
    /**
     * Default constructor. 
     */
    public FirstServlet() {
    	System.out.println("Servlet initialized");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		StudentDAO dbObj = new StudentDAO();
		dbObj.init();
		String click  = request.getParameter("onclick");
		
		if (click==null || click=="")
		{
			/*Acknowledgement Statement*/
			response.getWriter().append("Served at: ").append(request.getContextPath());	 
			
			 /*Fetch the Parameters from Survey Page*/
			response.setContentType("text/html");	
			String name = request.getParameter("name") ;
			String email = request.getParameter("email");
			String streetaddress =  request.getParameter("streetaddress") ;
			String city =  request.getParameter("city");
			String state = request.getParameter("state") ;
			String zipcode = request.getParameter("zipcode");
			String mobile = request.getParameter("mobile") ;
			
			
			
			String URL =  request.getParameter("URL");
			URL.replace(",", "");
			String dos =  request.getParameter("dos");
			String gradmonth = request.getParameter("gradmonth");
			String gradyear =  request.getParameter("gradyear");
			String option = request.getParameter("option");
			String[] box = request.getParameterValues("box");
			String recommend = request.getParameter("recommend");
			String numbers = request.getParameter("numbers");
			String feedback = request.getParameter("feedback");
			String StudentID = request.getParameter("StudentID");
			
			
			/*Perform some string manipulations*/
			String[] dataSet = numbers.split(",");
			
			String str = Arrays.toString(dataSet).replace("[", "");
			str = str.replace("]", "");
			str = str.replace(",", "");
			
			String str1 = Arrays.toString(box).replace("[", "");
			str1 = str1.replace("]", "");
			//str1 = str1.replace(",", "");
			
			StudentBean data = new StudentBean();
			data.setName(name);
			//System.out.println(data.getName());
			data.setAddress(streetaddress);
			data.setTel(mobile);
			data.setZip(zipcode);
			data.setCity(city);
			data.setState(state);
			data.setEmail(email);
			data.setUrl(URL);
			data.setDate(dos);
			data.setMonth(gradmonth);
			//data.setMonth(gradyear);
			data.setInfo(option);
			data.setInterest(str1);
			data.setDropdown(recommend);
			data.setTextarea(feedback);
			data.setRaffle(str);
			data.setStuID(StudentID);
			
			/* Prepare an array list to be passed to the StudentDAO object */	
			ArrayList<Object> aList = new ArrayList<Object>();
			/* Prepare an array list used to store values extracted from DB through StudentDAO object */	
			ArrayList<String> bList = new ArrayList<String>();
			
			aList.add(name);
			aList.add(streetaddress);
			aList.add(mobile);
			aList.add(zipcode);
			aList.add(city);
			aList.add(state);
			aList.add(email);
			aList.add(URL);
			aList.add(dos);
			aList.add(gradmonth);
			aList.add(option);
			aList.add("'"+ str1 +"'");
			aList.add(recommend);
			aList.add(feedback);
			aList.add("'" + str + "'");
			aList.add(StudentID);
					
			/*Call StudentDAO object to store the Data entered by user, into Oracle DB*/
			dbObj.insertToDB(aList);
			bList = dbObj.extractFromDB();
			dbObj.returnStudentInfo(StudentID);
			
			/*Call the Data Processor method to compute Mean and Standard Deviation*/
			Double mean=0.0, stdDev=0.0;
			
			/*If condition to check if data exists in Raffle field*/
			if((Arrays.toString(dataSet).length()>4)) // Checking for Null condition when user doesn't enter any data
			{
				DataProcessor dp = new DataProcessor(Arrays.toString(dataSet));
				mean = dp.mean();
				stdDev = dp.standDev();
						
				DataBean dBean = new DataBean();
				dBean.setMean(mean);
				dBean.setStdDev(stdDev);
				session.setAttribute("data", dBean);
				session.setAttribute("array", bList);
				
				if(mean>90)
				{
					request.getRequestDispatcher("WinnerAcknowledgement.jsp").forward(request,response);
				}
				else
				{
					request.getRequestDispatcher("SimpleAcknowledgement.jsp").forward(request,response);
				}
			}

		}
		/*Enter else condition when Acknowledgement JSP's redirect request back to servlet */
		else
		{
//			ArrayList<String> aList= new ArrayList<String>();
			Object obj = new Object();
			obj = dbObj.returnStudentInfo(click);
			//System.out.println(dbObj.getName());
			
			if(obj != null)
			{ 
				//HttpSession session1 = request.getSession();
				session.setAttribute("fetchedResults", obj);
				//System.out.println(((StudentBean) obj).getName());
				request.getRequestDispatcher("Student.jsp").forward(request,response);
			}
			else
				request.getRequestDispatcher("NoSuchStudent.jsp").forward(request,response);
		}
		 	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

