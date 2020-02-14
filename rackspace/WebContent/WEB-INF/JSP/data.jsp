<%@page import="database.Regdetails"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Table</h1>
<table border="25">
<tr bgcolor="white">
<th>Cno</th>
<th>Cname</th>
<th>gender</th>
<th>city</th>
<th>Hobbies</th>
</tr>
	<% if(request.getAttribute("sucess")!=null){%>
	<%
	 ArrayList<Regdetails> mylist = (ArrayList<Regdetails>)request.getAttribute("sucess");
   for(Regdetails rdt:mylist){
	   
   %>
<tr bgcolor="white">
<td> <%=rdt.getCnum() %></td>
<td> <%=rdt.getCname() %></td>
<td> <%=rdt.getGender() %></td>
<td> <%=rdt.getCity() %></td>
<td> <%=rdt.getHobbiess() %></td>
</tr>
<% }%>
</table>
<% } %>
</body>
</html>