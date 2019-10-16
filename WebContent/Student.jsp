

<%@page import="Bean.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student</title>
 
</head>
 <link rel="stylesheet" type="text/css" href="rohit.css">
<body id="body" style="background-color:rgb(240, 240, 240);">
	<% Object obj = session.getAttribute("fetchedResults");
	StudentBean sBean = (StudentBean)obj;
	%>
    

    
  <heading>Details of student</heading>
   

    <form name="testForm" id="myForm">

        <div id="middle">
            <table>
                <col  style=" border: 5px solid black;" />
                <col  style=" border: 5px solid black;" />
                <col  style=" border: 5px solid black;" />


                <tr >
                    <th><h1>Name:</h1></th>
                    <th><h1>Address:</h1></th>
                    <th><h1>Phone Number:</h1></th>                
                </tr>


                <tr >
                    <th><%=sBean.getName()%></th>
                    <th><%=sBean.getAddress()%></th>
                    <th><%=sBean.getTel()%></th>
                </tr>

                <tr >
                   <th><h1>Zip</h1> </th>
                    <th><h1>City:</h1></th>
                    <th><h1>State:</h1></th>
                </tr>



                <tr >
                    <th><output><%=sBean.getZip()%></output></th>
                    <th><output><%=sBean.getCity()%></output></th>
                    <th><output><%=sBean.getState()%></output></th>
                </tr>



                <tr >
                    <th><h1>E-Mail:</h1></th>
                    <th><h1>URL:</h1></th>
                    <th><h1>Date:</h1></th>
                </tr>

                <tr >
                    <th><output><%=sBean.getEmail()%></output></th>
                    <th><output><%=sBean.getUrl()%></output></th>
                    <th><output><%=sBean.getDate()%></output></th>
                </tr>

                <tr >
                    <th><h1>What do you like most about the campus:</h1></th>
                    <th><h1> Grad Month:</h1></th>
                    <th><h1>How you became interested in the university</h1></th>

                </tr>

                <tr >
                    <th><output><%=sBean.getInterest()%></output></th>
                    <th><output><%=sBean.getMonth()%></output></th>
                    <th><output><%=sBean.getInfo()%></output></th>
                    
                </tr>

                <tr >
                      <th> <h1>How likely do you recomend this school</h1> </th>
                    <th> <h1>Comments :</h1> </th>
                    <th> <h1>Data:</h1> </th>
                </tr>

                <tr >
                    <th><output><%=sBean.getDropdown()%></output></th>
                    <th><output><%=sBean.getTextarea()%></output></th>
                    <th><output><%=sBean.getRaffle()%></output></th>
				</tr>
				
				 <tr >
                    <th><h1>Student ID:</h1></th>
                    <th></th>
                    <th></th>
                </tr>
                
				<tr >
                    <th><output><%=sBean.getStuID()%></output></th>
                    <th><output></output></th>
                    <th><output></output></th>
                </tr>
</table>
</div>

</form>



   <div id = "img-tooltip">
  <a href="https://www2.gmu.edu/" ><img src="mason-logo.png" style="position:relative" alt="Mason logo" title="Please visit http://www.gmu.edu for more information." /></a>
</div>



/*
 * Developed By Rohit Pisipaty (G01084064)
 */

</body>
</html>