<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.Date"%>
<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sucess</title>
</head>
<body>
<h1>SucessFully logged</h1> 
<%String name=(String)request.getAttribute("name");
out.print("your name  "+name);%>
<br>
<%!
public void init()
{

}%>
<%= new Date() %>
<% for(int i = 0;i<=5;i++)
	{
	out.println("hai");
	%><br>
	<% 
	}
	%>
</body>
</html>