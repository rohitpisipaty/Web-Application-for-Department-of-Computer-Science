<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Winner Acknowledgement</title>
<style>
p{color:blue;}
b{color:red;}
#thanks{color:magenta;}
</style>
</head>
<body>
<jsp:useBean id="data" class="Bean.DataBean" scope="session"></jsp:useBean>
<p>Mean: ${data.mean}</p>
<p>Standard Deviation: ${data.stdDev}</p>
<p id="thanks">Thank you for completing the Survey</p>
<br><br>
<b>Congratulations ! You are the lucky winner of 2 Movie Tickets</b>
<br>
<b>The information entered on the form was successfully saved to a database table</b>

<p>List of Students with the Student-Id's:</p>
<ul>
   <% //ArrayList<Object> list = new ArrayList<Object>();
		Object list = session.getAttribute("array");
		String str = list.toString();
		str = str.replace("[", "");
		str = str.replace("]", "");
		String[] sArr = str.split(",");
		
		for(int i=0; i<sArr.length;i++) { 			
		%>
            <li><a href="FirstServlet?onclick=<%=sArr[i]%>"><%=sArr[i]%></a></li>
    <% } %>
  
</ul>
 <div id = "img-tooltip">
  <a href="https://www2.gmu.edu/" ><img src="mason-logo.png" style="position:relative" alt="Mason logo" title="Please visit http://www.gmu.edu for more information." /></a>
</div>

/*
 * Developed By Rohit Pisipaty (G01094130)
 */
</body>
</html>